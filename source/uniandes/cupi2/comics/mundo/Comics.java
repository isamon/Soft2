/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: Comics.java,v 1.5 2008/01/18 23:25:44 carl-veg Exp $
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n7_comics
 * Autor: Carlos Andr�s Vega - 17-sep-2007
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.comics.mundo;

import java.util.ArrayList;


/**
 * Es la clase que se encarga de manejar, organizar, cargar y salvar los superh�roes. <br>
 * 
 * <b>inv.</b><br>
 * heroes != null<br>
 * Ning�n h�roe tiene la misma identidad p�blica<br>
 * 
 */
public class Comics
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Es el vector que contiene todos los superh�roes
     */
    private ArrayList heroes;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye un nuevo manejador de superh�roes vac�o.
     */
    public Comics( )
    {
        heroes = new ArrayList( );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Ingresa un superh�roe. <br>
     * <b> pre: </b> La lista de superh�roes se encuentra inicializada <br>
     * <b> post: </b> La lista de superh�roes contiene un nuevo superh�roe, si este tiene una identidad p�blica diferente a los dem�s superh�roes existentes. <br>
     * Los superh�roes en la lista de superh�roes no contienen identidades publicas repetidas <br>
     * @param nIdentidadSecreta Identidad secreta del superh�roe - nIdentidadSecreta != null
     * @param nIdentidadPublica Identidad p�blica del superh�roe - nIdentidadPublica != null
     * @param nAnhoCreacion A�o de creaci�n del superh�roe - nAnhoCreacion > 0
     * @param nCreador Creador del superh�roe - nCreador != null
     * @param nPoderes Poderes del superh�roe - nPoderes != null
     * @param nHabilidades Habilidades del superh�roe - nHabilidades != null
     * @param nNivelFuerza Nivel del fuerza del superh�roe - nNivelFuerza > 0
     * @param nRutaImagen Ruta a la imagen del superh�roe - nRutaImagen != null
     * @return true si el superh�roe fue ingresado, false de lo contrario
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
     * Retorna una lista de superh�roes. La lista que se retorna no es la misma que la almacenada en esta clase, pero si tiene el mismo orden. <br>
     * Se crea una copia de la lista de superh�roes.
     * <b> pre: </b> La lista de superh�roes se encuentra inicializada. <br>
     * @return Lista de superh�roes
     */
    public ArrayList darSuperheroes( )
    {
        ArrayList copiaLista = new ArrayList( heroes );
        return copiaLista;
    }
    
    /**
     * Busca un Superh�roe utilizando una b�squeda binaria. <br>
     * <b>pre: </b> La lista de superh�roes se encuentra ordenada por identidad p�blica.
     * @param identidadPublica es la identidad p�blica del superh�roe que se va a buscar - identidadPublica != null
     * @return La posici�n del superh�roe con la identidad p�blica dada. Si el superh�roe no existe se retorna -1.
     */
    public int buscarBinarioPorIdentidadPublica( String identidadPublica )
    {
		
        // TODO Completar seg�n documentaci�n
		return 1;
    }

    /**
     * Busca un Superh�roe por identidad p�blica. <br>
     * <b>pre: </b> La lista de superh�roes se encuentra inicializada.
     * @param identidadPublica es la identidad p�blica del superh�roe que se va a buscar - identidadPublica != null
     * @return La posici�n del superh�roe con la identidad p�blica dada. Si el superh�roe no existe se retorna -1.
     */
    public int buscarSuperheroePorIdentidadPublica( String identidadPublica )
    {
		return 2;
        // TODO Completar seg�n documentaci�n
    }

    /**
     * Busca un Superh�roe por identidad secreta. <br>
     * <b>pre: </b> La lista de superh�roes se encuentra inicializada.
     * @param identidadSecreta es la identidad secreta del superh�roe que se va a buscar - identidadSecreta != null
     * @return La posici�n del superh�roe con la identidad secreta dada. Si el superh�roe no existe se retorna -1.
     */
    public int buscarSuperheroePorIdentidadSecreta( String identidadSecreta )
    {
		return 3;
        // TODO Completar seg�n documentaci�n
    }

    /**
     * Busca el superh�roe que tenga el menor a�o de creaci�n. <br>
     * <b>pre: </b> La lista de superh�roes se encuentra inicializada.
     * @return La posici�n del superh�roe con el menor a�o de creaci�n. Si el superh�roe no existe se retorna -1.
     */
    public int buscarSuperheroeMasAntiguo( )
    {
		return 4;
        // TODO Completar seg�n documentaci�n
    }

    /**
     * Busca el superh�roe mas fuerte. <br>
     * <b>pre: </b> La lista de superh�roes se encuentra inicializada. <br>
     * <b>post: <b> Retorna la posici�n del superh�roe mas fuerte, si hay varios con el mismo nivel de fuerza y
     * con el mayor nivel en la lista, retorna el primero que encuentre.
     * @return La posici�n del superh�roe con el mayor nivel de fuerza. Si el superh�roe no existe se retorna -1.
     */
    public int buscarSuperheroeMasFuerte( )
    {
		return 5;
        // TODO Completar seg�n documentaci�n
    }
    
    /**
     * Organiza la lista de superh�roes por su identidad publica usando el algoritmo de burbuja. <br>
     * <b>pre: </b> La lista de superh�roes se encuentra inicializada. <br>
     * <b>post: </b>La lista de superh�roes est� ordenada por identidad p�blica (orden ascendente).
     */
    public void ordenarPorIdentidadPublica( )
    {
        // TODO Completar seg�n documentaci�n

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
     * Organiza la lista de superh�roes por a�o de creaci�n usando el algoritmo de inserci�n. <br>
     * <b>pre: </b> La lista de superh�roes se encuentra inicializada. <br>
     * <b>post: </b>La lista de superh�roes est� ordenada por a�o de creaci�n (orden ascendente).
     */
    public void ordenarPorAnhoCreacion( )
    {
        // TODO Completar seg�n documentaci�n
    }

    /**
     * Organiza la lista de superh�roes por su creador usando el algoritmo de burbuja. <br>
     * <b>pre: </b> La lista de superh�roes se encuentra inicializada. <br>
     * <b>post: </b>La lista de superh�roes est� ordenada por creador (orden ascendente).
     */
    public void ordenarPorCreador( )
    {
        // TODO Completar seg�n documentaci�n
    }

    /**
     * Organiza la lista de superh�roes por nivel de fuerza usando el algoritmo de selecci�n. <br>
     * <b>pre: </b> La lista de superh�roes se encuentra inicializada. <br>
     * <b>post: </b>La lista de superh�roes est� ordenada por nivel de fuerza (orden ascendente).
     */
    public void ordenarPorNivelFuerza( )
    {
        // TODO Completar seg�n documentaci�n
    }

    // -----------------------------------------------------------------
    // Invariante
    // -----------------------------------------------------------------

    // TODO Declarar, implementar y documentar el m�todo verificarInvariante
    // Si utiliza m�todos auxiliares, decl�relos e implem�ntelos en esta secci�n

    // -----------------------------------------------------------------
    // Puntos de Extensi�n
    // -----------------------------------------------------------------

    /**
     * M�todo para la extensi�n 1
     * @return respuesta1
     */
    public String metodo1( )
    {
        return "Respuesta 1";
    }

    /**
     * M�todo para la extensi�n2
     * @return respuesta2
     */
    public String metodo2( )
    {
        return "Respuesta 2";
    }

}