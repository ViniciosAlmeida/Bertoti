package src;
import java.util.ArrayList;
import java.util.List;

public class ControleQualidade {
	
	private List<Controle> listeners = new ArrayList<Controle>();
	
	public void notificacao(Controle typeListener, String message) {
		for (Controle listener : listeners) {
			if(listener.getClass().equals(typeListener.getClass()))
				listener.update(message);
		}
}
}
