/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: PanelOpciones.java,v 1.4 2008/01/18 23:25:44 carl-veg Exp $
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

/**
 * Panel que contiene los botones con las opciones de la aplicaci�n
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Panel que muestra las opciones de consultas que posee la aplicaci�n
 */
public class PanelOpciones extends JPanel implements ActionListener
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Constante Buscar superh�roe por identidad publica utilizando la b�squeda binaria
     */
    public final static String BUSCAR_BINARIO_IDENTIDAD_PUBLICA = "Binario Identidad Publica";
    
    /**
     * Constante Buscar superh�roe por identidad secreta
     */
    public final static String BUSCAR_POR_IDENTIDAD_SECRETA = "Identidad Secreta";

    /**
     * constante Buscar superh�roe m�s antiguo
     */
    public final static String BUSCAR_MAS_ANTIGUO = "M�s Antiguo";

    /**
     * Constante Buscar superh�roe m�s fuerte
     */
    public final static String BUSCAR_MAS_FUERTE = "M�s Fuerte";

    /**
     * Constante Ordenar superh�roes por a�o de creaci�n
     */
    public final static String ORDENAR_POR_ANHO_CREACION = "A�o de Creaci�n";

    /**
     * Constante Ordenar superh�roes por nombre del creador
     */
    public final static String ORDENAR_POR_CREADOR = "Creador";

    /**
     * Constante Ordenar superh�roes por nivel de fuerza
     */
    public final static String ORDENAR_POR_NIVEL_FUERZA = "Nivel de Fuerza";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Ventana principal de la aplicaci�n
     */
    private InterfazComics principal;

    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

    /**
     * Bot�n para Buscar un superh�roe por Identidad publica utilizando el m�todo binario
     */
    private JButton btnBuscarBinarioIdentidadPublica;
    /**
     * Bot�n para Buscar un superh�roe por Identidad secreta
     */
    private JButton btnBuscarPorIdentidadSecreta;
    /**
     * Bot�n para buscar superh�roe mas antiguo
     */
    private JButton btnBuscarMasAntiguo;

    /**
     * Bot�n para buscar superh�roe mas fuerte
     */
    private JButton btnBuscarMasFuerte;

    /**
     * Bot�n para ordenar los superh�roe por a�o de creaci�n
     */
    private JButton btnOrdenarPorAnhoCreacion;

    /**
     * Bot�n para ordenar los superh�roes por nombre del creador
     */
    private JButton btnOrdenarPorCreador;

    /**
     * Bot�n para ordenar los superh�roes por nivel de fuerza
     */
    private JButton btnOrdenarPorNivelFuerza;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del panel para mostrar las opciones disponibles
     * @param principal Clase principal de la aplicaci�n
     */
    public PanelOpciones( InterfazComics principal )
    {
        this.principal = principal;
        this.setLayout( new BorderLayout( ) );

        JPanel panelBusquedas = new JPanel( );
        panelBusquedas.setBorder( new TitledBorder( "Buscar Por:" ) );

        GridLayout layout = new GridLayout( 4, 1 );
        layout.setVgap( 15 );
        layout.setHgap( 15 );

        panelBusquedas.setLayout( layout );

        
        btnBuscarBinarioIdentidadPublica = new JButton( BUSCAR_BINARIO_IDENTIDAD_PUBLICA );
        btnBuscarBinarioIdentidadPublica.setActionCommand( BUSCAR_BINARIO_IDENTIDAD_PUBLICA );
        btnBuscarBinarioIdentidadPublica.addActionListener( this );
        panelBusquedas.add( btnBuscarBinarioIdentidadPublica );
        
        btnBuscarPorIdentidadSecreta = new JButton( BUSCAR_POR_IDENTIDAD_SECRETA );
        btnBuscarPorIdentidadSecreta.setActionCommand( BUSCAR_POR_IDENTIDAD_SECRETA );
        btnBuscarPorIdentidadSecreta.addActionListener( this );
        panelBusquedas.add( btnBuscarPorIdentidadSecreta );

        btnBuscarMasAntiguo = new JButton( BUSCAR_MAS_ANTIGUO );
        btnBuscarMasAntiguo.setActionCommand( BUSCAR_MAS_ANTIGUO );
        btnBuscarMasAntiguo.addActionListener( this );
        panelBusquedas.add( btnBuscarMasAntiguo );

        btnBuscarMasFuerte = new JButton( BUSCAR_MAS_FUERTE );
        btnBuscarMasFuerte.setActionCommand( BUSCAR_MAS_FUERTE );
        btnBuscarMasFuerte.addActionListener( this );
        panelBusquedas.add( btnBuscarMasFuerte );

        this.add( panelBusquedas, BorderLayout.NORTH );

        JPanel panelOrdenamientos = new JPanel( );
        panelOrdenamientos.setBorder( new TitledBorder( "Ordenar por:" ) );

        GridLayout layout2 = new GridLayout( 3, 1 );
        layout2.setVgap( 15 );
        layout2.setHgap( 15 );

        panelOrdenamientos.setLayout( layout2 );

        btnOrdenarPorAnhoCreacion = new JButton( ORDENAR_POR_ANHO_CREACION );
        btnOrdenarPorAnhoCreacion.setActionCommand( ORDENAR_POR_ANHO_CREACION );
        btnOrdenarPorAnhoCreacion.addActionListener( this );
        panelOrdenamientos.add( btnOrdenarPorAnhoCreacion );

        btnOrdenarPorCreador = new JButton( ORDENAR_POR_CREADOR );
        btnOrdenarPorCreador.setActionCommand( ORDENAR_POR_CREADOR );
        btnOrdenarPorCreador.addActionListener( this );
        panelOrdenamientos.add( btnOrdenarPorCreador );

        btnOrdenarPorNivelFuerza = new JButton( ORDENAR_POR_NIVEL_FUERZA );
        btnOrdenarPorNivelFuerza.setActionCommand( ORDENAR_POR_NIVEL_FUERZA );
        btnOrdenarPorNivelFuerza.addActionListener( this );
        panelOrdenamientos.add( btnOrdenarPorNivelFuerza );

        this.add( panelOrdenamientos, BorderLayout.SOUTH );

    }
    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * M�todo que recoge las acciones sobre los objetos que est� escuchando.
     * @param e Evento que se realiz�.
     */
    public void actionPerformed( ActionEvent e )
    {
        String comando = e.getActionCommand( );
        
        if( BUSCAR_BINARIO_IDENTIDAD_PUBLICA.equals( comando ) )
        {
            principal.buscarSuperheroeBinarioIdentidadPublica( );
        }
        else if( BUSCAR_POR_IDENTIDAD_SECRETA.equals( comando ) )
        {
            principal.buscarSuperheroePorIdentidadSecreta( );
        }
        else if( BUSCAR_MAS_ANTIGUO.equals( comando ) )
        {
            principal.buscarSuperheroeMasAntiguo( );
        }
        else if( BUSCAR_MAS_FUERTE.equals( comando ) )
        {
            principal.buscarSuperheroeMasFuerte( );
        }
        else if( ORDENAR_POR_ANHO_CREACION.equals( comando ) )
        {
            principal.ordenarPorAnhoCreacion( );
        }
        else if( ORDENAR_POR_CREADOR.equals( comando ) )
        {
            principal.ordenarPorCreador( );
        }
        else if( ORDENAR_POR_NIVEL_FUERZA.equals( comando ) )
        {
            principal.ordenarPorNivelFuerza( );
        }

    }

}
