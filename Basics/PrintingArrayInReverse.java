public class PrintingArrayInReverse {
    public static void main(String[] args) {
        /* Let the indexing of the array be i which will be increment in loop */
        int []arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp=0;
        for (int i = 0; i < n; i++) {
            //Now for swapping the number to reverse the array
            temp=arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i]=temp;
        }

        for (int ele : arr) {
            System.out.println(ele);
        }
    }
}