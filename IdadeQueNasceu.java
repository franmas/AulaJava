import java.util.Scanner;

public class IdadeQueNasceu {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Em que ano voc� nasceu?");
		int nasc = leitor.nextInt();
		System.out.println("Em que ano nos estamos?");
		int anoAtu = leitor.nextInt();

		int idade = anoAtu - nasc;

		System.out.println("Voc� nasceu em " + nasc + " e nos estamos no ano de " + anoAtu + " ent�o voc� tem " + idade
				+ " anos de idade");

	}

}
