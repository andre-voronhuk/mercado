package Modelo;

public interface interfaceGerente {
  public produto CadastrarProduto(int id, String nome, String tipo, double preco, int qtd);

  public produto AlterarProduto(int ID_PRODUTO, produto novo);
}
