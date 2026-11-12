import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos = new ArrayList<>();

    //cadastrar produto
    public void cadastrarProduto(Produto produto){
        produtos.add(produto);
        System.out.println("Produto cadastradpo com sucesso!");
    }

    //Listar prdutos
    public void listarProdutos(){
        if(produtos.isEmpty()){
            System.out.println("Estoque vazio!");
            return;
        }
        for(Produto produto : produtos){
            produto.exibirInformacoes();
        }
    }

    // Buscar produto por id
    public Produto buscarProduto(int id){
        for(Produto produto : produtos){
            if(produto.getId() == id){
                return produto;
            }
        }
        return null;
    }

    //Atualizar Produto
    public void atualizarProduto(int id, String nome,
                                 double preco, int quantidade) {

        Produto produto = buscarProduto(id);

        if (produto != null) {
            produto.setNome(nome);
            produto.setPreco(preco);
            produto.setQuantidade(quantidade);

            System.out.println("Produto atualizado!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    //Remover produto
    public void removerProduto(int id){

        Produto produto = buscarProduto(id);

        if(produto != null){
            produtos.remove(produto);
            System.out.println("Produto removido!");
        }else{
            System.out.println("Produto não encontrado!");
        }
    }
    //Adicionar quantidade
    public void adicionarEstoque(int id, int quantidade){

        Produto produto = buscarProduto(id);

        if(produto != null){
            produto.setQuantidade(
                    produto.getQuantidade() + quantidade
            );
            System.out.println("Estoque atualizado!");
        }else{
            System.out.println("Operação inválida!");
        }
    }
    //Retirar quntidade
    public void retirarEstoque(int id, int quantidade){

        Produto produto = buscarProduto(id);

        if(produto == null){
            System.out.println("Produto não encontrado! ");
            return;
        }

        if(quantidade <= 0){
            System.out.println("Quantidade inválida! ");
            return;
        }

        if(produto.getQuantidade() >= quantidade){
            produto.setQuantidade(
                    produto.getQuantidade() - quantidade
            );
        }else{
            System.out.println("Estoque insuficiente!");
        }
    }
}
