public class HelloWorld{

    static int[] arr = {5,9,12,3,16,2};

     public static void main(String []args){
        System.out.println("Hello World");
        
        quickSort(0, arr.length-1);
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
     }
     public static void quickSort(int low, int high){
         int i = low, j = high;
         int pivot = arr[low+(high-low)/2];
         System.out.println("Pivot =" + pivot + " i=" + i + " j=" + j);
         while(i<=j){
             while(arr[i]<pivot){
                 i++;
             }
             while(arr[j]>pivot){
                 j--;
             }
             if(i<=j){
                 swap(i,j);
                 i++;
                 j--;
             }
         }
         if(low < j){
             quickSort(low,j);
         }if(i<high){
             quickSort(i,high);
         }
    }//quickSort
    private static void swap(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}//class
