/*
*  int[] weights = {20,10,9,4,2,1};
*  int[] values = {4000, 3500, 1800, 400, 1000, 200}
*
*
*
*
*
*
*
* */

import java.util.Arrays;

public class KnapSackGreedyAlgoApp {

    int[] weights = {20,10,9,4,2,1};
    int[] values = {4000, 3500, 1800, 400, 1000, 200};

    double[] ratios;

    KnapSackGreedyAlgoApp() {
        ratios = new double[weights.length];

        for (int idx = 0; idx < ratios.length; idx++) {
            ratios[idx] = values[idx] / weights[idx];
        }
    }
    public static void main(String[] args) {

        KnapSackGreedyAlgoApp app = new KnapSackGreedyAlgoApp();
        System.out.println(Arrays.toString(app.ratios));

        Arrays.sort(app.ratios);

        System.out.println(Arrays.toString(app.ratios));




        }

    }
