/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import clases.Tipo_Usuario;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author REYNO21
 */
public class ABMC
  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
      {
        int id = 0;
        String Usuario = "Prueba";
        String Contrasenia = "Contrasenia";

        int id2 = 0;
        String Usuario2 = "Prueba2";
        String Contrasenia2 = "Contrasenia";

        ////////////////////////////////////////////////////////////////////////////////////ALTAS//////////////////////////////////////////////////
        Connection con = Manipulacion.conecta();
        if (con != null)
          {
//            Querys sql = new Querys();
//            sql.Insertar(con, "EjemploTabla", "" + id + ",'" + Usuario + "'," + Contrasenia + "");
    //        sql.Insertar(con, "EjemploTabla", "" + id2 + ",'" + Usuario2 + "'," + Contrasenia2 + "");
            //sql.Insertar(con, "EjemploTabla", "" + id3 + ",'" + item23 + "'," + item33 + "");
            Manipulacion.desconecta(con);
            System.out.println("Dato insertado");
          }

        ////////////////////////////////////////////////////BASJAS////////////////////////////////////////////////////////
        Connection con2 = Manipulacion.conecta();
        if (con2 != null)
          {
            //Querys sql = new Querys();
         //   sql.Delete(con2, "EjemploTabla", "item2", "'" + item22 + "'");
          }
        Manipulacion.desconecta(con2);

        //Consultas
//        Connection con3 = Manipulacion.conecta();
//        if (con3 != null)
//          {
//           // Querys sql = new Querys();
//         //   ArrayList<Tipo_Usuario> ap = Manipulacion.cargarO(sql.Seleccion(con3, "*", "EjemploTabla", "id=" + 1 + ""));
//            Manipulacion.desconecta(con3);
//            if (ap != null)
//              {
//                //System.out.println(ap.get(0).desp());
//              } else
//              {
//                System.out.println("No se encontro el dato");
//              }
//
//            //Modificaciones
//            Connection con4 = Manipulacion.conecta();
//            if (con4 != null)
//              {
//              //  Querys sql = new Querys();
//                //ArrayList<Tipo_Usuario> ap = Manipulacion.cargarO(sql.Seleccion(con4, "*", "EjemploTabla", "id=" + 3 + ""));
//                if (ap != null)
//                  {
//                    sql.Modificar(con4, "EjemploTabla", "id", "2", "id=3");
//                  }
//              }
//
//          }
      }

  }
