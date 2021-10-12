# 字节码分析

```java
Classfile /Users/wangjunma/WorkDoc/learning/coding/java-training-camp/week1/src/main/java/Hello.class
Last modified 2021-10-12; size 1108 bytes
        MD5 checksum 3ec7fa231e776cd3bd7f10720d7f83ed
        Compiled from "Hello.java"
public class Hello
  minor version: 0
        major version: 52
        flags: ACC_PUBLIC, ACC_SUPER
        Constant pool:
        #1 = Methodref          #16.#31        // java/lang/Object."<init>":()V
        #2 = Class              #32            // Hello
        #3 = Fieldref           #33.#34        // java/lang/System.out:Ljava/io/PrintStream;
        #4 = Class              #35            // java/lang/StringBuilder
        #5 = Methodref          #4.#31         // java/lang/StringBuilder."<init>":()V
        #6 = String             #36            // sum:
        #7 = Methodref          #4.#37         // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        #8 = Methodref          #4.#38         // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        #9 = Methodref          #4.#39         // java/lang/StringBuilder.toString:()Ljava/lang/String;
        #10 = Methodref          #40.#41        // java/io/PrintStream.println:(Ljava/lang/String;)V
        #11 = String             #42            // reduce:
        #12 = String             #43            // multiply:
        #13 = Methodref          #4.#44         // java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        #14 = String             #45            // division:
        #15 = Methodref          #4.#46         // java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        #16 = Class              #47            // java/lang/Object
        #17 = Utf8               LENGTH
        #18 = Utf8               I
        #19 = Utf8               ConstantValue
        #20 = Integer            40
        #21 = Utf8               <init>
  #22 = Utf8               ()V
          #23 = Utf8               Code
          #24 = Utf8               LineNumberTable
          #25 = Utf8               main
          #26 = Utf8               ([Ljava/lang/String;)V
          #27 = Utf8               StackMapTable
          #28 = Class              #48            // "[Ljava/lang/String;"
          #29 = Utf8               SourceFile
          #30 = Utf8               Hello.java
          #31 = NameAndType        #21:#22        // "<init>":()V
          #32 = Utf8               Hello
          #33 = Class              #49            // java/lang/System
          #34 = NameAndType        #50:#51        // out:Ljava/io/PrintStream;
          #35 = Utf8               java/lang/StringBuilder
          #36 = Utf8               sum:
          #37 = NameAndType        #52:#53        // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
          #38 = NameAndType        #52:#54        // append:(I)Ljava/lang/StringBuilder;
          #39 = NameAndType        #55:#56        // toString:()Ljava/lang/String;
          #40 = Class              #57            // java/io/PrintStream
          #41 = NameAndType        #58:#59        // println:(Ljava/lang/String;)V
          #42 = Utf8               reduce:
          #43 = Utf8               multiply:
          #44 = NameAndType        #52:#60        // append:(J)Ljava/lang/StringBuilder;
          #45 = Utf8               division:
          #46 = NameAndType        #52:#61        // append:(D)Ljava/lang/StringBuilder;
          #47 = Utf8               java/lang/Object
          #48 = Utf8               [Ljava/lang/String;
          #49 = Utf8               java/lang/System
          #50 = Utf8               out
          #51 = Utf8               Ljava/io/PrintStream;
          #52 = Utf8               append
          #53 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
          #54 = Utf8               (I)Ljava/lang/StringBuilder;
          #55 = Utf8               toString
          #56 = Utf8               ()Ljava/lang/String;
          #57 = Utf8               java/io/PrintStream
          #58 = Utf8               println
          #59 = Utf8               (Ljava/lang/String;)V
          #60 = Utf8               (J)Ljava/lang/StringBuilder;
          #61 = Utf8               (D)Ljava/lang/StringBuilder;
          {
static final int LENGTH;
        descriptor: I
        flags: ACC_STATIC, ACC_FINAL
        ConstantValue: int 40

public Hello();
        descriptor: ()V
        flags: ACC_PUBLIC
        Code:
        stack=1, locals=1, args_size=1
        0: aload_0
        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
        4: return
        LineNumberTable:
        line 8: 0

public static void main(java.lang.String[]);
        descriptor: ([Ljava/lang/String;)V
        flags: ACC_PUBLIC, ACC_STATIC
        Code:
        stack=4, locals=8, args_size=1
        0: iconst_0
        1: istore_1
        2: iconst_0
        3: istore_2
        4: lconst_1
        5: lstore_3
        6: dconst_1
        7: dstore        5
        9: iconst_0
        10: istore        7
        12: iload         7
        14: bipush        40
        16: if_icmpge     107
        19: iload         7
        21: bipush        10
        23: if_icmpgt     34
        26: iload_1
        27: iload         7
        29: iadd
        30: istore_1
        31: goto          101
        34: iload         7
        36: bipush        10
        38: if_icmple     56
        41: iload         7
        43: bipush        20
        45: if_icmpgt     56
        48: iload_2
        49: iload         7
        51: isub
        52: istore_2
        53: goto          101
        56: iload         7
        58: bipush        20
        60: if_icmple     79
        63: iload         7
        65: bipush        30
        67: if_icmpgt     79
        70: lload_3
        71: iload         7
        73: i2l
        74: lmul
        75: lstore_3
        76: goto          101
        79: iload         7
        81: bipush        30
        83: if_icmple     101
        86: iload         7
        88: bipush        40
        90: if_icmpgt     101
        93: dload         5
        95: iload         7
        97: i2d
        98: ddiv
        99: dstore        5
        101: iinc          7, 1
        104: goto          12
        107: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
        110: new           #4                  // class java/lang/StringBuilder
        113: dup
        114: invokespecial #5                  // Method java/lang/StringBuilder."<init>":()V
        117: ldc           #6                  // String sum:
        119: invokevirtual #7                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        122: iload_1
        123: invokevirtual #8                  // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        126: invokevirtual #9                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        129: invokevirtual #10                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        132: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
        135: new           #4                  // class java/lang/StringBuilder
        138: dup
        139: invokespecial #5                  // Method java/lang/StringBuilder."<init>":()V
        142: ldc           #11                 // String reduce:
        144: invokevirtual #7                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        147: iload_2
        148: invokevirtual #8                  // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        151: invokevirtual #9                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        154: invokevirtual #10                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        157: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
        160: new           #4                  // class java/lang/StringBuilder
        163: dup
        164: invokespecial #5                  // Method java/lang/StringBuilder."<init>":()V
        167: ldc           #12                 // String multiply:
        169: invokevirtual #7                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        172: lload_3
        173: invokevirtual #13                 // Method java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        176: invokevirtual #9                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        179: invokevirtual #10                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        182: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
        185: new           #4                  // class java/lang/StringBuilder
        188: dup
        189: invokespecial #5                  // Method java/lang/StringBuilder."<init>":()V
        192: ldc           #14                 // String division:
        194: invokevirtual #7                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        197: dload         5
        199: invokevirtual #15                 // Method java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        202: invokevirtual #9                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        205: invokevirtual #10                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        208: return
        LineNumberTable:
        line 12: 0
        line 13: 2
        line 14: 4
        line 15: 6
        line 16: 9
        line 17: 19
        line 18: 26
        line 19: 34
        line 20: 48
        line 21: 56
        line 22: 70
        line 23: 79
        line 24: 93
        line 16: 101
        line 27: 107
        line 28: 132
        line 29: 157
        line 30: 182
        line 31: 208
        StackMapTable: number_of_entries = 6
        frame_type = 255 /* full_frame */
        offset_delta = 12
        locals = [ class "[Ljava/lang/String;", int, int, long, double, int ]
        stack = []
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 22 /* same */
        frame_type = 21 /* same */
        frame_type = 250 /* chop */
        offset_delta = 5
        }
        SourceFile: "Hello.java"


```


