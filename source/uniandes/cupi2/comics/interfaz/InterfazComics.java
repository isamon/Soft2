/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: InterfazComics.java,v 1.5 2008/01/19 00:56:00 carl-veg Exp $
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n7_comics
 * Autor: Carlos Andrés Vega - 17-sep-2007
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.comics.interfaz;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import uniandes.cupi2.comics.mundo.Comics;
import uniandes.cupi2.comics.mundo.SuperHeroe;

/**
 * Esta es la ventana principal de la aplicación.
 */
public class InterfazComics extends JFrame
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------
    
    /**
     * Ruta al archivo de propiedades
     */
    private final static String RUTA = "./data/superheroes.data";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Clase principal del mundo
     */
    private Comics comics;

    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * Panel con las extensiones
     */
    private PanelExtension panelExtension;

    /**
     * Panel con la imagen
     */
    private PanelImagen panelImagen;

    /**
     * Panel con la lista de superhéroes
     */
    private PanelSuperheroes panelSuperheroes;

    /**
     * Panel para visualizar la información de un superhéroe
     */
    private PanelInfoSuperheroe panelInfoSuperheroe;

    /**
     * Panel con las opciones de la aplicación
     */
    private PanelOpciones panelOpciones;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor de la ventana principal de la aplicación
     */
    public InterfazComics( )
    {
        // Crea la clase principal
        comics = new Comics( );

        try
        {
            cargarSuperheroes( RUTA );
            // Construye la forma
            getContentPane( ).setLayout( new BorderLayout( ) );
            setSize( 800, 600 );
            setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            setTitle( "Comics Database" );

            // Creación de los paneles aquí
            panelExtension = new PanelExtension( this );
            add( panelExtension, BorderLayout.SOUTH );

            panelImagen = new PanelImagen( );
            add( panelImagen, BorderLayout.NORTH );

            panelSuperheroes = new PanelSuperheroes( this );
            add( panelSuperheroes, BorderLayout.EAST );

            panelInfoSuperheroe = new PanelInfoSuperheroe( );
            add( panelInfoSuperheroe, BorderLayout.CENTER );

            panelOpciones = new PanelOpciones( this );
            add( panelOpciones, BorderLayout.WEST );

            setLocationRelativeTo( null );

            panelSuperheroes.actualizarSuperheroes( comics.darSuperheroes( ) );
        }
        catch( Exception e )
        {
            JOptionPane.showMessageDialog( this, e.getMessage( ), "Error", JOptionPane.ERROR_MESSAGE );
            dispose( );
        }

    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Método para actualizar el panel que muestra la información de los superhéroes
     * @param heroe Héroe del cual se va a obtener la información
     */
    public void actualizarInfoSuperheroe( SuperHeroe heroe )
    {
        panelInfoSuperheroe.actualizar( heroe );
    }

    /**
     * Método para buscar un superhéroe por identidad secreta utilizando el método binario
     */
    public void buscarSuperheroeBinarioIdentidadPublica( )
    {
        String idPublica = JOptionPane.showInputDialog( this, "Identidad Secreta" );
        if( idPublica != null )
        {
            comics.ordenarPorIdentidadPublica( );
            panelSuperheroes.actualizarSuperheroes( comics.darSuperheroes( ) );
            int pos = comics.buscarBinarioPorIdentidadPublica( idPublica );
            if( pos != -1 )
                panelSuperheroes.seleccionar( pos );
            else
                JOptionPane.showMessageDialog( this, "No se encontró algún superhéroe con la identidad dada.", "Respuesta", JOptionPane.INFORMATION_MESSAGE );
        }

    }
    
    /**
     * Método para buscar un superhéroe por identidad secreta
     */
    public void buscarSuperheroePorIdentidadSecreta( )
    {
        String idSecreta = JOptionPane.showInputDialog( this, "Identidad Secreta" );
        if( idSecreta != null )
        {
            int pos = comics.buscarSuperheroePorIdentidadSecreta( idSecreta );
            if( pos != -1 )
                panelSuperheroes.seleccionar( pos );
            else
                JOptionPane.showMessageDialog( this, "No se encontró algún superhéroe con la identidad dada.", "Respuesta", JOptionPane.INFORMATION_MESSAGE );
        }

    }

    /**
     * Método para buscar el superhéroe más antiguo
     */
    public void buscarSuperheroeMasAntiguo( )
    {
        int pos = comics.buscarSuperheroeMasAntiguo( );
        if( pos != -1 )
            panelSuperheroes.seleccionar( pos );
        else
            JOptionPane.showMessageDialog( this, "No se encontró el superhéroe más antiguo.", "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * Método para buscar el superhéroe más fuerte
     */
    public void buscarSuperheroeMasFuerte( )
    {
        int pos = comics.buscarSuperheroeMasFuerte( );
        if( pos != -1 )
            panelSuperheroes.seleccionar( pos );
        else
            JOptionPane.showMessageDialog( this, "No se encontró el superhéroe más fuerte.", "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * Método para visualizar la lista de superhéroes ordenada por año de creación ascendentemente
     */
    public void ordenarPorAnhoCreacion( )
    {
        comics.ordenarPorAnhoCreacion( );
        panelSuperheroes.actualizarSuperheroes( comics.darSuperheroes( ) );
    }

    /**
     * Método para visualizar la lista de superhéroes ordenada por el nombre del creador de manera ascendente
     */
    public void ordenarPorCreador( )
    {
        comics.ordenarPorCreador( );
        panelSuperheroes.actualizarSuperheroes( comics.darSuperheroes( ) );
    }

    /**
     * Método para visualizar la lista de superhéroes ordenada por el nivel de fuerza de manera ascendente
     */
    public void ordenarPorNivelFuerza( )
    {
        comics.ordenarPorNivelFuerza( );
        panelSuperheroes.actualizarSuperheroes( comics.darSuperheroes( ) );
    }

    /**
     * Método para mostrar el dialogo para ingresar un nuevo superhéroe
     */
    public void mostrarDialogoIngresarSuperheroe( )
    {
        DialogoIngresarSuperheroe d = new DialogoIngresarSuperheroe( this );
        d.setVisible( true );
    }

    /**
     * Método para ingresar un superhéroe
     * @param identidadPublica Identidad pública del superhéroe
     * @param identidadSecreta Identidad secreta del superhéroe
     * @param anhoCreacion Año de creación del superhéroe
     * @param creador Nombre del creador
     * @param nivelFuerza Nivel de fuerza
     * @param poderes poderes del superhéroe separados por comas
     * @param habilidades habilidades del superhéroe separadas por comas
     * @param rutaImagen Ruta a la imagen del superhéroe
     * @return true si el superhéroe fue ingresado, false de lo contrario
     */
    public boolean ingresarSuperheroe( String identidadPublica, String identidadSecreta, short anhoCreacion, String creador, byte nivelFuerza, String poderes, String habilidades, String rutaImagen )
    {
        boolean resultado;
        ArrayList nPoderes = new ArrayList( );
        ArrayList nHabilidades = new ArrayList( );

        StringTokenizer token = new StringTokenizer( poderes, "," );
        while( token.hasMoreElements( ) )
            nPoderes.add( token.nextElement( ).toString( ).trim( ) );

        token = new StringTokenizer( habilidades, "," );
        while( token.hasMoreElements( ) )
            nHabilidades.add( token.nextElement( ).toString( ).trim( ) );

        resultado = comics.ingresarSuperheroe( identidadSecreta, identidadPublica, anhoCreacion, creador, nPoderes, nHabilidades, nivelFuerza, rutaImagen );
        panelSuperheroes.actualizarSuperheroes( comics.darSuperheroes( ) );
        return resultado;
    }

    /**
     * Método para cargar los superhéroes desde un archivo
     * @param ruta Ruta del archivo
     * @throws Exception Si ocurre un error al cargar el archivo
     */
    private void cargarSuperheroes( String ruta ) throws Exception
    {
        FileInputStream fis = new FileInputStream( new File( ruta ) );
        Properties propiedades = new Properties( );
        propiedades.load( fis );

        // Cargar los superhéroes
        String nIdentidadSecreta, nIdentidadPublica, nCreador, nRutaImagen;
        short nAnhoCreacion;
        byte nNivelFuerza;
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
            nAnhoCreacion = (short) Integer.valueOf( propiedades.getProperty( "heroe" + cont + ".anhoCreacion" ) ).intValue( );
            nNivelFuerza = (byte) Integer.valueOf( propiedades.getProperty( "heroe" + cont + ".nivelFuerza" ) ).intValue( );

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

    // -----------------------------------------------------------------
    // Puntos de Extensión
    // -----------------------------------------------------------------

    /**
     * Método para la extensión 1
     */
    public void reqFuncOpcion1( )
    {
        String resultado = comics.metodo1( );
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * Método para la extensión 2
     */
    public void reqFuncOpcion2( )
    {
        String resultado = comics.metodo2( );
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    // -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------

    /**
     * Este método ejecuta la aplicación, creando una nueva interfaz
     * @param args
     */
    public static void main( String[] args )
    {

        InterfazComics interfaz = new InterfazComics( );
        interfaz.setVisible( true );
    }

}