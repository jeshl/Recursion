public class CalculatePower {
    
    public static int PowerCal(int num, int power){

        if(power == 0){
            return 1;
        }

        return num * PowerCal(num, -- power);
    }


    public static void main(String[] args) {
        int num = 2;
        int pow = 10;
        System.out.println(PowerCal(num, pow));
    }
}
