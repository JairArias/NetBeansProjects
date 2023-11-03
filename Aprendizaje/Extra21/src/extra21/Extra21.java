/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra21;

import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Extra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double carlos[] = new double[4];
        double jose[] = new double[4];
        double maria[] = new double[4];
        double mercedes[] = new double[4];
        double jorge[] = new double[4];
        double laura[] = new double[4];
        double mariana[] = new double[4];
        double john[] = new double[4];
        double luz[] = new double[4];
        double eduardo[] = new double[4];
        double promedio1 = 0;
        double promedio2 = 0;
        double promedio3 = 0;
        double promedio4 = 0;
        double promedio5 = 0;
        double promedio6 = 0;
        double promedio7 = 0;
        double promedio8 = 0;
        double promedio9 = 0;
        double promedio10 = 0;
        int aprobados = 0;
        int noAprobados = 0;
        int opc;

        
      opc=elije();
        
     //   {
            
        
        switch (opc) {
            case 1:
                for (int i = 0; i < 4; i++) {
                    System.out.println("ingrese las notas");
                    carlos[i] = leer.nextDouble();
                    switch (i) {
                        case 0:
                            carlos[i] = (carlos[i] * .10);
                            break;
                        case 1:
                            carlos[i] = (carlos[i] * .15);
                            break;
                        case 2:
                            carlos[i] = (carlos[i] * .25);
                            break;
                        case 3:
                            carlos[i] = (carlos[i] * .50);
                            break;
                        
                            
                    }
                    promedio1 += carlos[i];

                }
                if (promedio1 >= 7) {
                    System.out.println("Carlos aprobo");
                    aprobados += 1;
                } else {
                    noAprobados += 1;
                }
                break;
            case 2:
                for (int i = 0; i < 4; i++) {
                    System.out.println("ingrese las notas");
                    jose[i] = leer.nextDouble();
                    switch (i) {
                        case 0:
                            jose[i] = (jose[i] * .10);
                            break;
                        case 1:
                            jose[i] = (jose[i] * .15);
                            break;
                        case 2:
                            jose[i] = (jose[i] * .25);
                            break;
                        case 3:
                            jose[i] = (jose[i] * .50);
                            break;
                    }
                    promedio2 += jose[i];

                }
                if (promedio2 >= 7) {
                    System.out.println("Jose aprobo");
                    aprobados += 1;
                } else {
                    noAprobados += 1;
                }
                break;
            case 3:
                for (int i = 0; i < 4; i++) {
                    System.out.println("ingrese las notas");
                    maria[i] = leer.nextDouble();
                    switch (i) {
                        case 0:
                            maria[i] = (maria[i] * .10);
                            break;
                        case 1:
                            maria[i] = (maria[i] * .15);
                            break;
                        case 2:
                            maria[i] = (maria[i] * .25);
                            break;
                        case 3:
                            maria[i] = (maria[i] * .50);
                            break;
                    }
                    promedio3 += maria[i];

                }
                if (promedio3 >= 7) {
                    System.out.println("Maria aprobo");
                    aprobados += 1;
                } else {
                    noAprobados += 1;
                }
                break;
            case 4:
                for (int i = 0; i < 4; i++) {
                    System.out.println("ingrese las notas");
                    mercedes[i] = leer.nextDouble();
                    switch (i) {
                        case 0:
                            mercedes[i] = (mercedes[i] * .10);
                            break;
                        case 1:
                            mercedes[i] = (mercedes[i] * .15);
                            break;
                        case 2:
                            mercedes[i] = (mercedes[i] * .25);
                            break;
                        case 3:
                            mercedes[i] = (mercedes[i] * .50);
                            break;
                    }
                    promedio4 += mercedes[i];

                }
                if (promedio4 >= 7) {
                    System.out.println("Mercedes aprobo");
                    aprobados += 1;
                } else {
                    noAprobados += 1;
                }
                break;
            case 5:
                for (int i = 0; i < 4; i++) {
                    System.out.println("ingrese las notas");
                    jorge[i] = leer.nextDouble();
                    switch (i) {
                        case 0:
                            jorge[i] = (jorge[i] * .10);
                            break;
                        case 1:
                            jorge[i] = (jorge[i] * .15);
                            break;
                        case 2:
                            jorge[i] = (jorge[i] * .25);
                            break;
                        case 3:
                            jorge[i] = (jorge[i] * .50);
                            break;
                    }
                    promedio5 += jorge[i];

                }
                if (promedio5 >= 7) {
                    System.out.println("Jorge aprobo");
                    aprobados += 1;
                } else {
                    noAprobados += 1;
                }
                break;
            case 6:
                for (int i = 0; i < 4; i++) {
                    System.out.println("ingrese las notas");
                    laura[i] = leer.nextDouble();
                    switch (i) {
                        case 0:
                            laura[i] = (laura[i] * .10);
                            break;
                        case 1:
                            laura[i] = (laura[i] * .15);
                            break;
                        case 2:
                            laura[i] = (laura[i] * .25);
                            break;
                        case 3:
                            laura[i] = (laura[i] * .50);
                            break;
                    }
                    promedio6 += laura[i];

                }
                if (promedio6 >= 7) {
                    System.out.println("Laura aprobo");
                    aprobados += 1;
                } else {
                    noAprobados += 1;
                }
                break;
            case 7:
                for (int i = 0; i < 4; i++) {
                    System.out.println("ingrese las notas");
                    mariana[i] = leer.nextDouble();
                    switch (i) {
                        case 0:
                            mariana[i] = (mariana[i] * .10);
                            break;
                        case 1:
                            mariana[i] = (mariana[i] * .15);
                            break;
                        case 2:
                            mariana[i] = (mariana[i] * .25);
                            break;
                        case 3:
                            mariana[i] = (mariana[i] * .50);
                            break;
                    }
                    promedio7 += mariana[i];

                }
                if (promedio7 >= 7) {
                    System.out.println("Mariana aprobo");
                    aprobados += 1;
                } else {
                    noAprobados += 1;
                }
                break;
            case 8:
                for (int i = 0; i < 4; i++) {
                    System.out.println("ingrese las notas");
                    john[i] = leer.nextDouble();
                    switch (i) {
                        case 0:
                            john[i] = (john[i] * .10);
                            break;
                        case 1:
                            john[i] = (john[i] * .15);
                            break;
                        case 2:
                            john[i] = (john[i] * .25);
                            break;
                        case 3:
                            john[i] = (john[i] * .50);
                            break;
                    }
                    promedio8 += john[i];

                }
                if (promedio8 >= 7) {
                    System.out.println("John aprobo");
                    aprobados += 1;
                } else {
                    noAprobados += 1;
                }
                break;
            case 9:
                for (int i = 0; i < 4; i++) {
                    System.out.println("ingrese las notas");
                    luz[i] = leer.nextDouble();
                    switch (i) {
                        case 0:
                            luz[i] = (luz[i] * .10);
                            break;
                        case 1:
                            luz[i] = (luz[i] * .15);
                            break;
                        case 2:
                            luz[i] = (luz[i] * .25);
                            break;
                        case 3:
                            luz[i] = (luz[i] * .50);
                            break;
                    }
                    promedio9 += luz[i];

                }
                if (promedio9 >= 7) {
                    System.out.println("Luz aprobo");
                    aprobados += 1;
                } else {
                    noAprobados += 1;
                }
                break;
            case 10:
                for (int i = 0; i < 4; i++) {
                    System.out.println("ingrese las notas");
                    eduardo[i] = leer.nextDouble();
                    switch (i) {
                        case 0:
                            eduardo[i] = (eduardo[i] * .10);
                            break;
                        case 1:
                            eduardo[i] = (eduardo[i] * .15);
                            break;
                        case 2:
                            eduardo[i] = (eduardo[i] * .25);
                            break;
                        case 3:
                            eduardo[i] = (eduardo[i] * .50);
                            break;
                    }
                    promedio10 += eduardo[i];

                }
                if (promedio10 >= 7) {
                    System.out.println("Eduardo aprobo");
                    aprobados += 1;
                } else {
                    noAprobados += 1;
                }
                break;
            case 11:
                System.out.println("Ha salido del sistema");
                break;
        }
      //  }while(opc!=11);
        
        System.out.println(aprobados + " alumnos aprobaron el curso de programacion");
        System.out.println(noAprobados + " alumnos no aprobaron el curso de programacion");
    }

    
    public static int elije(){
        

    int numero;
      System.out.println("Bienvenidos al sistema de notas, escoja el alumno");
        System.out.println("1- Carlos");
        System.out.println("2- Jose");
        System.out.println("3- Maria");
        System.out.println("4- Mercedes");
        System.out.println("5- Jorge");
        System.out.println("6- Laura");
        System.out.println("7- Mariana");
        System.out.println("8- John");
        System.out.println("9- Luz");
        System.out.println("10- Eduardo");
        System.out.println("11- Salir del programa");

         numero = leer.nextInt();
         return numero;
         
        }


