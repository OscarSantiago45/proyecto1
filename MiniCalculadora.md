
import java.util.Scanner;

    public class Calculadora2 {
      public static int suma;
      public static int suma2;
      public static int resuma;
      public static int resta1;
      public static int resta2;
      public static int resresta;
      public static int multi;
      public static int multi2;
      public static int resmulti;
      public static int div;
      public static int div2;
      public static int resdiv;

        public static void main (String args[]) {

          Scanner zc = new Scanner(System.in);
          Scanner ok= new Scanner(System.in);
          Scanner bor= new Scanner(System.in);

          while (true) {

          int option;
          int continuar;
          int borrar;

          System.out.println("Seleccione la Operacion a realizar:");
          System.out.println("1. Suma de 2 Numeros");
          System.out.println("2. Resta de 2 Numeros");
          System.out.println("3. Multiplicacion de 2 Numeros");
          System.out.println("4. Division de 2 Numeros");
          System.out.println("5. Ver Bitacora");
          System.out.println("6. Borrar Bitacora");
          System.out.println("7. Salir");
          System.out.println("");

          option = zc.nextInt();

          switch (option) {
          case 1:
          opcion1(option);
          
          break;

          case 2:
          opcion2(option);
          break;

          case 3:
          opcion3(option);
          break;

          case 4:
          opcion4(option);
          break;

          case 5:
          bitacora(option);
          break;

          case 6:
          System.out.println("Esta seguro de querer borrar la bitacora? Presione \"1\" (si) para continuar o \"2\" para volver al menu \n \n");
          borrar = bor.nextInt();
          if(borrar == 1){
            suma =0;
            suma2 =0;
            resuma=0;
            resta1=0;
            resta2=0;
            resresta=0;
            multi=0;
            multi2=0;
            resmulti=0;
            div=0;
            div2=0;
            resdiv=0;
            System.out.println("La Bitacora ha sido borrada Satisfactoriamente \n \n");
          }else{
            if(borrar==2){

            }
          }

          break;

          case 7:
          System.exit(0);
          }

          System.out.println("presione una tecla Numerica y Enter para continuar");
          continuar = ok.nextInt();

        }
      }

                  public static void opcion1(int suma1){


                    Scanner s1 = new Scanner(System.in);
                    Scanner s2 = new Scanner(System.in);
                    int [] myList = new int[3];

                    System.out.println("Selecciono la Opcion 1. Suma de 2 Numeros");
                    System.out.println("Ingrese Primer Numero");
                    suma  = s1.nextInt();
                    System.out.println("Ingrese Segundo Numero");
                    suma2 = s2.nextInt();
                    resuma = suma + suma2;
                        System.out.println("El resultado de la suma es: " + resuma + "\n \n");
                  }

                  public static void opcion2(int resta){
                    Scanner r1 = new Scanner(System.in);
                    Scanner r2 = new Scanner(System.in);

                  System.out.println("Selecciono la Opcion 2. Resta de 2 Numeros");
                  System.out.println("Ingrese Primer Numero");
                  resta1  = r1.nextInt();
                  System.out.println("Ingrese Segundo Numero");
                  resta2 = r2.nextInt();
                  resresta = resta1 - resta2;
                      System.out.println("El resultado de la resta es: " + resresta + "\n \n");
                    }

                  public static void opcion3(int multiplicacion){
                    Scanner m1 = new Scanner(System.in);
                    Scanner m2 = new Scanner(System.in);
                  int [] myList3 = new int[3];
                  System.out.println("Selecciono la Opcion 3. Multiplicacion de 2 Numeros");
                  System.out.println("Ingrese Primer Numero");
                  multi  = m1.nextInt();
                  System.out.println("Ingrese Segundo Numero");
                  multi2 = m2.nextInt();
                  resmulti = multi * multi2;
                      System.out.println("El resultado de la resta es: " + resmulti + "\n \n");

                    }

                  public static void opcion4(int division){
                    Scanner d1 = new Scanner(System.in);
                    Scanner d2 = new Scanner(System.in);
                  int [] myList4 = new int[3];
                  System.out.println("Selecciono la Opcion 3. Multiplicacion de 2 Numeros");
                  System.out.println("Ingrese Primer Numero");
                  div = d1.nextInt();
                  System.out.println("Ingrese Segundo Numero");
                  div2 = d2.nextInt();


                      if(div2==0){

                         System.out.println("Error: Divison entre cero No es permitida");


                         }else{

                  resdiv = div / div2;
                      System.out.println("El resultado de la Division es: " + resdiv + "\n \n");

                  }
                }

                    public static void bitacora(int dv1){

                      System.out.println( suma + "+" + suma2 + "=" + resuma );
                      System.out.println( resta1 + "-" + resta2 + "=" + resresta );
                      System.out.println( multi + "*" + multi2 + "=" + resmulti );
                      if(div2==0){

                         System.out.println( div + "/" + div2 + "=" + "Error" );

                         }else{

                      System.out.println( div + "/" + div2 + "=" + resdiv );

                  }

                    }


              }
