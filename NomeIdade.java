import java.util.Scanner;

public class NomeIdade {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("qual seu nome");
		String nome = leitor.nextLine();
		System.out.println("qual a sua idade");
		int idade = leitor.nextInt();

		System.out.println("Seu nome é : " + nome + " e sua idade é " + idade + " anos de idade.");

	}

}
