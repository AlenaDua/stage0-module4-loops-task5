package school.mjc.stage0.loops.task5;

public class Hourglass {

    public void printHourglassOfGivenSize(int height) {
        int halfheight = height / 2;
        for (int i = 0; i < height; i++) {
            if (i<halfheight) {
                for (int k = 0; k < height; k++) {
                    if (k < i || k > height - i - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("8");
                    }
                }
            }
            if (i>=halfheight) {
                for (int k = 0; k < height; k++) {
                    if (k >= height - i - 1 && k <= i) {
                        System.out.print("8");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}








