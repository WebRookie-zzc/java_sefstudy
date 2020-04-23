public class first{
    public static void main(String[] args){
        int a = 1;
        System.out.println(a++);
        System.out.println(!(3>2));
//比较下面两个代码
        int b = 1;
        if((3>4)&&(b++ == 1)){
            System.out.println();
        }
        System.out.println(b);//输出的值为1

        int c = 1;
        if((3>4)&(c++ == 1)){
            System.out.println();
        }
        System.out.println(c);
    }
}