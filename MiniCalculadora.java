
import java.util.Scanner;

    public class MiniCalculadora {
      // A Continuación se declaran las variables Globales.
      public static String continuar;
      public static int suma, suma2, ressuma, resta1, resta2, resresta, multi, multi2, resmulti, division1, div2, resdiv;

        public static void main (String args[]) {
          /*
            A continuación se declaran las variables de tipo Scanner.
           Las cuales servirán para poder introducir valores desde consola
          */
          Scanner zc = new Scanner(System.in);
          Scanner ok= new Scanner(System.in);
          Scanner bor= new Scanner(System.in);
          // A continuación se iniciará el ciclo del menú
          while (true) {
            // A continuación se declaran las variables de tipo entero a utilizar para que se introduzcan datos desde consola.
          int option;

          int borrar;
          System.out.print("\033[H]\033[2J");
          System.out.flush();
          // A continuación se escriben las ociones del menú.
          System.out.println("\n \n \n***********************************************************");
          System.out.println("           Seleccione la Operacion a realizar:  \n ");
          System.out.println("           1. Suma de 2 Numeros                ");
          System.out.println("           2. Resta de 2 Numeros               ");
          System.out.println("           3. Multiplicacion de 2 Numeros      ");
          System.out.println("           4. Division de 2 Numeros            ");
          System.out.println("           5. Ver Bitacora                     ");
          System.out.println("           6. Borrar Bitacora                  ");
          System.out.println("           7. Salir \n                         ");
          System.out.println("************************************************************");
          // A continuación se indica que con la variable option se obtendran datos desde consola a travéz del scanner zc.
          option = zc.nextInt();
          /* A continuacion se utiliza un switch para ver cual fue la opcion elejida por el usuario.
             para poder realizar la opción requerida
          */
          switch (option) {
          // Basado en el número que se introdujo se realizará una operación, cada case corresponde al número de operación a realizar.
          case 1:
          System.out.print("\033[H]\033[2J");
          System.out.flush();
          // En esta parte se hace un llamado a la función que contiene la operación a realizar.
          opcion1(option);
          System.out.println("Presione enter para Continuar");
          continuar = ok.nextLine();
          break;

          case 2:
          System.out.print("\033[H]\033[2J");
          System.out.flush();
          opcion2(option);
          System.out.println("Presione enter para Continuar");
          continuar = ok.nextLine();
          break;

          case 3:
          System.out.print("\033[H]\033[2J");
          System.out.flush();
          opcion3(option);
          System.out.println("Presione enter para Continuar");
          continuar = ok.nextLine();
          break;

          case 4:
          System.out.print("\033[H]\033[2J");
          System.out.flush();
          opcion4(option);
          System.out.println("Presione enter para Continuar");
          continuar = ok.nextLine();
          break;

          case 5:
          System.out.print("\033[H]\033[2J");
          System.out.flush();
          bitacora(option);
          System.out.println("\n \n Presione enter para Continuar");
          continuar = ok.nextLine();
          break;

          case 6:

          System.out.print("\033[H]\033[2J");
          System.out.flush();
          System.out.println("\n \n----------------------------------------- \n \n \n  Selecciono la Opcion 6. Borrar Bitacora");
          System.out.println(" \n \n Esta seguro de querer borrar la bitacora? Presione \"1\" (si) para continuar \n o \"2\" (no) para volver al menu \n \n");
          System.out.println("\n \n" + "-----------------------------------------");
          borrar = bor.nextInt();

          // Aquí se cambian los valores de las variables utilizadas.
          if(borrar == 1){
            suma =0;
            suma2 =0;
            ressuma=0;
            resta1=0;
            resta2=0;
            resresta=0;
            multi=0;
            multi2=0;
            resmulti=0;
            division1=0;
            div2=0;
            resdiv=0;
            System.out.println("\n \n La Bitacora ha sido borrada Satisfactoriamente \n \n");
            System.out.println("\n \n" + "-----------------------------------------");
            System.out.println("\n \n Presione enter para Continuar");
            continuar = ok.nextLine();
          }else{
            System.out.print("\033[H]\033[2J");
            System.out.flush();
            if(borrar==2){

            }
          }

          break;

          case 7:
          System.out.print("\033[H]\033[2J");
          System.out.flush();
          System.exit(0);

          default:
          //Si el número ingresado es diferente a los que se muestra en el menú se imprimirá el siguiente mensaje.
            System.out.println("El Numero Ingresado es No esta contenido en el Menu \n \n");
          }


        }
      }
                  // Las variables utilizadas en cada funcion son las declaradas de forma global.
                  // En esta función se contiene la operación de suma.
                  public static void opcion1(int suma1){

                    Scanner s1 = new Scanner(System.in);
                    Scanner s2 = new Scanner(System.in);

                    // Lo que se observa a continuación es lo que se mostrara si se elije la suma (opción 1).
                    System.out.println("\n \n----------------------------------------- \n \n \n  Selecciono la Opcion 1. Suma de 2 Numeros");
                    System.out.println("  Ingrese Primer Numero");
                    suma = s1.nextInt();
                    System.out.println("  Ingrese Segundo Numero");
                    suma2 = s2.nextInt();
                    // A continuación se realiza la operación de suma
                    ressuma = suma + suma2;
                    // A continuación se muestra el resultado de la suma
                        System.out.println("   El resultado de la suma es: " + ressuma + "\n \n -----------------------------------------");
                  }
                  // En esta función se contiene la operación de resta.
                  public static void opcion2(int resta){
                    Scanner r1 = new Scanner(System.in);
                    Scanner r2 = new Scanner(System.in);

                  System.out.println("\n \n ----------------------------------------- \n \n \n  Selecciono la Opcion 2. Resta de 2 Numeros");
                  System.out.println("Ingrese Primer Numero");
                  resta1 = r1.nextInt();
                  System.out.println("Ingrese Segundo Numero");
                  resta2 = r2.nextInt();
                  // A continuación se realiza la operación de resta
                  resresta = resta1 - resta2;
                  // A continuación se muestra el resultado de la resta
                      System.out.println("El resultado de la resta es: " + resresta + "\n \n -----------------------------------------");
                    }
                    // En esta función se contiene la operación de multiplicación.
                  public static void opcion3(int multiplicacion){
                    Scanner m1 = new Scanner(System.in);
                    Scanner m2 = new Scanner(System.in);
                  System.out.println("\n \n----------------------------------------- \n \n \n  Selecciono la Opcion 3. Multiplicacion de 2 Numeros");
                  System.out.println("Ingrese Primer Numero");
                  multi = m1.nextInt();
                  System.out.println("Ingrese Segundo Numero");
                  multi2 = m2.nextInt();
                  // A continuación se realiza la operación de multiplicación
                  resmulti = multi * multi2;
                  // A continuación se muestra el resultado de la multiplicación
                      System.out.println("El resultado de la Multiplicacion es: " + resmulti + "\n \n -----------------------------------------");

                    }
                    // En esta función se contiene la operación de división.
                  public static void opcion4(int division){
                    Scanner d1 = new Scanner(System.in);
                    Scanner d2 = new Scanner(System.in);
                  int [] myList4 = new int[3];
                  System.out.println("\n \n----------------------------------------- \n \n \n  Selecciono la Opcion 4. Division de 2 Numeros");
                  System.out.println("Ingrese Primer Numero");
                  division1 = d1.nextInt();
                  System.out.println("Ingrese Segundo Numero");
                  div2 = d2.nextInt();

                  // A continuacion se declara una condición para que la divicioón entre 0 no se realice.
                      if(div2==0){
                         System.out.println("Error: Divison entre cero No es permitida");
                         System.out.println("\n \n-----------------------------------------");
                         }else{
                           // A continuación se realiza la operación de división
                  resdiv = division1 / div2;
                  // A continuación se muestra el resultado de la división
                      System.out.println("El resultado de la Division es: " + resdiv + "\n \n -----------------------------------------");
                  }
                }
                      //La siguiente función contiene la opción de Ver Bitácora
                    public static void bitacora(int dv1){
                        //A continuación se imprimen los valores de las variables Globales
                        System.out.println("\n \n-------------------------------------------------------- \n \n  Selecciono la Opcion 5. Ver Bitacora");

                            System.out.println( suma + "+" + suma2 + "=" + ressuma);
                            System.out.println( resta1 + "-" + resta2 + "=" + resresta );
                            System.out.println( multi + "*" + multi2 + "=" + resmulti);
                            // A continuación se declara una condición para el resultado de la división
                            if(div2==0){
                               System.out.println( division1 + "/" + div2 + "=" + "Error" );
                               }else{
                            System.out.println( division1 + "/" + div2 + "=" + resdiv);
                            System.out.println("\n \n" + "--------------------------------------------------------");
                          }
                          System.out.println("\n \n" + "--------------------------------------------------------");
                    }
                      }
