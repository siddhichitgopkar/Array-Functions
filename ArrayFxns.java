
public class ArrayFxns {

    public static int max(int[] arr) {
        //return largest number
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if ( arr[i] > max) {
                max = arr[i];
            } //if
        } //for
        return max;
    } //max

    public static int[] reverse (int[]arr) {
        int a = 0;
        int temp = 0;
        int b = arr.length - 1;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        } //for
        return arr;
    } //reverse

    public void insertAt(int item, int index) {
        if (index == test.length) {
            int[] newarr = new int[test.length + 10];
            for (int i = 0; i < test.length; i++) {
                newarr[i] = test[i];
            } //for
            newarr[index] = item;
        } else {
            //shift everything over and insert the new item

        } //else
    } //insert

    public static void main (String[] args) {
       public  int[] test = new int[50];
        for (int i = 0; i < test.length; i++) {
            test[i] = i;
        } //for
        System.out.println(ArrayFxns.max(test));
        ArrayFxns.reverse(test);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        } //for
        System.out.println();
    } //main

} //ArrayFxns
