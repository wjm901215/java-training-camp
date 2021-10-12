/**
 * 字节码分析
 * <p>需要涉及基本类型，四则运行，if 和 for，然后自己分析一下对应的字节码</p>
 *
 * @author SpiderMan
 * @version 1.0.0: PACKAGE_NAME.Hello,v 0.1 2021/10/11 17:17 Exp $$
 */
public class Hello {
    static final int LENGTH = 40;

    public static void main(String[] args) {
        int sum = 0;
        int reduce = 0;
        long multiply = 1L;
        double division = 1;
        for (int i = 0; i < LENGTH; i++) {
            if (i <= 10) {
                sum += i;
            } else if (i > 10 && i <= 20) {
                reduce -= i;
            } else if (i > 20 && i <= 30) {
                multiply *= i;
            } else if (i > 30 && i <= 40) {
                division /= i;
            }
        }
        System.out.println("sum:" + sum );
        System.out.println("reduce:" + reduce);
        System.out.println("multiply:" + multiply);
        System.out.println("division:" + division);
    }
}
