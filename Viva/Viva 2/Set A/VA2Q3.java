import java.util.Scanner;

public class VA2Q3 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of samples: ");
        int numberOfSamples = input.nextInt();
        System.out.print("Enter the maximum samples to remove: ");
        int maxSamplesToRemove = input.nextInt();
        System.out.print("Enter target mean: ");
        double targetMean = input.nextDouble();
        System.out.print("Enter samples: ");
        String sampleString = input.nextLine();
        double[] samples = new double[numberOfSamples];
        for (int i = 0; i < numberOfSamples; i++) {
            samples[i] = input.nextDouble();
        }

        for (int i = 0; i < maxSamplesToRemove; i++) {

            int removalIndex = getBestRemovalIndex(samples, targetMean);
            
            System.out.printf("Removed %.2f, ", samples[removalIndex]);
            
            samples = removeElement(samples, removalIndex);
            System.out.printf("new mean : %.2f\n", getMean(samples));
        }

        System.out.printf("Final mean: %.2f\n", getMean(samples));
        System.out.printf("Difference with target mean: %.2f\n", getDifference(samples, targetMean));
    }

    static double getMean(double[] numbers) {

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return (double) sum / numbers.length;
    }

    static int getBestRemovalIndex(double[] numbers, double targetMean) {

        int bestIndex = 0;
        double smallestDiff = Double.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            
            double[] tempArray = removeElement(numbers, i);
            double currentMean = getMean(tempArray);
            double currentDiff = getDifference(tempArray, targetMean);

            if (currentDiff < smallestDiff) {
                smallestDiff = currentDiff;
                bestIndex = i;
            }
        }
        return bestIndex;
    }

    static double getDifference(double[] numbers, double targetMean) {

        return Math.abs(getMean(numbers) - targetMean);
    }

    static double[] removeElement(double[] arr, int index) 
    {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }

        double[] proxyArray = new double[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue; 
            }
            proxyArray[k++] = arr[i];
        }
        return proxyArray;
    }
}
