import java.util.Scanner;

public class Executora {

    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        Gestora G = new Gestora();
        DadosItens DI = new DadosItens();
        G.Menu();
        // nao esquecer de chamar o metodo itens();
        DI.Itens();
        while (G.esc.equalsIgnoreCase("sim")) {
            G.Compra();
            System.out.println("Deseja adicionar mais um item? ");
            G.esc = read.next();
            if (G.esc.equalsIgnoreCase("sim")) {
            } else if (G.esc.equalsIgnoreCase("nao")) {
                System.out.println("Ok. Estes sao os itens em seu carrinho");
                G.MostraCarrinho();
                if (G.limitador == 1) {
                    System.out.println("\nAgora vamos precisar de alguns de seus dados...");
                    G.GuardaClienteCompra();
                    G.MostraTudo();
                } else if (G.limitador == 10) {
                    System.out.println("Finalizando o sistema...");
                }
            }
        }
    }
}
