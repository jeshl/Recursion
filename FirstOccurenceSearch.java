public class FirstOccurenceSearch {
    
    public static int SearchFirstOccurence(int arr[], int target, int index){
        if (index > arr.length - 1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return SearchFirstOccurence(arr, target, index + 1);      
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 3, 9, 4, 7, 8};
        System.out.println(SearchFirstOccurence(arr, 5, 0));
    }
}
