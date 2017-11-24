/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: PanelImagen.java,v 1.2 2008/01/14 20:42:40 camil-ji Exp $
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
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel con la imagen
 */
public class PanelImagen extends JPanel
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------
    
    /**
     * Constante ruta de la imagen
     */
    public final static String RUTA = "data/Encabezado.png";
    
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Etiqueta con la imagen
     */
    private JLabel etiquetaImagen;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del Panel
     */
    public PanelImagen( )
    {
        setLayout( new BorderLayout( ) );
        setBackground( Color.WHITE );

        // Etiqueta Logo de las elecciones
        ImageIcon icono = new ImageIcon( RUTA );
        etiquetaImagen = new JLabel( "" );
        etiquetaImagen.setIcon( icono );
        etiquetaImagen.setHorizontalAlignment( JLabel.CENTER );
        etiquetaImagen.setVerticalAlignment( JLabel.CENTER );
        etiquetaImagen.setIcon( new ImageIcon( RUTA ) );

        add( etiquetaImagen, BorderLayout.CENTER );
    }
}
