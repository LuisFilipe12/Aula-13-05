
public class ContaPoupanca extends Conta{

	
	
	public double rendimentos;
	
	public ContaPoupanca(String nome, int nrConta, double rendimentos ) {
		super(nome, nrConta);
		
		this.rendimentos = rendimentos;
		
	}

	public double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}
	
	
}
