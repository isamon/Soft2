/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: PanelSuperheroes.java,v 1.3 2008/01/14 20:42:41 camil-ji Exp $
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
 * Panel que muestra con una lista los superh�roes disponibles
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
 * Clase para visualizar los superh�roes
 */
public class PanelSuperheroes extends JPanel implements ActionListener, ListSelectionListener
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Constante Ingresar superh�roe
     */
    private final static String INGRESAR = "Ingresar Superh�roe";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Ventana principal de la aplicaci�n
     */
    private InterfazComics principal;

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Lista para mostrar la informaci�n de los superh�roes
     */
    private JList listaSuperheroes;

    /**
     * Bot�n para ingresar un Superh�roe
     */
    private JButton btnIngresarSuperheroe;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea el panel para la visualizaci�n de los Superh�roes
     * @param principal Ventana principal de la aplicaci�n
     */
    public PanelSuperheroes( InterfazComics principal )
    {
        
        
    	this.principal = principal;

        TitledBorder borde = new TitledBorder( "SuperH�roes" );
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
    // M�todos
    // -----------------------------------------------------------------

    /**
     * M�todo que actualiza la tabla con la informaci�n de los superh�roes
     * @param superheroes Superh�roes que contiene actualmente
     */
    public void actualizarSuperheroes( java.util.ArrayList superheroes )
    {
        // TODO Completar seg�n enunciado
        // Recuerde primero borrar los elementos de la lista actual, 
        // segundo agregar los nuevos elementos (entran como par�metro), 
        // y tercero establecer el �ndice seleccionado en el 0.
    	listaSuperheroes.setListData(superheroes.toArray());
    }

    /**
     * M�todo para seleccionar un superh�roe de la lista
     * @param seleccionar �ndice del superh�roe a seleccionar
     */
    public void seleccionar( int seleccionar )
    {
        listaSuperheroes.setSelectedIndex( seleccionar );
        listaSuperheroes.ensureIndexIsVisible( seleccionar );
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
            principal.mostrarDialogoIngresarSuperheroe( );
        }
    }

    /**
     * M�todo que se llama cuando se selecciona un superh�roe en la lista de superh�roes
     * @param e Evento de selecci�n en la lista
     */
    public void valueChanged( ListSelectionEvent e )
    {
        // TODO Completar seg�n enunciado
        // Obtenga el superh�roe seleccionado y llame a la interfaz para que actualice el panel 
        // de informaci�n de superh�roes con el superh�roe que ud. acab� de obtener
    }

}