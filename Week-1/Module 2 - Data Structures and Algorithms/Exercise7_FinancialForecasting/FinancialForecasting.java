public class FinancialForecasting {
    
    // Recursive method to calculate future value
    // Formula: FutureValue = PresentValue * (1 + GrowthRate)^Periods
    // Recursively: FutureValue(periods) = FutureValue(periods - 1) * (1 + GrowthRate)
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base case: If periods is 0, the future value is just the present value
        if (periods == 0) {
            return presentValue;
        }
        
        // Recursive step: Calculate future value for (periods - 1) and apply growth rate
        return calculateFutureValue(presentValue, growthRate, periods - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.05; // 5% growth rate
        int periods = 10; // 10 periods (e.g., years)
        
        double futureValue = calculateFutureValue(presentValue, growthRate, periods);
        System.out.printf("Future Value after %d periods: %.2f\n", periods, futureValue);
    }
}
