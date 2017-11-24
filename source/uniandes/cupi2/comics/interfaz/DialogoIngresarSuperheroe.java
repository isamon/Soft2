/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: DialogoIngresarSuperheroe.java,v 1.3 2008/01/14 20:42:41 camil-ji Exp $
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
 * Dialogo para ingresar un nuevo superh�roe
 */
public class DialogoIngresarSuperheroe extends JDialog implements ActionListener
{
    // -----------------------------------------------
    // Constantes
    // -----------------------------------------------

    /**
     * Constante Ingresar Superh�roe
     */
    private final static String INGRESAR = "Ingresar Superh�roe";

    /**
     * Constante examinar
     */
    private final static String EXAMINAR = "Examinar";

    // -----------------------------------------------
    // Atributos
    // -----------------------------------------------

    /**
     * Etiqueta Identidad p�blica
     */
    private JLabel labelIdentidadPublica;

    /**
     * Etiqueta Identidad secreta
     */
    private JLabel labelIdentidadSecreta;

    /**
     * Etiqueta A�o creaci�n
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
     * Texto Identidad p�blica
     */
    private JTextField textIdentidadPublica;

    /**
     * Texto Identidad secreta
     */
    private JTextField textIdentidadSecreta;

    /**
     * Texto A�o de creaci�n
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
     * Panel con la informaci�n del superh�roe
     */
    private JPanel panelInfo;

    /**
     * Bot�n para ingresar el superh�roe
     */
    private JButton btnIngresar;

    /**
     * Bot�n para ingresar la ruta de la imagen
     */
    private JButton btnExaminar;

    /**
     * Ventana principal de la aplicaci�n
     */
    private InterfazComics principal;

    // -----------------------------------------------
    // M�todos
    // -----------------------------------------------

    /**
     * Crea el dialogo para ingresar un superh�roe
     * @param principal Ventana principal de la aplicaci�n
     */
    public DialogoIngresarSuperheroe( InterfazComics principal )
    {
        super( principal, true );

        this.principal = principal;
        setTitle( "Ingresar Superh�roe" );
        setLayout( new java.awt.BorderLayout( ) );

        panelInfo = new JPanel( );
        panelInfo.setPreferredSize( new Dimension( 450, 300 ) );

        panelInfo.setBorder( new TitledBorder( "Informaci�n" ) );
        GridLayout layout = new GridLayout( 8, 2 );
        layout.setVgap( 10 );
        panelInfo.setLayout( layout );

        labelIdentidadPublica = new JLabel( "Id P�blica: " );
        panelInfo.add( labelIdentidadPublica );
        textIdentidadPublica = new JTextField( );
        panelInfo.add( textIdentidadPublica );

        labelIdentidadSecreta = new JLabel( "Id Secreta: " );
        panelInfo.add( labelIdentidadSecreta );
        textIdentidadSecreta = new JTextField( );
        panelInfo.add( textIdentidadSecreta );

        labelAnhoCreacion = new JLabel( "A�o creaci�n: " );
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
     * M�todo que recoge las acciones sobre los objetos que est� escuchando.
     * @param e Evento que se realiz�.
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
                    JOptionPane.showMessageDialog( this, "Datos Incompletos", "Ingresar Superh�roe", JOptionPane.ERROR_MESSAGE );
                }
                else if( anhoCreacion <= 0 || nivelFuerza <= 0 )
                {
                    JOptionPane.showMessageDialog( this, "El a�o de creaci�n y el nivel de fuerza del superh�roe deben ser mayores a cero", "Ingresar Superh�roe", JOptionPane.ERROR_MESSAGE );
                }
                else if( principal.ingresarSuperheroe( identidadPublica, identidadSecreta, anhoCreacion, creador, nivelFuerza, poderes, habilidades, imagen ) )
                {
                    dispose( );   
                }
                else
                {
                    JOptionPane.showMessageDialog( this, "Ya existe un superh�roe con la identidad p�blica dada", "Ingresar Superh�roe", JOptionPane.ERROR_MESSAGE );
                }
            }
            catch( NumberFormatException ne )
            {
                JOptionPane.showMessageDialog( this, "Formato de n�mero no v�lido", "Ingresar Superh�roe", JOptionPane.ERROR_MESSAGE );
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
