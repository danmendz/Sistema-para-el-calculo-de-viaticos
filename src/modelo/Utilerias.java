/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.*;
/**
 *
 * @author joana
 */
public class Utilerias {
   
  static Scanner lector = new Scanner(System.in);
  public static int leerInt(String concepto)
  {
    int r=0;
    boolean correcto=false;
    do
    {
      try
      {
        System.out.print(concepto + ":");
        r=lector.nextInt();
        correcto=true;
      }
      catch(Exception e)
      {
        System.out.println("Error, por favor ingresa solo numeros");
        lector.next();
      }
    }
    while(correcto==false);
    return r;
  }

  /////////////////////////
  public static String leerString(String concepto)
  {
    String r="";
    boolean correcto = false;
    do{
    try{
      System.out.print(concepto + ":");
      r=lector.nextLine();
      
        if(!r.matches("^[a-zA-Z]+$")){
          System.out.println("Error, por favor ingresa solo letras");
          correcto = false;
        }else{
            correcto = true;
        }
    }catch(Exception e){
        System.out.println("error");
    }
    }while(correcto==false);
    return r;
  }
  
}
