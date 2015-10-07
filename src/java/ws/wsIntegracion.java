/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ESTACION
 */
@WebService(serviceName = "wsIntegracion")
public class wsIntegracion {

    /**
     * This is a sample web service operation
     * @param Numero
     */
    
    
    @WebMethod(operationName = "SaberNumeroPrimo")
    public String hello(@WebParam(name = "name") String Numero) {
        String Resultado="";
 
        int a=0;
        int i=0;
        
          for(i=1;i<=Integer.parseInt(Numero);i++){
              System.out.println(Integer.parseInt(Numero) +"%"+ i);
              if((Integer.parseInt(Numero) % i) == 0){
                  System.out.println("Ingreso mod == 0"+Integer.parseInt(Numero) +"%"+ i);  
                  a=a+1;
              }
          }
          if(a!=2){
              Resultado="No es Primo";
          }else{
              Resultado="Si es primo";
          }

        return "El número Ingresado, " + Resultado + " !";
    }
    
    
    
    
    @WebMethod(operationName = "OperaSuma")
    public String OperaSuma(@WebParam(name = "name") String Num1, String Num2) {
        int Resultado=0;
        Resultado=Integer.parseInt(Num1)+Integer.parseInt(Num2);
        return "El resultado de la suma es: " + Resultado + " !";
    }
    
    
    @WebMethod(operationName = "OperaResta")
    public String OperaResta(@WebParam(name = "name") Integer Val1, Integer Val2) {
        Integer Resultado;        
        Resultado = Val1 - Val2;                
        return "Resultado de la resta " + Resultado + " !";
    }
    
    @WebMethod(operationName = "OperaMulti")
    public String OperaMulti(@WebParam(name = "name") Integer Val1, Integer Val2) {
        Integer Resultado;        
        Resultado = Val1 * Val2;                
        return "Resultado de la Multiplicación " + Resultado + " !";
    }
    
    
    @WebMethod(operationName = "OperaDivision")
    public String OperaDivision(@WebParam(name = "name") Integer Val1, Integer Val2) {
        Integer Resultado;        
        Resultado = Val1 / Val2;                
        return "Resultado de la División " + Resultado + " !";
    }
    
}
