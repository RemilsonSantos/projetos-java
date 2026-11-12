public class Produto {
    //atributos
    private int id;
    private String nome;
    private double preco;
    private int quantidade;

    //Métodos
    public Produto(int id, String nome, double preco, int quantidade){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public  void setPreco(double preco){
        this.preco = preco;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public void exibirInformacoes() {
        System.out.println("-------------------------");
        System.out.println("ID: " + id);
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("-------------------------");
    }
}

