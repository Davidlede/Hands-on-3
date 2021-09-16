import java.io.OptionalDataException;
import java.util.Scanner;
public class Simulacion {
 


    class Main {

        public static class operaciones {

            public static int datosxi(int datosx[]){
                int r =0;
                for(int i = 0; i < datosx.length; i++) {

                    r +=datosx[i];
                }
                return r;
            }

            public static int datosxf(int datosx[]){
                int r =0;
                for(int i = 0; i < datosx.length; i++) {

                    r +=Math.pow(datosx[i],2);
                }
                return r;
            }
            public static int datosyi(int datosy[]){
                int r =0;
                for(int i = 0; i < datosy.length; i++) {

                    r +=datosy[i];
                }
                return r;
            }
            public static int datosmultiplicacion(int datosx[], int datosy[]){
                int r =0;
                for(int i = 0; i < datosy.length; i++) {
                    r +=(datosx[i] * datosy[i]);
                }
                return r;
            }


        ///metodo 
        public static void main(String[] args) {
            /// atributos 
            int xi,yi,yf,xf,n,i;
            Scanner entrada = new Scanner(System.in);
            System.out.print("inserta cuantos numeros tiene el problema: ");
            n=entrada.nextInt();
            int[]datosx = new int[n];
            int[]datosy = new int[n];


            for(i = 0; i < datosx.length; i++) {
                System.out.print("inserta el xi: ");
                datosx[i] = entrada.nextInt();
            }

            for(i = 0; i < datosy.length; i++) {
                System.out.print("inserta el yi: ");
                datosy[i] = entrada.nextInt();
            }
            double datosx1=operaciones.datosmultiplicacion(datosx, datosy);
            double xp=operaciones.datosxi(datosx);
            double xt=operaciones.datosxf(datosx);
            double yp=operaciones.datosyi(datosy);
            double x =xp / n;
            double y =yp / n;
            double b1=((n*datosx1)-(xp * yp))/((n * xt)-(xp * xp));
            double b0=y- (b1*x);
            System.out.print("b1 el valor es:  "+b1);
            System.out.print("b0 el valor es: "+b0);

        }
    }
}
}