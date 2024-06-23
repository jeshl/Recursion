//given 2 * n board and tiles of size 2 * 1, 
//count the number of ways to tile the give board using 
//2 * 1 tiles. (A tile can either be placed horizontally or vertically)

public class TilingProblem {
    
    public static int tilingProb(int n){

        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 1;
        }

        int vertical = tilingProb(n - 1);
        int horizontal = tilingProb(n - 2);
        return vertical + horizontal; 
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(tilingProb(n));
    }
}
