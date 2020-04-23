# sixth

## Java语法结构1

补充一下按位非 ~：就是将每一位的0换为1，1换为0。

-1的补码是1，反码是0，按位非就是加个负号，再减一


```java
public class second{
    public static void main(String[] args){
        int a = 1;
        int b;
        b = ~a;
        System.out.println(b);
        //这里b的值为-2
    }
}
```

看几道笔试(面试题)：

1.&和&&的不同：

不仅要想到&&的短路，还要想到&也可以作为位运算符

2.请说出一种最有效率的方法计算2*8的结果(用位运算)

2 << 3即可

3.对于```int a = 1; int b = 2;```,如何将两个变量的值互换

1)(采用中间变量备份)int a = 1;int b = 2;int c;c = a;a = b;b = a;

2)


```java
public class sescond{
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        a = a + b;
        b = a - b;
        a = a - b;
    }

}
```


还有一个诡异的交换变量的值


```java
public class second{
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        a = a^b;
        b = a^b;
        a = a^b;
    }
}
```


解释：一个数字同时异或同一个数字两次，他的值不变


语法结构：顺序结构  分支结构(单分支、多分支)  循环结构


####  分支结构：

```if(boolean值){}  else if(){}  else{}```

用户输入：

利用lib中的Scanner库(引用类型)

```java
import java.util.Scanner
public class{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        day = input.nextInt();
    }
}
```

1.导入包```import java.util.Scanner```
2.声明对象(括号里要有内容)```Scanner input = new Scanner(System.in)```
3.用name.nextInt()获取整型、用name.nextLine()获取字符串


摇骰子并猜点数：


```java
import java.util.Random
public class{
    public static void main(String[] args){
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
```