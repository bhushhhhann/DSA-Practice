//////Find the greater(> target) smallest(among other elements) number of 'target' , if target itself is present then return target itself .
////// But if target is greater than all element in the array then return -1.
////public class FindCeilingOfANum {
////    public static void main(String[] args){
////        int[] arr={2,9,4,5,8,3,33};
////        int target=6;
////        System.out.println(ceiling(arr,target));
////    }
////    public static int ceiling(int[] arr,int target ){
////        int t=target;
////        int start = 0 ;
////        int end =arr.length-1;
////        while(start<=end){
////            int mid =end+(start-end)/2;
////            if(arr[mid]<target){
////                start=mid+1;
////            }
////            else if(arr[mid]>target){
////                end = mid-1;
////            }
////
////            else return target;
////
////        }
////        int i=arr[start];
////        return i;
////
////    }
////}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//////Find the greater smallest number of 'target' , if target itself is present then return target itself .
////// But if target is greater than all element in the array then return -1.
//
//public class FindCeilingOfANum{
//
//    static int ans(int[] nums,int targ){
//        int start=0;
//        int end=nums.length;
//        while(start>=end){
//            int mid=start=(end-start)/2;
//            if(targ==nums[mid]) return targ;
//            else if(targ>nums[mid]){
//                start=mid+1;
//            }else if(targ<nums[mid]){
//
//            }
//        }
//
//    }
//
//    public static void main(String [] args){
//        int[] arr={2,4,5,7,8,12,23,36};
//        int target=15;
//        int ans =ans(arr,target);
//
//    }
//}
//



















