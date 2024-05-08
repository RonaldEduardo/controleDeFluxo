import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scan.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scan.nextInt();

		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois, scan);

		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parametro deve ser maio que o primeiro");
		}

	}

    static void contar(int parametroUm, int parametroDois, Scanner scan) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
				boolean validarParametro = parametroUm > parametroDois;
				if (validarParametro) {
					throw new ParametrosInvalidosException();
				}
        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
				for (int i = 1; i <= contagem; i++) {
					System.out.println("Imprimindo o número " + i);
				}
    }

}
