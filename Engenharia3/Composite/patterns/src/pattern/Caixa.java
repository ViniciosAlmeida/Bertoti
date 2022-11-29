package pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Caixa {

	public List<Caixa> caixas = new ArrayList<>();
	public List<Produto> produtos = new ArrayList<>();;
	public int total;
	
	
	
	public Caixa(Caixa... caixas) {
		Add(caixas);

	}
	
	public Caixa(Produto... produtos) {
		Add(produtos);

	}
	public Caixa() {
		

	}
	


	public void Add (Produto produto) {
		produtos.add(produto);
	}
	
	public void Add (Produto... produto) {
		produtos.addAll(Arrays.asList(produto));
	}

		
	public void Add (Caixa caixa) {
		caixas.add(caixa);
	}
	
	public void Add (Caixa... caixa) {
		caixas.addAll(Arrays.asList(caixa));
	}
	
	
	
	public void Total() {
		for (Produto produto : produtos) {
			total=total+produto.getPreço();
		}
		
		for (Caixa caixa : caixas) {
			caixa.Total();
			total=total+caixa.getTotal();
		}
		
		
		
		
		
		
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
