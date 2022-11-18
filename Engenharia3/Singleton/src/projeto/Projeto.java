package projeto;
public class Projeto {
	private static Projeto projeto;
	private String message;
	
	private Projeto(String message) {
		this.message = message;
	}
	
	public static Projeto getInstance(String message) {
		if(projeto == null)
			projeto = new Projeto(message);
		
		return projeto;
	}
	
	public void show() {
		System.out.println(message);
	}
}

