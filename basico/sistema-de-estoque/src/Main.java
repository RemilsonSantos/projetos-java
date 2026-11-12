
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Estoque estoque = new Estoque();

        int opcao;
        int proximoId = 1;

        do {
        System.out.println("\n===== SISTEMA DE ESTOQUE =====");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Buscar produto");
        System.out.println("4 - Atualizar produto");
        System.out.println("5 - Remover produto");
        System.out.println("6 - Adicionar estoque");
        System.out.println("7 - Retirar estoque");
        System.out.println("0 - Sair");

        System.out.print("Escolha uma opção: ");
                opcao = Integer.parseInt(entrada.nextLine());

switch (opcao) {
        case 1:
                System.out.print("Nome do produto: ");
                String nome = entrada.nextLine();

                System.out.print("Preço: ");
                double preco = Double.parseDouble(
                        entrada.nextLine().replace(",", "."));

                System.out.print("Quantidade: ");
                int quantidade = Integer.parseInt(
                        entrada.nextLine());
                Produto novoProduto = new Produto(
                        proximoId, nome, preco, quantidade);

                estoque.cadastrarProduto(novoProduto);
                proximoId++;
                break;

        case 2:
                estoque.listarProdutos();
                break;

        case 3:
                System.out.print("Digite o ID: ");
                int idBusca = Integer.parseInt(
                        entrada.nextLine());
                        Produto encontrado = estoque.buscarProduto(idBusca);

                if (encontrado != null) {
                        encontrado.exibirInformacoes();
                }else {
                System.out.println("Produto não encontrado!");
        }       
                break
                ;
        case 4:
                System.out.print("Digite o ID do produto: ");
                int idAtualizar = Integer.parseInt(
                        entrada.nextLine());
                System.out.print("Novo nome: ");
                String novoNome = entrada.nextLine();
                System.out.print("Novo preço: ");
                double novoPreco = Double.parseDouble(
                        entrada.nextLine().replace(",", "."));
                System.out.print("Nova quantidade: ");
                int novaQuantidade = Integer.parseInt(entrada.nextLine());
                estoque.atualizarProduto(
                        idAtualizar,
                        novoNome,
                        novoPreco,
                        novaQuantidade);
                break;

        case 5:
                System.out.print("Digite o ID: ");
                int idRemover = Integer.parseInt(entrada.nextLine());
                estoque.removerProduto(idRemover);
                break;

        case 6:
                        System.out.print("Digite o ID: ");
                        int idAdicionar = Integer.parseInt(entrada.nextLine());
                        
                        System.out.print("Quantidade para adicionar: ");
                        int adicionar = Integer.parseInt(entrada.nextLine());
                        estoque.adicionarEstoque(idAdicionar, adicionar);
                        break;

        case 7:
                        System.out.print("Digite o ID: ");
                        int idRetirar = Integer.parseInt(entrada.nextLine());

                        System.out.print("Quantidade para retirar: ");
                        int retirar = Integer.parseInt(entrada.nextLine());estoque.retirarEstoque(
                        idRetirar, retirar);
                        break;
                        
        case 0:
                System.out.println("Encerrando o sistema...");
                break;

                default:
                        System.out.println("Opção inválida!");

        }

                } while (opcao != 0);
        entrada.close();
        }
}
