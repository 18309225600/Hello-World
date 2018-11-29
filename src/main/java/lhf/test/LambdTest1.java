package lhf.test;

import com.sun.deploy.util.StringUtils;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 内置四大核心接口测试
 * 1. Comsumer
 * 2.Supplier
 * 3.Function
 * 4.Predicate
 * @param <T>
 * @param <R>
 */
public class LambdTest1<T,R> {

    @Test
    public void test1(){
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("张三");
        employee.setGender("男");

        consumerTest(employee,(e)->{
            e.setGender("女");
            System.out.println(e);

        });

        List<Integer> list = new ArrayList<>();
        supplierTest(list,()->{
            StringBuffer stringBuffer = new StringBuffer();
            for (int i=0;i<6;i++){
                double d = Math.random();
                System.out.print(d);
                System.out.print("=");
                System.out.print((int)(d*9+1));
                System.out.print("=");
                System.out.print((int)(d*10));
                stringBuffer.append((int)(d*9+1));
            }
            System.out.println();
            return Integer.valueOf(stringBuffer.toString());
        });
        System.out.println(list);
        Boolean b = null;
        String abc = "";


        String message = functionTest(b,(p)->{ return p==null?"参数不能为空":""; });

        System.out.println(message);

        System.out.println(predicateTest(abc,o-> o==null));

    }

    public void consumerTest(Employee employee, Consumer<Employee> consumer){
        consumer.accept(employee);
    }

    public List<Integer> supplierTest(List<Integer> list, Supplier<Integer> supplier){
        for (int i=0;i<30;i++)
        list.add(supplier.get());
        return  list;
    }

    public String functionTest(Object param, Function<Object,String> function){
        return function.apply(param);
    }

    public boolean predicateTest(Object o, Predicate<Object> predicate){
        return predicate.test(o);
    }
}
