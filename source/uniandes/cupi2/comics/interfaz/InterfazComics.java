/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: InterfazComics.java,v 1.5 2008/01/19 00:56:00 carl-veg Exp $
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n7_comics
 * Autor: Carlos Andr�s Vega - 17-sep-2007
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
 * Esta es la ventana principal de la aplicaci�n.
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
     * Panel con la lista de superh�roes
     */
    private PanelSuperheroes panelSuperheroes;

    /**
     * Panel para visualizar la informaci�n de un superh�roe
     */
    private PanelInfoSuperheroe panelInfoSuperheroe;

    /**
     * Panel con las opciones de la aplicaci�n
     */
    private PanelOpciones panelOpciones;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor de la ventana principal de la aplicaci�n
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

            // Creaci�n de los paneles aqu�
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
    // M�todos
    // -----------------------------------------------------------------

    /**
     * M�todo para actualizar el panel que muestra la informaci�n de los superh�roes
     * @param heroe H�roe del cual se va a obtener la informaci�n
     */
    public void actualizarInfoSuperheroe( SuperHeroe heroe )
    {
        panelInfoSuperheroe.actualizar( heroe );
    }

    /**
     * M�todo para buscar un superh�roe por identidad secreta utilizando el m�todo binario
     */
    public void buscarSuperheroeBinarioIdentidadPublica( )
    {
        String idPublica = JOptionPane.showInputDialog( this, "Identidad Publica" );
        if( idPublica != null )
        {
            comics.ordenarPorIdentidadPublica( );
            panelSuperheroes.actualizarSuperheroes( comics.darSuperheroes( ) );
            int pos = comics.buscarBinarioPorIdentidadPublica( idPublica );
            if( pos != -1 )
                panelSuperheroes.seleccionar( pos );
            else
                JOptionPane.showMessageDialog( this, "No se encontr� alg�n superh�roe con la identidad dada.", "Atencion", JOptionPane.INFORMATION_MESSAGE );
        }

    }
    
    /**
     * M�todo para buscar un superh�roe por identidad secreta
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
                JOptionPane.showMessageDialog( this, "No se encontr� alg�n superh�roe con la identidad dada.", "Respuesta", JOptionPane.INFORMATION_MESSAGE );
        }

    }

    /**
     * M�todo para buscar el superh�roe m�s antiguo
     */
    public void buscarSuperheroeMasAntiguo( )
    {
        int pos = comics.buscarSuperheroeMasAntiguo( );
        if( pos != -1 )
            panelSuperheroes.seleccionar( pos );
        else
            JOptionPane.showMessageDialog( this, "No se encontr� el superh�roe m�s antiguo.", "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * M�todo para buscar el superh�roe m�s fuerte
     */
    public void buscarSuperheroeMasFuerte( )
    {
        int pos = comics.buscarSuperheroeMasFuerte( );
        if( pos != -1 )
            panelSuperheroes.seleccionar( pos );
        else
            JOptionPane.showMessageDialog( this, "No se encontr� el superh�roe m�s fuerte.", "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * M�todo para visualizar la lista de superh�roes ordenada por a�o de creaci�n ascendentemente
     */
    public void ordenarPorAnhoCreacion( )
    {
        comics.ordenarPorAnhoCreacion( );
        panelSuperheroes.actualizarSuperheroes( comics.darSuperheroes( ) );
    }

    /**
     * M�todo para visualizar la lista de superh�roes ordenada por el nombre del creador de manera ascendente
     */
    public void ordenarPorCreador( )
    {
        comics.ordenarPorCreador( );
        panelSuperheroes.actualizarSuperheroes( comics.darSuperheroes( ) );
    }

    /**
     * M�todo para visualizar la lista de superh�roes ordenada por el nivel de fuerza de manera ascendente
     */
    public void ordenarPorNivelFuerza( )
    {
        comics.ordenarPorNivelFuerza( );
        panelSuperheroes.actualizarSuperheroes( comics.darSuperheroes( ) );
    }

    /**
     * M�todo para mostrar el dialogo para ingresar un nuevo superh�roe
     */
    public void mostrarDialogoIngresarSuperheroe( )
    {
        DialogoIngresarSuperheroe d = new DialogoIngresarSuperheroe( this );
        d.setVisible( true );
    }

    /**
     * M�todo para ingresar un superh�roe
     * @param identidadPublica Identidad p�blica del superh�roe
     * @param identidadSecreta Identidad secreta del superh�roe
     * @param anhoCreacion A�o de creaci�n del superh�roe
     * @param creador Nombre del creador
     * @param nivelFuerza Nivel de fuerza
     * @param poderes poderes del superh�roe separados por comas
     * @param habilidades habilidades del superh�roe separadas por comas
     * @param rutaImagen Ruta a la imagen del superh�roe
     * @return true si el superh�roe fue ingresado, false de lo contrario
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
    // Puntos de Extensi�n
    // -----------------------------------------------------------------

    /**
     * M�todo para la extensi�n 1
     */
    public void reqFuncOpcion1( )
    {
        String resultado = comics.metodo1( );
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * M�todo para la extensi�n 2
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
     * Este m�todo ejecuta la aplicaci�n, creando una nueva interfaz
     * @param args
     */
    public static void main( String[] args )
    {

        InterfazComics interfaz = new InterfazComics( );
        interfaz.setVisible( true );
    }

}