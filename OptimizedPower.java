public class OptimizedPower {
    
    public static int Calculate(int num, int power){

        if(power == 0){
            return 1;
        }

        int dividedPower = Calculate(num, power/2);
        int dividedPowerSq = dividedPower * dividedPower;
     
        if(power % 2 != 0){
            dividedPowerSq = num * dividedPowerSq;
        }
        return dividedPowerSq;

    }
    public static void main(String[] args) {
        int num = 2;
        int power = 9;
        System.out.println(Calculate(num, power));
    }
}
