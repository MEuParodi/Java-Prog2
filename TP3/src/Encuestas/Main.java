package Encuestas;

import java.util.ArrayList;

/**
 * 1 Sistema de encuestas
Una empresa consultora desea desarrollar un sistema el cual le permita informatizar su
mecanismo de encuestas. La compañía se encarga de realizar encuestas para empresas
de terceros o para el gobierno. Una encuesta se compone de un conjunto de preguntas,
una persona encuestada y el empleado que realizo la encuesta. La compañía guarda
todas las encuestas realizadas. Los empleados cobran un plus por cantidad de encuestas
realizadas, con lo cual la empresa desea conocer el número de encuestas que realizó
cada empleado. Para evitar falsificación de datos, en la encuesta figura el número de
documento de la persona. Una misma persona no puede llenar dos veces la misma
encuesta, pero si una encuesta diferente. 
 * 
 *
 */

public class Main {
	  public static void main(String[] args) {
		  
		  String preg1 = "preg1";
		  String preg2 = "preg2";
		  String preg3 = "preg3";
		  String preg4 = "preg4";
		  String preg5 = "preg5";
		  
		  ArrayList<String> preguntasEnc1 = new ArrayList<>();
		  preguntasEnc1.add(preg1);
		  preguntasEnc1.add(preg2);
		  preguntasEnc1.add(preg3);
		  
		  ArrayList<String> preguntasEnc2 = new ArrayList<>();
		  preguntasEnc2.add(preg3);
		  preguntasEnc2.add(preg4);
		  preguntasEnc2.add(preg5);
		  
		  ArrayList<String> preguntasEnc3 = new ArrayList<>();
		  preguntasEnc3.add(preg3);
		  preguntasEnc3.add(preg4);
		  
		  Encuesta enc1 = new Encuesta(01, preguntasEnc1);
		  Encuesta enc2 = new Encuesta(02, preguntasEnc2);
		  Encuesta enc3 = new Encuesta(03, preguntasEnc3);
		  
		  Empleado juan = new Empleado (181822);
		  Empleado pedro = new Empleado (181823);
		  
		  Compania CC = new Compania();
		  
		  CC.setEmpleado(pedro);
		  CC.setEmpleado(juan);
		  CC.setEncuesta(enc1);
		  CC.setEncuesta(enc2);
		  CC.setEncuesta(enc3);
		  
		  EncuestaR encRA = new EncuestaR(pedro, 41110455, 01);
		  EncuestaR encRB = new EncuestaR(juan, 41110455, 01); //no es valida
		  EncuestaR encRC = new EncuestaR(juan, 41110459, 01);
		  EncuestaR encRD = new EncuestaR(pedro, 41110455, 02);
		  
		  CC.setEncuestaR(encRA);
		  CC.setEncuestaR(encRB);
		  CC.setEncuestaR(encRC);
		  CC.setEncuestaR(encRD);
		  
		  System.out.println("Encuestas respondidas del empleado pedro: " + CC.getCantEncuestasR(pedro));
		  System.out.println("Encuestas respondidas del empleado juan: " + CC.getCantEncuestasR(juan));		  
		 
	}
}