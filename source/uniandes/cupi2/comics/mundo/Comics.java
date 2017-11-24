/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: Comics.java,v 1.5 2008/01/18 23:25:44 carl-veg Exp $
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n7_comics
 * Autor: Carlos Andrés Vega - 17-sep-2007
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.comics.mundo;

import java.util.ArrayList;


/**
 * Es la clase que se encarga de manejar, organizar, cargar y salvar los superhéroes. <br>
 * 
 * <b>inv.</b><br>
 * heroes != null<br>
 * Ningún héroe tiene la misma identidad pública<br>
 * 
 */
public class Comics
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Es el vector que contiene todos los superhéroes
     */
    private ArrayList heroes;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye un nuevo manejador de superhéroes vacío.
     */
    public Comics( )
    {
        heroes = new ArrayList( );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Ingresa un superhéroe. <br>
     * <b> pre: </b> La lista de superhéroes se encuentra inicializada <br>
     * <b> post: </b> La lista de superhéroes contiene un nuevo superhéroe, si este tiene una identidad pública diferente a los demás superhéroes existentes. <br>
     * Los superhéroes en la lista de superhéroes no contienen identidades publicas repetidas <br>
     * @param nIdentidadSecreta Identidad secreta del superhéroe - nIdentidadSecreta != null
     * @param nIdentidadPublica Identidad pública del superhéroe - nIdentidadPublica != null
     * @param nAnhoCreacion Año de creación del superhéroe - nAnhoCreacion > 0
     * @param nCreador Creador del superhéroe - nCreador != null
     * @param nPoderes Poderes del superhéroe - nPoderes != null
     * @param nHabilidades Habilidades del superhéroe - nHabilidades != null
     * @param nNivelFuerza Nivel del fuerza del superhéroe - nNivelFuerza > 0
     * @param nRutaImagen Ruta a la imagen del superhéroe - nRutaImagen != null
     * @return true si el superhéroe fue ingresado, false de lo contrario
     */
    public boolean ingresarSuperheroe( String nIdentidadSecreta, String nIdentidadPublica, short nAnhoCreacion, String nCreador, ArrayList nPoderes, ArrayList nHabilidades, byte nNivelFuerza, String nRutaImagen )
    {
        if( buscarSuperheroePorIdentidadPublica( nIdentidadPublica ) == -1 )
        {
            heroes.add( new SuperHeroe( nIdentidadSecreta, nIdentidadPublica, nAnhoCreacion, nCreador, nPoderes, nHabilidades, nNivelFuerza, nRutaImagen ) );
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Retorna una lista de superhéroes. La lista que se retorna no es la misma que la almacenada en esta clase, pero si tiene el mismo orden. <br>
     * Se crea una copia de la lista de superhéroes.
     * <b> pre: </b> La lista de superhéroes se encuentra inicializada. <br>
     * @return Lista de superhéroes
     */
    public ArrayList darSuperheroes( )
    {
        ArrayList copiaLista = new ArrayList( heroes );
        return copiaLista;
    }
    
    /**
     * Busca un Superhéroe utilizando una búsqueda binaria. <br>
     * <b>pre: </b> La lista de superhéroes se encuentra ordenada por identidad pública.
     * @param identidadPublica es la identidad pública del superhéroe que se va a buscar - identidadPublica != null
     * @return La posición del superhéroe con la identidad pública dada. Si el superhéroe no existe se retorna -1.
     */
    public int buscarBinarioPorIdentidadPublica( String identidadPublica )
    {
		
        // TODO Completar según documentación
		return 1;
    }

    /**
     * Busca un Superhéroe por identidad pública. <br>
     * <b>pre: </b> La lista de superhéroes se encuentra inicializada.
     * @param identidadPublica es la identidad pública del superhéroe que se va a buscar - identidadPublica != null
     * @return La posición del superhéroe con la identidad pública dada. Si el superhéroe no existe se retorna -1.
     */
    public int buscarSuperheroePorIdentidadPublica( String identidadPublica )
    {
		return 2;
        // TODO Completar según documentación
    }

    /**
     * Busca un Superhéroe por identidad secreta. <br>
     * <b>pre: </b> La lista de superhéroes se encuentra inicializada.
     * @param identidadSecreta es la identidad secreta del superhéroe que se va a buscar - identidadSecreta != null
     * @return La posición del superhéroe con la identidad secreta dada. Si el superhéroe no existe se retorna -1.
     */
    public int buscarSuperheroePorIdentidadSecreta( String identidadSecreta )
    {
		return 3;
        // TODO Completar según documentación
    }

    /**
     * Busca el superhéroe que tenga el menor año de creación. <br>
     * <b>pre: </b> La lista de superhéroes se encuentra inicializada.
     * @return La posición del superhéroe con el menor año de creación. Si el superhéroe no existe se retorna -1.
     */
    public int buscarSuperheroeMasAntiguo( )
    {
		return 4;
        // TODO Completar según documentación
    }

    /**
     * Busca el superhéroe mas fuerte. <br>
     * <b>pre: </b> La lista de superhéroes se encuentra inicializada. <br>
     * <b>post: <b> Retorna la posición del superhéroe mas fuerte, si hay varios con el mismo nivel de fuerza y
     * con el mayor nivel en la lista, retorna el primero que encuentre.
     * @return La posición del superhéroe con el mayor nivel de fuerza. Si el superhéroe no existe se retorna -1.
     */
    public int buscarSuperheroeMasFuerte( )
    {
		return 5;
        // TODO Completar según documentación
    }
    
    /**
     * Organiza la lista de superhéroes por su identidad publica usando el algoritmo de burbuja. <br>
     * <b>pre: </b> La lista de superhéroes se encuentra inicializada. <br>
     * <b>post: </b>La lista de superhéroes está ordenada por identidad pública (orden ascendente).
     */
    public void ordenarPorIdentidadPublica( )
    {
        // TODO Completar según documentación

    	for (int i=heroes.size(); i >0; i--)
    	{
    		for (int j=0; j<i-1; j++)
    		{
    			SuperHeroe superheroe1 = (SuperHeroe) heroes.get( j );
                SuperHeroe superheroe2 = (SuperHeroe) heroes.get( j + 1 );
                
                if( superheroe1.compararPorIdentidadPublica( superheroe2 ) > 0 )
                {
                	heroes.set( j, superheroe2 );
                	heroes.set( j + 1, superheroe1 );
                }
    		}
    	}
    }

    /**
     * Organiza la lista de superhéroes por año de creación usando el algoritmo de inserción. <br>
     * <b>pre: </b> La lista de superhéroes se encuentra inicializada. <br>
     * <b>post: </b>La lista de superhéroes está ordenada por año de creación (orden ascendente).
     */
    public void ordenarPorAnhoCreacion( )
    {
        // TODO Completar según documentación
    }

    /**
     * Organiza la lista de superhéroes por su creador usando el algoritmo de burbuja. <br>
     * <b>pre: </b> La lista de superhéroes se encuentra inicializada. <br>
     * <b>post: </b>La lista de superhéroes está ordenada por creador (orden ascendente).
     */
    public void ordenarPorCreador( )
    {
        // TODO Completar según documentación
    }

    /**
     * Organiza la lista de superhéroes por nivel de fuerza usando el algoritmo de selección. <br>
     * <b>pre: </b> La lista de superhéroes se encuentra inicializada. <br>
     * <b>post: </b>La lista de superhéroes está ordenada por nivel de fuerza (orden ascendente).
     */
    public void ordenarPorNivelFuerza( )
    {
        // TODO Completar según documentación
    }

    // -----------------------------------------------------------------
    // Invariante
    // -----------------------------------------------------------------

    // TODO Declarar, implementar y documentar el método verificarInvariante
    // Si utiliza métodos auxiliares, declárelos e impleméntelos en esta sección

    // -----------------------------------------------------------------
    // Puntos de Extensión
    // -----------------------------------------------------------------

    /**
     * Método para la extensión 1
     * @return respuesta1
     */
    public String metodo1( )
    {
        return "Respuesta 1";
    }

    /**
     * Método para la extensión2
     * @return respuesta2
     */
    public String metodo2( )
    {
        return "Respuesta 2";
    }

}