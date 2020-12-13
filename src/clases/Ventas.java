package clases;

/**
 *
 * @author Kevin
 */
public class Ventas
{

    private int id;
    private int id_DV;
    private String fecha;
    private int hora;
    private float Costos;

    public Ventas()
    {
    }

    public Ventas(int id, int id_DV, String fecha, int hora, float Costos)
    {
        this.id = id;
        this.id_DV = id_DV;
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
     * @return the id_DV
     */
    public int getId_DV()
    {
        return id_DV;
    }

    /**
     * @param id_DV the id_DV to set
     */
    public void setId_DV(int id_DV)
    {
        this.id_DV = id_DV;
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

}
