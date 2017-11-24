@echo off
REM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
REM Universidad de los Andes (Bogot� - Colombia)
REM Departamento de Ingenier�a de Sistemas y Computaci�n 
REM Licenciado bajo el esquema Academic Free License version 2.1 
REM
REM Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
REM Ejercicio: n7_comics
REM Autor: Carlos Andr�s Vega - 17-sep-2007
REM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

SET CLASSPATH=

REM ---------------------------------------------------------
REM Ejecucion de las pruebas
REM ---------------------------------------------------------

cd..
java -classpath lib/comics.jar;test/lib/comicsTest.jar;test/lib/junit.jar junit.swingui.TestRunner uniandes.cupi2.comics.test.ComicsTest
java -classpath lib/comics.jar;test/lib/comicsTest.jar;test/lib/junit.jar junit.swingui.TestRunner uniandes.cupi2.comics.test.SuperHeroeTest
cd bin