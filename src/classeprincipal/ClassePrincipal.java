package classeprincipal;

/**
 *
 * @author mateus.bertol
 */
import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("SOMAR ");
        System.out.println("digite um número:  ");
        int var1 = teclado.nextInt();
        System.out.println("digite o segundo número:  ");
        int var2 = teclado.nextInt();

        somar(var1, var2);

        System.out.println("SOMAR ");
        System.out.println("digite um número:  ");
        int num1 = teclado.nextInt();
        System.out.println("digite o segundo número:  ");
        int num2 = teclado.nextInt();

        subtrair(num1, num2);
        for (int c = 0; c < 10; c++) {
            
        }
        while (true) {            
            
            
        }
       
        

    }

    public static void somar(int var1, int var2) {

        int soma = var1 + var2;
        System.out.println("Resultado : " + var1 + " + " + var2 + " = " + soma);

    }

    public static void subtrair(int num1, int num2) {

        int soma = num1 - num2;
        System.out.println("Resultado : " + num1 + " - " + num2 + " = " + soma);

    }
}
