
public class Cliente{
    private final String identificacion;
    private String nombre;
    private String sucursal;
    
    double calcularPromedio(){
        return 0;
    }
    
    public String getIdentificacion(){
        return identificacion;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
    }
    
    public String getSucursal(){
        return sucursal;
    }
    public void setSucursal(String sucursal){
        if(sucursal != null) this.sucursal = sucursal;
        else this.sucursal = "";
    }
    
    public Cliente(String identificacion, String nombre, String sucursal){
        if(identificacion != null) this.identificacion = identificacion;
        else this.identificacion = "";
        this.nombre = nombre;
        this.sucursal = sucursal;
    }
}
