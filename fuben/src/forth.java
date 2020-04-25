import java.util.Scanner;

public class forth {
    public static void main(String[] args){
        System.out.println((int)(Math.pow(2,3)));

        //打印星星
        //1.一行任意颗星星
        System.out.print("你想要几颗星星？ ");
        Scanner input_1 =new Scanner(System.in);
        int count = input_1.nextInt();
        for(int i_1 = 1; i_1 <= count; i_1++){
            System.out.print("*");
        }
        System.out.println("");

        //2、行数和星星数都是用户给的
        System.out.println("请输入行数：");
        Scanner input_2 = new Scanner(System.in);
        int line_1 = input_2.nextInt();
        System.out.println("请输入星星的个数：");
        Scanner input_3 = new Scanner(System.in);
        int num_1 = input_3.nextInt();
        for(int x = 1; x <= line_1;x++){
            for(int y = 1; y<= num_1; y++){
                System.out.print("*");
            }
            System.out.println();
        }
        //3.输出4行，第一行1个第二行2个第三行3个第四行4个
        for(int x = 1; x <= 4; x++){
            for(int y = 1; y <=x; y++){
                System.out.print("*");
            }
            System.out.println();
        }
        //4.根据3.画一个右对齐的三角型
        for(int x = 1; x <= 4; x++){
            for(int y = 1; y <= (4-x);y++){
                System.out.print(" ");
            }
            for(int z = 1; z <= x; z++){
                System.out.print("*");
            }
            System.out.println();
        }

        //输出九九乘法表
        for(int x = 1; x <= 9; x++){
            for(int y = 1; y <= x; y++){
                System.out.print(x+"*"+y+"="+(x*y)+" ");
            }
            System.out.println();
        }
    }

}