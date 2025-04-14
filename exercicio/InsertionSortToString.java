package exercicio;

public class InsertionSortToString {

    public static void insertionSort(String[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j]; /*move a string maior pra frente*/
                j--;
            }
            arr[j + 1] = key; /*insere a string na posição certa*/
        }
    }

    public static void main(String[] args) {
        String[] nomes = {"Luiz", "Miguel", "Renata", "Gilza", "Antony", "Matheus"};
        insertionSort(nomes); /*ordem alf*/

        System.out.println(java.util.Arrays.toString(nomes));
    }
}

