package org.springframework;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.tests.sample.beans.TestBean;

/**
 * @author lishangjun
 * @date 2018/9/4
 */
public class ClassPathApplicationContestTest {

    @Test
    public void test() {
        // 资源加载
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test.xml", this.getClass());
        TestBean testBean = (TestBean) context.getBean("testBean");
        System.out.println(testBean.getName());
    }
}
