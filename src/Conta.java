
public class Conta {

	public String nome;
	public int nrConta;
	public double saldo;

	
	public Conta(String nome, int nrConta) {
		this.nome = nome;
		this.nrConta = nrConta;
		
	}
	
	
	public void Sacar(double valor) {
		saldo -= valor;
	}

	public void Depositar(double valor) {
		saldo += valor;

	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getNrConta() {
		return nrConta;
	}


	public void setNrConta(int nrConta) {
		this.nrConta = nrConta;
	}


	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Nome do Títular: " + nome
				+", Número da conta: " + nrConta
				+", Saldo: " + saldo;
	}
}
