public class FindNumberIndices {
    
    public static void findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }

        if(arr[index] == target){
            System.out.println(index);
        }
 
        findIndex(arr, target, ++ index); //index++ doesn't work here.
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        findIndex(arr, 2, 0);
    }
}
