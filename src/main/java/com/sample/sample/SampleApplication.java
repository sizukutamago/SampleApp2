package com.sample.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.core.io.Resource;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
public class SampleApplication {
    private static ApplicationContext app;
    private static Properties mybeanProps;

    public static void main(String[] args) {
        app = new ClassPathXmlApplicationContext("classpath:bean.xml");

        MyBean bean = (MyBean) app.getBean("bean1");
        mybeanProps = (Properties) app.getBean("mybeanprops");

        String from = mybeanProps.getProperty("keeper.from");
        String to = mybeanProps.getProperty("keeper.to");

        MyBeanKeeper keeper = new MyBeanKeeper(bean, from, to);
        System.out.println(keeper);

//        app = new StaticApplicationContext();
//        Resource resource = app.getResource("file:sample.txt");
//
//        if (resource.exists()) {
//            try {
//                System.out.println("URI:" + resource.getURI());
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            System.out.println("*" + resource.getFilename() + "* ======");
//            InputStream input = null;
//            try
//            {
//                input = resource.getInputStream();
//                BufferedInputStream bufferedInputStream = new BufferedInputStream(input);
//                byte[] bytes = new byte[10240];
//                bufferedInputStream.read(bytes);
//                String xmlString = new String(bytes).trim();
//                System.out.println(xmlString);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            System.out.println("* end * =========");
//        } else {
//            System.out.println("not found :" + resource);
//        }
    }

}
