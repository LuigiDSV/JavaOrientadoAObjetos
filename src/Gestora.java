import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Gestora {
    Scanner read = new Scanner(System.in);

    DadosCliente DC = new DadosCliente();
    DadosItens DI = new DadosItens();
    DadosCompra DP = new DadosCompra();

    public String nomeItem, esc = "sim";
    public int counter = 10, limitador = 0;
    public double valorSemiFinal;

    ArrayList<DadosItens> dItens = new ArrayList<DadosItens>();
    ArrayList<DadosCompra> dCompra = new ArrayList<DadosCompra>();
    ArrayList<DadosCliente> dCliente = new ArrayList<DadosCliente>();

    // criar dois arraylists, um para itens e um para cliente
    public void Menu() {
        System.out.println("---------------------------------------");
        System.out.println("BEM VINDO - FLORICULTURA LIRIO DO CAMPO");
        System.out.println("---------------------------------------");
        System.out.println();
        System.out.println("ITENS DISPONIVEIS EM NOSSA FLORICULTURA: ");
        DI.Itens();
        for (int i = 0; i < DI.getNome().length; i++) {
            System.out.println("(" + (i + 1) + ") nome do produto: " + DI.getNome()[i]);
            System.out.println("(" + (i + 1) + ") preco: " + DI.getPreco()[i]);
            System.out.println("(" + (i + 1) + ") tipo: " + DI.getTipo()[i]);
            System.out.println("(" + (i + 1) + ") estoque: " + DI.getEstoque()[i]);
            System.out.println("------------------------------------------");
        }
    }

    // import java.util.regex.*;
    // public class Estudos{
    // public static void main(String args[]){
    // String padrao = "\\s";
    // Pattern regPat = Pattern.compile(padrao);
    // String frase = "Esta frase contém alguns espaços";
    // Matcher matcher = regPat.matcher(frase);
    // String res = matcher.replaceAll("_");
    // System.out.println(res);
    // }
    // }//para poder digitar palavras com espaco, como faz?
    public int Compra() {
        System.out.println("Dentre os produtos em estoque, qual voce gostaria de adicionar ao seu carrinho? ");
        nomeItem = read.next();
        for (int i = 0; i < DI.getNome().length; i++) {
            if (DI.getNome()[i].equalsIgnoreCase(nomeItem)) {
                DadosCompra DP = new DadosCompra();

                // instanciar a classe dentro do metodo e crucial para o funcionamento do
                // sistema
                System.out.println("Item adicionado com sucesso. ");
                DP.setItemCompra(nomeItem);
                valorSemiFinal = DI.getPreco()[i] + valorSemiFinal;
                DP.setValorVenda(DI.getPreco()[i]);
                // o que fazer para implementar data?
                dCompra.add(DP);
            }
        }
        return 1;// usar esse retun para caso der erro o programa finalize
    }
    // for (int i = 0; i < dItens.size(); i++) {
    // System.out.println(dItens.get(i).getItemCarrinho());

    public int MostraCarrinho() {
        for (int i = 0; i < dCompra.size(); i++) {
            System.out.println(dCompra.get(i).getItemCompra() + "   " + dCompra.get(i).getValorVenda());
        }
        System.out.println("\t\nValor total: R$" + valorSemiFinal);
        System.out.println("Voce confirma esses itens? ");
        if (read.next().equalsIgnoreCase("sim")) {
            System.out.println("Ok. Daremos continuidade ao seu pedido.");
            limitador = 1;
        } else if (read.next().equalsIgnoreCase("nao")) {
            System.out.println("Ok. Compra cancelado com sucesso.");
            limitador = 9;
        } else {
            System.out.println("*ERROR*");
            limitador = 9;
        }
        return 1 + limitador;
    }

    public void GuardaClienteCompra() {
        DadosCliente DC = new DadosCliente();
        System.out.println("Qual o seu nome? ");
        DC.setNome(read.next());
        System.out.println("Qual o seu RG? ");
        DC.setRg(read.next());
        System.out.println("Qual o seu telefone? ");
        DC.setTelefone(read.next());
        System.out.println("Qual o seu endereco? ");
        DC.setEndereco(read.next());
        // nome rg telefone endereco
        dCliente.add(DC);
        // um arraylist para receber os dados de cliente e um para os itens comprados
    }

    public void MostraTudo() {
        for (int i = 0; i < dCliente.size(); i++) {
            System.out.println("----------------------");
            System.out.println("NOME DO CLIENTE: " + dCliente.get(i).getNome() + "\nRG DO CLIENTE: "
                    + dCliente.get(i).getRg() + "\nENDERECO DO CLIENTE: " + dCliente.get(i).getEndereco()
                    + "\nTELEFONE DO CLIENTE: " + dCliente.get(i).getTelefone() + "\n");
        }
        for (int j = 0; j < dCompra.size(); j++) {
            System.out.print("ITENS: " + dCompra.get(j).getItemCompra() + "\nVALOR UNITARIO: R$"
                    + dCompra.get(j).getValorVenda() + "\nDATA: ");
            DP.PegarData();
            System.out.println();

        }
        System.out.println("VALOR TOTAL: R$" + valorSemiFinal);
    }
}
// Uma floricultura deseja informatizar suas operações. Inicialmente,
// deseja manter um cadastro de todos os seus clientes, mantendo informações
// como: RG, nome, telefone e endereço.

// Deseja também manter um cadastro
// contendo informações sobre os produtos que vende, tais como: nome do
// produto, tipo (flor, vaso, planta,...), preço e quantidade em estoque.

// Quando um cliente faz uma compra, a mesma é armazenada, mantendo informação
// sobre o cliente que fez a compra, a data da compra, o valor total e os
// produtos comprados.