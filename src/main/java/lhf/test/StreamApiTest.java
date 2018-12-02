package lhf.test;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream API test
 */
public class StreamApiTest {
    //一共有五种方式产生Stream

    //1. 可以通过Collection 提供的 stream() 或者 parallelStream()
    //2.通过Arrays 中的静态方法 stream()
    //3.通过Stream中的静态方法 of()
    //4.通过迭代产生无限流   Stream.iterate(seed,uni)
    //5.通过生成产生无限流   Stream.generate(Supplier)


    //产生了stream，几种操作：
    //A 筛选和切片
        //1.filter 过滤
        //2.limit  截断
        //3.skip(n) 跳过
        //4.distinct 去重
    //B映射
        // map
        //flatMap
    //C 排序
        //comparable   自然排序
        //comparator   定制排序
        //区别：comparable 是一个接口  有一个comparato方法。按照这个方法具体实现排序
        //comparator 是一个函数式接口，按照自己制定方式排序。

    //D 终止操作：
        //查找与匹配。
        /*
        allMatch   是否都匹配
        anyMatch    是否至少有一个匹配
        noneMatch  是否都不匹配
        findFirst 返回第一个元素
        findAny 返回任意一个元素
        count  返回数据总数
        max  返回最大的
        min   返回最小的
        */
     //E归约  reduce
     //F收集  collect  Collectors工具类中提供了很多收集器

    List<Employee> employees = Arrays.asList(
            new Employee(1L,"张三","男",100),
            new Employee(2L,"李四","男",120),
            new Employee(3L,"王五","女",320),
            new Employee(4L,"赵六","女",145));


    //中间操作没有任何结果 “惰性求职”
    // 筛选和切片操作
    @Test
    public void testA(){
        Stream stream = employees.stream().limit(2).filter(e->{
            System.out.println("中间操作。。。");
            return e.getGender().equalsIgnoreCase("女");
        });

        stream.onClose(()->{
            System.out.println("onClose..");
        });
        stream.forEach(System.out::println);
        stream.close();
    }
    //映射操作
    @Test
    public void testB(){
        List<String> slist = Arrays.asList("aaa","bbb","ccc","ddd");
        /*slist.stream().map(s->s.toUpperCase()).forEach(System.out::println);*/
        //Stream<Stream<Character>> streamStream = slist.stream().map(str -> this.toChar(str));
        //streamStream.forEach(stream->stream.forEach(System.out::println));

        Stream<Character> characterStream = slist.stream().flatMap(str -> this.toChar(str));
        characterStream.forEach(System.out::println);
    }

    public Stream<Character> toChar(String str){
        List<Character> cs = new ArrayList<>();
        char[] strs = str.toCharArray();
        for (Character c : strs) {
            cs.add(c);
        }
        return cs.stream();
    }

    //归约
    @Test
    public void testE(){
        Optional<Long> reduce = employees.stream().map(e -> e.getId()).reduce(Long::sum);
        System.out.println(reduce.get());

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        Optional<Integer> sum = list.stream().reduce((x, y) -> x + y);
        System.out.println(sum.get());

    }

    //收集
    @Test
    public void testF(){
        List<String> collect = employees.stream().map(e -> e.getName()).collect(Collectors.toList());
        System.out.println(collect);

        //收集集合总数
        Long count= employees.stream().collect(Collectors.counting());
        System.out.println("count="+count);

        //工资平均值
        Double avg = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(avg);

        //工资总和
        Double sum = employees.stream().collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println(sum);

        //工资谁最高
        Optional<Employee> maxSalary = employees.stream().collect(Collectors.maxBy((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())));
        System.out.println(maxSalary.get());

        DoubleSummaryStatistics sta = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        double max = sta.getMax();



    }

    @Test
    public void Test1(){
        //Collection的stream方法
        List<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(13);
        list.add(34);
        Stream<Integer> stream = list.stream();
    }

    @Test
    public void Test2(){
        //Arrays 的 stream方法
        int [] arr = new int[20];
        IntStream stream = Arrays.stream(arr);

    }

    @Test
    public void Test3(){
        //Stream 类的of方法
        Stream<Integer> integerStream = Stream.of(2);
    }

    @Test
    public void Test4(){
        //迭代无限流
        Stream.iterate(0,x->x+2).forEach(System.out::println);
    }

    @Test
    public void Test5(){
        //生成无限流
        Stream.generate(()->Math.random()).limit(5).forEach(System.out::println);
    }
}
