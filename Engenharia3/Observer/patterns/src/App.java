package src;

public class App {

	public static void main(String[] args) {
		Restaurante dia = new Restaurante();		
		dia.event.controle(new SatisfacaoClientes());
		dia.event.controle(new QuantidadeClientes());
		
		dia.MedSatistac("Excelente");
		dia.MedCli(30);
	}
}
