package Pattern;


public class AplicacaoCliente {

	public static void main(String[] args) {
		ClienteDoBanco cliente = new ClienteDoBanco("Gustavo Oliveira");
		ContaBancaria conta = new ContaBancaria("123");

		Fachada facade = new Fachada();
		facade.fazerDeposito(150, cliente, conta);
	}
}
