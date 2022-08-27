import java.util.Arrays;

public class CyclicRotation {

    public static int[] rotateArray(int[] array, int numOfRotations){

        int[] array1 = new int[array.length];

        for(int i=0; i<array.length; i++){
            int k = (i+numOfRotations)%array.length;
            array1[k] = array[i];
        }
        return array1;
    }

    public static void main(String[] args) {
        int[] result = rotateArray(new int[]{2,9,7,8,5},3);
        System.out.println(Arrays.toString(result));
    }
}
