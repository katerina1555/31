import java.io.InterruptedIOException;
import java.util.Scanner;

import static jdk.vm.ci.common.InitTimer.timer;

public class Main {
    public static void main(String[] args) {
        /*
          Public
         */

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            timer(3);
            timer(x);
        }

        public static void timer(int x){
            int min = x / 60;
            int sec = x % 60;

            for (int j = x; j <= 0; j--) {
                System.out.println("min = " + min + ",sec=" + sec);
                sec--;
                if (sec < 0) {
                    sec = 60;
                    min--;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Times up");
        }
    }
}
