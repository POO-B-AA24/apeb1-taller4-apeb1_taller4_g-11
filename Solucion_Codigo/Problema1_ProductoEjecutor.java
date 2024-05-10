package problema.pkg1_tiendaejecutor;
import java.util.Scanner;
public class Problema1_ProductoEjecutor {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        char salir=' ';
        do{
            System.out.print("por favor ingrese la cantidad y precio del pruducto ");       
            Problema1_ProductoBase p1=new Problema1_ProductoBase(entrada.nextInt(),entrada.nextDouble());
            p1.calcularPrecio();
            p1.calcualrDescuento();
            p1.calcularPrecioFinal();
            System.out.println(p1);
            System.out.println("desea salir s/n");
            salir=entrada.next().charAt(0);
        }while(salir!='s');  
    }    
}