/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: PanelInfoSuperheroe.java,v 1.3 2008/01/14 20:42:41 camil-ji Exp $
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
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import uniandes.cupi2.comics.mundo.SuperHeroe;

/**
 * Panel que muestra la informaci�n de un Superh�roe
 * 
 */
public class PanelInfoSuperheroe extends JPanel
{

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Panel que contiene la imagen del superh�roe
     */
    private JPanel panelImagen;

    /**
     * Panel que contiene la informaci�n del superh�roe
     */
    private JPanel panelInformacionSuperheroe;

    /**
     * Etiqueta que contiene la imagen del superh�roe
     */
    private JLabel labelImagen;

    /**
     * Etiqueta identidad p�blica
     */
    private JLabel labelIdentidadPublica;

    /**
     * Etiqueta identidad secreta
     */
    private JLabel labelIdentidadSecreta;

    /**
     * Etiqueta A�o de creaci�n
     */
    private JLabel labelAnhoCreacion;

    /**
     * Etiqueta Creador
     */
    private JLabel labelCreador;

    /**
     * Etiqueta Nivel de fuerza
     */
    private JLabel labelNivelFuerza;

    /**
     * Etiqueta Poderes
     */
    private JLabel labelPoderes;

    /**
     * Etiqueta Habilidades
     */
    private JLabel labelHabilidades;

    /**
     * Etiqueta con la identidad p�blica del superh�roe
     */
    private JLabel labelIdentidadPublicaSuperheroe;

    /**
     * Etiqueta con la identidad secreta del superh�roe
     */
    private JLabel labelIdentidadSecretaSuperheroe;

    /**
     * Etiqueta con el a�o de creaci�n del superh�roe
     */
    private JLabel labelAnhoCreacionSuperheroe;

    /**
     * Etiqueta con el nombre del creador del superh�roe
     */
    private JLabel labelCreadorSuperheroe;

    /**
     * Etiqueta con el nivel de fuerza del superh�roe
     */
    private JLabel labelNivelFuerzaSuperheroe;

    /**
     * Panel con los poderes del superh�roe
     */
    private JPanel panelPoderes;

