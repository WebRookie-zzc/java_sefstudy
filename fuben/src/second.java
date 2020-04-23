//导入用于输入的包
import java.util.Scanner;
import java.util.Random;

public class second {
    public static void main(String[] args){
        //补充的按位非
        int a,b;
        a = 1;
        b = ~a;
        System.out.println(b);
        //交换c、d的值(下面展示两种不同的不熟悉的方式)
        int c = 1;
        int d = 2;
        c = c + d;
        d = c - d;
        c = c - d;
        System.out.println(c);
        System.out.println(d);
            //接续上面的交换e、f的值
        int e = 10;
        int f = 11;
        e = e^f;
        f = e^f;
        e = e^f;
        System.out.println(e);
        System.out.println(f);

        //输入函数
//        System.out.print("请输入");
//        Scanner input = new Scanner(System.in);
//        int day = input.nextInt();
        //nextInt用于读取输入的数字
        //nextLine用于读取字符串
//        System.out.println(day);

        //if 分支
        /*System.out.println("请输入月份：");
        Scanner input_1 = new Scanner(System.in);
        int month = input_1.nextInt();
        if(month ==3 | month ==4  | month ==5){
            System.out.println("春天");
        }else if(month == 6|month ==7|month ==8) {
            System.out.println("夏天");
        }else if(month ==9|month ==10|month ==11){
            System.out.println("秋天");
        }else if(month ==12|month ==1|month ==2){
            System.out.println("冬天");
        }else{
            System.out.println("数据错误");
        }*/

        //摇骰子
        Random random = new Random();
        int num = random.nextInt(7);
        //System.out.println(num);
        Scanner input = new Scanner(System.in);
        int num_in = input.nextInt();
        if(num_in == num){
            System.out.println("猜对了");
        }else{
            System.out.println("猜错了");
        }
    }
}