package clases;

import java.sql.Connection;
import java.util.ArrayList;
import poo.bd.Conexion;
import poo.bd.Querys;

/**
 *
 * @author Kevin
 */
public class ManipulaBD
{

    private static Conexion con = new Conexion();

    public static Connection conecta()
    {
        try
        {
            return con.Conecta("localhost:3306", "snk", "root", "", 2);
        } catch (Exception e)
        {
            System.out.println("Error al conectar a la base de datoa");
            return null;
        }
    }

    public static void desconecta(Connection conn)
    {
        con.desconectar(conn);
    }

    public static ArrayList<Tipo_Usuario> CargarTipo_Usuario(ArrayList<Object> reg)
    {
        ArrayList<Tipo_Usuario> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 4)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != " " && idS != "")
                {
                    int id = Integer.parseInt(idS);
                    String usuario = ((String) reg.get(i + 1)).trim();
                    String contrasenia = ((String) reg.get(i + 2)).trim();
                    String es = ((String) reg.get(i + 3)).trim();
                    boolean estatus = Boolean.parseBoolean(es);
                    Tipo_Usuario obj = new Tipo_Usuario(id, usuario, contrasenia, estatus);
                    lista.add(obj);
                }
            }

            return lista;
        } catch (Exception e)
        {
            System.out.println("Error al crear objeto");
            if (lista != null)
            {
                return lista;
            } else
            {
                return null;
            }
        }
    }

    public static ArrayList<Personas> CargarPersonas(ArrayList<Object> reg, ArrayList<Tipo_Usuario> he)
    {
        ArrayList<Personas> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 8)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != "" && idS != " ")
                {
                    int id = Integer.parseInt(idS);
                    String clasificacionS = ((String) reg.get(i + 1)).trim();
                    int clasificacion = Integer.parseInt(clasificacionS);
                    String sueldoS = ((String) reg.get(i + 2)).trim();
                    float sueldo = Float.parseFloat(sueldoS);
                    String nombre = ((String) reg.get(i + 3)).trim();
                    String apellidoP = ((String) reg.get(i + 4)).trim();
                    String apellidoM = ((String) reg.get(i + 5)).trim();
                    String sexo = ((String) reg.get(i + 6)).trim();
                    String es = ((String) reg.get(i + 7)).trim();
                    boolean estatus = Boolean.parseBoolean(es);
                    Personas obj = new Personas(he.get(id).getId(), he.get(id).getUsuario(), he.get(id).getContrasenia(), id,
                            clasificacion, sueldo, nombre, apellidoP, apellidoM, sexo, estatus);
                    lista.add(obj);
                }
            }
            return lista;
        } catch (Exception e)
        {
            System.out.println("Error al crear objeto");
            if (lista != null)
            {
                return lista;
            } else
            {
                return null;
            }
        }
    }

    public static ArrayList<Incidentes> CargarIncidentes(ArrayList<Object> reg)
    {
        ArrayList<Incidentes> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 7)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != " " && idS != "")
                {
                    int id = Integer.parseInt(idS);
                    String descripcion = ((String) reg.get(i + 1)).trim();
                    descripcion = descripcion.replace("|", " ");
                    String horaS = ((String) reg.get(i + 2)).trim();
                    int hora = Integer.parseInt(horaS);
                    String minutoS = ((String) reg.get(i + 3)).trim();
                    int minuto = Integer.parseInt(minutoS);
                    String diaS = ((String) reg.get(i + 4)).trim();
                    int dia = Integer.parseInt(diaS);
                    String mesS = ((String) reg.get(i + 5)).trim();
                    int mes = Integer.parseInt(mesS);
                    String anioS = ((String) reg.get(i + 6)).trim();
                    int anio = Integer.parseInt(anioS);
                    Incidentes obj = new Incidentes(id, descripcion, hora, minuto, dia, mes, anio);
                    lista.add(obj);

                }
            }
            return lista;
        } catch (Exception e)
        {
            System.out.println("Error al crear objeto");
            if (lista != null)
            {
                return lista;
            } else
            {
                return null;
            }
        }
    }

    public static ArrayList<Informes> CargarInformes(ArrayList<Object> reg)
    {
        ArrayList<Informes> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 9)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != " " && idS != "")
                {
                    int folio = Integer.parseInt(idS);
                    String id_VentasS = ((String) reg.get(i + 1)).trim();
                    int id_Ventas = Integer.parseInt(id_VentasS);
                    String dia = ((String) reg.get(i + 2)).trim();
                    String producto_masS = ((String) reg.get(i + 3)).trim();
                    int producto_Mas = Integer.parseInt(producto_masS);
                    String producto_menosS = ((String) reg.get(i + 4)).trim();
                    int producto_Menos = Integer.parseInt(producto_menosS);
                    String marca_mas = ((String) reg.get(i + 5)).trim();
                    String marca_menos = ((String) reg.get(i + 6)).trim();
                    String gananciasS = ((String) reg.get(i + 7)).trim();
                    float ganancias = Float.parseFloat(gananciasS);
                    String perdidasS = ((String) reg.get(i + 8)).trim();
                    float perdidas = Float.parseFloat(perdidasS);
                    Informes obj = new Informes(folio, id_Ventas, dia, producto_Mas, producto_Menos, marca_mas,
                            marca_menos, ganancias, perdidas);
                    lista.add(obj);
                }
            }
            return lista;
        } catch (Exception e)
        {
            System.out.println("Error al crear objeto");
            if (lista != null)
            {
                return lista;
            } else
            {
                return null;
            }
        }
    }

    public static ArrayList<Ventas> CargarVentas(ArrayList<Object> reg)
    {
        ArrayList<Ventas> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 7)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != "" && idS != " ")
                {
                    int id = Integer.parseInt(idS);
                    String id_DVS = ((String) reg.get(i + 1)).trim();
                    int id_DV = Integer.parseInt(id_DVS);
                    String productoS = ((String) reg.get(i + 2)).trim();
                    int producto = Integer.parseInt(productoS);
                    String fecha = ((String) reg.get(i + 3)).trim();
                    String horaS = ((String) reg.get(i + 4)).trim();
                    int hora = Integer.parseInt(horaS);
                    String cantidadVS = ((String) reg.get(i + 5)).trim();
                    int cantidadV = Integer.parseInt(cantidadVS);
                    String CostosS = ((String) reg.get(i + 6)).trim();
                    int Costos = Integer.parseInt(CostosS);
                    Ventas obj = new Ventas(id, id_DV, producto, fecha, hora, cantidadV, Costos);
                    lista.add(obj);

                }
            }

            return lista;
        } catch (Exception e)
        {
            System.out.println("Error al crear objeto");
            if (lista != null)
            {
                return lista;
            } else
            {
                return null;
            }
        }
    }

    public static ArrayList<Detalles_Ventas> CargarDetalles_Ventas(ArrayList<Object> reg)
    {
        ArrayList<Detalles_Ventas> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 5)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != " " && idS != "")
                {
                    int id = Integer.parseInt(idS);
                    String id_ProductosS = ((String) reg.get(i + 1)).trim();
                    int id_productos = Integer.parseInt(id_ProductosS);
                    String id_personasS = ((String) reg.get(i + 2)).trim();
                    int id_personas = Integer.parseInt(id_personasS);
                    String id_CantidadS = ((String) reg.get(i + 3)).trim();
                    int id_Cantidad = Integer.parseInt(id_CantidadS);
                    String precio_TotalS = ((String) reg.get(i + 4)).trim();
                    float precio_Total = Float.parseFloat(precio_TotalS);
                    Detalles_Ventas obj = new Detalles_Ventas(id, id_productos, id_personas, id_Cantidad, precio_Total);
                    lista.add(obj);
                }
            }
            return lista;
        } catch (Exception e)
        {
            System.out.println("Error al crear objeto");
            if (lista != null)
            {
                return lista;
            } else
            {
                return null;
            }
        }
    }

    public static ArrayList<Productos> CargarProductos(ArrayList<Object> reg)
    {
        ArrayList<Productos> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 9)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != " " && idS != "")
                {
                    int id = Integer.parseInt(idS);
                    String codigoS = ((String) reg.get(i + 1)).trim();
                    int codigo = Integer.parseInt(codigoS);
                    String id_ProveedorS = ((String) reg.get(i + 2)).trim();
                    int id_Proveedor = Integer.parseInt(id_ProveedorS);
                    String ventasS = ((String) reg.get(i + 3)).trim();
                    int ventas = Integer.parseInt(ventasS);
                    String nombre = ((String) reg.get(i + 4)).trim();
                    String descripcion = ((String) reg.get(i + 5)).trim();
                    String precio_VentasS = ((String) reg.get(i + 6)).trim();
                    float precio_Ventas = Float.parseFloat(precio_VentasS);
                    String precio_CompraS = ((String) reg.get(i + 7)).trim();
                    float precio_Compra = Float.parseFloat(precio_CompraS);
                    String es = ((String) reg.get(i + 8)).trim();
                    boolean perecedero = Boolean.parseBoolean(es);
                    Productos obj = new Productos(id, codigo, id_Proveedor, ventas, nombre, descripcion, precio_Ventas,
                            precio_Compra, perecedero);
                    lista.add(obj);
                }
            }
            return lista;
        } catch (Exception e)
        {
            System.out.println("Error al crear objeto");
            if (lista != null)
            {
                return lista;
            } else
            {
                return null;
            }
        }
    }

    public static ArrayList<Proveedores> CargarProveedores(ArrayList<Object> reg)
    {
        ArrayList<Proveedores> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 12)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != "" && idS != " ")
                {
                    int id = Integer.parseInt(idS);
                    String id_MunicipioS = ((String) reg.get(i + 1)).trim();
                    int id_Municipio = Integer.parseInt(id_MunicipioS);
                    String nombre = ((String) reg.get(i + 2)).trim();
                    String apellidoP = ((String) reg.get(i + 3)).trim();
                    String apellidoM = ((String) reg.get(i + 4)).trim();
                    String rfc = ((String) reg.get(i + 5)).trim();
                    String razon_Social = ((String) reg.get(i + 6)).trim();
                    String direccion = ((String) reg.get(i + 7)).trim();
                    String cpS = ((String) reg.get(i + 8)).trim();
                    int cp = Integer.parseInt(cpS);
                    String telefonoS = ((String) reg.get(i + 9)).trim();
                    int telefono = Integer.parseInt(telefonoS);
                    String email = ((String) reg.get(i + 10)).trim();
                    String es = ((String) reg.get(i + 11)).trim();
                    boolean estatus = Boolean.parseBoolean(es);
                    Proveedores obj = new Proveedores(id, id_Municipio, nombre, apellidoP, apellidoM, rfc,
                            razon_Social, direccion, cp, telefono, email, estatus);
                    lista.add(obj);
                }
            }
            return lista;
        } catch (Exception e)
        {
            System.out.println("Error al crear objeto");
            if (lista != null)
            {
                return lista;
            } else
            {
                return null;
            }
        }
    }

    public static ArrayList<Municipio> CargarMunicipio(ArrayList<Object> reg)
    {
        ArrayList<Municipio> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 4)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != "" && idS != " ")
                {
                    int id = Integer.parseInt(idS);
                    String id_EntidadS = ((String) reg.get(i + 1)).trim();
                    int id_Entidad = Integer.parseInt(id_EntidadS);
                    String es = ((String) reg.get(i + 2)).trim();
                    boolean estatus = Boolean.parseBoolean(es);
                    String nombre = ((String) reg.get(i + 3)).trim();
                    Municipio obj = new Municipio(id, id_Entidad, estatus, nombre);
                    lista.add(obj);
                }
            }
            return lista;
        } catch (Exception e)
        {
            System.out.println("Error al crear objeto");
            if (lista != null)
            {
                return lista;
            } else
            {
                return null;
            }
        }
    }

    public static ArrayList<Entidades> CargarEntidades(ArrayList<Object> reg)
    {
        ArrayList<Entidades> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 5)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != "" && idS != " ")
                {
                    int id = Integer.parseInt(idS);
                    String id_PaisS = ((String) reg.get(i + 1)).trim();
                    int id_Pais = Integer.parseInt(id_PaisS);
                    String nombre = ((String) reg.get(i + 2)).trim();
                    String es = ((String) reg.get(i + 3)).trim();
                    boolean estatus = Boolean.parseBoolean(es);
                    Entidades obj = new Entidades(id_Pais, id, nombre, estatus);
                    lista.add(obj);
                }
            }

            return lista;
        } catch (Exception e)
        {
            System.out.println("Error al crear objeto");
            if (lista != null)
            {
                return lista;
            } else
            {
                return null;
            }
        }
    }

    public static ArrayList<Pais> CargarPais(ArrayList<Object> reg)
    {
        ArrayList<Pais> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 3)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != "" && idS != " ")
                {
                    int id = Integer.parseInt(idS);
                    String nombre = ((String) reg.get(i + 1)).trim();
                    String es = ((String) reg.get(i + 2)).trim();
                    boolean estatus = Boolean.parseBoolean(es);
                    Pais obj = new Pais(id, nombre, estatus);
                    lista.add(obj);
                }
            }
            return lista;
        } catch (Exception e)
        {
            System.out.println("Error al crear objeto");
            if (lista != null)
            {
                return lista;
            } else
            {
                return null;
            }
        }
    }

    //Altas Bajas Consultas y Modificaciones de las clases
    /**
     * Método para dar de alta a una persona/tipo_Usuario
     *
     * @param id tipo int
     * @param usuario tipo String
     * @param contrasenia tipo String
     * @param estatus tipo boolean
     * @param clasificaciont tipo int
     * @param sueldo tipo float
     * @param nombre tipo String
     * @param apellidoP tipo String
     * @param apellidoM tipo String
     * @param sexo tipo String
     */
    public static void AltasPersonas(int id, String usuario, String contrasenia, boolean estatus, int clasificacion,
            float sueldo, String nombre, String apellidoP, String apellidoM, String sexo)
    {
        String estatusS = String.valueOf(estatus);
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Insertar(con, "tipo_usuario",
                    "" + id + ",'"
                    + usuario + "','"
                    + contrasenia + "','"
                    + estatusS + "'"
            );
            sql.Insertar(con, "personas",
                    "" + id + ","
                    + clasificacion + ","
                    + sueldo + ",'"
                    + nombre + "','"
                    + apellidoP + "','"
                    + apellidoM + "','"
                    + sexo + "','"
                    + estatusS + "'"
            );
            ManipulaBD.desconecta(con);
            System.out.println("Dato insertado");
        }
    }

    /**
     * Método para eliminar un registro de la bd que permite solo por id para
     * evitar errores
     *
     * @param id tipo int
     */
    public static void BajasPersonas(int id)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Delete(con, "tipo_usuario", "id", "" + id + "");
            sql.Delete(con, "personas", "id", "" + id + "");
        }
        ManipulaBD.desconecta(con);
    }

    /**
     * Método para traer a las personas de las tablas "personas" y
     * "Tipo_Usuario"
     *
     * @param variable a traves de que variable se va abuscar en la base ejemplo
     * "id=" es importante poner el igual
     * @param condicion cual es la condicion por la cual se traera el objeto
     * ejemplo "1" si es String seria "'1'"
     * @return un ArrayList de personas que ya tiene como herencia tipo_Usuarios
     */
    public static ArrayList<Personas> ConsultasPersonas(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Personas> ap = null;
        if (con != null)
        {
            Querys sql = new Querys();
            ArrayList<Tipo_Usuario> apt = ManipulaBD.CargarTipo_Usuario(sql.Seleccion(con, "*", "tipo_usuario", variable + condicion));
            if (apt != null)
            {
                ap = ManipulaBD.CargarPersonas(sql.Seleccion(con, "*", "personas", variable + condicion), apt);
                System.out.println("Dato encontrado");
            } else
            {
                System.out.println("No se encontro el dato");
            }
        }
        return ap;
    }

    /**
     * Método para modificar datos en la bd de un usuario
     *
     * @param id tipo int
     * @param campos los campos que seran cambiados ejemplo "Nombre,sueldo"
     * @param datos los datos nuevos que seran replazados en la bd ejemplos:
     * "'pedro',12.50" los string con comillas simples y los numeros sin ellas
     */
    public static void ModificarPersona(int id, String campos, String datos)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            ArrayList<Tipo_Usuario> ap = ManipulaBD.CargarTipo_Usuario(sql.Seleccion(con, "*", "tipo_usuario", "id=" + id + ""));
            if (ap != null)
            {
                sql.Modificar(con, "personas", campos, datos, "id='" + id + "'");
                ManipulaBD.desconecta(con);
                System.out.println("Modificados");
            }
        }
    }

    /**
     * Métodos que registra incidentes en la tabla
     *
     * @param id tipo int
     * @param descipcion tipo descripcion
     * @param hora tipo int
     * @param minuto tipo int
     * @param dia tipo int
     * @param mes tipo int
     * @param anio tipo int
     */
    public static void AltasIncidentes(int id, String descipcion, int hora, int minuto, int dia, int mes, int anio)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            descipcion = descipcion.replace(" ", "|");
            sql.Insertar(con, "incidentes",
                    "" + id + ",'"
                    + descipcion + "',"
                    + hora + ","
                    + minuto + ","
                    + dia + ","
                    + mes + ","
                    + anio + ""
            );
        }
    }

    /**
     * Se debe enviar el id del inicidente para dar de baja el incidente
     *
     * @param id tipo int
     */
    public static void BajasIncidentes(int id)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Delete(con, "incidentes", "id", "" + id + "");
        }
        ManipulaBD.desconecta(con);
    }

    /**
     * Métodos para la consulta en la base de datos de la tabla incidentes y
     * retorna el o los objetos enforma de arraylist
     *
     * @param variable a traves de la cual se buscara el objeto ejemplo "id="
     * @param condicion con el cual se comparara el dato ejemplo "0" Si quiere
     * traer todos los datos variable debe ser "id!=" y la condicion "-1"
     * @return ArrayList de incidentes
     */
    public static ArrayList<Incidentes> ConsultasIncidentes(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Incidentes> ap = null;
        if (con != null)
        {
            Querys sql = new Querys();
            ap = ManipulaBD.CargarIncidentes(sql.Seleccion(con, "*", "incidentes", variable + condicion));
            ManipulaBD.desconecta(con);
            if (ap != null)
            {
                System.out.println("Dato encontrado");
            } else
            {
                System.out.println("Dato no encontrado");
            }
        }
        return ap;
    }

    public static void AltasInformes(int folio, int id_Ventas, String dia, int producto_Mas, int producto_Menos,
            String marca_Mas, String marca_Menos, float ganancias, float perdidas)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Insertar(con, "informes",
                    "" + folio + ","
                    + id_Ventas + ",'"
                    + dia + "',"
                    + producto_Mas + ","
                    + producto_Menos + ",'"
                    + marca_Mas + "','"
                    + marca_Menos + "',"
                    + ganancias + ","
                    + perdidas + ""
            );
            ManipulaBD.desconecta(con);
            System.out.println("Dato insertado");
        }
    }

    /**
     * Métodos para la consulta en la base de datos de la tabla incidentes y
     * retorna el o los objetos enforma de arraylist
     *
     * @param variable a traves de la cual se buscara el objeto ejemplo "id="
     * @param condicion con el cual se comparara el dato ejemplo "0" Si quiere
     * traer todos los datos variable debe ser "id!=" y la condicion "-1"
     * @return ArrayList de incidentes
     */
    public static ArrayList<Informes> ConsultasInformes(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Informes> ap = null;
        if (con != null)
        {
            Querys sql = new Querys();
            ap = ManipulaBD.CargarInformes(sql.Seleccion(con, "*", "incidentes", variable + condicion));
            ManipulaBD.desconecta(con);
            if (ap != null)
            {
                System.out.println("Dato encontrado");
            } else
            {
                System.out.println("Dato no encontrado");
            }
        }
        return ap;
    }

    public static void AltasDetalles_Ventas(int id, int id_Productos, int id_Personas, int id_CantidadV, float precio_Total)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Insertar(con, "detalles_ventas",
                    "" + id + ","
                    + id_Productos + ","
                    + id_Personas + ","
                    + id_CantidadV + ","
                    + precio_Total + ""
            );
            ManipulaBD.desconecta(con);
            System.out.println("Dato insertado");
        }
    }

    public static ArrayList<Detalles_Ventas> ConsultasDetalles_Ventas(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Detalles_Ventas> ap = null;
        if (con != null)
        {
            Querys sql = new Querys();
            ap = ManipulaBD.CargarDetalles_Ventas(sql.Seleccion(con, "*", "detalles_ventas", variable + condicion));
            ManipulaBD.desconecta(con);
            if (ap != null)
            {
                System.out.println("Datos encontrados");
            } else
            {
                System.out.println("Datos no encontrados");
            }
        }
        return ap;
    }

    public static void AltasVentas(int id, int id_DV, int producto, String fecha, int hora, int cantidadV, float Costos)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Insertar(con, "ventas",
                    "" + id + ","
                    + id_DV + ","
                    + producto + ",'"
                    + fecha + "',"
                    + hora + ","
                    + cantidadV + ","
                    + Costos + ""
            );
        }
    }

    public static ArrayList<Ventas> ConsultasVentas(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Ventas> ap = null;
        if (con != null)
        {
            Querys sql = new Querys();
            ap=ManipulaBD.CargarVentas(sql.Seleccion(con, "*", "ventas", variable+condicion));
            ManipulaBD.desconecta(con);
            if (ap!=null)
            {
                System.out.println("Datos encontrados");
            } else
            {
                System.out.println("Datos no encontrados");
            }
        }
        return ap;
    }
}
