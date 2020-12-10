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
            int con = 0;
            for (int i = 0; i < reg.size(); i += 8)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != "" && idS != " " && idS != null)
                {
                    System.out.println("Inicie creacion de objetos");
                    System.out.println(reg.size());
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
                    Personas obj = new Personas(he.get(con).getId(), he.get(con).getUsuario(), he.get(con).getContrasenia(), id,
                            clasificacion, sueldo, nombre, apellidoP, apellidoM, sexo, estatus);
                    lista.add(obj);
                    con++;
                }
            }
            return lista;
        } catch (Exception e)
        {
            if (!lista.isEmpty())
            {
                return lista;
            } else
            {
                return null;
            }
        }
    }

    public static ArrayList<Incidentes1> CargarIncidentes(ArrayList<Object> reg)
    {
        ArrayList<Incidentes1> lista = new ArrayList<>();
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
                    String descripcion = ((String) reg.get(i + 1)).trim();
                    descripcion = descripcion.replace("|", " ");
                    String horaS = ((String) reg.get(i + 2)).trim();
                    int hora = Integer.parseInt(horaS);
                    String minutoS = ((String) reg.get(i + 3)).trim();
                    int minuto = Integer.parseInt(minutoS);
                    String fecha = ((String) reg.get(i + 4)).trim();
                    Incidentes1 obj = new Incidentes1(id, descripcion, hora, minuto, fecha);
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
            for (int i = 0; i < reg.size(); i += 15)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != " " && idS != "")
                {
                    int id = Integer.parseInt(idS);
                    String id_ProveedorS = ((String) reg.get(i + 1)).trim();
                    int id_Proveedor = Integer.parseInt(id_ProveedorS);
                    String codigoS = ((String) reg.get(i + 2)).trim();
                    int codigo = Integer.parseInt(codigoS);
                    String nombre = ((String) reg.get(i + 3)).trim();
                    String descripcion = ((String) reg.get(i + 4)).trim();
                    descripcion = descripcion.replace("|", " ");
                    String precio_VentasS = ((String) reg.get(i + 5)).trim();
                    float precio_Ventas = Float.parseFloat(precio_VentasS);
                    String precio_CompraS = ((String) reg.get(i + 6)).trim();
                    float precio_Compra = Float.parseFloat(precio_CompraS);
                    String pe = ((String) reg.get(i + 7)).trim();
                    boolean perecedero = Boolean.parseBoolean(pe);
                    String cantidadS = ((String) reg.get(i + 8)).trim();
                    int cantidad = Integer.parseInt(cantidadS);
                    String pesoS = ((String) reg.get(i + 9)).trim();
                    float peso = Float.parseFloat(pesoS);
                    String caducidad = ((String) reg.get(i + 10)).trim();
                    String marca = ((String) reg.get(i + 11)).trim();
                    marca = marca.replace("|", " ");
                    String es = ((String) reg.get(i + 12)).trim();
                    boolean estatus = Boolean.parseBoolean(es);
                    String ex = ((String) reg.get(i + 13)).trim();
                    boolean existencias = Boolean.parseBoolean(ex);
                    String ventasS = ((String) reg.get(i + 14)).trim();
                    int ventas = Integer.parseInt(ventasS);

                    Productos obj = new Productos(id, id_Proveedor, codigo, nombre, descripcion, precio_Ventas,
                            precio_Compra, perecedero, cantidad, peso, caducidad, marca, estatus, existencias, ventas);
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
                    direccion = direccion.replace("|", " ");
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
            for (int i = 0; i < reg.size(); i += 4)
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
     * @param clasificacion tipo int
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
            } else
            {
                System.out.println("No se encontro el dato");
            }
        }
        return ap;
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
    public static ArrayList<Tipo_Usuario> ConsultasTipo_Usuario(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Tipo_Usuario> ap = null;
        if (con != null)
        {
            Querys sql = new Querys();
            ap = ManipulaBD.CargarTipo_Usuario(sql.Seleccion(con, "*", "tipo_usuario", variable + condicion));
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
     * @param fecha tipo String
     */
    public static void AltasIncidentes(int id, String descipcion, int hora, int minuto, String fecha)
    {
        Connection con = ManipulaBD.conecta();
        descipcion.replace(" ", "|");
        if (con != null)
        {
            Querys sql = new Querys();
            descipcion = descipcion.replace(" ", "|");
            sql.Insertar(con, "incidentes",
                    "" + id + ",'"
                    + descipcion + "',"
                    + hora + ","
                    + minuto + ",'"
                    + fecha + "'"
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
    public static ArrayList<Incidentes1> ConsultasIncidentes(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Incidentes1> ap = null;
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

    /**
     * Método para dar de alta los detalles_Ventas
     *
     * @param id tipo int
     * @param id_Productos tipo int
     * @param id_Personas tipo int
     * @param id_CantidadV tipo int
     * @param precio_Total tipo float
     */
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

    /**
     * Método que da de alta las ventas
     *
     * @param id tipo int
     * @param id_DV tipo int
     * @param producto tipo int
     * @param fecha tipo String
     * @param hora tipo int
     * @param cantidadV tipo int
     * @param Costos tipo float
     */
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
            ap = ManipulaBD.CargarVentas(sql.Seleccion(con, "*", "ventas", variable + condicion));
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

    /**
     * Método que hace alta de productos en la bd
     *
     * @param id tipo int
     * @param id_Proveedor tipo int
     * @param codigo tipo int
     * @param nombre tipo String
     * @param descripcion tipo String
     * @param precio_Venta tipo float
     * @param precio_Compra tipo float
     * @param perecedero tipo boolean
     * @param cantidad tipo int
     * @param peso tipo float
     * @param caducidad tipo String
     * @param marca tipo String
     * @param estatus tipo boolean
     * @param existencias tipo boolean
     * @param ventas tipo int
     */
    public static void AltasProductos(int id, int id_Proveedor, int codigo, String nombre, String descripcion,
            float precio_Venta, float precio_Compra, boolean perecedero, int cantidad, float peso, String caducidad,
            String marca, boolean estatus, boolean existencias, int ventas)
    {
        Connection con = ManipulaBD.conecta();
        String perecederoS = String.valueOf(perecedero);
        String estatusS = String.valueOf(estatus);
        String existenciasS = String.valueOf(existencias);
        descripcion = descripcion.replace(" ", "|");
        marca = marca.replace(" ", "|");
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Insertar(con, "productos",
                    "" + id + ","
                    + id_Proveedor + ","
                    + codigo + ",'"
                    + nombre + "','"
                    + descripcion + "',"
                    + precio_Venta + ","
                    + precio_Compra + ",'"
                    + perecederoS + "',"
                    + cantidad + ","
                    + peso + ",'"
                    + caducidad + "','"
                    + marca + "','"
                    + estatusS + "','"
                    + existenciasS + "',"
                    + ventas + ""
            );
            ManipulaBD.desconecta(con);
            System.out.println("Dato insertado");
        }
    }

    /**
     * Se debe enviar el id ya que es unico e impide la eliminacion de un dato
     * erroneo así como se recomienda hacer uso del metodo ConsultasProductos el
     * cual sera usado para encontrar cual es dato que se quiere eliminar
     *
     * @param id tipo int es el identificador unico del objeto en la bd
     */
    public static void BajasProductos(int id)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Delete(con, "productos", "id", "" + id + "");
        }
        ManipulaBD.desconecta(con);
    }

    /**
     * Método para colsutar en la bd en la tabla de Materias1 y retorna el
     * objeto o los objetos en un arraylist esto con la intencion de traer lo
     * que se requiera en el momento
     *
     * "id!=" "-1"
     *
     * @param variable que variable va a buscar en la base ejemplo "Nombre=" es
     * importante poner el igual
     * @param condicion cual es la condicion por la cual se extraera el objeto
     * ejemplo "'Firulais'" Nota: los números van sin comillas y los String
     * entre comillas simples
     * @return ArrayList de Materias1 dada la condicion enviada
     */
    public static ArrayList<Productos> ConsultasProductos(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Productos> ap = null;
        if (con != null)
        {
            Querys sql = new Querys();
            ap = ManipulaBD.CargarProductos(sql.Seleccion(con, "*", "productos", variable + condicion));
            ManipulaBD.desconecta(con);
            if (ap != null)
            {
                System.out.println("Datos Encontrados");
            } else
            {
                System.out.println("Datos no Encontrados");
            }
        }
        return ap;
    }

    /**
     * Método para modificar datos en la bd de un objeto productos
     *
     * @param id el id de la persona que se modificara sus datos
     * @param campos los campos que seran cambiados ejemplo: "Nombre,Telefono"
     * @param datos los datos nuevos que seran remplazados en la bd ejemplo:
     * "'Pancho',1234" los datos tipos String deben ser puestos entre comillas
     * simples
     */
    public static void ModificarProductos(int id, String campos, String datos)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            ArrayList<Productos> ap = ManipulaBD.CargarProductos(sql.Seleccion(con, "*", "productos", "id=" + id + ""));
            if (ap != null)
            {
                sql.Modificar(con, "productos", campos, datos, "id=" + id + "");
                ManipulaBD.desconecta(con);
                System.out.println("Modificados");
            }
        }
    }

    /**
     * Método para dar de altas proveedores
     *
     * @param id tipo int
     * @param id_Municipio tipo int
     * @param nombre tipo String
     * @param apellidoP tipo String
     * @param apellidoM tipo String
     * @param rfc tipo String
     * @param razon_Social tipo String
     * @param direccion tipo String
     * @param cp tipo int
     * @param telefono tipo int
     * @param email tipo String
     * @param estatus tipo boolean
     */
    public static void AltasProveedores(int id, int id_Municipio, String nombre, String apellidoP, String apellidoM,
            String rfc, String razon_Social, String direccion, int cp, int telefono, String email, boolean estatus)
    {
        Connection con = ManipulaBD.conecta();
        String estatusS = String.valueOf(estatus);
        direccion = direccion.replace(" ", "|");
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Insertar(con, "proveedores",
                    "" + id + ","
                    + id_Municipio + ",'"
                    + nombre + "','"
                    + apellidoP + "','"
                    + apellidoM + "','"
                    + rfc + "','"
                    + razon_Social + "','"
                    + direccion + "',"
                    + cp + ","
                    + telefono + ",'"
                    + email + "','"
                    + estatusS + "'"
            );
            ManipulaBD.desconecta(con);
            System.out.println("Dato Insertado");
        }
    }

    /**
     * Se debe enviar el id ya que es unico e impide la eliminacion de un dato
     * erroneo así como se recomienda hacer uso del metodo ConsultasProveedores
     * el cual sera usado para encontrar cual es dato que se quiere eliminar
     *
     * @param id tipo int es el identificador unico del objeto en la bd
     */
    public static void BajasProveedore(int id)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Delete(con, "proveedores", "id", "" + id + "");
        }
        ManipulaBD.desconecta(con);
    }

    /**
     * Método para colsutar en la bd en la tabla de proveedores y retorna el
     * objeto o los objetos en un arraylist esto con la intencion de traer lo
     * que se requiera en el momento
     *
     * "id!=" "-1"
     *
     * @param variable que variable va a buscar en la base ejemplo "Nombre=" es
     * importante poner el igual
     * @param condicion cual es la condicion por la cual se extraera el objeto
     * ejemplo "'Firulais'" Nota: los números van sin comillas y los String
     * entre comillas simples
     * @return ArrayList de Materias1 dada la condicion enviada
     */
    public static ArrayList<Proveedores> ConsultasProveedores(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Proveedores> ap = null;
        if (con != null)
        {
            Querys sql = new Querys();
            ap = ManipulaBD.CargarProveedores(sql.Seleccion(con, "*", "proveedores", variable + condicion));
            ManipulaBD.desconecta(con);
            if (ap != null)
            {
                System.out.println("Datos Encontrados");
            } else
            {
                System.out.println("Datos No Encontrados");
            }
        }
        return ap;
    }

    /**
     * Método para modificar datos en la bd de un objeto proveedores
     *
     * @param id el id de la persona que se modificara sus datos
     * @param campos los campos que seran cambiados ejemplo: "Nombre,Telefono"
     * @param datos los datos nuevos que seran remplazados en la bd ejemplo:
     * "'Pancho',1234" los datos tipos String deben ser puestos entre comillas
     * simples
     */
    public static void ModificarProveedores(int id, String campos, String datos)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            ArrayList<Proveedores> ap = ManipulaBD.CargarProveedores(sql.Seleccion(con, "*", "proveedores", "id=" + id + ""));
            if (ap != null)
            {
                sql.Modificar(con, "proveedores", campos, datos, "id=" + id + "");
                ManipulaBD.desconecta(con);
                System.out.println("Modificados");
            }
        }
    }

    /**
     * Altas de municipios
     *
     * @param id tipo int
     * @param id_Entidad tipo int
     * @param estatus tipo boolean
     * @param nombre tipo String
     */
    public static void AltasMunicipio(int id, int id_Entidad, boolean estatus, String nombre)
    {
        Connection con = ManipulaBD.conecta();
        String estatusS = String.valueOf(estatus);
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Insertar(con, "municipio",
                    "" + id + ","
                    + id_Entidad + ",'"
                    + estatusS + "','"
                    + nombre + "'"
            );
        }
    }

    /**
     * Se debe enviar el id ya que es unico e impide la eliminacion de un dato
     * erroneo así como se recomienda hacer uso del metodo ConsultasMunicipios
     * el cual sera usado para encontrar cual es dato que se quiere eliminar
     *
     * @param id tipo int es el identificador unico del objeto en la bd
     */
    public static void BajasMunicipio(int id)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Delete(con, "municipio", "id", "" + id + "");
        }
        ManipulaBD.desconecta(con);
    }

    /**
     * Método para colsutar en la bd en la tabla de Municipios y retorna el
     * objeto o los objetos en un arraylist esto con la intencion de traer lo
     * que se requiera en el momento
     *
     * "id!=" "0"
     *
     * @param variable que variable va a buscar en la base ejemplo "Nombre=" es
     * importante poner el igual
     * @param condicion cual es la condicion por la cual se extraera el objeto
     * ejemplo "'Firulais'" Nota: los números van sin comillas y los String
     * entre comillas simples
     * @return ArrayList de Materias1 dada la condicion enviada
     */
    public static ArrayList<Municipio> ConsultasMunicipio(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Municipio> ap = null;
        if (con != null)
        {
            Querys sql = new Querys();
            ap = ManipulaBD.CargarMunicipio(sql.Seleccion(con, "*", "municipio", variable + condicion));
            ManipulaBD.desconecta(con);
            if (ap != null)
            {
                System.out.println("Datos Encontrados");
            } else
            {
                System.out.println("Datos No Encontrados");
            }
        }
        return ap;
    }

    /**
     * Método para modificar datos en la bd de un objeto Municipio
     *
     * @param id el id de la persona que se modificara sus datos
     * @param campos los campos que seran cambiados ejemplo: "Nombre,Telefono"
     * @param datos los datos nuevos que seran remplazados en la bd ejemplo:
     * "'Pancho',1234" los datos tipos String deben ser puestos entre comillas
     * simples
     */
    public static void ModificarMunicipio(int id, String campos, String datos)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            ArrayList<Municipio> ap = ManipulaBD.CargarMunicipio(sql.Seleccion(con, "*", "municipio", "id=" + id + ""));
            if (ap != null)
            {
                sql.Modificar(con, "municipio", campos, datos, "id=" + id + "");
                ManipulaBD.desconecta(con);
                System.out.println("Modificados");
            }
        }
    }

    public static void AltasEntidades(int clave_Pais, int id, String nombre, boolean estatus)
    {
        Connection con = ManipulaBD.conecta();
        String estatusS = String.valueOf(estatus);
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Insertar(con, "entidades",
                    "" + id + ","
                    + clave_Pais + ",'"
                    + nombre + "','"
                    + estatusS + "'"
            );
            ManipulaBD.desconecta(con);
            System.out.println("Dato Insertado");
        }
    }

    public static void BajasEntidades(int id)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Delete(con, "entidades", "id", "" + id + "");
            sql.Delete(con, "municipio", "id_Entidad", "" + id + "");
        }
        ManipulaBD.desconecta(con);
    }

    public static ArrayList<Entidades> ConsultasEntidades(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Entidades> ap = null;
        if (con != null)
        {
            poo.bd.Querys sql = new poo.bd.Querys();
            ap = ManipulaBD.CargarEntidades(sql.Seleccion(con, "*", "entidades", variable + condicion));
            ManipulaBD.desconecta(con);
            if (ap != null)
            {
                System.out.println("Datos encontrados");
            } else
            {
                System.out.println("no se encontro nada");
            }
        }
        return ap;
    }

    public static void AltasPais(int id, String nombre, boolean estatus)
    {
        Connection con = ManipulaBD.conecta();
        String estatusS = String.valueOf(estatus);
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Insertar(con, "pais",
                    "" + id + ",'"
                    + nombre + "','"
                    + estatusS + "'"
            );
            ManipulaBD.desconecta(con);
            System.out.println("Dato Insertado");
        }
    }

    public static void BajasPais(int id)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Delete(con, "pais", "id", "" + id + "");
            ArrayList<Entidades> ap = ConsultasEntidades("id_pais", "" + id + "");
            for (int i = 0; i < ap.size(); i++)
            {
                BajasEntidades(ap.get(i).getId());
            }
        }
        ManipulaBD.desconecta(con);
    }

    public static ArrayList<Pais> ConsultasPais(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Pais> ap = null;
        if (con != null)
        {
            poo.bd.Querys sql = new poo.bd.Querys();
            ap = ManipulaBD.CargarPais(sql.Seleccion(con, "*", "pais", variable + condicion));
            ManipulaBD.desconecta(con);
            if (ap != null)
            {
                System.out.println("Datos encontrados");
            } else
            {
                System.out.println("no se encontro nada");
            }
        }
        return ap;
    }

}
