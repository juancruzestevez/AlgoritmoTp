public class Sorts {
    public static void main(String[] args) {
        int[] array = {2,1,4,5,3,7};
        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /*2)a)
    Selección: tipo de sort que busca un valor mínimo en un array y lo ubica en el primer lugar. Hace lo mismo para el resto del array colocándolos uno seguido del otro.
    Inserción: tipo de sort que cuando encuentra un valor que no corresponde al orden establecido busca el lugar que debería tomar en la parte del array previamente ordenada.
    Burbujeo: tipo de sort que itera varias veces sobre el array cambiando de lugar los valores que no estén en orden evaluando de a pares.

     */

    //2)b)
    public static void SortSelection(int[] array){
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]){
                    index = j;
                }
            }
            int minNumber = array[index];
            array[index] = array[i];
            array[i] = minNumber;
        }
    }

    public static void SortInsertion(int[] array){
        for (int i = 1; i < array.length; ++i) {
            int position = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > position) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = position;
        }
    }


    public static void SortBubble(int[] array){
        int n = array.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }

            }
        }
    }

    //2)c)
    public static int[] RandomArray(int N){
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            double e = Math.random()*100;
            int s = (int)e;
            array[i] = s;
        }
        return array;
    }

    //2)d)
    public static void SortSelection(String[] array){
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0){
                    index = j;
                }
            }
            String minString = array[index];
            array[index] = array[i];
            array[i] = minString;
        }
    }

    public static void SortInsertion(String[] array){
        for (int i = 1; i < array.length; ++i) {
            String position = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(position) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = position;
        }
    }

    public static void SortBubble(String[] array){
        String change;
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[j-1].compareTo(array[j]) > 0){
                    change = array[j-1];
                    array[j-1] = array[j];
                    array[j] = change;
                }
            }
        }
    }

    //2)g)

    public static void selectionSort(int[] a) {
        int n = a.length;
        recurSelectionSort(a, n, 0);
    }

    // Recursive selection sort. n is size of a[] and index
    // is index of starting element.
    static void recurSelectionSort(int[] a, int n, int index) {

        // Return when starting and size are same
        if (index == n)
            return;

        // calling minimum index function for minimum index
        int k = minIndex(a, index, n-1);

        // Swapping when index nd minimum index are not same
        if (k != index){
            // swap
            int temp = a[k];
            a[k] = a[index];
            a[index] = temp;
        }
        // Recursively calling selection sort function
        recurSelectionSort(a, n, index + 1);
    }

    // Return minimum index
    static int minIndex(int[] a, int i, int j) {
        if (i == j)
            return i;

        // Find minimum of remaining elements
        int k = minIndex(a, i + 1, j);

        // Return minimum of current and remaining.
        return (a[i] < a[k])? i : k;
    }
}
