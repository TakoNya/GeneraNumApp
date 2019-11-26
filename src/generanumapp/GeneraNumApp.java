package generanumapp;
import java.util.Scanner;

public class GeneraNumApp {

        public static void main(String[] args) {
            
            Scanner teclado = new Scanner (System.in);
            System.out.println("Introduce el primer número");
            int num1 = teclado.nextInt();
            
            System.out.println("Introduce el segúndo número");
            int num2 = teclado.nextInt();
            System.out.print("\n");
            
            for (int i = 0; i < 10; i++){
                //Generamos un número aleatorio.
                int numAleatorio = (int) Math.floor (Math.random() * (num1-num2) + num2);
                System.out.println(numAleatorio);
            }        
    }
    
}
