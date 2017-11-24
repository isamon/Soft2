/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: SuperHeroe.java,v 1.4 2008/01/18 23:25:44 carl-veg Exp $
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
 * Es la clase que representa a un superh�roe. <br>
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
     * Identidad secreta del superh�roe
     */
    private String identidadSecreta;

    /**
     * Identidad p�blica del superh�roe
     */
    private String identidadPublica;

    /**
     * A�o de creaci�n
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
     * Nivel de fuerza del superh�roe
     */
    private byte nivelFuerza;

    /**
     * Ruta a la imagen del superh�roe
     */
    private String rutaImagen;
    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye un nuevo superh�roe con los par�metros indicados. <br>
     * <b>post: </b> Se construy� un superh�roe con los par�metros especificados. <br>
     * @param nIdentidadSecreta Identidad secreta del superh�roe - nIdentidadSecreta != null
     * @param nIdentidadPublica Identidad p�blica del superh�roe - nIdentidadPublica != null
     * @param nAnhoCreacion A�o de creaci�n del superh�roe - nAnhoCreacion > 0
     * @param nCreador Creador del superh�roe - nCreador != null
     * @param nPoderes Poderes del superh�roe - nPoderes != null
     * @param nHabilidades Habilidades del superh�roe - nHabilidades != null
     * @param nNivelFuerza Nivel del fuerza del superh�roe - nNivelFuerza > 0
     * @param nRutaImagen Ruta a la imagen del superh�roe - nRutaImagen != null
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
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna el a�o de creaci�n del superh�roe.
     * @return A�o de creaci�n
     */
    public short darAnhoCreacion( )
    {
        return anhoCreacion;
    }

    /**
     * Retorna el nombre del creador del superh�roe.
     * @return Nombre del creador
     */
    public String darCreador( )
    {
        return creador;
    }

    /**
     * Retorna la lista de habilidades del superh�roe.
     * @return Lista de habilidades del superh�roe
     */
    public ArrayList darHabilidades( )
    {
        return habilidades;
    }

    /**
     * Retorna la identidad p�blica del superh�roe.
     * @return Identidad p�blica
     */
    public String darIdentidadPublica( )
    {
        return identidadPublica;
    }

    /**
     * Retorna la identidad secreta del superh�roe.
     * @return Identidad secreta
     */
    public String darIdentidadSecreta( )
    {
        return identidadSecreta;
    }

    /**
     * Retorna el nivel de fuerza del superh�roe.
     * @return Nivel de fuerza
     */
    public byte darNivelFuerza( )
    {
        return nivelFuerza;
    }

    /**
     * Retorna la lista de poderes del superh�roe.
     * @return Lista de poderes
     */
    public ArrayList darPoderes( )
    {
        return poderes;
    }

    /**
     * Retorna la ruta a la imagen del superh�roe.
     * @return Ruta a la imagen del superh�roe
     */
    public String darRutaImagen( )
    {
        return rutaImagen;
    }

    /**
     * Compara dos superh�roes seg�n su identidad p�blica. <br>
     * @param s es el superh�roe contra el que se est� comparando - s !=null
     * @return Retorna 0 si los superh�roes tienen la misma identidad p�blica. <br>
     *         Retorna -1 si el superh�roe s tiene un valor "MAYOR" para la identidad p�blica. <br>
     *         Retorna 1 si el superh�roe s tiene un valor "MENOR" para la identidad p�blica. <br>
     */
    public int compararPorIdentidadPublica( SuperHeroe s )
    {
    	return identidadPublica.toLowerCase().compareTo(s.darIdentidadPublica().toLowerCase());
    }
    
    /**
     * Compara dos superh�roes seg�n el a�o de creaci�n. <br>
     * @param s Es el superh�roe contra el que se est� comparando - s !=null
     * @return Retorna 0 si los superh�roes tienen el mismo a�o de creaci�n. <br>
     *         Retorna -1 si el superh�roe 's' tiene un valor "MAYOR" para el a�o de creaci�n. <br>
     *         Retorna 1 si el superh�roe 's' tiene un valor "MENOR" para el a�o de creaci�n. <br>
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
     * Compara dos superh�roes seg�n el nombre de su creador. <br>
     * @param s es el superh�roe contra el que se est� comparando - s !=null
     * @return Retorna 0 si los superh�roes tienen el mismo creador. <br>
     *         Retorna -1 si el superh�roe s tiene un valor "MAYOR" para el nombre del creador. <br>
     *         Retorna 1 si el superh�roe s tiene un valor "MENOR" para el nombre del creador. <br>
     */
    public int compararPorCreador( SuperHeroe s )
    {
    	return creador.toLowerCase().compareTo(s.darCreador().toLowerCase());
    }

    /**
     * Compara dos superh�roes seg�n su nivel de fuerza. <br>
     * @param s es el superh�roe contra el que se est� comparando - s !=null
     * @return Retorna 0 si los superh�roes tienen el mismo nivel de fuerza. <br>
     *         Retorna -1 si el superh�roe s tiene un valor "MAYOR" para el nivel de fuerza. <br>
     *         Retorna 1 si el superh�roe s tiene un valor "MENOR" para el nivel de fuerza. <br>
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
     * Retorna una cadena que representa al superh�roe con la identidad p�blica y el a�o de creaci�n
     * @return La representaci�n del superh�roe en String ("identidad p�blica (a�o de creaci�n)")
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
    	assert identidadPublicaValida(  ):"La identidad P�blica es inv�lida";
    	assert identidadSecretaValida(  ):"La identidad Secreta es inv�lida";
    	
    }
    
    // -----------------------------------------------------------------
    // M�todos auxiliares para verificar invariante
    // -----------------------------------------------------------------
    /**
     * Verifica que la identidad p�blica sea v�lida
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
     * Verifica que la identidad secreta sea v�lida
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