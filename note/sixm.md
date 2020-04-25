# sixth

## Java语法结构

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


```java
import java.lang.Math  //lang的包相当于桌面，这步导入可以省略掉(lang包的都可省略)
public class second{
    public static void main(String[] args){
        //new一个对象也省了，因为里面都是静态方法
        double value = Math.random();//Math.random()返回的值是[0,1)的double类型
        int result = (int)(value*6+1);
        System.out.println("本次摇出的结果是：",result);//可以进行拼接
    }
}
```


补充：引用数据类型(如字符串)的“==”要用equals()方法，如果用==的话，那么比较的就是地址
```"a".equals("b")  --->  flase```


### 多分支语句

```
switch(值){
    case值1：
        语句一
        break;
    case值2；
        语句二
        break;
    default:
        语句三
        break;
}
```

注意：小括号里面的值是 byte short  int  char enum  1.7String类型

当小括号里面的值和case后面的值相同的时候才会执行case后面的语句

default相当于else

注意：java和C相同，case只是标识作用，需要用break跳出，如果没有break的时候，则从满足条件的开始后面的所有的case后的代码都执行(break不是必须的)

if和switch：
if的小括号里可以写复杂的逻辑，但是执行较慢
switch判断的过程效率更高,但只能做“==”判断

练习：用switch表示范围：

题目：利用谁提出语句实现一个学生成绩对应的区间
不及格 <60   及格【60,70)  中【70,80)   良【80,90） 优秀【90,100）  满分100  数据有误


```java
System.out.println("请输入分数");
        Scanner input_2 = new Scanner(System.in);
        int result = input_2.nextInt() / 10;
        switch (result){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
                System.out.println("及格");
                break;
            case 7:
                System.out.println("中");
                break;
            case 8:
                System.out.println("良");
                break;
            case 9:
                System.out.println("优秀");
                break;
            case 10:
            if(result % 10 == 0){
                System.out.println("满分");
                break;}//排除有10几分的时候
            default:
                System.out.println("数据错误");
        }
```