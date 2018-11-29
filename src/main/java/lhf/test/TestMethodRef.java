package lhf.test;

import org.junit.Test;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 *方法引用：
 *  如果lambda表达式的lambda体正好是某个方法的实现，可以使用方法引用
 *  1. 实例::方法
 *  2. 类名::方法名  （静态方法）
 *  3. 类名::方法名  （实例方法）   如果第一个参数是方法的调用者，第二个参数是方法的参数，则可以使用
 */
public class TestMethodRef {
    @Test
    public void test1(){
        //实例::方法名
        Employee employee = new Employee();
        Supplier<Long> con = employee::getId;
        System.out.println(con.get());

        //类名::静态方法

    }
}
