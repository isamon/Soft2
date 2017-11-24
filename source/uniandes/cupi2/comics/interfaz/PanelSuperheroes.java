/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: PanelSuperheroes.java,v 1.3 2008/01/14 20:42:41 camil-ji Exp $
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

/**
 * Panel que muestra con una lista los superhéroes disponibles
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import uniandes.cupi2.comics.mundo.SuperHeroe;

/**
 * Clase para visualizar los superhéroes
 */
public class PanelSuperheroes extends JPanel implements ActionListener, ListSelectionListener
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Constante Ingresar superhéroe
     */
    private final static String INGRESAR = "Ingresar Superhéroe";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Ventana principal de la aplicación
     */
    private InterfazComics principal;

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Lista para mostrar la información de los superhéroes
     */
    private JList listaSuperheroes;

    /**
     * Botón para ingresar un Superhéroe
     */
    private JButton btnIngresarSuperheroe;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea el panel para la visualización de los Superhéroes
     * @param principal Ventana principal de la aplicación
     */
    public PanelSuperheroes( InterfazComics principal )
    {
        
        
    	this.principal = principal;

        TitledBorder borde = new TitledBorder( "SuperHéroes" );
        setBorder( borde );
        setLayout( new BorderLayout( ) );

        // TODO 
        // (1) Crear la lista y (2) agregar al panel como listener de la lista
        listaSuperheroes = new JList( );
        listaSuperheroes.setSelectionMode( ListSelectionModel.SINGLE_SELECTION);
        listaSuperheroes.addListSelectionListener( this );
       
        // TODO 
        // (1) Crear y configurar un scroll pane para que contenga la lista
        JScrollPane scroll = new JScrollPane();
        scroll.setHorizontalScrollBarPolicy( JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setBorder( new CompoundBorder(new EmptyBorder(3, 3, 3, 3),new LineBorder(Color.BLACK,1)));
        scroll.getViewport().add(listaSuperheroes);
        
        // (2) Agregar el scroll al panel en el centro (Tener en cuenta que el layout es BorderLayout)
        add(scroll, BorderLayout.CENTER);

        JPanel panelIngresar = new JPanel( );
        panelIngresar.setLayout( new GridLayout( 1, 1 ) );
        btnIngresarSuperheroe = new JButton( INGRESAR );
        btnIngresarSuperheroe.setActionCommand( INGRESAR );
        btnIngresarSuperheroe.addActionListener( this );
        panelIngresar.add( btnIngresarSuperheroe );

        add( panelIngresar, BorderLayout.SOUTH );
    }
    
    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Método que actualiza la tabla con la información de los superhéroes
     * @param superheroes Superhéroes que contiene actualmente
     */
    public void actualizarSuperheroes( java.util.ArrayList superheroes )
    {
        // TODO Completar según enunciado
        // Recuerde primero borrar los elementos de la lista actual, 
        // segundo agregar los nuevos elementos (entran como parámetro), 
        // y tercero establecer el índice seleccionado en el 0.
    	listaSuperheroes.setListData(superheroes.toArray());
    }

    /**
     * Método para seleccionar un superhéroe de la lista
     * @param seleccionar Índice del superhéroe a seleccionar
     */
    public void seleccionar( int seleccionar )
    {
        listaSuperheroes.setSelectedIndex( seleccionar );
        listaSuperheroes.ensureIndexIsVisible( seleccionar );
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
            principal.mostrarDialogoIngresarSuperheroe( );
        }
    }

    /**
     * Método que se llama cuando se selecciona un superhéroe en la lista de superhéroes
     * @param e Evento de selección en la lista
     */
    public void valueChanged( ListSelectionEvent e )
    {
        // TODO Completar según enunciado
        // Obtenga el superhéroe seleccionado y llame a la interfaz para que actualice el panel 
        // de información de superhéroes con el superhéroe que ud. acabó de obtener
    }

}