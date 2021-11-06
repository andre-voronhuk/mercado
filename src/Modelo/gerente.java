package Modelo;

public class gerente extends funcionario {

  public gerente(String cpf, String nome, int idade, String telefone) {
    super(cpf, nome, idade, telefone);
  }

  public produto CadastrarProduto(int id, String nome, String tipo, double preco, int qtd) {
    produto item = new produto(id, nome, tipo, preco, qtd);
    System.out.println(
        "\n\nCadastrando o produto:"
            + "\nID: "
            + id
            + "\nNOME: "
            + nome
            + "\nTIPO: "
            + tipo
            + "\nPRECO: "
            + preco
            + "\nQUANTIDADE: "
            + qtd);
    System.out.println("Aqui seria feito um insert no banco de dados\n");
    return item;
  }

  public produto AlterarProduto(int ID_PRODUTO, produto novo) {
    System.out.println("\n\nAlteracao nos dados do produto id:" + ID_PRODUTO);
    System.out.println(
        "Novos dados:"
            + "\nID:"
            + novo.getId()
            + "\nNOME:"
            + novo.getNome()
            + "\nTIPO:"
            + novo.getTipo()
            + "\nPRECO:"
            + novo.getPreco()
            + "\nQUANTIDADE:"
            + novo.getQtd());
    System.out.println(
        "\nExecutando a função AlterarProduto, \n\nSeria feito um update na base de dados com base no ID informado");
    return novo;
  }

  public String getNome() {
    return "Sr " + super.getNome();
  }
  ;

  @Override
  public void setSalario(double salario) {
    super.salario = salario + (salario * 0.35);
    // o gerente tem um adicional de 35% em seu salario
  }
}
