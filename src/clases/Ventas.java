package clases;

/**
 *
 * @author Kevin
 */
public class Ventas
{

    private int id;
    private String fecha;
    private String hora;
    private float Costos;

    public Ventas()
    {
    }

    public Ventas(int id, String fecha, String hora, float Costos)
    {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.Costos = Costos;
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

    /**
     * @return the Costos
     */
    public float getCostos()
    {
        return Costos;
    }

    /**
     * @param Costos the Costos to set
     */
    public void setCostos(float Costos)
    {
        this.Costos = Costos;
    }

    /**
     * @return the hora
     */
    public String getHora()
    {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora)
    {
        this.hora = hora;
    }
}
