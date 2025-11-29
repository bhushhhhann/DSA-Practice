// Have to SEARCH in SORTED INFINITE ARRAY(array ki length nhi pata rahegi in short) and without length no end ;)
// LOGIC : CHUNKS(size exponentially(2,4,8,16,32...) badaige yoh best) mai dekehge as we dont have start end to search we will have to search our start end first :) .

import java.util.*;
public class SortedInfiniteArraySearch {
    static int ans(int[] arr,int target){
        int a=0;
        int start=0;
        int end=1;
        while(target>arr[end]){
            start=end+1;
            end=start+start*2;
        }
        if(target==arr[end]) return end;

        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                return mid;
            }
        }

        return a;
    }
    public static void main(String[] args) {
        // we cannot make infinite array so just asssume that we cant use .length fucntion .
        int[] arr ={2,5,7,10,12,15,16,19,20,25,27,28,29,36,41,42,49}; //random big array
        int target=29;
        System.out.println(ans(arr,target));
    }
}
