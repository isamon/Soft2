/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: SuperHeroe.java,v 1.4 2008/01/18 23:25:44 carl-veg Exp $
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
 * Es la clase que representa a un superhéroe. <br>
 * 
 * <b>inv.</b><br>
 * identidadSecreta != null <br>
 * !identidadSecreta.equals("")<br>
 * identidadPublica != null <br>
 * !identidadPublica.equals("")<br>
 * 
 */
public class SuperHeroe
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Identidad secreta del superhéroe
     */
    private String identidadSecreta;

    /**
     * Identidad pública del superhéroe
     */
    private String identidadPublica;

    /**
     * Año de creación
     */
    private short anhoCreacion;

    /**
     * Nombre del creador
     */
    private String creador;

    /**
     * Lista con los poderes
     */
    private ArrayList poderes;

    /**
     * Lista con las habilidades
     */
    private ArrayList habilidades;

    /**
     * Nivel de fuerza del superhéroe
     */
    private byte nivelFuerza;

    /**
     * Ruta a la imagen del superhéroe
     */
    private String rutaImagen;
    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye un nuevo superhéroe con los parámetros indicados. <br>
     * <b>post: </b> Se construyó un superhéroe con los parámetros especificados. <br>
     * @param nIdentidadSecreta Identidad secreta del superhéroe - nIdentidadSecreta != null
     * @param nIdentidadPublica Identidad pública del superhéroe - nIdentidadPublica != null
     * @param nAnhoCreacion Año de creación del superhéroe - nAnhoCreacion > 0
     * @param nCreador Creador del superhéroe - nCreador != null
     * @param nPoderes Poderes del superhéroe - nPoderes != null
     * @param nHabilidades Habilidades del superhéroe - nHabilidades != null
     * @param nNivelFuerza Nivel del fuerza del superhéroe - nNivelFuerza > 0
     * @param nRutaImagen Ruta a la imagen del superhéroe - nRutaImagen != null
     */
    public SuperHeroe( String nIdentidadSecreta, String nIdentidadPublica, short nAnhoCreacion, String nCreador, ArrayList nPoderes, ArrayList nHabilidades, byte nNivelFuerza, String nRutaImagen )
    {
        identidadSecreta = nIdentidadSecreta;
        identidadPublica = nIdentidadPublica;
        anhoCreacion = nAnhoCreacion;
        creador = nCreador;
        poderes = nPoderes;
        habilidades = nHabilidades;
        nivelFuerza = nNivelFuerza;
        rutaImagen = nRutaImagen;
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Retorna el año de creación del superhéroe.
     * @return Año de creación
     */
    public short darAnhoCreacion( )
    {
        return anhoCreacion;
    }

    /**
     * Retorna el nombre del creador del superhéroe.
     * @return Nombre del creador
     */
    public String darCreador( )
    {
        return creador;
    }

    /**
     * Retorna la lista de habilidades del superhéroe.
     * @return Lista de habilidades del superhéroe
     */
    public ArrayList darHabilidades( )
    {
        return habilidades;
    }

    /**
     * Retorna la identidad pública del superhéroe.
     * @return Identidad pública
     */
    public String darIdentidadPublica( )
    {
        return identidadPublica;
    }

    /**
     * Retorna la identidad secreta del superhéroe.
     * @return Identidad secreta
     */
    public String darIdentidadSecreta( )
    {
        return identidadSecreta;
    }

    /**
     * Retorna el nivel de fuerza del superhéroe.
     * @return Nivel de fuerza
     */
    public byte darNivelFuerza( )
    {
        return nivelFuerza;
    }

    /**
     * Retorna la lista de poderes del superhéroe.
     * @return Lista de poderes
     */
    public ArrayList darPoderes( )
    {
        return poderes;
    }

    /**
     * Retorna la ruta a la imagen del superhéroe.
     * @return Ruta a la imagen del superhéroe
     */
    public String darRutaImagen( )
    {
        return rutaImagen;
    }

    /**
     * Compara dos superhéroes según su identidad pública. <br>
     * @param s es el superhéroe contra el que se está comparando - s !=null
     * @return Retorna 0 si los superhéroes tienen la misma identidad pública. <br>
     *         Retorna -1 si el superhéroe s tiene un valor "MAYOR" para la identidad pública. <br>
     *         Retorna 1 si el superhéroe s tiene un valor "MENOR" para la identidad pública. <br>
     */
    public int compararPorIdentidadPublica( SuperHeroe s )
    {
    	return identidadPublica.toLowerCase().compareTo(s.darIdentidadPublica().toLowerCase());
    }
    
    /**
     * Compara dos superhéroes según el año de creación. <br>
     * @param s Es el superhéroe contra el que se está comparando - s !=null
     * @return Retorna 0 si los superhéroes tienen el mismo año de creación. <br>
     *         Retorna -1 si el superhéroe 's' tiene un valor "MAYOR" para el año de creación. <br>
     *         Retorna 1 si el superhéroe 's' tiene un valor "MENOR" para el año de creación. <br>
     */
    public int compararPorAnhoCreacion( SuperHeroe s )
    {
    	if( s.darAnhoCreacion() == anhoCreacion )
    		return 0;
    	else if ( s.darAnhoCreacion() > anhoCreacion )
    		return -1;
    	else
    		return 1;
    }

    /**
     * Compara dos superhéroes según el nombre de su creador. <br>
     * @param s es el superhéroe contra el que se está comparando - s !=null
     * @return Retorna 0 si los superhéroes tienen el mismo creador. <br>
     *         Retorna -1 si el superhéroe s tiene un valor "MAYOR" para el nombre del creador. <br>
     *         Retorna 1 si el superhéroe s tiene un valor "MENOR" para el nombre del creador. <br>
     */
    public int compararPorCreador( SuperHeroe s )
    {
    	return creador.toLowerCase().compareTo(s.darCreador().toLowerCase());
    }

    /**
     * Compara dos superhéroes según su nivel de fuerza. <br>
     * @param s es el superhéroe contra el que se está comparando - s !=null
     * @return Retorna 0 si los superhéroes tienen el mismo nivel de fuerza. <br>
     *         Retorna -1 si el superhéroe s tiene un valor "MAYOR" para el nivel de fuerza. <br>
     *         Retorna 1 si el superhéroe s tiene un valor "MENOR" para el nivel de fuerza. <br>
     */
    public int compararPorNivelFuerza( SuperHeroe s )
    {
    	if( s.darNivelFuerza() == nivelFuerza )
    	{
    		return 0;
    	}
    	else if ( s.darNivelFuerza() > nivelFuerza )
    	{
    		return -1;
    	}
    	else
    		return 1; 
    }

    /**
     * Retorna una cadena que representa al superhéroe con la identidad pública y el año de creación
     * @return La representación del superhéroe en String ("identidad pública (año de creación)")
     */
    public String toString( )
    {
		return identidadPublica + "(" + anhoCreacion + ")";
    }

    // -----------------------------------------------------------------
    // Invariante
    // -----------------------------------------------------------------
    /**
     * Verifica que el invariante de la clase se cumpla. Si algo falla,lanza un AssertError
     */
    private void verificarInvariante()
    {
    	assert identidadPublicaValida(  ):"La identidad Pública es inválida";
    	assert identidadSecretaValida(  ):"La identidad Secreta es inválida";
    	
    }
    
    // -----------------------------------------------------------------
    // Métodos auxiliares para verificar invariante
    // -----------------------------------------------------------------
    /**
     * Verifica que la identidad pública sea válida
     */
    private boolean identidadPublicaValida( )
    {
    	boolean validoPub;
    	if (identidadPublica != null && identidadPublica.equals("") )
    	{
    		validoPub = false;
    	}
    	else
    		validoPub = true;
    	return validoPub;

    }
    
    /**
     * Verifica que la identidad secreta sea válida
     */
    private boolean identidadSecretaValida ( )
    {
    	boolean validoSec;
    	if (identidadSecreta != null && identidadSecreta.equals("") )
    	{
    		validoSec = false;
    	}
    	else
    		validoSec = true;
    	return validoSec;
    }
}