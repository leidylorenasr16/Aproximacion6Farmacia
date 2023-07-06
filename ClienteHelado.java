
/**
 * Write a description of class ClienteHelado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClienteHelado extends Cliente
{
    private double compra1;
    private double compra2;
    public double getCompra1(){
        return compra1;
    }
    public void setCompra1(double compra1){
        if(compra1 >= 0) this.compra1 = compra1;
        else this.compra1 = 0;
    }
    
    public double getCompra2(){
        return compra2;
    }
    public void setCompra2(double compra2){
        if(compra2 >= 0) this.compra2 = compra2;
        else this.compra2 = 0;
    }
    ClienteHelado(String identificacion, String nombre, String sucursal, double compra1, double compra2){
        super(identificacion, nombre, sucursal);
        setCompra1(compra1);
        setCompra2(compra2);
    }
    double calcularPromedio(){
        return (compra1 + compra2)/2;
    }
}
