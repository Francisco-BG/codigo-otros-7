//Es un programa que tiene guardadas las capitales de algunos países.
//Le pide al usuario introducir el nombre e un país
//Si tiene guardado el país, dice su capital, si no. Pide la capital para guardarla.
//Este proceso se repite una y otra vez hasta que el usuario escriba "salir"
import java.util.Scanner;//Se importó Scanner
import java.util.HashMap;
public class Codigo7{ //Se quitó el acento para evitar problemas
  public static void main(String[] args){//Se agregó método Main
    Scanner s = new Scanner(System.in);//Se agregó flujo de entrada

    HashMap<String, String> capitales = new HashMap<>();// Se cambió el tipo de clave y valor

    capitales.put("Canadá", "Ottawa");//correción ortográfica
    capitales.put("Estados Unidos", "Washington DC");
    capitales.put("México", "México DF");
    capitales.put("Belice", "Belmopán");
    capitales.put("Costa rica", "San José");
    capitales.put("El Salvador","San Salvador"); //se añadió capital
    capitales.put("Guatemala", "Ciudad de Guatemala");
    capitales.put("Honduras", "Tegucigalpa");
    capitales.put("Nicaragua", "Managua");
    capitales.put("Panamá", "Panamá");
    
    String c = ""; //Le faltaba la erre a String 

    do {
      System.out.print("Escribe el nombre de un país y te diré su capital: ");// Cambio de in por out
      c = s.nextLine();//Line es para recibir strings
      
      if (!c.equals("salir")) { //se agregó la s a equal
        if (capitales.containsKey(c)) { //cambio de nombre de variable, // cambio de Llave
          System.out.print("La capital de " + c); // se agregó flujo de salida
          System.out.println(" es " + capitales.get(c));//se cambió put por get, cambio de nombre de variable
        }else{
          System.out.print("No conozco la respuesta ");
          System.out.print("¿cuál es la capital de " + c + "?: ");
          String newCa = s.nextLine();// cambio de nombre de variable para no tener conflictos con la preexistente
          capitales.put(c, newCa); //cambio de ca por la nueva variable
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
      }
      
    } while (!c.equals("salir"));//faltaba la hache de while
    s.close();//se cierra scanner
  }
}