/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import clases.Tipo_Usuario;
import java.sql.Connection;
import java.util.ArrayList;
import poo.bd.Conexion;

/**
 *
 * @author REYNO21
 */
public class Manipulacion
  {

    private static Conexion con = new Conexion();

    public static Connection conecta()
      {
        try
          {
            return con.Conecta("Localhost:3306", "Ejemplo", "root", "", 2);
          } catch (Exception e)
          {
            System.out.println("No se pudo conectar a la bd");
            return null;
          }
      }

    public static void desconecta(Connection conn)
      {
        con.desconectar(conn);
      }

    public static ArrayList<Tipo_Usuario> cargarO(ArrayList<Object> reg)
      {
        try
          {
            ArrayList<Tipo_Usuario> v = new ArrayList<>();
            for (int i = 0; i < reg.size(); i += 3)
              {
                String idS = (String) reg.get(i);
                if (idS != "" && idS != " ")
                  {
                    int id = Integer.parseInt(idS.trim());
                    String Usuario = ((String) reg.get(i + 1)).trim();
                    String Contrasenia = ((String) reg.get(i + 2)).trim();
                    //String item3 = String.valueOf(item3S);
                    Tipo_Usuario obj = new Tipo_Usuario(id, Usuario, Contrasenia);
                    v.add(obj);
                  }
              }
            return v;
          } catch (Exception e)
          {
            System.out.println("Error al crear objetos");
            return null;
          }
      }
  }
