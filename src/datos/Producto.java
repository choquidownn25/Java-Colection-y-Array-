/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author choqu_000
 */
public class Producto implements Comparable<Producto>{

    //Atributos de clase
    private String nombre;
    private int cantidad;
    private int precio;
    private String descripcion;
    
    //Poliformismo
    public Producto(String nomb, int cant, int prec, String descr){
       this.nombre = nomb;
       this.cantidad=cant;
       this.precio=prec;
       this.descripcion=descr;
    }
         
    //Encapsulamiento
        
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //Meto de to string
    public String toString(){
        return ("Nombre : " + nombre+
        "Cantidad : "+cantidad + " " +
        "Precio : "+ precio+ " " +
        "Descripcion : "+descripcion);
    }
    
    //meto igual
    public boolean equals(Object objeto){
        //indica la base a que atributo se iguala
        if(objeto==null){ 
            return false;
        }
            Producto producto = (Producto)objeto;
        if (this.getNombre().equals(producto.getNombre()) )
            return true; 
        
        return false;
    }
    
    //Metodo de intenficiador de codigo
    public  int hashCode(){
        //retorna un identificador unico del objeto
        return this.getNombre().hashCode();
    }
    
    //Metodo a compara el ogjeto
    @Override
    public int compareTo(Producto producto) {
        // Indica en base a que atributos se compara el objeto 
        // Devuelve +1 si this es > que objeto 
        // Devuelve -1 si this es < que objeto 
        // Devuelve 0 si son iguales 
        
       String nombreObjeto = producto.getNombre().toLowerCase(); 
       String nombreThis = this.getNombre().toLowerCase(); 

       return( nombreThis.compareTo( nombreObjeto ) );

    }

}
