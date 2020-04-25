public class third {
    public static void main(String[] args){
        //操场跑圈for循环
        for (int round = 1;round <= 5; round++){
            int temp_1 = 1;
            System.out.println("跑到第" + round + "圈了");
            //字符串和数字可以拼接输出
        }
        //System.out.println(round);round变量在for循环执行完的时候就销毁了
        //System.out.println(temp_1);在括号里定义的和在循环体中定义的变量，在for循环结束时都不能访问到

        //也可以这样写
        int a = 1;
        for(;a <= 5;a++){//注意，for循环括号里的条件可以那出来，但是分号不能少
            //循环体
            System.out.print("");
        }
        System.out.println(a);
        //a的值为6

        //去理解下面的代码：
        int b = 1;
        for(;b<=5;b++){
            System.out.println(b++);
        }
        System.out.println(b);

        //看一道小学数学应用题
        /*
        操场上一百多人排队，三人一组多一个，四人一组多两个，五人一组多两个
        */
        for(int students = 100; students < 200; students++){
            if(students % 3 == 1 && students % 4 ==2 && students % 5 == 2){
                System.out.println("学生的人数是："+students);
            }
        }

    }
}
