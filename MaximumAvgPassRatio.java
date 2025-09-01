import java.util.PriorityQueue;
public class MaximumAvgPassRatio {

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(b[2], a[2])
        );
        for (int[] cls : classes) {
            int pass = cls[0], total = cls[1];
            double gain = (pass + 1.0) / (total + 1.0) - (double) pass / total;
            pq.offer(new double[]{pass, total, gain});
        }

        while (extraStudents-- > 0) {
            double[] top = pq.poll();
            double pass = top[0] + 1;
            double total = top[1] + 1;
            double newGain = (pass + 1) / (total + 1) - pass / total;
            pq.offer(new double[]{pass, total, newGain});
        }

        double avg = 0;
        while (!pq.isEmpty()) {
            double[] curr = pq.poll();
            avg += curr[0] / curr[1];
        }
        return avg / classes.length;
    }
}


}
