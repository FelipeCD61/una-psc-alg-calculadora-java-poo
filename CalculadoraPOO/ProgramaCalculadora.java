import java.util.Scanner;
public class ProgramaCalculadora {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        while (true) {

        System.out.println("\n\t#### Calculadora ####");

        System.out.print("Digite o primeiro número: ");
        calculadora.setNumeroUm(scanner.nextDouble()); 

        System.out.print("Digite o segundo número: ");
        calculadora.setNumeroDois(scanner.nextDouble());

        System.out.println("\nDigite a operação que deseja fazer de acordo com a tabela a baixo ou digite 'Q' para sair:");
        System.out.println("\n + | Soma\n - | Subtração\n * | Multiplicação\n / | Divisão\n ^ | Potenciação\n V | Raiz\n-------------------------------------"); //Coloquei uma linha divisória para organização
        calculadora.setOperation(scanner.next());

        if (calculadora.getOperation().equals("Q") || calculadora.getOperation().equals("q") ) {
            System.out.println("Você saiu do programa!");
            break;
        }

        calculadora.operacao();
    }

        scanner.close();
    }
}
