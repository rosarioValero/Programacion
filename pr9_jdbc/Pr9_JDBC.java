/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr9_jdbc;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pr9_jdbc.Pr9_JDBC.consultar_bd;

/**
 *
 * @author Rosario
 */
public class Pr9_JDBC {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    //  private ResultSetMetaData metaDatos;
    /* private ResultSet rs;
    private String[][] datosDevueltos;
    private String[] nombresColumnas;
    private String error;
     */
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("------BD OPTIONS------------");
        System.out.println("____________________________");

        while (!salir) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" 1- Consulta base de datos. ");
            System.out.println(" 2- Actualiza una tabla. ");
            System.out.println(" 3- Inserta un dato en la tabla. ");
            System.out.println(" 4- Salir. ");

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Escribe una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\nHas seleccionado la opcion 1 - "
                            + "Realizar una consulta: ");
                    consultar_bd();
                    break;

                case 2:
                    System.out.println("\nHas seleccionado la opcion 2 - "
                            + "Actualizar una tabla ");
                    actualizar_tabla();
                    break;

                case 3:
                    System.out.println("\nHas seleccionado la opcion 3 - "
                            + "Inserta un dato\n");
                    insert_bd();
                    break;

                case 4:
                    salir = true;
                    break;

                default:
                    System.out.println("Introduce una opcion correcta!");
            }

        }

    }

    public static void consultar_bd() {

        try {
            //Connexion con la base de datos
            Connection con
                    = (Connection) DriverManager.getConnection("jdbc:mysql:/"
                            + "/localhost:3307/beer"
                            + "?verifyServerCertificate=false"
                            + "&useSSL=true", "root", "gaspar1326");

            //Creamos una sentencia que realizara una connexión con la base de 
            //datos creada.
            //De esta forma se connectara a ella para realizar una consulta.
            Statement st;
            st = (Statement) con.createStatement();

            //practica parte b - Consultar base datos
            //Realizamos la consulta que queremos realizar a la base de datos
            ResultSet rs = st.executeQuery("select * from Beer");

            //visualizamos los datos que solicitamos en la consulta.
            while (rs.next()) {
                //la primera vez que se ejecuta no apunta a nada,
                //pero una vez entra en el bucle se ejecuta la siguiente linea

                System.out.println(rs.getString(1) + " " + rs.getString(2));
            }

            //cerramos la connección con la base de datos.
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Pr9_JDBC.class.getName()).log(Level.SEVERE, null,
                    ex);

        }
    }

    public static void actualizar_tabla() throws SQLException {
        /*
        La opción update. Realiza un método que ejecute una actualización de
        un campo de la tabla. Pide al usuario en este método el campo o
        campos que desea actualizar sobre una tabla concreta, por tanto, la
        construcción de la sentencia update dependerá directamente de lo que
        introduzca el usuario sobre la tabla seleccionada.
         */
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql:/"
                + "/localhost:3307/beer" + "?verifyServerCertificate=false"
                + "&useSSL=true", "root", "gaspar1326");

        Statement st;
        st = (Statement) con.createStatement();

        // ResultSet rs;
        Scanner sc = new Scanner(System.in);
        // Hemos de colocar los interrogantes para indicar los valores que 
        //queremos sustituir
        
        String actualizar_columna = "update Beer set  name = ? where name = ?";
        // String actualizar_columna = "update Serves set  beer= ? where bar=?";
        PreparedStatement columna = con.prepareStatement(actualizar_columna);
        // PreparedStatement tabla = con.prepareStatement(actualizar_columna);
        /*
        System.out.println("Introduce el nombre de la base de datos 
        seleccionada:");
        tabla.setString(0, sc.next());
        // System.out.println("Introduce el nombre de tabla seleccionada:");
        //  String tabla = sc.next();
        System.out.println("introduce el nombre de la columna que deseas 
        actualizar: ");
        String columna1 = sc.next();*/
        System.out.println("Introduce que datos quieres cambiar");
        System.out.println("Valor: ");
        String valor1 = sc.next();
        /*  System.out.println("Introduce la columna que quieres cambiar: ");
        String columna2 = sc.next();*/
        System.out.println(" segundo valor: ");
        String valor2 = sc.next();

        //columna.setString(1, tabla);
        //columna.setString(1,columna1);
        // con el PreparedStament hemos de llamar al valor indicando 
        //la posicion de cada uno.
        columna.setString(1, valor1);
        //columna.setString(3, columna2);
        columna.setString(2, valor2);

        columna.executeUpdate();

        con.close();
    }

    public static void insert_bd() throws SQLException {

        /*
    La opción insert. Realiza un método que pida al usuario todos los
    campos a insertar en dos tablas concretas. En caso de producir un error
    en el insert de la segunda tabla, debe realizar rollback, y por tanto no
    guardar los cambios en ninguna de las tablas
         */
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql:/"
                + "/localhost:3307/beer" + "?verifyServerCertificate=false"
                + "&useSSL=true", "root", "gaspar1326");

        Statement st;
        st = (Statement) con.createStatement();
        Scanner sc = new Scanner(System.in);
        /*
        try {
            con.setAutoCommit(false);
        } catch (SQLException e) {
            System.err.println("There was an error disabling autocomit");
        }
         */
        try {
            con.setAutoCommit(false);
            String insertar_dato = ("INSERT INTO Bar" + "(name, address) VALUES"
                    + "(?,?)");

            PreparedStatement dato = con.prepareStatement(insertar_dato);

            String insertar_dato1 = ("INSERT INTO Bar" + "(name, address)"
                    + "VALUES (?,?)");
            PreparedStatement valor = con.prepareStatement(insertar_dato1);

            System.out.println("Introduce el primer valor: ");
            String dato1 = sc.next();

            System.out.println("Introduce el segundo valor: ");
            String dato2 = sc.next();
            //con.setAutoCommit(false);

            System.out.println("Vuelve a introducir otros datos, "
                    + "para hacer un nuevo insert. ");
            
            System.out.println("Introduce el primer valor: ");
            String dato3 = sc.next();

            System.out.println("Introduce el segundo valor: ");
            String dato4 = sc.next();

            dato.setString(1, dato1);
            dato.setString(2, dato2);

            valor.setString(1, dato3);
            valor.setString(2, dato4);

            dato.executeUpdate();
            valor.executeUpdate();
            con.commit();
            System.out.println("Row inserted");

        } catch (SQLException e) {
            con.rollback();
            System.out.println("Error a la hora de insertar los datos");
        }

        //      dato.executeUpdate();
        //     valor.executeUpdate();
        con.close();
    }
}
