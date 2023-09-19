package examenu1u2;
import java.util.Scanner;
public class ExamenU1U2 {
    
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        
        //PEDIR DATOS
        System.out.println("PRODUCTOS EN LIQUIDACION(VIDEOJUEGOS)");
        
        System.out.println("Ingresa el nombre del producto 1:");
        String nombrev1 = leerDatos.nextLine();
        System.out.println("Precio original:");
        double precioOriginalv1 = leerDatos.nextDouble();
        
        leerDatos.nextLine();
        
        System.out.println("Ingresa el nombre del producto 2:");
        String nombrev2 = leerDatos.nextLine();
        System.out.println("Precio original:");
        double precioOriginalv2 = leerDatos.nextDouble();
        
        leerDatos.nextLine();
        
        System.out.println("Ingresa el nombre del producto 3:");
        String nombrev3 = leerDatos.nextLine();
        System.out.println("Precio original:");
        double precioOriginalv3 = leerDatos.nextDouble();
        
        leerDatos.close();
        
        //DESCUENTOS
        double DESCUENTOV1 = 30;
        double DESCUENTOV2 = 65;
        double DESCUENTOV3 = 15; 
        
        //PRECIO FINAL
        double precioFinalv1 = precioOriginalv1-(precioOriginalv1*DESCUENTOV1/100);
        double precioFinalv2 = precioOriginalv2-(precioOriginalv2*DESCUENTOV2/100);
        double precioFinalv3 = precioOriginalv3-(precioOriginalv3*DESCUENTOV3/100);
        
        //RESULTADO
        System.out.println("********************************************************************");
        System.out.println("El precio final del videojuego 1, "+nombrev1+" es $"+precioFinalv1);
        System.out.println("El precio final del videojuego 2, "+nombrev2+" es $"+precioFinalv2);
        System.out.println("El precio final del videojuego 3, "+nombrev3+" es $"+precioFinalv3);
        System.out.println("********************************************************************");
    }    
}
