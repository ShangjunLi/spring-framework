package org.springframework.beans.lsj;

import junit.framework.TestCase;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * Description：
 *
 * @author lishangjun
 * @date 2018/8/29 7:45
 */
public class BeanFactoryTests extends TestCase {

	public void test() {
		// 资源加载
		ClassPathResource resource = new ClassPathResource("test.xml", getClass());
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		// 创建读取器，将读取信息回调给factory
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		// 载入资源中的bean
		reader.loadBeanDefinitions(resource);
	}
}
