package Modelo;

public class gerente extends funcionario {


    public gerente(String cpf, String nome, int idade, String telefone) {
        super(cpf, nome, idade, telefone);
    }

    private void CadastrarProduto(){}
    private void AlterarProduto(){}




    @Override
    public void setSalario(double salario) {
        super.salario = salario + (salario * 0.35);
        // o gerente tem um adicional de 35% em seu salario
    }


}
