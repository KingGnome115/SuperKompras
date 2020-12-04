package clases;

import java.sql.Connection;
import java.util.ArrayList;
import poo.bd.Conexion;

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
            for (int i = 0; i < reg.size(); i += 3)
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

}
