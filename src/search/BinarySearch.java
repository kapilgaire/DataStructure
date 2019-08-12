package search;

/*
divide the array into two parts if elemnet is equal to mid then
return
if x is greater than ignore then mid ignore left

if x is smaller than mid ignore right  half

if not found return null
* */
public class BinarySearch {


    public static void main(String[] args) {


        int arr[] = {1, 2, 4, 5, 8, 9, 22, 25, 30, 39, 50};

        int findNumber = 500;

        System.out.println(binarySearch(arr, findNumber));

    }

    private static int binarySearch(int[] arr, int findNumber) {
        int low = 0;
        int high = arr.length - 1;


        while (low <= high) {
            int mid = low +(high-low)/2;

            System.out.println("low "+ low+"high  "+ high);
            System.out.println(mid);

            if(arr[mid]==findNumber){
                return mid;
            }

            if(arr[mid]<findNumber){
                low = mid+1;
            }else {
                high = mid-1;
            }

        }

        return -1;
    }
}
