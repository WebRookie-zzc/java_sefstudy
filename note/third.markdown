# third

## 数据类型的转换问题

看下面的代码

```java
public class third{
    public static void main(String[] args){
        int a = 1;
        int b = a;
    }
} 
```

对于```int b = a```的代码：b不是上常量存储区去拿1，而是从a的存储位置拿1；

下面的代码没问题

```java
public class third{
    public static void main(String[] args){
        byte a = 1;
        int b = a;
    }
}
```
```java
public class third{
    public static void main(String[] args){
        int a = 1;
        byte b = a;
        //编译不通过
    }
}
```

解决方法：
```java
public class third{
    public static void main(String[] args){
        int a = 1;
        byte b = (byte)a;
    }
}
```

用大的放小的没有用问题
小的存到大的里面需要进行强制的转换才可以；

类型之间转换的问题：
1.同种数据类型之间可以直接进行复制操作;```int a = 1; int b = a;```
2.数据类型不同才转换
    同种大数据类型才可以直接转换，即基本数据类型了=和引用数据类型不能相互转换。
    分为自动和强制转换
    基本类型和引用类型之间通过包装类和封装类进行间接转换
3.保证大数据类型一致的前提下；(基本类型 --》 基本类型)
    小数据类型相同：```byte a = 1; int b = a;```(自动转换)
    小数据类型不同：




若强制转换，将大的硬塞到小的里面，编译可以成功，但是一定不是原来的值：

例：
```java
public class third{
    public static void main(String[] args){
        int a = 1000;
        byte b;
        b = (byte)a;
        System.out.println(b);//输出-24
    }
}
```

## 有疑惑的
## 代码：

```java
public class third{
    public static void main(String[] args){
        int a = -10;
        byte b;
        b = (byte)a;
        System.out.print(b);
    }
}
//这里还是-10
```

不同小数据类型的转换：

```java
public class third{
    public static void main(String[] args){
        int a = 1;
        float b;
        b = (float)a;
        Sysytm.out.println(b);
        //输出1.0
    }
}
```

整型和浮点型的转换看的是精确程度，long可以放到flaot中

```java
public class third{
    public static void main(String[] args){
        long a = 1;
        float b = a;
        System.out.println(b);
        //1.0
    }
}
```

整型和浮点型的转换
浮点型可以放整型，整形存放浮点型需要强制转换(他们比较精确程度，浮点型的精确程度比较高)
任何一个浮点型都可以存放整型，浮点型到整型损失小数部分。

```java
public class third{
    public static void main(String[] args){
        float a =  3.4f;
        int b = (int)a;
        System.out.println(b);
        //输出3
    }
}
```

### char 和 int的转换

```java
public class {
    public static void main(String[] args){
        char x = 'a';
        int y = x;
        System.out.println(y);
        //输出97
    }
}
```

```java
public class {
    public static void main(String[] args){
        int x = 97;
        char y = (char)x;
        //这里 必须进行强制转换否则编译不通过
        System.out.println(y);
        //输出a
    }
}
```

### 布尔类型的数据不能与其他类型的转换