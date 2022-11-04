public class Movimentacoes {
  protected String data;
  protected double valor;
  protected char tipo; // pode ser credito (c) e debito (d);

  public Movimentacoes(String data, double valor, char tipo) {
    this.data = data;
    this.valor = valor;
    this.tipo = tipo;
  }

  public String toString() {
    return "Data: " + this.data + " | Valor: " + this.valor + " | Tipo: " + this.tipo;
  }
}
