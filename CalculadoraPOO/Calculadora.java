public class Calculadora {
    private double numeroUm;
    private double numeroDois;

    public void setNumeroUm(double numeroUm) {
        this.numeroUm = numeroUm;
    }

    public void setNumeroDois(Double numeroDois) {
        this.numeroDois = numeroDois;
    }

    public double somar() {
        return numeroUm + numeroDois;
    }

    public double subtrair() {
        return numeroUm - numeroDois;
    }

    public double multiplicar() {
        return numeroUm * numeroDois;
    }

    public double dividir() {
        return numeroUm / numeroDois;
    }

    public double potenciar() {
        return Math.pow(numeroUm, numeroDois);
    }

    public double raizNumeroUm() {
        return Math.sqrt(numeroUm);
    }

    public double raizNumeroDois() {
        return Math.sqrt(numeroDois);
    }

    private String operation;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    public void operacao() {
        switch (operation) {
            case "+":
                double resultadoSoma = somar();
                System.out.printf("O resultado dessa adição é %.2f", resultadoSoma);
                break;

            case "-":
                double resultadoSubtração = subtrair();
                System.out.printf("O resultado dessa subtração é %.2f", resultadoSubtração);
                break;

            case "*":
                double resultadoMultiplicao = multiplicar();
                System.out.printf("O resultado dessa multiplicação é %.2f", resultadoMultiplicao);
                break;

            case "/":
                double resultadoDivisao = dividir();
                if (numeroDois == 0) {
                    System.out.println("Impossível realizar uma divisão por zero.");
                    break;
                } else
                    System.out.printf("O resultado dessa divisão é  %.2f", resultadoDivisao);
                break;

            case "^":
                if (numeroDois == 0) {
                    double resultadoPotencia = 1;
                    System.out.println("O resultado dessa potência é " + resultadoPotencia);
                    break;
                } else {
                    double resultadoPotencia = potenciar();
                    System.out.printf("O resultado dessa potência é %.2f", resultadoPotencia);
                    break;
                }

            case "V":
                if (numeroUm < 0) {
                    double resultadoRaizDois = raizNumeroDois();
                    System.out.printf("Os resulatados são: \n Primeira raiz: Não existe raiz de número negativo. \n Segunda raiz: %.2f", resultadoRaizDois);
                    break;
                } else if (numeroDois < 0) {
                    double resultadoRaizUm = raizNumeroUm();
                    System.out.printf("Os resulatados são: \n Primeira raiz: %.2f \n Segunda raiz: Não existe raiz de número negativo.", resultadoRaizUm);
                    break;
                } else if (numeroUm < 0 && numeroDois < 0) {
                    System.out.println("Não existe raiz de número negativo.");
                    break;
                } else {
                    double resultadoRaizUm = raizNumeroUm();
                    double resultadoRaizDois = raizNumeroDois();
                    System.out.printf("Os resultados são: \nPrimeira raiz: %.2f \nSegunda raiz: %.2f", resultadoRaizUm, resultadoRaizDois);
                    break;
                }
            default:
                System.out.println("Operação inválida, digite um dos ícones na tabela.");
        }
    }

}
