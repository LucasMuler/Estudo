import classes.Cliente;
import classes.Ingresso;
import classes.pagamento.Pagamento;

public class sistemaInterno {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(true);
		Ingresso i1 = new Ingresso(c1);		
		i1.setingressoNormal();
		i1.getValor();
		Pagamento p1 = new Pagamento(i1, "Debito");
		p1.getIngresso();
		
		//-------------------------------------------
		
		
	}

}
