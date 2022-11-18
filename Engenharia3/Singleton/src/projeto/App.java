package projeto;
public class App {
		public static void main(String[] args) {
			Projeto first = Projeto.getInstance("Olá mestre");
			first.show();
			
			Projeto second = Projeto.getInstance("Adeus meu senhor");
			second.show();
		}
}
