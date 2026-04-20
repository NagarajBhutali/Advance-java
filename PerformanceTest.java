package twoB;

public class PerformanceTest {
    public static void main(String[] args) {

        int n = 10000;

        // StringBuffer test (thread-safe)
        long startTime = System.nanoTime();
        StringBuffer sbuffer = new StringBuffer();

        for (int i = 0; i < n; i++) {
            sbuffer.append("AIET");
        }

        long endTime = System.nanoTime();
        long bufferTime = endTime - startTime;

        System.out.println("Time taken by StringBuffer: " + bufferTime + " ns");

        // StringBuilder test (not thread-safe)
        startTime = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sbuilder.append("AIET");
        }

        endTime = System.nanoTime();
        long builderTime = endTime - startTime;

        System.out.println("Time taken by StringBuilder: " + builderTime + " ns");

        // Comparison
        if (builderTime < bufferTime) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("StringBuffer is faster than StringBuilder.");
        }
    }
}