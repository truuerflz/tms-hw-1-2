import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        int number = 233673;
        int max = 0, min = 9;
        int temp = 0;

        while (number > 0) {
            temp = number % 10;
            if(temp > max) {max = temp;}
            if(temp < min) {min = temp;}
            number /= 10;
        }

        System.out.println("Max = " + max + ", Min =  " + min);

    }
}