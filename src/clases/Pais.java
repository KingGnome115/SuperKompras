package clases;

/**
 *
 * @author Kevin
 */
public class Pais
{

    private int id;
    private String nombre;
    private boolean estatus;

    public Pais()
    {
    }

    public Pais(int id, String nombre, boolean estatus)
    {
        this.id = id;
        this.nombre = nombre;
        this.estatus = estatus;
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
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the estatus
     */
    public boolean isEstatus()
    {
        return estatus;
    }

    /**
     * @param estatus the estatus to set
     */
    public void setEstatus(boolean estatus)
    {
        this.estatus = estatus;
    }
}
