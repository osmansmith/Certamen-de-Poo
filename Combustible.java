
/**
 * Write a description of class Combustible here.
 * 
 * @author (Osman Ahumada) 
 * @version (1.0)
 */
public class Combustible
{
    private String nombre;
    private double valor;
    
    public Combustible(String name, double precio)
    {
        this.nombre = name;
        this.valor = precio;
    }
    
    /**
     * Setters()
     */
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setValor(int precio)
    {
        this.valor = precio;
    }
    
    /**
     * Getters()
     */
    
    public String getNombre()
    {
        return(this.nombre);
    }
    public double getValor()
    {
        return(this.valor);
    }
}
