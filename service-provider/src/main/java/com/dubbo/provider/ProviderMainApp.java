package com.dubbo.provider;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @AUTHOR: 小于
 * @DATE: [2019/4/4  23:58]
 * @DESC:
 */
public class ProviderMainApp {
    private static final Logger LOGGER=Logger.getLogger(ProviderMainApp.class);
      public static void main(String[] args) throws IOException {

          ClassPathXmlApplicationContext context =
                  new ClassPathXmlApplicationContext("classpath:spring-context.xml");
          context.start();
          LOGGER.info("服务启动,已提供服务");
          System.in.read(); // 按任意键退出

      }
}
