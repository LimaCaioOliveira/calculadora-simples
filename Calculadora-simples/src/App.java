import java.util.Scanner; //para criar o objeto do tipo Scanner
import java.util.Math;

public class App {
    public static void main(String[] args) throws Exception {
        //declaração de variáveis operandos e operadores
        char operador; //operador matemático
        double operando1, operando2; //operandos e resultado da operação matemática, economia de linhas
        double resultado = 0;

        //Solicitação dos valores e operação
        Scanner reader = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("Operadores da calculadora: ");
        System.out.println("Adição [+]\nSubtração [-]\nMultiplicação [*]\nDivisão [/]\nExponenciação [^]\nResto da divisão [%] ");
        System.out.println("-----------------------------------------------");
        System.out.println("Digite somente o operador: ");
        operador = reader.next().charAt(0); //recebe e armazena a informação

        //validação do conteúdo digitado
        while(operador!='+' && operador!='-' &&  operador!='*' && operador!='/' && operador!='^' && operador!='%'){
            System.out.println("Operador inválido!");
            System.out.println("-----------------------------------------------");
            System.out.println("Operadores da calculadora: ");
            System.out.println("Adição [+]\nSubtração [-]\nMultiplicação [*]\nDivisão [/]\nExponenciação [^]\nResto da divisão [%] ");
            System.out.println("-----------------------------------------------");
            System.out.println("Digite somente o operador: ");
            operador = reader.next().charAt(0);
        }
        System.out.println("Digite o operando 1: ");
        operando1 = reader.nextDouble();
        System.out.println("Em caso de exponenciação o operando 2 é o expoente.");
        System.out.println("Digite o operando 2: ");
        operando2 = reader.nextDouble();

        //é impossível dividir um operando por zero, entao devemos evitar
        while(operador == '/' && operando2 == 0){
            System.out.println("\nDivisão inválida, favor digitar um número diferente de zero.");
            System.out.println("Digite o operando 2: ");
            operando2 = reader.nextDouble();
        }

        //calculando a operação
        switch(operador){
            case '+':
                resultado = operando1 + operando2;
                break;
            case '-':
                resultado = operando1 - operando2;
                break;
            case '*':
                resultado = operando1 * operando2;
                break;
            case '/':
                resultado = operando1 / operando2;
                break;
            case '%':
                resultado = operando1 % operando2;
                break;
            case '^':
                resultado = Math.pow(operando1,operando2);
                break;
        }
        System.out.println("\n"+operando1+" " +operador+ " "+operando2+" = ");
        System.out.print(resultado);

    }
}
