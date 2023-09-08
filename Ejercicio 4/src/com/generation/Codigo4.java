package com.generation;

import java.util.Scanner; // importar Scanner

public class Codigo4 {
	
	public static void main(String[]  args) {   // faltaba el metodo main 

    Scanner s = new Scanner( System.in ); // agregue System.in

	
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    Scanner s2 = new Scanner( System.in ); // agregue System.in
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // cambie jugador 1 por el 2
    String j2 = s2.nextLine();
    
    if (j1.equals(j2) ) {                    // eliminé un parentesis extra y agregue .equals
      System.out.println("Empate");
    } else {
      int g = 2;
    
     switch(j1) {
        case "piedra":
        	
          if (j2.equals( "tijeras") ) {// agregue .equals
            g = 1;
          }
          break;                       // faltaba break
        case "papel":
          if (j2.equals( "piedra") ) { // agregue .equals
            g = 1;
          }                            // faltaba una llave de cierre
          break;                       // faltaba break
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;                       // faltaba break
        default:
      }
      System.out.println("Gana el jugador " + g);
    } 
  
    }

} // faltaba una llave de cierre