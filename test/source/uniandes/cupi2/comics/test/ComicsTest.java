/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: ComicsTest.java,v 1.7 2008/01/18 23:25:44 carl-veg Exp $
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

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import junit.framework.TestCase;
import uniandes.cupi2.comics.mundo.Comics;
import uniandes.cupi2.comics.mundo.SuperHeroe;

/**
 * Esta es la clase usada para verificar que los m�todos de la clase Comics est�n correctamente implementados
 */
public class ComicsTest extends TestCase
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Es la clase donde se har�n las pruebas
     */
    private Comics comics;

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Construye una nueva Comics con la configuraci�n cargada desde el archivo
     */
    private void setupEscenario1( )
    {
        try
        {
            comics = new Comics( );
            cargarSuperheroes( "./test/data/superheroesTest.data" );
        }
        catch( Exception e )
        {
            fail( "Error al cargar el archivo con los datos" );
        }
    }
    
    /**
     * Construye una nueva Comics con la configuraci�n cargada desde el archivo
     */
    private void setupEscenario2( )
    {
        try
        {
            comics = new Comics( );
            cargarSuperheroes( "./test/data/superheroesTest2.data" );
        }
        catch( Exception e )
        {
            fail( "Error al cargar el archivo con los datos" );
        }
    }

    
    /**
     * Prueba 1 - Prueba el m�todo buscarBinarioPorIdentidadPublica con el escenario 1 el cual est� ordenado por identidad p�blica
     */
    public void testBuscarBinarioPorIdentidadPublica()
    {
        // TODO Completar seg�n enunciado
    }
    
    /**
     * Prueba 2 - Prueba el m�todo buscarSuperheroePorIdentidadPublica con el escenario 1 y 2
     */
    public void testBuscarSuperheroePorIdentidadPublica( )
    {
        // TODO Completar seg�n enunciado
    }
    
    /**
     * Prueba 3 - Prueba el m�todo buscarSuperheroePorIdentidadSecreta con el escenario 1 y 2
     */
    public void testBuscarSuperheroePorIdentidadSecreta( )
    {
        // TODO Completar seg�n enunciado
    }

    /**
     * Prueba 4 - Prueba el m�todo buscarSuperheroeMasAntiguo con el escenario 1 y 2
     */
    public void testBuscarSuperheroeMasAntiguo( )
    {
        // TODO Completar seg�n enunciado
    }

    /**
     * Prueba 5 - Prueba el m�todo buscarSuperheroeMasFuerte con el escenario 1 y 2
     */
    public void testBuscarSuperheroeMasFuerte( )
    {
        // TODO Completar seg�n enunciado
    }
    
    /**
     * Prueba 6 - Prueba el m�todo ordenarPorIdentidadPublica con el escenario 1 y 2
     */
    public void testOrdenarPorIdentidadPublica( )
    {
        // TODO Completar seg�n enunciado
    }

    /**
     * Prueba 7 - Prueba el m�todo ordenarPorAnhoCreacion con el escenario 1 y 2
     */
    public void testOrdenarPorAnhoCreacion( )
    {
        // TODO Completar seg�n enunciado
    }
    
    /**
     * Prueba 8 - Prueba el m�todo ordenarPorCreador con el escenario 1 y 2
     */
    public void testOrdenarPorCreador( )
    {
        // TODO Completar seg�n enunciado
    }

    /**
     * Prueba 9 - Prueba el m�todo ordenarPorNivelFuerza con el escenario 1 y 2
     */
    public void testOrdenarPorNivelFuerza( )
    {
        // TODO Completar seg�n enunciado
    }
    

    /**
     * M�todo para cargar los superh�roes desde un archivo
     * @param ruta Ruta del archivo
     * @throws Exception Si ocurre un error al cargar el archivo
     */
    private void cargarSuperheroes( String ruta ) throws Exception
    {
        FileInputStream fis = new FileInputStream( new File( ruta ) );
        Properties propiedades = new Properties( );
        propiedades.load( fis );

        // Cargar los superh�roes
        String nIdentidadSecreta, nIdentidadPublica, nCreador, nRutaImagen;
        int nAnhoCreacion, nNivelFuerza;
        ArrayList nPoderes;
        ArrayList nHabilidades;

        int numHeroes = Integer.parseInt( propiedades.getProperty( "total.heroes" ) );
        for( int cont = 1; cont <= numHeroes; cont++ )
        {
            nPoderes = new ArrayList( );
            nHabilidades = new ArrayList( );

            nIdentidadPublica = propiedades.getProperty( "heroe" + cont + ".identidadPublica" );
            nIdentidadSecreta = propiedades.getProperty( "heroe" + cont + ".identidadSecreta" );
            nCreador = propiedades.getProperty( "heroe" + cont + ".creador" );
            nRutaImagen = propiedades.getProperty( "heroe" + cont + ".imagen" );
            nAnhoCreacion = Integer.valueOf( propiedades.getProperty( "heroe" + cont + ".anhoCreacion" ) ).intValue( );
            nNivelFuerza = Integer.valueOf( propiedades.getProperty( "heroe" + cont + ".nivelFuerza" ) ).intValue( );

            int numPoderes = Integer.valueOf( propiedades.getProperty( "heroe" + cont + ".numPoderes" ) ).intValue( );
            for( int cont2 = 1; cont2 <= numPoderes; cont2++ )
            {
                String poder = propiedades.getProperty( "heroe" + cont + ".poder" + cont2 );
                nPoderes.add( poder );
            }

            int numHabilidades = Integer.valueOf( propiedades.getProperty( "heroe" + cont + ".numHabilidades" ) ).intValue( );
            for( int cont2 = 1; cont2 <= numHabilidades; cont2++ )
            {
                String habilidad = propiedades.getProperty( "heroe" + cont + ".habilidad" + cont2 );
                nHabilidades.add( habilidad );
            }

            comics.ingresarSuperheroe( nIdentidadSecreta, nIdentidadPublica, nAnhoCreacion, nCreador, nPoderes, nHabilidades, nNivelFuerza, nRutaImagen );
        }
        fis.close( );
    }

}