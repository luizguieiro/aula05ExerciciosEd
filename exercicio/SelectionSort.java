package exercicio;

public class SelectionSort {

    public static int selectionSort(int[] arr) {
        int n = arr.length;
        int contadorTrocas = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                contadorTrocas++;
            }
        }

        return contadorTrocas;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 1, 4, 2, 6};

        int totalTrocas = selectionSort(arr);

        System.out.println("Array ordenado: " + java.util.Arrays.toString(arr));
        System.out.println("Total de trocas feitas: " + totalTrocas);
    }
}
