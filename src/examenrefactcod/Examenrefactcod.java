package examenrefactcod;
//Yasmin

public class Examenrefactcod {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean esPrimo = false;

    public static void main(String arg[]) {
        int numDigitos = 3;
        int nDigitos = 0;
        if (numDigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int comparaNum = 1; comparaNum <= 99999; comparaNum++) {
            int aux = comparaNum;

            int contador = 0;

            while (aux != 0) {
                aux = aux / 10;
                contador++;
            }
            nDigitos = contador;

            if (nDigitos == numDigitos) {
                if (comparaNum < 4) {
                    esPrimo = true;
                } else {
                    if (comparaNum % 2 == 0) {
                        esPrimo = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int k = (comparaNum - 1) / 2;
                        if (k % 2 == 0) {
                            k--;
                        }

                        while (i1 <= k) {
                            if (comparaNum % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = k + 1;
                            }
                        }

                        if (contador1 == 1) {
                            esPrimo = true;
                        }
                    }
                }

                if (esPrimo == true) {
                    System.out.println(comparaNum);
                }
            }
        }
    }

}
