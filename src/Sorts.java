public class Sorts {
    public static void main(String[] args) {
        String[] arrayString = {"manu", "sos", "altisimo", "pete"};
        SortSelection(arrayString);
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }
    }

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

    public static int[] RandomArray(int N){
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            double e = Math.random()*100;
            int s = (int)e;
            array[i] = s;
        }
        return array;
    }

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
}
