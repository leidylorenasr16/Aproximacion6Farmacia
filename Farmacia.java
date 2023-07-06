
/**
 * Write a description of class Farmacia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Farmacia
{
    private final String nit;
    private String nombreFarmacia;
    private String direccion;
    private ClienteHelado[] cliente1;
    private ClienteCosmeticos[] cliente2;
    private ClienteMedicamento[] cliente3;
    private int numClientes1;
    private int numClientes2;
    private int numClientes3;
    
    public Farmacia(String nit, String nombreFarmacia, String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = "";
        setNombreFarmacia(nombreFarmacia);
        setDireccion(direccion);
        cliente1 = new ClienteHelado[50];
        cliente2 = new ClienteCosmeticos[50];
        cliente3 = new ClienteMedicamento[50];
        numClientes1 = 0;
        numClientes2 = 0;
        numClientes3 = 0;
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreFarmacia(){
        return nombreFarmacia;
    }
    public void setNombreFarmacia(String nombreFarmacia){
        if(nombreFarmacia != null){
            this.nombreFarmacia = nombreFarmacia;
        }else{
            this.nombreFarmacia = "";
        }
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        if(direccion != null){
            this.direccion = direccion;
        }else{
            this.direccion = "";
        }        
    }
    
    public int getNumClientes1(){
        return numClientes1;
    }
    
    public int getNumClientes2(){
        return numClientes2;
    }
    
    public int getNumClientes3(){
        return numClientes3;
    }
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numClientes1; i++){
            promedio = promedio + cliente1[i].calcularPromedio() / numClientes1;
        }
        for(int i = 0; i < numClientes2; i++){
            promedio = promedio + cliente2[i].calcularPromedio() / numClientes2;
        }
        for(int i = 0; i < numClientes3; i++){
            promedio = promedio + cliente3[i].calcularPromedio() / numClientes3;
        }
        
        return promedio / 3;
    }
    
    public void adicionarClienteHelado(String identificacion, String nombre, String sucursal, double compra1, double compra2){
        cliente1[numClientes1] = new ClienteHelado(identificacion, nombre, sucursal, compra1, compra2);
        numClientes1++;
    }
    
    public void adicionarClienteCosmeticos(String identificacion, String nombre, String sucursal, double compra1, double compra2, double compra3){
        cliente2[numClientes2] = new ClienteCosmeticos(identificacion, nombre, sucursal, compra1, compra2, compra3);
        numClientes2++;
    }
    
    public void adicionarClienteMedicamento(String identificacion, String nombre, String sucursal, double compra1, double compra2, double compra3, double compra4){
        cliente3[numClientes3] = new ClienteMedicamento(identificacion, nombre, sucursal, compra1, compra2, compra3, compra4);
        numClientes3++;
    }
}
