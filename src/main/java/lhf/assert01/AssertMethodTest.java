package lhf.assert01;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @Author lhf
 * @Description
 * @Date 2019/5/6 10:08
 * @Version 1.0
 **/
public class AssertMethodTest {

    /**
     * 测试断言
     */
    @Test
    public void test(){
        String obj1 = "junit";
        String obj2 = "junit";
        String obj3 = "test";
        String obj4 = "test";
        String obj5 = null;
        int var1 = 1;
        int var2 = 2;
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};

        /**
         * equals
         */
        Assert.assertEquals("是否相同",1,1);

        /**
         * 数组是否equals
         */
        Assert.assertArrayEquals(array1,array2);

        /**
         * not equals
         */
        Assert.assertNotEquals("不相同",obj1,obj3);
    }
}
