package clases;

/**
 *
 * @author Kevin
 */
public class Entidades
{

    private int id;
    private int id_Pais;
    private String nombre;
    private boolean estatus;

    public Entidades()
    {
    }

    public Entidades(int clave_Pais, int id, String nombre, boolean estatus)
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

    /**
     * @return the id_Pais
     */
    public int getId_Pais()
    {
        return id_Pais;
    }

    /**
     * @param id_Pais the id_Pais to set
     */
    public void setId_Pais(int id_Pais)
    {
        this.id_Pais = id_Pais;
    }

    public void BuscarP(int id)
    {
        this.id_Pais = id;
    }

    public void BuscarP(String nombre)
    {

    }
}
