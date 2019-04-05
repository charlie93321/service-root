package com.dubbo.user;

import com.dubbo.api.model.User;
import com.dubbo.api.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @AUTHOR: 小于
 * @DATE: [2019/4/5  1:15]
 * @DESC:
 */
public class ConsumerApp {


      public static void main(String[] args){

         ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("classpath:spring-context.xml");


         classPathXmlApplicationContext.start();

         UserService userService=classPathXmlApplicationContext.getBean(UserService.class);


         User user=userService.queryUser(new User("1003",null,null,null));

         System.out.println("查询得到:"+user);


         classPathXmlApplicationContext.close();

      }

}
