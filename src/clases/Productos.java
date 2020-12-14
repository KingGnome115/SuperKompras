package clases;

/**
 *
 * @author Kevin
 */
//aqui hace falta la clase de verificar segun tu diagrama :v
//
//
public class Productos
{

    private int id;
    private int id_Proveedor;
    private int codigo;
    private String nombre;
    private String descripcion;
    private float precio_Venta;
    private float precio_Compra;
    private boolean perecedero;
    private int cantidad;
    private float peso;
    private String caducidad;
    private String marca;
    private boolean estatus;
    private boolean existencias;
    private int ventas;

    public Productos()
    {
    }

    public Productos(int id, int id_Proveedor, int codigo, String nombre, String descripcion, float precio_Venta,
            float precio_Compra, boolean perecedero, int cantidad, float peso, String caducidad, String marca,
            boolean estatus, boolean existencias, int ventas)
    {
        this.id = id;
        this.id_Proveedor = id_Proveedor;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_Venta = precio_Venta;
        this.precio_Compra = precio_Compra;
        this.perecedero = perecedero;
        this.cantidad = cantidad;
        this.peso = peso;
        this.caducidad = caducidad;
        this.marca = marca;
        this.estatus = estatus;
        this.existencias = existencias;
        this.ventas = ventas;
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
     * @return the id_Proveedor
     */
    public int getId_Proveedor()
    {
        return id_Proveedor;
    }

    /**
     * @param id_Proveedor the id_Proveedor to set
     */
    public void setId_Proveedor(int id_Proveedor)
    {
        this.id_Proveedor = id_Proveedor;
    }

    /**
     * @return the codigo
     */
    public int getCodigo()
    {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
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
     * @return the descripcion
     */
    public String getDescripcion()
    {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio_Venta
     */
    public float getPrecio_Venta()
    {
        return precio_Venta;
    }

    /**
     * @param precio_Venta the precio_Venta to set
     */
    public void setPrecio_Venta(float precio_Venta)
    {
        this.precio_Venta = precio_Venta;
    }

    /**
     * @return the precio_Compra
     */
    public float getPrecio_Compra()
    {
        return precio_Compra;
    }

    /**
     * @param precio_Compra the precio_Compra to set
     */
    public void setPrecio_Compra(float precio_Compra)
    {
        this.precio_Compra = precio_Compra;
    }

    /**
     * @return the perecedero
     */
    public boolean isPerecedero()
    {
        return perecedero;
    }

    /**
     * @param perecedero the perecedero to set
     */
    public void setPerecedero(boolean perecedero)
    {
        this.perecedero = perecedero;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad()
    {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

    /**
     * @return the peso
     */
    public float getPeso()
    {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso)
    {
        this.peso = peso;
    }

    /**
     * @return the caducidad
     */
    public String getCaducidad()
    {
        return caducidad;
    }

    /**
     * @param caducidad the caducidad to set
     */
    public void setCaducidad(String caducidad)
    {
        this.caducidad = caducidad;
    }

    /**
     * @return the marca
     */
    public String getMarca()
    {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca)
    {
        this.marca = marca;
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
     * @return the existencias
     */
    public boolean isExistencias()
    {
        return existencias;
    }

    /**
     * @param existencias the existencias to set
     */
    public void setExistencias(boolean existencias)
    {
        this.existencias = existencias;
    }

    /**
     * @return the ventas
     */
    public int getVentas()
    {
        return ventas;
    }

    /**
     * @param ventas the ventas to set
     */
    public void setVentas(int ventas)
    {
        this.ventas = ventas;
    }

    public boolean isCantidad()
    {
        if (cantidad != 0)
        {
            return true;
        } else
        {
            return false;
        }
    }

}
