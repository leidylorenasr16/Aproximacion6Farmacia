import java.util.Scanner;

/**
 * Write a description of class Compras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Compras
{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        Farmacia miFarmacia = new Farmacia("123456", "Balmoral", "Fusa");
        String identificacion, nombre, sucursal;
        
        double promedio = 0;
        
        System.out.println("Digite el número de Clientes de compra de helados: ");
        int numClientes1 = sc.nextInt();
        for(int i = 0; i < numClientes1; i++){
            double compra1, compra2;
            System.out.println("Digite la Identificacion del Cliente");
            identificacion = sc.next();
            System.out.println("Digite el nombre del Cliente");
            nombre = sc.next();
            System.out.println("Digite la sucursal del Cliente");
            sucursal = sc.next();
            System.out.println("Digite la primera compra del Cliente");
            compra1 = sc.nextDouble();
            System.out.println("Digite la segunda compra del Cliente");
            compra2 = sc.nextDouble();
            miFarmacia.adicionarClienteHelado(identificacion, nombre, sucursal, compra1, compra2);
        }
        
        System.out.println("Digite el número de Clientes de compra de cosmeticos: ");
        int numClientes2 = sc.nextInt();
        for(int i = 0; i < numClientes2; i++){
            double compra1, compra2, compra3;
            System.out.println("Digite la Identificacion del Cliente");
            identificacion = sc.next();
            System.out.println("Digite el nombre del Cliente");
            nombre = sc.next();
            System.out.println("Digite la sucursal del Cliente");
            sucursal = sc.next();
            System.out.println("Digite la primera compra del Cliente");
            compra1 = sc.nextDouble();
            System.out.println("Digite la segunda compra del Cliente");
            compra2 = sc.nextDouble();
            System.out.println("Digite la tercera compra del Cliente");
            compra3 = sc.nextDouble();
            miFarmacia.adicionarClienteCosmeticos(identificacion, nombre, sucursal, compra1, compra2, compra3);
        }
        
        System.out.println("Digite el número de Clientes de compra de medicamentos: ");
        int numClientes3 = sc.nextInt();
        for(int i = 0; i < numClientes3; i++){
            double compra1, compra2, compra3, compra4;
            System.out.println("Digite la Identificacion del Cliente");
            identificacion = sc.next();
            System.out.println("Digite el nombre del Cliente");
            nombre = sc.next();
            System.out.println("Digite la sucursal del Cliente");
            sucursal = sc.next();
            System.out.println("Digite la primera compra del Cliente");
            compra1 = sc.nextDouble();
            System.out.println("Digite la segunda compra del Cliente");
            compra2 = sc.nextDouble();
            System.out.println("Digite la tercera compra del Cliente");
            compra3 = sc.nextDouble();
            System.out.println("Digite la cuarta compra del Cliente");
            compra4 = sc.nextDouble();
            miFarmacia.adicionarClienteMedicamento(identificacion, nombre, sucursal, compra1, compra2, compra3, compra4);
        }
        
        promedio = miFarmacia.calcularPromedioGeneral();
        System.out.println("\n El promedio de compras es: " + promedio);
    }
}
