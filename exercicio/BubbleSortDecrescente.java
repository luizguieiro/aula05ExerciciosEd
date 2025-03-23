package exercicio;

public class BubbleSortDecrescente {

    public static void bubbleSortDecrescente(int[] array) {
        int n = array.length;
        boolean trocou;

        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - i - 1; j++) {
                // faz troca se o elemento atual for menor que o proximo
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) {
                break;
            }
        }
    }

    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {2, 4, 8, 9, 6};

        System.out.println("Array Crescente:");
        imprimirArray(array);
        bubbleSortDecrescente(array);

        System.out.println("\nArray ordenado em ordem Decrescente:");
        imprimirArray(array);
    }

}