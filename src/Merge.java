public class Merge {
    public static int[] merge(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        int indexA = 0;
        int indexB = 0;
        for (int i = 0; i < a.length+b.length; i++) {
            if (indexA == a.length){
                c[i] = b[indexB];
                indexB++;
                continue;
            }
            if (indexB == b.length){
                c[i] = a[indexA];
                indexA++;
                continue;
            }
            if (a[indexA]<=b[indexB]){
                c[i] = a[indexA];
                indexA++;
            }
            else{
                c[i] = b[indexB];
                indexB++;
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        return c;
    }
}
