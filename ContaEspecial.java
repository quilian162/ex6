public class ContaEspecial extends Conta {
  protected double limite;
  protected double taxaManutencao;

  public ContaEspecial(double limite, double taxaManutencao) {
    super("Especial");
    this.limite = limite;
    this.taxaManutencao = taxaManutencao;

  }

  @Override
  public boolean sacar(double valor) {
    if (super.sacar(valor) == true) {
      return true;
    } else if (this.saldo + this.limite >= valor) {
      // o saldo negativa ate no maximo o valor do limite
      this.saldo = this.saldo - valor;
      return true;
    } else {
      return false;
    }

  }

  @Override
  public void resumoExtrato() {
    System.out.println("---------------------");
    super.resumoExtrato();
    System.out.println("Limite disponível: " + this.limite);
    System.out.println("Taxa de manutenção de conta: " + this.taxaManutencao);
    System.out.println("---------------------");
  }

  @Override
  public void fazManutencao() {
    this.saldo -= this.taxaManutencao;
  }

  public String toString() {
    return "ID: " + this.numero + " | Titular: " + this.titular + " | Limite: " + this.limite + " | Manutencao: "
        + this.taxaManutencao;
  }
}
