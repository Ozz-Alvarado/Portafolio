
import java.util.Scanner;



public class TiendaDeLibros {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Proporcione el id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporcione el Precio: ");
        double precio = Double.parseDouble(scanner.nextLine());
         boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Proporcione el Envio Gratuito: ");
            if (precio >= 500){
                envioGratuito = true;
                
            } 
            else {
                envioGratuito = false;
            }
            
        
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito = " + envioGratuito);
    }
    
}
