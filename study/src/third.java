public class third {
    public static void main(String[] args){
//        下面这三行代码没问题  ---- 》 1
//        int a = 1;
//        int b = a;
//        System.out.println(b);

//        byte a = 1;
//        int  b = a;
//        System.out.println(b);
//
        //下面的三行代码编译不通过
//        int a = 1;
//        byte b = a;
//        System.out.println(b);
        //解决办法：
        int a = 1;
        byte b = (byte)a;
        System.out.println(b);

        double c = 3.4;
        float d = (float)c;
        System.out.println(d);
        //下面一个是有损失的强制转换
        int e = 1000;
        byte f = (byte)e;
        System.out.println(f);

        int g = -10;
        byte h = (byte)g;
        System.out.println(h);
//不同小数据类型的转换
        int i = 1;
        float j;
        j = (float)i;
        System.out.println(j);
        //输出1.0

        int k = 1;
        float l = k;
        System.out.println(l);
        //输出1.0

        float m = 1.9f;
        //int n = m;//此时这个代码是编译不通过的。需要进行强制转化
        int n = (int)(m);
        System.out.println(n);
        //输出1

        char o = 'a';
        int p = o;
        System.out.println(p);
        //97

        int q = 97;
        char r = (char)q;
        System.out.println(r);

        char s = '我';
        int t = s;
        System.out.println(t);
        //25105(中文在两万多到四万多)
    }


}
