public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11};
        int target = 7, low = 0, high = arr.length-1;
        boolean found = false;

        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                found = true; break;
            } else if(arr[mid] < target){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        System.out.println(target + (found ? " Found" : " Not Found"));
    }
}

