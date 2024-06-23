public class LastOccurrence {
    
    public static int SearchLastOccurrence(int[] arr, int target, int index){
        if (index == arr.length) {
            return -1;
        }

        int isFound = SearchLastOccurrence(arr, target, index + 1); //traverse to end and check while returning back

        if(isFound == -1 && arr[index] == target){ 
            return index;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 3, 9, 4, 7, 8};
        System.out.println(SearchLastOccurrence(arr, 7, 0));
    }
}
