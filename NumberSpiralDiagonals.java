public class NumberSpiralDiagonals {

    public static void main(String[] args) {
        
        int total = 1;
        int counter = 2;
        int runningNumbers = 1;
        
        while(counter < 1001) {
            for(int i = 0; i < 4; i++) {
                runningNumbers += counter;
                total += runningNumbers;
            }
            counter += 2;
        }
        System.out.println("The total: " + total);
    }
}
