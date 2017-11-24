/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: DialogoIngresarSuperheroe.java,v 1.3 2008/01/14 20:42:41 camil-ji Exp $
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
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * Dialogo para ingresar un nuevo superhéroe
 */
public class DialogoIngresarSuperheroe extends JDialog implements ActionListener
{
    // -----------------------------------------------
    // Constantes
    // -----------------------------------------------

    /**
     * Constante Ingresar Superhéroe
     */
    private final static String INGRESAR = "Ingresar Superhéroe";

    /**
     * Constante examinar
     */
    private final static String EXAMINAR = "Examinar";

    // -----------------------------------------------
    // Atributos
    // -----------------------------------------------

    /**
     * Etiqueta Identidad pública
     */
    private JLabel labelIdentidadPublica;

    /**
     * Etiqueta Identidad secreta
     */
    private JLabel labelIdentidadSecreta;

    /**
     * Etiqueta Año creación
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
     * Etiqueta Imagen
     */
    private JLabel labelImagen;

    /**
     * Texto Identidad pública
     */
    private JTextField textIdentidadPublica;

    /**
     * Texto Identidad secreta
     */
    private JTextField textIdentidadSecreta;

    /**
     * Texto Año de creación
     */
    private JTextField textAnhoCreacion;

    /**
     * Texto Creador
     */
    private JTextField textCreador;

    /**
     * Texto Nivel de fuerza
     */
    private JTextField textNivelFuerza;

    /**
     * Texto Poderes
     */
    private JTextField textPoderes;

    /**
     * Texto Habilidades
     */
    private JTextField textHabilidades;

    /**
     * Texto con la ruta de la imagen
     */
    private JTextField textImagen;

    /**
     * Panel con la información del superhéroe
     */
    private JPanel panelInfo;

    /**
     * Botón para ingresar el superhéroe
     */
    private JButton btnIngresar;

    /**
     * Botón para ingresar la ruta de la imagen
     */
    private JButton btnExaminar;

    /**
     * Ventana principal de la aplicación
     */
    private InterfazComics principal;

    // -----------------------------------------------
    // Métodos
    // -----------------------------------------------

    /**
     * Crea el dialogo para ingresar un superhéroe
     * @param principal Ventana principal de la aplicación
     */
    public DialogoIngresarSuperheroe( InterfazComics principal )
    {
        super( principal, true );

        this.principal = principal;
        setTitle( "Ingresar Superhéroe" );
        setLayout( new java.awt.BorderLayout( ) );

        panelInfo = new JPanel( );
        panelInfo.setPreferredSize( new Dimension( 450, 300 ) );

        panelInfo.setBorder( new TitledBorder( "Información" ) );
        GridLayout layout = new GridLayout( 8, 2 );
        layout.setVgap( 10 );
        panelInfo.setLayout( layout );

        labelIdentidadPublica = new JLabel( "Id Pública: " );
        panelInfo.add( labelIdentidadPublica );
        textIdentidadPublica = new JTextField( );
        panelInfo.add( textIdentidadPublica );

        labelIdentidadSecreta = new JLabel( "Id Secreta: " );
        panelInfo.add( labelIdentidadSecreta );
        textIdentidadSecreta = new JTextField( );
        panelInfo.add( textIdentidadSecreta );

        labelAnhoCreacion = new JLabel( "Año creación: " );
        panelInfo.add( labelAnhoCreacion );
        textAnhoCreacion = new JTextField( );
        panelInfo.add( textAnhoCreacion );

        labelCreador = new JLabel( "Creador: " );
        panelInfo.add( labelCreador );
        textCreador = new JTextField( );
        panelInfo.add( textCreador );

        labelNivelFuerza = new JLabel( "Nivel de Fuerza: " );
        panelInfo.add( labelNivelFuerza );
        textNivelFuerza = new JTextField( );
        panelInfo.add( textNivelFuerza );

        labelPoderes = new JLabel( "Poderes (Separados por comas):" );
        panelInfo.add( labelPoderes );
        textPoderes = new JTextField( );
        panelInfo.add( textPoderes );

        labelHabilidades = new JLabel( "Habilidades (Separadas por comas): " );
        panelInfo.add( labelHabilidades );
        textHabilidades = new JTextField( );
        panelInfo.add( textHabilidades );

        labelImagen = new JLabel( "Imagen: " );
        panelInfo.add( labelImagen );

        BorderLayout border = new BorderLayout( );
        border.setHgap( 5 );
        border.setVgap( 5 );

        JPanel panelRutaImagen = new JPanel( border );
        textImagen = new JTextField( );
        panelRutaImagen.add( textImagen, BorderLayout.CENTER );

        btnExaminar = new JButton( EXAMINAR );
        btnExaminar.setActionCommand( EXAMINAR );
        btnExaminar.addActionListener( this );
        panelRutaImagen.add( btnExaminar, BorderLayout.EAST );

        panelInfo.add( panelRutaImagen );

        add( panelInfo, BorderLayout.NORTH );

        btnIngresar = new JButton( INGRESAR );
        btnIngresar.setActionCommand( INGRESAR );
        btnIngresar.addActionListener( this );
        add( btnIngresar, BorderLayout.SOUTH );

        pack( );
        setLocationRelativeTo( null );

    }

