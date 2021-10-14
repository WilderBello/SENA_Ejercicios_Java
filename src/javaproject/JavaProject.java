/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author wob19
 * 
 */
public class JavaProject {

    /*
     * Añadido while
     */
    public static void main(String[] args) throws IOException {
        // Salida para el programador
        System.out.println("Menú");
        //Inicialización de variable ejercicio
        int  ejercicio = 1;
        //Selección del menú
        while (ejercicio != 0){
            try {
                ejercicio = Integer.parseInt(JOptionPane.showInputDialog(
                    "Seleccione el enunciado al que desea acceder: \n"
                            + 1 + ". Intereses de un banco \n"
                            + 2 + ". Frutería: Manzanas \n" 
                            + 3 + ". Función Y=x^2-2x \n" 
                            + 4 + ". Suma de dígitos \n" 
                            + 5 + ". Salario Neto a recibir \n" 
                            + 6 + ". 20 términos de una serie \n" 
                            + 7 + ". Datos de una fiesta \n" 
                            + 8 + ". Costo de llamada \n" 
                            + 9 + ". Examen de física \n"
                            + "  ~Con cero (0) termina.~   "));
                if (ejercicio == 0){
                    JOptionPane.showMessageDialog(null, "Finalizando...");
                } else if (ejercicio == 1) {
                    Ejercicio1();
                } else if (ejercicio == 2){
                    Ejercicio2();
                } else if (ejercicio == 3){
                    Ejercicio3();
                } else if (ejercicio == 4){
                    Ejercicio4();
                } else if (ejercicio == 5){
                    Ejercicio5();
                } else if (ejercicio == 6){
                    Ejercicio6();
                } else if (ejercicio == 7){
                    Ejercicio7();
                } else if (ejercicio == 8){
                    Ejercicio8();
                } else if (ejercicio == 9){
                    Ejercicio9();
                } else {
                    JOptionPane.showMessageDialog(null, "Opción fuera de rango...");
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Opción fuera de rango...");
            }
            
        }
    }

    public static void Ejercicio1(){
        System.out.println("Ejemplo 1");
        
        float dinero; // Real = float
        
        dinero = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el dinero: $"));
        
        float ValorPresente = dinero;
        float intereses = (float) 0.02;
        float meses  = 60;
       
        float ValorFuturo1 = (float) Math.pow((1+intereses),meses);
        float ValorFuturo = ValorPresente * ValorFuturo1;
        
        JOptionPane.showMessageDialog(null,"Valor consignado: $" + ValorPresente);
        JOptionPane.showMessageDialog(null,"Valor futuro en 5 años: $" + ValorFuturo);
       
    }
    public static void Ejercicio2(){
        System.out.println("Ejemplo 2"); // escriba
        float precio_kilo = (float) 4200;
        // float kilo;
        float kilo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese los kilos de manzana que desea: "));
        float descuento;
        if (kilo >= 0 && kilo <= 2) {
            descuento = 0;
        } else if (kilo > 2 && kilo <= 5) {
            descuento = (float) 0.1;
        } else if (kilo > 5 && kilo <= 10) {
            descuento = (float) 0.15;
        } else if (kilo > 10) {
            descuento = (float) 0.2;
        } else {
            System.out.println("El número ingresado es negativo");
            descuento = 0;
        }
        float ValorSin = precio_kilo * kilo;
        float ValorCon = ValorSin * descuento;
        float ValorTotal = ValorSin - ValorCon;

        JOptionPane.showMessageDialog(null,
                "La compra de " + kilo + " kilos tiene un valor de $" + ValorSin
                        + ", pero tiene un descuento por valor de $" + ValorCon
                        + ", por lo tanto el valor a pagar es: $" + ValorTotal);
    }
    public static void Ejercicio3(){
        System.out.println("Ejemplo 3");
        int y;
        int suma_y = 0;
        List<Integer> multiplos_3 = new ArrayList<>();
        int suma_3 = 0;
        List<Integer> multiplos_5 = new ArrayList<>();
        int suma_5 = 0;
        for (int x = 1; x<=10; x++){
            y = (int) (Math.pow(x, 2) - 2*x);
            suma_y = suma_y + y;
            if (y%3 == 0 && y != 0) {
            	multiplos_3.add(y);
            	suma_3 += y;
            }
            if (y%5 == 0) {
            	if (y != 80 && y != 0) {
                	multiplos_5.add(y);
                	suma_5 = suma_5 + y;
                }
            }
        }
        
        JOptionPane.showMessageDialog(null,
                "La suma de los valores de Y es: " + suma_y + 
                        "\nLos valores de Y múltiplos de 3: " + multiplos_3 + 
                        "\nSuma de los valores de Y múltiplos de 3: " + suma_3 + 
                        "\nValores de Y cuyo �ltimo d�gito sea 5: " + multiplos_5 + 
                        "\nSuma de los valores de Y cuyo �ltimo d�gito es 5: " + suma_5);
        
    }

    public static void Ejercicio4(){
        System.out.println("Ejemplo 4");
    	int numero;
    	numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
    	String cad_numero = String.valueOf(numero);
    	int a = cad_numero.length();
    	int suma = 0;
        while (a > 0) {
        	suma = suma + (numero%10);
        	int numero1 = numero / 10;
        	numero = numero1;
           	a--;
        }
        JOptionPane.showMessageDialog(null,
                "El número ingresado es: " + cad_numero 
                        + "\nLa suma de sus digitos es: " + suma);
    }

    public static void Ejercicio5(){
        
        System.out.println("Ejemplo 5");
		
		// --------- Variables -------------

		int SalarioMinimo = 737717;
		float AuxTransporte;
		int dias = 0;
        
        // --------------- Solicitud de datos / entradas -----------
        String cedula = JOptionPane.showInputDialog("Ingrese su número de cédula: ");
        
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        
        float multi = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el multiplicador de salario: "));
        
        while (dias < 1 || dias > 30) {
            dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias laborados (1-30): "));
        }
        
        int ventas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las ventas del mes: "));
        
        int prestamos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus préstamos: "));
        
        // ------------ Operando -------------
        float SalarioBasico = SalarioMinimo * multi;
		float SueldoDevengado = SalarioBasico * dias / 30;
		
		if (SalarioBasico < 2 * SalarioMinimo) {
			AuxTransporte = 83140 * dias / 30; 
		} else {
			AuxTransporte = 0;
		}
		float comision = (float) (ventas * 0.02);
		float TotalDevengado = SueldoDevengado + comision;
		float TotalDeducciones = prestamos;
		float SalarioNeto = TotalDevengado - TotalDeducciones;
        
        // ------------- salidas --------------------
        JOptionPane.showMessageDialog(null, 
                "Cedula empleado: " + cedula 
                        + "\nNombre Empleado: " + nombre 
                        + "\nSalario Básico: " + SalarioBasico 
                        + "\nAuxilio de Transporte: " + AuxTransporte 
                        + "\nComisión de Ventas: " + comision 
                        + "\nPréstamos: " + prestamos 
                        + "\nSalario Neto a Recibir: " + SalarioNeto);
    }
    public static void Ejercicio6(){
        System.out.println("Ejemplo 6");
		int N = 0;
		List<Integer> terminos = new ArrayList<>();
        for (int i = 1; i <=20; i++) {
        	N += i;
        	terminos.add(N);
        }

        JOptionPane.showMessageDialog(null,"Términos de la serie: \n" + terminos);
    }
    public static void Ejercicio7(){
        System.out.println("Ejemplo 7");
		int edad = 1;
		int m = 0;
		int f = 0;
		int no_def = 0;
		int edad_m = 0;
		int edad_f = 0;
		int edad_no = 0;
		int menor_edad = 0;
		float prom_m;
		float prom_f;
		float prom_no;
		
		while(edad > 0) {
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad (0 = Terminar): "));
            
                    if (edad >= 18) {

                        String sexo = JOptionPane.showInputDialog("Ingrese su sexo (M - F): ");

                        if (sexo.equals("M") || sexo.equals("m")) {
                                m += 1;
                                edad_m += edad;
                        } else if (sexo.equals("F") || sexo.equals("f")) {
                                f += 1;
                                edad_f += edad;
                        }else {
                                no_def += 1;
                                edad_no += edad;
                        }
                        if (menor_edad == 0) {
                                menor_edad = edad;
                        } else if (edad < menor_edad) {
                                menor_edad = edad;
                        }
                    }else if (edad > 0 && edad < 18){
                        JOptionPane.showMessageDialog(null, "Es menor de edad. No puede ingresar.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Terminar...");
                    }
		}
		
		int Total = m + f + no_def;
		
		if (m == 0) {
			prom_m = 0;
		}else {
			prom_m = edad_m / m;
		}
		if (f == 0) {
			prom_f = 0;
		}else {
			prom_f = edad_f / f;
		}
		if (no_def == 0) {
			prom_no = 0;
		}else {
			prom_no = edad_no / no_def;
		}
        if (menor_edad == 0){
            JOptionPane.showMessageDialog(null, "Nadie asistió.");
        } else {
            JOptionPane.showMessageDialog(null, 
                    "Total de personas que asistieron: " + Total
                            + "\nTotal de hombres que asistieron: " + m 
                            + "\nTotal de mujeres que asistieron: " + f 
                            + "\nTotal de personas sin sexo identificado que asistieron: " + no_def 
                            + "\nPromedio de edad de hombres que asistieron: " + prom_m 
                            + "\nPromedio de edad de mujeres que asistieron: " + prom_f 
                            + "\nPromedio de edad de sexo no definido que asistieron: " + prom_no 
                            + "\nEdad de la persona más joven que asistió: " + menor_edad);
        }
        
    }
    public static void Ejercicio8(){
        System.out.println("Ejemplo 8");
		int duracion;
		int costo = 200;
		int costo_min_adicional = 30;
		duracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duraci�n de la llamada en minutos: "));
		
		if (duracion <= 3) {
			JOptionPane.showMessageDialog(null,
                    "La llamada con duraci�n de "+ duracion 
                            + " minuto(s) \ntiene un costo de: $" + costo);
		} else {
			int adicional = duracion - 3; 
			int costo_adicional = adicional * costo_min_adicional;
			int costo_total = costo + costo_adicional;
			JOptionPane.showMessageDialog(null,
                    "La llamada con duraci�n de "+ duracion 
                            + " minutos \ntiene un costo de: $" + costo_total);
		}
    }
    public static void Ejercicio9(){
        System.out.println("Ejemplo 9");
		
		int cal50 = 0;
		int cal70 = 0;
		int cal80 = 0;
		int cal100 = 0;
		
		for (int estudiante = 1; estudiante <= 10; estudiante++ ) {
			float calificacion = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificaci�n del estudiante " 
                                                                                + estudiante + ": "));
			
			if (calificacion > 0 && calificacion < 50) {
				cal50 += 1;
			}else if (calificacion >= 50 && calificacion < 70) {
				cal70 += 1;
			} else if(calificacion >= 70 && calificacion < 80) {
				cal80 += 1;
			} else if(calificacion >= 80 && calificacion <= 100) {
				cal100 += 1;
			} else {
				JOptionPane.showMessageDialog(null,"Calificaci�n fuera del rango 1 - 100");
				estudiante -= 1;
			}
		}
		JOptionPane.showMessageDialog(null,
                "Estudiantes con calificaci�n menor a 50: " + cal50 
                        + ". \nEstudiantes con calificaci�n entre 50 y menor a 70: " + cal70 
                        + ". \nEstudiantes con calificaci�n entre 70 y menor que 80: " + cal80 
                        + ". \nEstudiantes con calificaci�n entre 80 y 100: " + cal100);
    }
}

