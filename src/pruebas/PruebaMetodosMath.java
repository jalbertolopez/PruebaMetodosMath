/*
 * Clase que implementa algunos métodos pertenecientes a la Clase Math de JAVA
 */
package pruebas;

/**
 *
 * @author jalbertolopez
 */
public class PruebaMetodosMath 
{
    
    public static void main( String[] args )
    {
       
        //Constantes
        System.out.println( "Math.PI = " + Math.PI );
        System.out.println( "Math.E = " + Math.E );
        
        //Valor absoluto
        System.out.println( "Math.abs( -45.8 ) = " + Math.abs( -45.8 ) );

        //Redondeos y Truncamientos
        System.out.println( "Math.ceil( 88.18 ) = " + Math.ceil( 88.18 ) );
        System.out.println( "Math.ceil( 88.88 ) = " + Math.ceil( 88.88 ) );
        System.out.println( "Math.floor( 88.18 ) = " + Math.floor( 88.18 ) );
        System.out.println( "Math.floor( 88.88 ) = " + Math.floor( 88.88 ) );
        System.out.println( "Math.rint( 88.18 ) = " + Math.rint( 88.18 ) );
        System.out.println( "Math.rint( 88.88 ) = " + Math.rint( 88.88 ) );
        System.out.println( "Math.round( 88.18 ) = " + Math.round( 88.18 ) );
        System.out.println( "Math.round( 88.88 ) = " + Math.round( 88.88 ) );

        //Mayor o menor de 2 numeros
        System.out.println( "Math.max( 4.6, 2.2 ) = " + Math.max( 4.6, 2.2 ) );
        System.out.println( "Math.max( -4.6, -2.2 ) = " + Math.max( -4.6, -2.2 ) );
        System.out.println( "Math.min( 4.6, 2.2 ) = " + Math.min( 4.6, 2.2 ) );
        System.out.println( "Math.min( -4.6, -2.2 ) = " + Math.min( -4.6, -2.2 ) );

        //Trigonometricas
        System.out.println( "Math.cos( 0 ) = " + Math.cos( 0 ) );
        System.out.println( "Math.sin( 0 ) = " + Math.sin( 0 ) );
        System.out.println( "Math.tan( 0 ) = " + Math.tan( 0 ) );

        //Potencia y raiz cuadrada
        System.out.println( "Math.pow( 9, 2 ) = " + Math.pow( 9, 2 ) );
        System.out.println( "Math.sqrt( 900 ) = " + Math.sqrt( 900 ) );
              
    }
   
}