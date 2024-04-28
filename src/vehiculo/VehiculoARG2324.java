
package vehiculo;

/**
 *
 * @author 
 * @since 28-04-2024
 * @version 1.0
 */

public class VehiculoARG2324 {

    /**
     * Atributo que indica el nombre
     */
    String nombre;
    /**
     * Atributo que indica el precio
     */
    double precio;
    /**
     * Atributo que indica el precio con IVA
     */
    double precioIVA;
    /**
     * Atributo que indica el stock
     */
    int stock;

    /**
     * Constructor sin argumentos
     */
    public VehiculoARG2324 ()
    {
    }
    
    /**
     * Constructor con parámetro para iniciar todas las propiedades de la clase
     * @param nom Indica el nombre
     * @param precio Indica el precio
     * @param stock Indica el stock
     */
    public VehiculoARG2324 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
   /**
    * Método para asignar el nombre del vehiculo
    * @param nom Indica el nombre
    */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    /**
     * Método que me devuelve el nombre del vehiculo
     * @return devuelve el nombre
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método que me devuelve el stock de vehiculos disponible en cada momento
     * @return devuelve el stock
     */
     public int obtenerStock ()
    {
        return getStock();
    }
     /**
      * Método para comprar vehiculos.
      * @param cantidad Indica cantidad
      * @throws Exception 
      */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }
 /**
      * Método para vender vehiculos.
      * @param cantidad Indica cantidad
      * @throws Exception 
      */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }
/**
 * Metodo que asigna el atributo
 * @return devuelve nombre
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Metodo para acceder al atributo
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Metodo que selecciona el atributo
 * @return devuelve precio
 */
    public double getPrecio() {
        return precio;
    }
/**
 * Metodo para acceder al atributo
 * @param precio 
 */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
/**
 * Metodo que selecciona el atributo
 * @return devuelve precioIVA
 */
    public double getPrecioIVA() {
        return precioIVA;
    }
/**
 * Metodo para acceder al atributo
 * @param precioIVA 
 */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }
/**
 * Metodo que selecciona el atributo
 * @return devuelve stock
 */
    public int getStock() {
        return stock;
    }
/**
 * Metodo para acceder al atributo
 * @param stock 
 */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
}  
   
    

