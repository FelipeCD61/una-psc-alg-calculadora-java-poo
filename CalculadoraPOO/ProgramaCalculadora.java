import java.util.Scanner;
public class ProgramaCalculadora {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        while (true) {

        System.out.println("\n \t#### Calculadora ####");

        System.out.print("Digite o primeiro número: ");
        calculadora.setNumeroUm(scanner.nextDouble()); 

        System.out.print("Digite o segundo número: ");
        calculadora.setNumeroDois(scanner.nextDouble());

        System.out.println("\nDigite a operação que deseja fazer de acordo com a tabela a baixo ou digite 'Q' para sair:");
        System.out.println("\n + | Soma\n - | Subtração\n * | Multiplicação\n / | Divisão\n ^ | Potenciação\n V | Raiz\n-------------------------------------"); //Coloquei uma linha divisória para organização
        String operation = scanner.next();

        if (operation.equals("Q") || operation.equals("q") ) {
            System.out.println("Você saiu do programa!");
            break;
        }
  
        switch (operation) {
            case "+":
            double resultadoSoma = calculadora.somar();
            System.out.printf("O resultado dessa adição é %.2f", resultadoSoma);
            break;

            case "-":
            double resultadoSubtração = calculadora.subtrair();
            System.out.printf("O resultado dessa subtração é %.2f", resultadoSubtração);
            break;

            case "*":
            double resultadoMultiplicao = calculadora.multiplicar();
            System.out.printf("O resultado dessa multiplicação é %.2f", resultadoMultiplicao);
            break;

            case "/":
            double resultadoDivisao = calculadora.dividir();
            if (calculadora.getNumeroDois() == 0) {
            System.out.println("Impossível realizar uma divisão por zero.");
            break;
            } else
            System.out.printf("O resultado dessa divisão é  %.2f", resultadoDivisao);
            break;

            case "^":
            if (calculadora.getNumeroDois() == 0) {
                double resultadoPotencia = 1;
                System.out.println("O resultado dessa potência é " +  resultadoPotencia);
                break;
            } else {
                double resultadoPotencia = calculadora.potenciar();
                System.out.printf("O resultado dessa potência é %.2f", resultadoPotencia);
                break;
            }

            case "V":
            if (calculadora.getNumeroUm() < 0) {
                double resultadoRaizDois = calculadora.raizNumeroDois();
                System.out.printf("Os resulatados são: \n Primeira raiz: Não existe raiz de número negativo. \n Segunda raiz: %.2f", resultadoRaizDois);
                break;
            } else if (calculadora.getNumeroDois() < 0) {
                double resultadoRaizUm = calculadora.raizNumeroUm();
                System.out.printf("Os resulatados são: \n Primeira raiz: %.2f \n Segunda raiz: Não existe raiz de número negativo.", resultadoRaizUm);
                break;
            } else if (calculadora.getNumeroUm() < 0 && calculadora.getNumeroDois() < 0) { 
                System.out.println("Não existe raiz de número negativo.");
                break;  
            } else {
                double resultadoRaizUm = calculadora.raizNumeroUm();
                double resultadoRaizDois = calculadora.raizNumeroDois();
                System.out.printf("Os resultados são: \nPrimeira raiz: %.2f \nSegunda raiz: %.2f", resultadoRaizUm, resultadoRaizDois);
                break;
            }
            default:
            System.out.println("Operação inválida, digite um dos ícones na tabela.");

        }
    }

        scanner.close();
    }
}
