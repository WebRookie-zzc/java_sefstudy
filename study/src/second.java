public class second {
    public static void main(String[] args){
        float a = 3.4F;
        //不能写成float a = 3.4;
        boolean b = true;
        System.out.println(a);
        System.out.println(b);
        long c = 2147483648L;
        //不能写成long c = 2147483648;  -->编译无法通过
        System.out.println(c);
        String e = "abc";
        System.out.println(e);
        String f = null;
        System.out.println(f);
    }
}
