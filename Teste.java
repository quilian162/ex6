public class Teste {
  public static void main(String[] args) {

    Cliente cliente = new Cliente("luiz", "000.111.222-33");
    Cliente cliente1 = new Cliente("paulo", "111.222.333-44");

    ContaEspecial especial = new ContaEspecial(1500, 50);
    especial.addTitular(cliente);
    System.out.println(especial.toString());

    Investimento investimento = new Investimento(5);
    investimento.addTitular(cliente);
    System.out.println(investimento.toString());

    cliente.addConta(especial);
    cliente.addConta(investimento);
    cliente.listarContas();

    especial.depositar(200);
    especial.sacar(100);
    especial.resumoExtrato();

    investimento.depositar(200);
    investimento.sacar(100);
    investimento.resumoExtrato();

    CarteiraPrime primelist = new CarteiraPrime();
    primelist.adicionar(cliente);
    primelist.adicionar(cliente1);
    primelist.listar();

  }
}
