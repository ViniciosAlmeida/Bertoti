package pattern;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p1 = new Produto("carro",20000);
		Produto p2 = new Produto("celular",100);
		Produto p3 = new Produto("capinha",10);
		Produto p4 = new Produto("bolsa",150);
		Caixa c1 =  new Caixa();
		Caixa c2 =  new Caixa();
		Caixa c3 =  new Caixa();
		Caixa c4 =  new Caixa();
		
		c1.Add(p1);
		c2.Add(p2);
		c2.Add(p3);
		c2.Add(c4);
		c4.Add(p4);
		c1.Add(c2);
		c1.Add(c3);
		
		c1.Total();
		System.out.println(c1.getTotal());
		
	}

}
