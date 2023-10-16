/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizadorfinalmad;

/**
 *
 * @author Juan Carlos
 */
public class NotasParaElProfe {
    
    //Primero el programa se ejecuta desde la aplicacion NetBeans
    //Lo segundo la clase principal que hace todo seria Com.java ya que contiene interfaz
    //Para ejecutar el programa se tiene que apretar al signo de reproduccion verde, tambien al momento de cerrar se abrira una ventana si desea guardar, no es necesario
    //lo tecero las clases que hacen todo el procedimiento son:
                                                                //borrarComponentes();
                                                                // analisisLexico();
                                                                //llenarJPnaleTokens();
                                                                //analisisLexicoEerr();
                                                                //parse();
    
    ///Pues hice mi intento, tuve problemas al aplicar el sintactico por parte del vacio en las producciones
    ///la mayoria del proceso sintactico se mostrara hasta que encuentre un vacio y despues no estara eliminando correctamente
    
    //En Resumidas cuentas lo lexico funciona, signos como ?,¿,% etc. mandaran mensaje de error por no encontrarlos y asi.
    //En parte del sintactico lo que funciona son los Shift por parte de los q en la tabla
    //y hasta cierta manera el remover por parte de los P hasta cierto punto
    //el proceso lexico se mostrara dentro de la interfaz, el proceso sintactico al tenerlo incompleto se estara mostrando todo el cambio en el CMD
    
    //Un ejemplo para ejecutar seria: float a,b; b = (12 + 48);

}
