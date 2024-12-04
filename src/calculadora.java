import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

            System.out.println("Digite o primeiro número:");
            int num1 = sc.nextInt();

            System.out.println("Digite a operação (+, -, *, /, %):");
            char op = sc.next().charAt(0);

            System.out.println("Digite o segundo número:");
            int num2 = sc.nextInt();

            System.out.println("O resultado é:");
            switch (op) {
                case '+':
                    System.out.println(num1 + num2);
                    break;

                case '-':
                    System.out.println(num1 - num2);
                    break;

                case '*':
                    System.out.println(num1 * num2);
                    break;

                case '/':
                    if (num1 == 0 || num2 == 0) {
                        System.out.println("Erro: Divisão por zero.");
                    } else {
                        System.out.println(num1 / num2);
                    }
                    break;


                case '%':
                    if (num1 == 0 || num2 == 0) {
                        System.out.println("Erro: Divisão por zero.");
                    } else {
                        System.out.println(num1 % num2);
                    }
                    break;

                default:
                    System.out.println("Operação inválida.");
                    break;

            }
            System.out.println("Deseja realizar outro cálculo? (s/n):");
            char resposta = sc.next().charAt(0);
            if (resposta == 'n' || resposta == 'N') {
                continuar = false;
            }
        }
        sc.close();
        System.out.println("Calculadora encerrada.");
    }
}