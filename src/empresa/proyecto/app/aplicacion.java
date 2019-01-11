package empresa.proyecto.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class aplicacion {

    public aplicacion() {
    }
    
    
    
   public static void main (String args[]){
      
      //CONEXION A LA BASE DE DATOS
      Connection miConexion;
      //INICIO
      String url="jdbc:mysql://localhost:3306/soap";
      String user="soap";
      String password="soap";
      
      //DECLARACION DE VARIABLES
      int a= 30;
      int b= 5;
      //llamado a la funcion add
      int Add= add(a,b);
      //llamado a la funcion divide
      int Divide= divide(a,b);
      //llamado a la funcion multiplly
      int Multiply= multiply(a,b);
      //llamado a la funcion subtract
      int subtract= subtract(a,b);
      
      try {
            miConexion=DriverManager.getConnection(url, user, password);
            //CONEXION ALA BASE DE DATOS
            
            String sql_add="INSERT INTO `soap_add`( `a`, `b`, `resultado`) VALUES ( "+a+","+b+","+Add+");";
            String sql_divide="INSERT INTO `soap_divide`( `a`, `b`, `resultado`) VALUES ( "+a+","+b+","+Divide+");";
            String sql_multiply="INSERT INTO `soap_multiply`( `a`, `b`, `resultado`) VALUES ( "+a+","+b+","+Multiply+");";
            String sql_subtract="INSERT INTO `soap_subtract`( `a`, `b`, `resultado`) VALUES ( "+a+","+b+","+subtract+");";
            Statement clausula;
            
            clausula=miConexion.createStatement();
            
            clausula.execute(sql_add);
            clausula.execute(sql_divide);
            clausula.execute(sql_multiply);
            clausula.execute(sql_subtract);
            //PREPARAR LA CONSULTA
            
        } catch (SQLException ex) {
            Logger.getLogger(aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
       
   } 

    private static int add(int intA, int intB) {
        empresa.proyecto.ws.Calculator service = new empresa.proyecto.ws.Calculator();
        empresa.proyecto.ws.CalculatorSoap port = service.getCalculatorSoap();
        return port.add(intA, intB);
    }

    private static int divide(int intA, int intB) {
        empresa.proyecto.ws.Calculator service = new empresa.proyecto.ws.Calculator();
        empresa.proyecto.ws.CalculatorSoap port = service.getCalculatorSoap();
        return port.divide(intA, intB);
    }

    private static int multiply(int intA, int intB) {
        empresa.proyecto.ws.Calculator service = new empresa.proyecto.ws.Calculator();
        empresa.proyecto.ws.CalculatorSoap port = service.getCalculatorSoap();
        return port.multiply(intA, intB);
    }

    private static int subtract(int intA, int intB) {
        empresa.proyecto.ws.Calculator service = new empresa.proyecto.ws.Calculator();
        empresa.proyecto.ws.CalculatorSoap port = service.getCalculatorSoap();
        return port.subtract(intA, intB);
    }
   
    
    
   
}
