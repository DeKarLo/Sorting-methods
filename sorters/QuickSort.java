package sorters;

public class QuickSort {
    public static void quickSort(int[] x){
        quickSort(x, 0, x.length-1);
    }

    private static void quickSort(int[] x, int start,int end){
        if(start<end){
            int pi = partition(x, start, end);
            quickSort(x, start, pi-1);
            quickSort(x, pi+1, end);
        }

    }


    private static int partition(int x[], int start, int end){
        int pivot = x[end];
        int j = start;

        for(int i = start; i <= end; i++){
            if(x[i] <= pivot){
                swap(x, i, j);
                j++;
            }
        }

        return j-1;
    }

    private static void swap(int[] x,int i1, int i2){
        int temp = x[i1];
        x[i1] = x[i2];
        x[i2] = temp;
    }

}
