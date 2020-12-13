package clases;

/**
 *
 * @author Kevin
 */
public class Detalles_Ventas
{
    private int id;
    private int id_Productos;
    private int CantidadV;
    private float precio_Total;

    public Detalles_Ventas()
    {
    }

    public Detalles_Ventas(int id, int id_Productos, int CantidadV, float precio_Total)
    {
        this.id = id;
        this.id_Productos = id_Productos;
        this.CantidadV = CantidadV;
        this.precio_Total = precio_Total;
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
     * @return the id_Productos
     */
    public int getId_Productos()
    {
        return id_Productos;
    }

    /**
     * @param id_Productos the id_Productos to set
     */
    public void setId_Productos(int id_Productos)
    {
        this.id_Productos = id_Productos;
    }

    /**
     * @return the CantidadV
     */
    public int getCantidadV()
    {
        return CantidadV;
    }

    /**
     * @param CantidadV the CantidadV to set
     */
    public void setCantidadV(int CantidadV)
    {
        this.CantidadV = CantidadV;
    }

    /**
     * @return the precio_Total
     */
    public float getPrecio_Total()
    {
        return precio_Total;
    }

    /**
     * @param precio_Total the precio_Total to set
     */
    public void setPrecio_Total(float precio_Total)
    {
        this.precio_Total = precio_Total;
    }
    
    
}