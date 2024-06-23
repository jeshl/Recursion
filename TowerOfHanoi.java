public class TowerOfHanoi {
    private static int count = 0;

    public static void tower_of_hanoi(int numOfDisk, String source, String helper, String dest){
        if(numOfDisk == 1){
            System.out.println("moved disk " + numOfDisk + " from " + source + " to " + dest);
            count ++;
            return;
        }

        tower_of_hanoi(numOfDisk - 1, source, dest, helper);
        System.out.println("moved disk " + numOfDisk + " from " + source + " to " + dest);
        count ++;
        tower_of_hanoi(numOfDisk - 1, helper, source, dest);
    }
    public static void main(String[] args) {
        int numOfDisk = 3;
        String source = "Src";
        String dest = "dest";
        String helper = "helper";

        tower_of_hanoi(numOfDisk, source, helper, dest);
        System.out.println(count);
    }
}
