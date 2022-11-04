import java.util.*;

public class Cliente {
  protected String nome;
  protected String cpf;

  protected ArrayList<Conta> contas = new ArrayList<Conta>();

  public Cliente(String nome, String cpf) {

    this.nome = nome;
    this.cpf = cpf;

  }

  public void addConta(Investimento conta) {
    this.contas.add(conta);
  }

  public void addConta(ContaEspecial conta) {
    this.contas.add(conta);
  }

  public void listarContas() {
    System.out.print("Contas pertencentes a: ");
    System.out.println(this.toString());
    for (Conta conta : contas) {
      System.out.println(conta.nome);
    }
  }

  public String toString() {
    return "Nome: " + this.nome + " | CPF: " + this.cpf;
  }
}
