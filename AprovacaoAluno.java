import java.util.Scanner;

public class AprovacaoAluno {
	public static int contador = 1;

	public static void main(String[] args) {

		float[] nota = new float[4];
		float media = 0;
		Scanner leitor = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite a nota " + contador + " do aluno");
			nota[i] = leitor.nextFloat();
			contador = contador + 1;

		}

		if (nota[0] > nota[1]) {
			media = (nota[0] + nota[2]) / 2;

		} else {
			media = (nota[1] + nota[2]) / 2;
		}
		System.out.println("Sua media é :" + media);

		if (media >= 7) {
			System.out.println("O aluno tem media " + media + " e esta APROVADO");
		} else if (media >= 5 && media <= 7) {

			System.out.println("O aluno tirou uma media " + media + " e  esta na recuperação");

			System.out.println("Qual a nota da recuperação");

			float recumedi = leitor.nextFloat();
			recumedi = (recumedi + media) / 2;

			if (recumedi >= 6 && recumedi <= 10) {
				System.out.println("O aluno tirou media " + recumedi + " e esta aprovado...");

			} else if (recumedi <= 5) {
				System.out.println("vc ta reprovadooooooooo ;-)");
			}

		} else {
			System.out.println("o aluno tirou media " + media + " e esta reprovado ");
		}
	}
}
