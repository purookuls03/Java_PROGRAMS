public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k=4;
        int res = search(arr,k);
        System.out.println(res);
        // System.out.println(arr);

    }
    private static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                start=mid+1;
            else
                end = mid-1;
        }
        return -1;
    }



}
