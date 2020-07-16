import java.util.Scanner;

/**
 * pruebaa
 */
public class pruebaa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] matriz = new int[2][2][2];
        int suma[] = new int[2];
        double[] prom = new double[2];
        for (int mes = 0; mes < matriz[0][0].length; mes++) {
            System.out.println("Mes " + (mes+1));
            System.out.println();
            for (int est = 0; est < matriz.length; est++) {
                
                for (int nota = 0; nota < matriz[0].length; nota++) {
                    
                    matriz[est][nota][mes] = sc.nextInt();
                    suma[mes]+= matriz[est][nota][mes];
                    System.out.println();
                }
            }
            prom[mes] = suma[mes]/(4.0);
        }
        System.out.println();
        
        System.out.println("El promedio del mes 1 es: " +(prom[0]));
        System.out.println();
        System.out.println("El promedio del mes 2 es: " +(prom[1]));
        
    }
    }
