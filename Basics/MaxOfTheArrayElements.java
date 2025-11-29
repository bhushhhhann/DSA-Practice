public class MaxOfTheArrayElements {
    public static void main (String[]args){
        int []arr={1,2,3,4,56,76};
        int max=0;
        for(int e:arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println(max);

    }
}
