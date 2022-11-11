import javax.swing.JOptionPane;

/**
 *  Este es un examen de practica de Porgramacion
 * @author Ivan Cañas Carretón
 * 
 */
public class NumerosApp {
    
    public static void main(String[] args) {
        esNumeroPerfecto(28);
        int encontrados = 0 , n;
        String entrada = JOptionPane.showInputDialog("¿Cuantos numeros perfectos quieres?");
        n = Integer.parseInt(entrada);
        do{
            int contador = 0;
            if(esNumeroPerfecto(contador) == true){
                encontrados++;
                System.out.println("El numero"+contador+"es perfecto.");
            }
            contador++;

        }while(encontrados<n);
    
    }
/**
 * 
 * Metodo que devuelve true si el numero introducido es perfecto
 * 
 * @param n, es el numero que queremos saber si es perfecto o no
 * @return devuelve true si se trata de un numero perfecto o false si no lo es
 */
    public static boolean esNumeroPerfecto(int n){
        boolean es = false;
        int sumaPerf = 0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sumaPerf = sumaPerf + i;
            }
        }
        if (n == sumaPerf){
            es = true;
            System.out.println("El numero es Perfecto");
        }
        return es;
    }

}
