
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.*;

public abstract class Conta {
  protected static int numero = 0;
  protected double saldo = 0;
  protected String nome;
  protected Cliente titular;

  protected ArrayList<Movimentacoes> movimentacoes = new ArrayList<Movimentacoes>();

  public Conta(String nome) {
    this.numero += numero;
    this.nome = nome;
  }

  public void addTitular(Cliente cliente) {
    this.titular = cliente;
  }

  public void depositar(double valor) {
    this.saldo += valor;
    this.movimentacoes.add(new Movimentacoes(java.time.LocalDate.now().toString(), valor, 'c'));
  }

  public boolean sacar(double valor) {
    if (this.saldo > valor) {
      this.saldo -= valor;
      this.movimentacoes.add(new Movimentacoes(java.time.LocalDate.now().toString(), valor, 'd'));
      return true;
    } else {
      return false;
    }
  }

  public void resumoExtrato() {
    System.out.println("Lista de movimentacoes.......| Cliente: " + this.titular.nome + " | Conta: " + this.nome);
    for (Movimentacoes movimentacao : movimentacoes) {
      System.out.println(movimentacao.toString());
    }
    System.out.println(".............................| Saldo Atual: " + this.saldo);
  }

  public abstract void fazManutencao();
}
