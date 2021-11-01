package Modelo;

public class vendedor extends  funcionario{

    public vendedor(String cpf, String nome, int idade, String telefone) {
        super(cpf, nome, idade, telefone);
    }
    private void Venderproduto(){}

    public void setSalario(double salario){
        super.salario = salario;
    }
}
