package clases;

/**
 *
 * @author Kevin
 */
public class Incidentes1
{
    
    private int id;
    private String descipcion;
    private int hora;
    private int minuto;
    private String fecha;

    public Incidentes1()
    {
    }

    public Incidentes1(int id, String descipcion, int hora, int minuto, String fecha)
    {
        this.id = id;
        this.descipcion = descipcion;
        this.hora = hora;
        this.minuto = minuto;
        this.fecha = fecha;
    }
    
    

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @return the descipcion
     */
    public String getDescipcion()
    {
        return descipcion;
    }

    /**
     * @param descipcion the descipcion to set
     */
    public void setDescipcion(String descipcion)
    {
        this.descipcion = descipcion;
    }

    /**
     * @return the hora
     */
    public int getHora()
    {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora)
    {
        this.hora = hora;
    }

    /**
     * @return the minuto
     */
    public int getMinuto()
    {
        return minuto;
    }

    /**
     * @param minuto the minuto to set
     */
    public void setMinuto(int minuto)
    {
        this.minuto = minuto;
    }

    /**
     * @return the fecha
     */
    public String getFecha()
    {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }

    
}
