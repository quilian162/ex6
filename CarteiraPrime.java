import java.util.*;

public class CarteiraPrime {
  protected ArrayList<Cliente> primes = new ArrayList<Cliente>();

  public void adicionar(Cliente cliente) {
    this.primes.add(cliente);
  }

  public void listar() {
    System.out.println("Lista Clientes Prime.........");
    for (Cliente cliente : primes) {
      System.out.println(cliente.toString());
    }
    System.out.println(".............................");
  }
}
