import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);

		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();

		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}

		terminal.close();
	}
    
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();
        
        else{
            int contagem = parametroDois - parametroUm;

            System.out.println(parametroDois + " - " + parametroUm + " = " + contagem);

            //realizar o for para imprimir os números com base na variável contagem
            System.out.println("Imprimindo a quantidade de números entre " + parametroUm + " e " + parametroDois);
            for (int contador=1; contador<=contagem; contador++){
                System.out.println("Imprimindo o número "+contador);
            }

            //outra possibilidade de demonstração do uso do for
            System.out.println("-------------------------------------------------------");
            System.out.println("Imprimindo os números entre: " + parametroUm + " a " + parametroDois);
            for (int contador = parametroUm; contador <= parametroDois; contador++){
                System.out.println("Imprimindo o número " + contador);
            }
            }
        }
		
	}
