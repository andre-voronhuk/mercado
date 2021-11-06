package Modelo;

public class vendedor extends funcionario implements interfaceVendedor {

  public vendedor(String cpf, String nome, int idade, String telefone) {
    super(cpf, nome, idade, telefone);
  }

  public void setSalario(double salario) {
    super.salario = salario;
  }

  @Override
  public void VenderProduto(produto item, int qtd) {
    System.out.println(
        "*VenderProduto*\nSeria feito a alteração na quantidade do produto informado ");
    // aqui seria criado um objeto do tipo produto, a partir do ID no banco de dados,// para que
    // fosse possivel chamar a funcao Vender(), como nao temos um banco dados, vamos solicitar como
    // parametro um obj produto
    item.Vender(item.id, qtd);
  }
}
