package antipattern;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private int total=0;
	private List<Produto> produtos= new ArrayList<>();
	
	public void add(Produto produto) {
		produtos.add(produto);
		
	}
	
	public void Total() {
		for (Produto produto : produtos) {
			total=total+produto.getPreço();
		}
	
	}
	
	
	
}
