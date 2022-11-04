public class Investimento extends Conta {
  double taxaRendimento;

  public Investimento(double taxaRendimento) {
    super("Investimento");
    this.taxaRendimento = taxaRendimento;
  }

  @Override
  public void fazManutencao() {
    this.saldo += this.saldo * (taxaRendimento / 100);
  }

  @Override
  public void resumoExtrato() {
    super.resumoExtrato();
    System.out.println("Porcentagem do rendimento: " + taxaRendimento + "%");
    System.out.println("---------------------");
  }

  public String toString() {
    return "ID: " + this.numero + " | Titular: " + this.titular + " | Rendimento: " + this.taxaRendimento + "%";
  }
}
