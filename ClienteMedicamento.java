
/**
 * Write a description of class ClienteMedicamento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClienteMedicamento extends Cliente
{
    private double compra1;
    private double compra2;
    private double compra3;
    private double compra4;
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
    
    public double getCompra3(){
        return compra3;
    }
    public void setCompra3(double compra3){
        if(compra3 >= 0) this.compra3 = compra3;
        else this.compra3 = 0;
    }
    
    public double getCompra4(){
        return compra4;
    }
    public void setCompra4(double compra4){
        if(compra4 >= 0) this.compra4 = compra4;
        else this.compra4 = 0;
    }
    ClienteMedicamento(String identificacion, String nombre, String sucursal, double compra1, double compra2, double compra3, double compra4){
        super(identificacion, nombre, sucursal);
        setCompra1(compra1);
        setCompra2(compra2);
        setCompra3(compra3);
        setCompra4(compra4);
    }
    double calcularPromedio(){
        return (compra1 + compra2 + compra3 + compra4) / 4;
    }
}
