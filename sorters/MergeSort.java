package sorters;

public class MergeSort {
    public void mergeSort(int[] x) {
        mergeSort(x, 0 , x.length-1);
    }

    private void mergeSort(int[] x, int start, int end) {
        if(start < end) {
            int middle = (start + end)/2;
            mergeSort(x, start, middle);
            mergeSort(x, middle+1, end);

            merge(x, start, end, middle);
        }

    }

    private static void merge(int[] x, int start, int end, int middle){
        int[] a = new int[middle-start+1];
        int[] b = new int[end-middle];

        for(int j = 0; j < a.length; j++) {
            a[j] = x[start+j];
        }

        for(int j = 0; j < b.length; j++) {
            b[j] = x[middle+j+1];
        }

        int i = 0;
        int j = 0;


        while(i < a.length && j <  b.length){
            if (a[i]<b[j]) {
                x[start++] = a[i++];
            }
            else {
                x[start++] = b[j++];
            }

        }
        while(i < a.length) x[start++] = a[i++];
        while(j < b.length) x[start++] = b[j++];


    }
}
