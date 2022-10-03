import java.util.Scanner; //para criar o objeto do tipo Scanner

public class App {
    public static void main(String[] args) throws Exception {
        //declaração de variáveis operandos e operadores
        char operador; //operador matemático
        double operando1, operando2, resultado; //operandos e resultado da operação matemática, economia de linhas

        //Solicitação dos valores e operação
        Scanner reader = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("Operadores da calculadora: ");
        System.out.println("Adição [+]\nSubtração [-]\nMultiplicação [*]\nDivisão [/]\nExponenciação [^]\nResto da divisão [%] ");
        System.out.println("-----------------------------------------------");
        System.out.println("Digite somente o operador: ");
        operador = reader.next().charAt(0); //recebe e armazena a informação do primeiro caracter digitado

    }
}
