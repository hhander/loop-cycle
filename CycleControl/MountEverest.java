package CycleControl;

public class MountEverest {
    public static void main(String[] args) {
        double height = 8848860;
        double thickness = 0.1;
        int count = 0;
        while(thickness < height)
        {
            thickness = thickness * 2;
            count ++;
        }
        System.out.println("要叠" + count + "次");
    }


    public static void menu() {
        System.out.println("这是Mount类的函数调用");
    }


};


