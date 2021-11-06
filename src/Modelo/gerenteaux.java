package Modelo;

public class gerenteaux extends gerente {

  public gerenteaux(String cpf, String nome, int idade, String telefone) {
    super(cpf, nome, idade, telefone);
  }

  public produto AlterarProduto(int ID_PRODUTO, produto novo) {
    System.out.println("\nO cargo de Aux de Gerente nao tem permissao de alterar nenhum produto");

    return novo;
  }

  public void setSalario(double salario) {
    super.salario = salario + (salario * 0.15);
    // o aux de gerente tem um adicional de 15% em seu salario
  }
}
