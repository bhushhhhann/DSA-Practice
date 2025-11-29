public class AvgOfMarksStoredInArray {
    public static void main(String[]args){
        float []arr = {3.2f,2.6f,5.3f,1.3f,6.3f};
        float sum = 0;
        for(float i:arr){
            sum = sum + i;
        }
        System.out.println("The Avg of the number is "+ sum/arr.length);
    }
}