    /**
     * Método que recoge las acciones sobre los objetos que está escuchando.
     * @param e Evento que se realizó.
     */
    public void actionPerformed( ActionEvent e )
    {
        String comando = e.getActionCommand( );
        
        if( comando.equals( INGRESAR ) )
        {
            try
            {
                String identidadPublica = textIdentidadPublica.getText( );
                String identidadSecreta = textIdentidadSecreta.getText( );
                String creador = textCreador.getText( );
                String imagen = textImagen.getText( );
                String poderes = textPoderes.getText( );
                String habilidades = textHabilidades.getText( );

                short anhoCreacion = (short) Integer.valueOf( textAnhoCreacion.getText( ) ).intValue( );
                byte nivelFuerza = (byte) Integer.valueOf( textNivelFuerza.getText( ) ).intValue( );
                
                if( identidadPublica.equals( "" ) || identidadSecreta.equals( "" ) || creador.equals( "" ) || poderes.equals( "" ) || habilidades.equals( "" ) || imagen.equals( "" ) )
                {
                    JOptionPane.showMessageDialog( this, "Datos Incompletos", "Ingresar Superhéroe", JOptionPane.ERROR_MESSAGE );
                }
                else if( anhoCreacion <= 0 || nivelFuerza <= 0 )
                {
                    JOptionPane.showMessageDialog( this, "El año de creación y el nivel de fuerza del superhéroe deben ser mayores a cero", "Ingresar Superhéroe", JOptionPane.ERROR_MESSAGE );
                }
                else if( principal.ingresarSuperheroe( identidadPublica, identidadSecreta, anhoCreacion, creador, nivelFuerza, poderes, habilidades, imagen ) )
                {
                    dispose( );   
                }
                else
                {
                    JOptionPane.showMessageDialog( this, "Ya existe un superhéroe con la identidad pública dada", "Ingresar Superhéroe", JOptionPane.ERROR_MESSAGE );
                }
            }
            catch( NumberFormatException ne )
            {
                JOptionPane.showMessageDialog( this, "Formato de número no válido", "Ingresar Superhéroe", JOptionPane.ERROR_MESSAGE );
                return;
            }

        }
        else if( comando.equals( EXAMINAR ) )
        {
            JFileChooser fc = new JFileChooser( "./data/imagenes" );
            fc.setDialogTitle( "Buscar Imagen..." );
            fc.setMultiSelectionEnabled( false );

            int resultado = fc.showOpenDialog( this );
            if( resultado == JFileChooser.APPROVE_OPTION )
            {
                String imagen = fc.getSelectedFile( ).getAbsolutePath( );
                textImagen.setText( imagen );
            }
        }

    }

}
