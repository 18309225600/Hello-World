package lhf.test.hw;

import lhf.test.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HWTest {

    /**
     * 给定一个数字列表，返回平方列表
     */
    @Test
    public void test1(){
        //作用于每一个元素上的平方 map
        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        List<Integer> collect = integers.stream().map((x) -> x * x).collect(Collectors.toList());
        System.out.println(collect);
    }

    /**
     * 数一数有多少个employee
     */
    @Test
    public void test2(){
        List<Employee> employees = Arrays.asList(
                new Employee(1L,"张三","男",100),
                new Employee(2L,"李四","男",120),
                new Employee(3L,"王五","女",320),
                new Employee(4L,"赵六","女",145));
    }
}
