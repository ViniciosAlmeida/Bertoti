package src;
public class App {

	public static void main(String[] args) {
		Cliente jorge = new Ovo(new Mexido());
		Cliente carlos = new Ovo(new Frito());
		Cliente maria = new Ovo(new Cozido());
		
		carlos.comer();
		jorge.comer();
		maria.comer();
	}
}
