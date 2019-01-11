package empresa.proyecto.app;

public class aplicacion {

    public aplicacion() {
    }
    
    
    
   public static void main (String args[]){
      int a= 20;
      int b= 4;
      //llamado a la funcion add
      float Add= add(a,b);
      //llamado a la funcion divide
      float Divide= divide(a,b);
      //llamado a la funcion multiplly
      float Multiply= multiply(a,b);
      //llamado a la funcion subtract
      float subtract= subtract(a,b);
      
      
       
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
