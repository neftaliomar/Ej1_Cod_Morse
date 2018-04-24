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
public class Morse {
    String texto;
    //Constructor
    Morse(){
    
    }
    
    public void setTexto(String t){
        texto = t;
    }
    
    public void gettexto(){
    }
    
    public String convertirTexto(){
        String morse[] = { 
            ".- ", //a
            "-... ", //b
            "-.-. ", //c
            "-.. ", //d
            ". ", //e
            "..-. ", //f
            "--. ", //g
            ".... ", //h
            ".. ", //i
            ".--- ", //j
            "-.- ", //k
            ".-.. ", //l
            "--" , //m
            "-. ", //n
            "--- ", //o
            ".--. ", //p
            "--.- ", //q
            ".-. ", //r
            "... ", //s
            "- ", //t
            "..- ", //u
            "...- ", //v
            ".-- ", //w
            "-..- ", //x
            "-.-- ", //y
            "-- .. ", //z
            ".- ", //A
            "-... ", //B
            "-.-. ", //C
            "-.. ", //D
            ". ", //E
            "..-. ", //F
            "--. ", //G
            ".... ", //H
            ".. ", //I
            ".--- ", //J
            "-.- ", //K
            ".-.. ", //L
            "--" , //M
            "-. ", //N
            "--- ", //O
            ".--. ", //P
            "--.- ", //Q
            ".-. ", //R
            "... ", //S
            "- ", //T
            "..- ", //U
            "...- ", //V
            ".-- ", //W
            "-..- ", //X
            "-.-- ", //Y
            "-- .. ", //Z
            ".---- ", //1
            "..--- ", //2
            "...-- ", //3
            "....- ", //4
            "..... ", //5
            "-.... ", //6
            "--... ", //7
            "---.. ", //8
            "----. ", //9
            "----- ", //0
            "   " //espaciado de palabras    
    
        };
        
        String letras="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890 ";
        
        int posicion = 0;
        String suma = "";
        
        for (int i = 0; i < texto.length(); i++) {    
            posicion=letras.indexOf(texto.charAt(i)); 
            suma+=morse[posicion]; 
        }
        return suma;
    }
    
    
    
}
