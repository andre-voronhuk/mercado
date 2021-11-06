import Modelo.gerente;
import Modelo.gerenteaux;
import Modelo.produto;
import Modelo.vendedor;

public class Main {

  public static void main(String[] args) {
    // cadastro dos funcionarios
    vendedor lucas = new vendedor("115.345.213-22", "Lucas da silva", 20, "4299932-2231");
    gerente mario = new gerente("234.213.653-82", "Mario das Pedras", 26, "4299832-9921");
    gerenteaux joao = new gerenteaux("112.325.122-09", "Joao Gabriel Pontes", 22, "4299122-1123");

    // ambos tem o salario base em 5mil, porem o gerente tem uma porcentagem a mais que o vendedor
    mario.setSalario(5000);
    lucas.setSalario(5000);
    joao.setSalario(5000);

    System.out.println("\n\nSALARIOS:\n\n vendedor " + lucas.getNome() + ":" + lucas.getSalario());
    System.out.println(" gerente: " + mario.getNome("Sr") + ":" + mario.getSalario());
    System.out.println(" aux gerente: " + joao.getNome() + ":" + joao.getSalario());
    System.out.println("\nSalario do vendedor em dolar (5R$): $" + lucas.getSalario(5));

    System.out.println("\nCadastrando produtos: ");
    produto item = mario.CadastrarProduto(1, "Adidas Essentials Big Logo", "camiseta", 50, 9);

    System.out.println("\nPreco do produto antes de alterar ");
    System.out.println(item.getNome() + " custa R$" + item.getPreco());

    // criando o prodtudo que ira substituir o produto 'item'
    produto novaCamiseta = new produto(1, "Adidas Essentials Big Logo", "camiseta", 80, 4);

    // Alteracao do produto item para o produto novaCamiseta
    item = mario.AlterarProduto(1, novaCamiseta);

    // Preco depois da alteração
    System.out.println("\nPreco do produto depois de alterar ");
    System.out.println("\n\n" + item.getNome() + " custa R$" + item.getPreco());

    // Alterar sem permissao
    System.out.println("Alterando um produto como aux de gerente:");
    item = joao.AlterarProduto(1, novaCamiseta);

    // Venda de um produto
    System.out.println("\nAntes da venda, quantidade no estoque:" + item.getQtd());
    System.out.println("\nVendedor vendeu 2 camisetas ");

    lucas.VenderProduto(item, 2);

    System.out.println("\nDepois da venda, quantidade no estoque:" + item.getQtd());
  }
}
