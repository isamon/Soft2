/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: SuperHeroeTest.java,v 1.3 2008/01/18 23:25:44 carl-veg Exp $
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n7_comics
 * Autor: Carlos Andr�s Vega - 17-sep-2007
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.comics.test;

import java.util.ArrayList;

import junit.framework.TestCase;
import uniandes.cupi2.comics.mundo.SuperHeroe;

/**
 * Esta es la clase usada para verificar que los m�todos de la clase SuperHeroe est�n correctamente implementados
 */
public class SuperHeroeTest extends TestCase
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Es la clase donde se har�n las pruebas
     */
    private SuperHeroe heroe1;

    /**
     * Es la clase donde se har�n las pruebas
     */
    private SuperHeroe heroe2;

    /**
     * Lista con poderes
     */
    private ArrayList poderes;

    /**
     * Lista con habilidades
     */
    private ArrayList habilidades;

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Construye un nuevo SuperHeroe
     * 
     */
    private void setupEscenario1( )
    {
        poderes = new ArrayList( );
        poderes.add( "Volar" );
        poderes.add( "Correr" );

        habilidades = new ArrayList( );
        habilidades.add( "Cientifico" );

        heroe1 = new SuperHeroe( "secreta1", "publica1", 1, "creador1", poderes, habilidades, 1, "ruta1" );
        heroe2 = new SuperHeroe( "secreta2", "publica2", 2, "creador2", poderes, habilidades, 2, "ruta2" );
    }

    /**
     * Prueba 1
     */
    public void testComics( )
    {
        setupEscenario1( );

        assertEquals( "La identidad secreta del superh�roe est� equivocada", "secreta1", heroe1.darIdentidadSecreta( ) );
        assertEquals( "La identidad publica del superh�roe est� equivocada", "publica1", heroe1.darIdentidadPublica( ) );
        assertEquals( "El a�o de creaci�n del superh�roe est� equivocado", 1, heroe1.darAnhoCreacion( ) );
        assertEquals( "El creador del superh�roe est� equivocado", "creador1", heroe1.darCreador( ) );
        assertEquals( "Los poderes del superh�roe est�n equivocados", poderes, heroe1.darPoderes( ) );
        assertEquals( "La ruta a la imagen del superh�roe est� equivocada", "ruta1", heroe1.darRutaImagen( ) );

    }

    // Prueba 2
    // TODO Declarar, implementar y documentar el caso de prueba para el m�todo compararPorAnhoCreacion

    // Prueba 3
    // TODO Declarar, implementar y documentar el caso de prueba para el m�todo compararPorCreador

    // Prueba 4
    // TODO Declarar, implementar y documentar el caso de prueba para el m�todo compararPorNivelFuerza
    
    // Prueba 4
    // TODO Declarar, implementar y documentar el caso de prueba para el m�todo compararPorIdentidadPublica

}