# 字节码分析

> Java版本
>
> ```
> major version: 52
> jdk8
> ```



> 构造方法
>
> ```
> stack=1, locals=1, args_size=1
> 
> 栈深度：1
> 本地变量表：1
> ```



> 栈信息
>
> ```
> stack=4, locals=2, args_size=1
> 
> 栈深度：4
> 本地变量表：2
> ```



> 操作码信息
>
> ```java
> /**
>  * 变量到操作数栈：iload,iload_,lload,lload_,fload,fload_,dload,dload_,aload,aload_
>  * 操作数栈到变量：istore,istore_,lstore,lstore_,fstore,fstore_,dstore,dstor_,astore,astore_
>  * 常数到操作数栈：bipush,sipush,ldc,ldc_w,ldc2_w,aconst_null,iconst_ml,iconst_,lconst_,fconst_,dconst_
>  */
> // iconst_0 将int类型常量0压入栈
> 0: iconst_0
> // istore 将int类型值存入局部变量1
> 1: istore_1
> 
> // lconst_1 将long类型常量1压入栈
> 4: lconst_1
> // lstore 将long类型值存入局部变量3
> 5: lstore_3
> // dconst_1 将Double类型常量1压入栈
> 6: dconst_1
> // dstore 将Double类型值存入局部变量
> 7: dstore        5
>   
> // 将int类型值存入局部变量
> 10: istore        7
> // 从局部变量中装载int类型值
> 12: iload         7
> // 将一个8位带符号整数压入栈
> 14: bipush        40
>   
> // 如果一个int类型值大于或者等于另外一个int类型值
> 16: if_icmpge     107
> // 从局部变量中装载int类型值
> 19: iload         7
> 
> // int类型数值相加 加：iadd,ladd,fadd,dadd
> 29: iadd
> // int类型数值相减 减：isub,lsub,fsub,dsub
> 51: isub
> // long类型数值相乘 乘：imul,lmul,fmul,dmul
> 74: lmul
> // double类型数值相除：idiv,ldiv,fdiv,ddiv
> 98: ddiv
> 
> // 类型转换（放宽数值转换），i2l把int类型的数据转化为long类型，i2d把int类型的数据转化为double类型
> 73: i2l
> 97: i2d
> ```

