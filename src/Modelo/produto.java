package Modelo;

public class produto {
  int id;
  String nome;
  String tipo;
  double preco;
  int qtd;

  public produto(int id, String nome, String tipo, double preco, int qtd) {
    this.id = id;
    this.nome = nome;
    this.tipo = tipo;
    this.preco = preco;
    this.qtd = qtd;
  }

  public int getId() {
    return id;
  }

  void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  void setNome(String nome) {
    this.nome = nome;
  }

  public String getTipo() {
    return tipo;
  }

  void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public double getPreco() {
    return preco;
  }

  void setPreco(double preco) {
    this.preco = preco;
  }

  public int getQtd() {
    return qtd;
  }

  void setQtd(int qtd) {
    this.qtd = qtd;
  }

  protected int Vender(int id, int qtd) {
    this.qtd = this.qtd - qtd;
    return this.qtd;
  }
}
