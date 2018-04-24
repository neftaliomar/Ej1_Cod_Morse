/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1_cod_morse;

/**
 *
 * @author neftali
 */
import java.util.Scanner;
public class Ej1_Cod_Morse {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // CONVERTIT TEXTO A MORSE
        Scanner entrada = new Scanner(System.in);
        String texto, codigo;

        System.out.println("Ingresa la palabra o frase: ");
        texto = entrada.nextLine();

        Morse morse1 = new Morse();
        morse1.setTexto(texto);

        System.out.println("El código morse es: "+morse1.convertirTexto());
        
        
        
        //CONVERTIR MORSE A TEXTO         
        System.out.println("Ingrese un código morse:");
        codigo=entrada.nextLine();
        
        String [ ] simbolo = codigo.split("\\ ");
        System.out.println("El texto es: ");
        for (String simbolo1 : simbolo) {
            
            if (simbolo1.equals(".-")) {
                System.out.print("A ");
            } else if (simbolo1.equals("-...")) {
                System.out.print("B ");
            } else if (simbolo1.equals("-.-.")) {
                System.out.print("C ");
            } else if (simbolo1.equals("-..")) {
                System.out.print("D ");
            } else if (simbolo1.equals(".")) {
                System.out.print("E ");
            } else if (simbolo1.equals("..-.")) {
                System.out.print("F ");
            } else if (simbolo1.equals("--.")) {
                System.out.print("G ");
            } else if (simbolo1.equals("....")) {
                System.out.print("H ");
            } else if (simbolo1.equals("..")) {
                System.out.print("I ");
            } else if (simbolo1.equals(".---")) {
                System.out.print("J ");
            } else if (simbolo1.equals("-.-")) {
                System.out.print("K ");
            } else if (simbolo1.equals(".-..")) {
                System.out.print("L ");
            } else if (simbolo1.equals("--")) {
                System.out.print("M ");
            } else if (simbolo1.equals("-.")) {
                System.out.print("N ");
            } else if (simbolo1.equals("---")) {
                System.out.print("O ");
            } else if (simbolo1.equals(".--.")) {
                System.out.print("P ");
            } else if (simbolo1.equals("--.-")) {
                System.out.print("Q ");
            } else if (simbolo1.equals(".-.")) {
                System.out.print("R ");
            } else if (simbolo1.equals("...")) {
                System.out.print("S ");
            } else if (simbolo1.equals("-")) {
                System.out.print("T ");
            } else if (simbolo1.equals("..-")) {
                System.out.print("U ");
            } else if (simbolo1.equals("...-")) {
                System.out.print("V ");
            } else if (simbolo1.equals(".--")) {
                System.out.print("W ");
            } else if (simbolo1.equals("-..-")) {
                System.out.print("X ");
            } else if (simbolo1.equals("-.--")) {
                System.out.print("Y ");
            } else if (simbolo1.equals("--..")) {
                System.out.print("Z ");
            } else if (simbolo1.equals(".----")) {
                System.out.print("1 ");
            }
             else if (simbolo1.equals("..---")) {
                System.out.print("2 ");
            }
              else if (simbolo1.equals("...--")) {
                System.out.print("3 ");
            }
               else if (simbolo1.equals("....-")) {
                System.out.print("4 ");
            }
                else if (simbolo1.equals(".....")) {
                System.out.print("5 ");
            }
             else if (simbolo1.equals("-....")) {
                System.out.print("6 ");
            }
              else if (simbolo1.equals("--...")) {
                System.out.print("7 ");
            }
               else if (simbolo1.equals("---..")) {
                System.out.print("8 ");
            }
                else if (simbolo1.equals("----.")) {
                System.out.print("9 ");
            }
                 else if (simbolo1.equals("-----")) {
                System.out.print("0 ");
            }
            else if (simbolo1.equals(" ")) {
                System.out.print("   ");
            }
        }

        
    }
    
}
