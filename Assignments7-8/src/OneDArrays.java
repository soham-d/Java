public class OneDArrays {
    public static void main(String[] args){
        //Implicit Array Creation
        int arr1[] = { 10, 20, 30, 40};
        int[] arr2 = { 10, 20, 30, 40};

        // Explicit Array creation

        int[] arr3 = new int[] { 10, 20, 30, 40};
        int[] arr4 = new int[] { 10, 20, 30, 40};

        // Compile time and run time

        // Arrays in Java will always get memory during Run Time

        for(int element : arr2){
            System.out.println(element);
        }
    }
}
