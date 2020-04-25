import java.util.Scanner;
//加大上次小任务的难度(习题课)
public class firth {
    public static void main(String[] args){
        //行数由用户输入
        System.out.println("请输入行数：");
        Scanner input_1 = new Scanner(System.in);
        int line_1 = input_1.nextInt();
        for(int x = 1; x <= line_1; x++){
            if(x == 1){
                for(int y = 1; y <= (2*line_1 - 1); y++) {
                    System.out.print("*");
                }
            }
            else{
                for(int y = 1; y<= ((2*line_1-1)-(2*x-3))/2; y++){
                    System.out.print("*");
                }
                for(int y = 1; y<= (2*x-3); y++){
                    System.out.print(" ");
                }
                for(int y = 1; y<= ((2*line_1-1)-(2*x-3))/2; y++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        //任务2的代码优化
        for(int line = 1; line <= 4; line++){
            for(int x = 1; x <= (4 - line);x++){
                System.out.print(" ");
            }
            for(int x = 1; x <= line; x++){
                System.out.print(x);
            }
            for(int x = line-1; x >= 1; x--){//优化改为 --
                System.out.print(x);
            }
            System.out.println();
        }
        //任务3  九九乘法表对齐的优化
        for(int x = 1; x <= 9; x++){
            for(int y = 1; y <= x; y++){
                System.out.print(y + "*" + x + "=" + (x*y) + "\t");
            }
            System.out.println();
        }
        //任务4 素数与否代码优化  1.标识换为boolean省内存    2.数的范围换为他的算数平方根

                for(int x = 2; x <= 100; x++){
                    boolean mark = true;
                    if(x==2){
                        System.out.println(x+"是素数");
                    }
                    else{
                        for(int y = 2; y < (int)(Math.pow(x,0.5)); y++) {
                            if (x % y == 0) {
                                System.out.println(x + "不是素数");
                                mark = false;
                                break;
                            }
                        }
                        if (mark == true){
                            System.out.println(x+"是素数");
                        }
                    }
                }
            }
        }
