/*Link do exercício.
* https://olimpiada.ic.unicamp.br/pratique/ps/2020/f1/acelerador/*
* */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // usando a classe Scanner para receber o input do usuário
        Scanner scanner = new Scanner(System.in);

        /*o programa foi colocado dentro de um loop para ficar mais dinâmico para o usuário, enquanto a sentença for verdadeira o programa continuará em execução,
        no fim do código existe uma condição do tipo IF para validar a continuação ou não da aplicação.
        */
        while ( true ) {
            System.out.println("Welcome to Particles accelerator");
            System.out.print("Please insert distance in km :");
            int kmNumber = scanner.nextInt();

            //aqui são checadas as restrições que o exercício propôs, caso não sejam atendidas o programa dispara uma mensagem de erro informando para o usuário que o numero está fora do esperado.
            if (kmNumber < 6 || kmNumber > 800008){
                System.out.println("Error, out of range.");
            }else {
                //aqui consta a lógica elaborada para se obter o resultado de saída do exercício.
                int result = (kmNumber - 3) / 8;
                int sensor = (int) Math.ceil(result);
                if (sensor < 2) {
                    System.out.println("Sensor "+1+" picked up the particle");
                } else if (sensor <= 5) {
                    System.out.println("Sensor "+2+" picked up the particle");
                } else {
                    System.out.println("Sensor "+3+" picked up the particle");
                }
            }
            System.out.println();
            System.out.println("Do you want to continue? Digit any button + ENTER to continue, or 'q' to exit.");
            char exit = scanner.next().charAt(0);
            if (exit == 'q'){
                break;
            }
    }
    }
}

