import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Conta conta = new Conta("Luís", 123456);
		ContaPoupanca cp = new ContaPoupanca("Luís Filipe", 1452, 55.22);
		
		
		
		System.out.println(conta);
		System.out.println(cp);
		
		leia.close();
	}

}
