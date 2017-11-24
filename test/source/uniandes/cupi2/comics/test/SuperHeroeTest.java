/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: SuperHeroeTest.java,v 1.3 2008/01/18 23:25:44 carl-veg Exp $
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n7_comics
 * Autor: Carlos Andrés Vega - 17-sep-2007
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.comics.test;

import java.util.ArrayList;

import junit.framework.TestCase;
import uniandes.cupi2.comics.mundo.SuperHeroe;

/**
 * Esta es la clase usada para verificar que los métodos de la clase SuperHeroe estén correctamente implementados
 */
public class SuperHeroeTest extends TestCase
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Es la clase donde se harán las pruebas
     */
    private SuperHeroe heroe1;

    /**
     * Es la clase donde se harán las pruebas
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
    // Métodos
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

        assertEquals( "La identidad secreta del superhéroe está equivocada", "secreta1", heroe1.darIdentidadSecreta( ) );
        assertEquals( "La identidad publica del superhéroe está equivocada", "publica1", heroe1.darIdentidadPublica( ) );
        assertEquals( "El año de creación del superhéroe está equivocado", 1, heroe1.darAnhoCreacion( ) );
        assertEquals( "El creador del superhéroe está equivocado", "creador1", heroe1.darCreador( ) );
        assertEquals( "Los poderes del superhéroe están equivocados", poderes, heroe1.darPoderes( ) );
        assertEquals( "La ruta a la imagen del superhéroe está equivocada", "ruta1", heroe1.darRutaImagen( ) );

    }

    // Prueba 2
    // TODO Declarar, implementar y documentar el caso de prueba para el método compararPorAnhoCreacion

    // Prueba 3
    // TODO Declarar, implementar y documentar el caso de prueba para el método compararPorCreador

    // Prueba 4
    // TODO Declarar, implementar y documentar el caso de prueba para el método compararPorNivelFuerza
    
    // Prueba 4
    // TODO Declarar, implementar y documentar el caso de prueba para el método compararPorIdentidadPublica

}