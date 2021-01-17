package operaciones;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Operaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     double radio, longitud, area = 0;
     Scanner in = new Scanner(System.in);
     
     System.out.println("Porfavor ingrese el radio");
     radio = in.nextDouble();
     
     longitud = 2 * Math.PI * radio;
     area = Math.PI * Math.pow(radio,2);
     System.out.println("la longitud de la circunferencia es: " + longitud + " el area de la circunferencia es: " + area);


    }
}
