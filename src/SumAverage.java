public class SumAverage {
    public static int sum(int lowerBound, int upperBound) {
        int temporary;
        int sum = 0;
        if (lowerBound > upperBound) {
            temporary = upperBound;
            upperBound = lowerBound;
            lowerBound = temporary;
        }

        for (int i = lowerBound; i <= upperBound; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sum(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static double average(int lowerBound, int upperBound) {
        int temporary;
        double sum = 0;
        int counter = 0;
        if (lowerBound > upperBound) {
            temporary = upperBound;
            upperBound = lowerBound;
            lowerBound = temporary;
        }

        for (int i = lowerBound; i <= upperBound; i++) {
            sum = sum + i;
            counter++;
        }
        return sum / counter;
    }

    public static double average(int[] numbers) {
        double sum = 0;
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            counter++;
        }
        return sum / counter;
    }
}