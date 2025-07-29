/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helmuntlopez_20072025;

/**
 *
 * @author UFG
 */
public class Main {
    
    /*VARIABLES GLOBALES*/
    public static String nombres = "Helmunt Yahir";
    public static String apellidos = "Lopez Funes";
    public static int anio_denacimiento = 2001;
    public static int mesw_nacimiento = 7;
    public static float estatura = 1.50f; //estatura en metros
    public static float peso = 150.0f; //peso en libras
    public static char genero = 'M';
    public static String estado_familiar = "soltero";
    public static double salario_mensual = 365.43d;
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double imc = 0.0d;
        float tasa_kilogramos = 0.453592f; //1c libra equivale a o.453592 Kilogramos
        int dias_laborales = 22;//22 dias laborales al mes
        int horas_laborables =8;//8 horas laborales al dia
        
        //convertir peso de liblras a kilogramos
        float peso_kilogramos = Main.peso * tasa_kilogramos;
        
        //Elevado al cuadrado
        float estatura_al_cuadrado = Main.estatura*Main.estatura;
        
        //calcular el indice de masa corporal
        imc = peso_kilogramos/estatura_al_cuadrado;
        
        //calcular el salario diario
        double salario_diario = Main.salario_mensual/dias_laborales;
        
        //calacular el salario por hora
        double salario_hora = salario_diario/horas_laborables;
        
        
        
        /*+***************************/
        /*******salida de datos*******/
        /*****************************/
        System.out.println("saludos "+Main.nombres+" "+Main.apellidos);
        System.out.println("su peso en libras es: "+Main.peso+", pero en kilogramos es:"+peso_kilogramos);
        System.out.println("Su indice de masa corporal es: "+imc);
        System.out.println("su salario mensual es: "+Main.salario_mensual);
        System.out.println("su salario diario es: "+salario_diario);
        System.out.println("su salario por hora es: "+salario_hora);
     
        

      
        
        
        


    }
    
}
