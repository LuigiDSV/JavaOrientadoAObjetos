public class DadosItens {
    private String nome[] = new String[8], tipo[] = new String[8];
    private double preco[] = new double[8];
    private int estoque[] = new int[8];

    public String[] getNome() {
        return nome;
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public double[] getPreco() {
        return preco;
    }

    public void setPreco(double[] preco) {
        this.preco = preco;
    }

    public int[] getEstoque() {
        return estoque;
    }

    public void setEstoque(int[] estoque) {
        this.estoque = estoque;
    }

    public void Itens() {
        nome[0] = ("Rosa");
        preco[0] = (1.99);
        tipo[0] = ("Flor");
        estoque[0] = (60);

        nome[1] = ("Vaso de ferro");
        preco[1] = (15.99);
        tipo[1] = ("Recipiente");
        estoque[1] = (26);

        nome[2] = ("Aloe vera");
        preco[2] = (2.99);
        tipo[2] = ("Planta");
        estoque[2] = (24);

        nome[3] = ("Girassol");
        preco[3] = (4.50);
        tipo[3] = ("Flor");
        estoque[3] = (30);

        nome[4] = ("Orquidea");
        preco[4] = (5.79);
        tipo[4] = ("Flor");
        estoque[4] = (65);

        nome[5] = ("Vaso de barro");
        preco[5] = (9.99);
        tipo[5] = ("Recipiente");
        estoque[5] = (36);

        nome[6] = ("Lirio");
        preco[6] = (1.59);
        tipo[6] = ("Flor");
        estoque[6] = (98);

        nome[7] = ("Jasmim");
        preco[7] = (3.59);
        tipo[7] = ("Flor");
        estoque[7] = (59);
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