    /**
     * Panel con las habilidades del superh�roe
     */
    private JPanel panelHabilidades;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea el panel para la visualizaci�n de la informaci�n de un Superh�roe
     */
    public PanelInfoSuperheroe( )
    {
        setLayout( new BorderLayout( ) );
        setBorder( new TitledBorder( "Informaci�n SuperH�roe" ) );
        setBackground( Color.WHITE );

        panelImagen = new JPanel( );
        panelInformacionSuperheroe = new JPanel( );

        inicializarPanelImagen( );
        inicializarPanelInformacionSuperheroe( );

        add( panelImagen, BorderLayout.WEST );
        add( panelInformacionSuperheroe, BorderLayout.EAST );

    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Inicializa el panel con la imagen
     */
    private void inicializarPanelImagen( )
    {
        panelImagen.setLayout( new BorderLayout( ) );
        panelImagen.setBackground( Color.WHITE );
        labelImagen = new JLabel( "" );
        labelImagen.setHorizontalAlignment( JLabel.CENTER );
        labelImagen.setVerticalAlignment( JLabel.CENTER );

        panelImagen.add( labelImagen, BorderLayout.CENTER );
    }

    /**
     * Inicializa el panel que contiene la informaci�n del superh�roe
     */
    private void inicializarPanelInformacionSuperheroe( )
    {
        GridLayout layout = new GridLayout( 8, 2 );
        layout.setVgap( 7 );
        Color gris = new Color( 128, 128, 128 );

        panelInformacionSuperheroe.setLayout( layout );
        panelInformacionSuperheroe.setBackground( Color.BLUE );

        labelIdentidadPublica = new JLabel( "Identidad P�blica: " );
        labelIdentidadPublica.setForeground( gris );
        panelInformacionSuperheroe.add( labelIdentidadPublica );

        labelIdentidadPublicaSuperheroe = new JLabel( );
        panelInformacionSuperheroe.add( labelIdentidadPublicaSuperheroe );

        labelIdentidadSecreta = new JLabel( "Identidad Secreta: " );
        labelIdentidadSecreta.setForeground( gris );
        panelInformacionSuperheroe.add( labelIdentidadSecreta );

        labelIdentidadSecretaSuperheroe = new JLabel( );
        panelInformacionSuperheroe.add( labelIdentidadSecretaSuperheroe );

        labelAnhoCreacion = new JLabel( "Año de creación: " );
        labelAnhoCreacion.setForeground( gris );
        panelInformacionSuperheroe.add( labelAnhoCreacion );

        labelAnhoCreacionSuperheroe = new JLabel( );
        panelInformacionSuperheroe.add( labelAnhoCreacionSuperheroe );

        labelCreador = new JLabel( "Creador: " );
        labelCreador.setForeground( gris );
        panelInformacionSuperheroe.add( labelCreador );

        labelCreadorSuperheroe = new JLabel( );
        panelInformacionSuperheroe.add( labelCreadorSuperheroe );

        labelNivelFuerza = new JLabel( "Nivel de Fuerza: " );
        labelNivelFuerza.setForeground( gris );
        panelInformacionSuperheroe.add( labelNivelFuerza );

        labelNivelFuerzaSuperheroe = new JLabel( );
        panelInformacionSuperheroe.add( labelNivelFuerzaSuperheroe );

        labelPoderes = new JLabel( "Poderes: " );
        labelPoderes.setForeground( gris );
        panelInformacionSuperheroe.add( labelPoderes );

        panelPoderes = new JPanel( );
        panelPoderes.setBackground( Color.WHITE );
        panelInformacionSuperheroe.add( panelPoderes );

        labelHabilidades = new JLabel( "Habilidades: " );
        labelHabilidades.setForeground( gris );
        panelInformacionSuperheroe.add( labelHabilidades );

        panelHabilidades = new JPanel( );
        panelHabilidades.setBackground( Color.WHITE );
        panelInformacionSuperheroe.add( panelHabilidades );
    }

    /**
     * Muestra la informaci�n del superh�roe dado por par�metro
     * @param heroe Superheroe del cual se va a mostrar la informaci�n
     */
    public void actualizar( SuperHeroe heroe )
    {
        labelIdentidadPublicaSuperheroe.setText( heroe.darIdentidadPublica( ) );
        labelIdentidadSecretaSuperheroe.setText( heroe.darIdentidadSecreta( ) );
        labelAnhoCreacionSuperheroe.setText( String.valueOf( heroe.darAnhoCreacion( ) ) );
        labelCreadorSuperheroe.setText( heroe.darCreador( ) );
        labelNivelFuerzaSuperheroe.setText( String.valueOf( heroe.darNivelFuerza( ) ) );

        panelPoderes.removeAll( );
        panelPoderes.setLayout( new GridLayout( heroe.darPoderes( ).size( ), 1 ) );
        for( Iterator iter = heroe.darPoderes( ).iterator( ); iter.hasNext( ); )
        {
            String poder = ( String )iter.next( );
            JLabel label = new JLabel( poder );
            panelPoderes.add( label );
        }

        panelHabilidades.removeAll( );
        panelHabilidades.setLayout( new GridLayout( heroe.darHabilidades( ).size( ), 1 ) );
        for( Iterator iter = heroe.darHabilidades( ).iterator( ); iter.hasNext( ); )
        {
            String habilidad = ( String )iter.next( );
            JLabel label = new JLabel( habilidad );
            panelHabilidades.add( label );
        }

        BufferedImage bImagen;
        try
        {
            bImagen = ImageIO.read( new File( heroe.darRutaImagen( ) ) );
            Image laImagen = bImagen.getScaledInstance( ( int ) ( 180 ), ( int ) ( 180 ), Image.SCALE_AREA_AVERAGING );
            labelImagen.setIcon( new ImageIcon( laImagen ) );
        }
        catch( IOException e )
        {
            labelImagen.setIcon( null );
            JOptionPane.showMessageDialog( this, "Error al cargar la imagen del superh�roe " + heroe.darRutaImagen( ), "Error", JOptionPane.ERROR_MESSAGE );
        }
    }
}
