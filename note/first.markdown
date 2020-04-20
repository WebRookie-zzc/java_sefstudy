# 编译与执行和环境变量

## 1-first

java文件的后缀名为.java
编译后的可执行文件是.class
编译后的文件的名字为```类名.class```

javac.exe 用来编译java文件
java.ext 用来执行由java生成的class文件

先写一个关键字class  后面加一个名字
名字可以是字母(对大小写敏感)数字(0-9,但是数字不能开头)符号(只能用_和$) 中文(强烈不推荐使用中文)
类的名字首字母建议大写，如果多个单词，采用驼峰命名法。

例：
如再first文件中写入：

```java
class Demo(){
    public static void main(String[],arg){
        System.out.print("Hello world");
        //也可以是println，就是多一个回车
    }
}
```

在DOS下这么运行

```DOS
javac first.java ----->会生成一个名为Demo.classd的文件

java Demo  ------> 执行这个文件    -----注意：这里就不用写.class了
```

