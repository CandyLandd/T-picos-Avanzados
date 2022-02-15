/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

public class Contraseña {
    public static void main(String[] args) 
{
    System.out.println("generar");
 }  
    static String generar()
{
     
     char[]mayu={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
     char[]min={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
     int[]num={'1','2','3','4','5','6','7','8','9','0'};
     char[]car={'.',',','@','-','$','%','#','!','/','=','?','¿'};
     StringBuilder caracteres=new StringBuilder();
     caracteres.append(mayu);
     caracteres.append(min);
     caracteres.append(num);
     caracteres.append(car);
     
     StringBuilder contra=new StringBuilder();
     
     for(int i=0; i<=8; i++)
{
     int cantidadCaracteres = caracteres.length();
     int numeroRandom= (int)(Math.random()*cantidadCaracteres);
     
     contra.append(caracteres.toString().charAt(numeroRandom));
}
     return contra.toString();
}
}
