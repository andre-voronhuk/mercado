package Modelo;

 abstract class  funcionario {
    private String cpf;
    private String nome;
    private int idade;
    protected double salario;
    private String telefone;

     public funcionario(String cpf, String nome, int idade, String telefone) {
         this.cpf = cpf;
         this.nome = nome;
         this.idade = idade;
         this.telefone = telefone;
     }

     public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSalario() {
        return this.salario;
    }


     public abstract void setSalario(double salario);
 }
