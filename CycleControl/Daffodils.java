package CycleControl;

import java.awt.desktop.ScreenSleepEvent;
import java.io.FileWriter;

public class Daffodils {
    public static void main(String[] args) {
        for(int i = 100;i<=999;i++)
        {
            int tmp = i;
            double sum = 0;
            while(tmp != 0)
            {
                sum = sum + Math.pow((tmp%10),3);
                tmp /= 10;
            }
            if(i == sum)
            {
                System.out.println(i);
            }
        }
    }

}
