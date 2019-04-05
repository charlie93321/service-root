package com.dubbo.api.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @AUTHOR: 小于
 * @DATE: [2019/4/4  23:10]
 * @DESC:
 */
@Data
public class User implements Serializable {

   private String userId;

   private String  userName;


   private Integer  age;


   private Address address;

   public User(String userId, String userName, Integer age, Address address) {
      this.userId = userId;
      this.userName = userName;
      this.age = age;
      this.address = address;
   }

   public User() {
   }
}
