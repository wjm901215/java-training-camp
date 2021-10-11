import cn.hutool.core.io.IoUtil;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 自定义一个 Classloader
 * <p>加载一个 Hello.xlass 文件，执行 hello 方法，此文件内容是一个 Hello.class 文件所有字节（x=255-x）处理后的文件</p>
 *
 * @author SpiderMan
 * @version 1.0.0: PACKAGE_NAME.HelloClassloader,v 0.1 2021/10/11 07:18 Exp $$
 */
public class HelloClassloader extends ClassLoader {

    static final String CLASS_NAME = "Hello";
    static final String METHOD_NAME = "hello";
    static final String RESOURCE_NAME = "Hello.xlass";

    public static void main(String[] args) {
        try {
            Class<?> hello = new HelloClassloader().findClass(CLASS_NAME);
            hello.getMethod(METHOD_NAME).invoke(hello.newInstance());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] b = null;
        //找到Hello.xlass所在路径
        String path = this.getClass().getClassLoader().getResource(RESOURCE_NAME).getPath();
        try (InputStream inputStream = new FileInputStream(path);) {
            //将Hello.xlass输出字节码,读取所有的字节信息
            b = IoUtil.readBytes(inputStream);
            for (int i = 0; i < b.length; i++) {
                b[i] = (byte) (255 - b[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return defineClass(name, b, 0, b.length);
    }
}
