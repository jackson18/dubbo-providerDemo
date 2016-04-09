package com.qijiabin.provider;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务方启动类
 * @author jackson
 *
 */
public class Provider {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-dubbo-provider.xml" });
		context.start();
		System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
	}
	
}

