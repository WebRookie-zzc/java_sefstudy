public class forth {
    public static void main(String[] args) {
        float a = 1.3F;
        a++;
        System.out.println(a);

        int b = 1;
        for (int i = 1; i <= 100; i++) {
            b = b++;
        }
        System.out.println(b);
        //注意：此时的b是1
        int c = 1;
        for (int i = 1; i <= 100; i++) {
            c = ++c;
        }
        System.out.println(c);
        //此时的值为101

        byte d = 1;
        d += 3;
        //d = d+3;  这一行编译会出错  int到byte有损失
        System.out.println(d);
        byte e = 1;
        e = (byte)(e+3);
        System.out.println(e);
    }
}
