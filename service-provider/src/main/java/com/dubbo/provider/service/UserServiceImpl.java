package com.dubbo.provider.service;

import com.dubbo.api.model.Address;
import com.dubbo.api.model.User;
import com.dubbo.api.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @AUTHOR: 小于
 * @DATE: [2019/4/4  23:26]
 * @DESC:
 */
@Service
public class UserServiceImpl implements UserService {

     private static final  List<User> userList=new ArrayList<>(10);

     static{

         userList.add(new User("1001","小明",12,
                 new Address("湖北省","武汉市","洪山区","民主街道xx号")));

         userList.add(new User("1002","小红",13,
                 new Address("江西省","南昌市","青山湖区","朝阳洲农场")));

         userList.add(new User("1003","小白",14,
                 new Address("浙江省","宁波市","江北区","中马街道")));

         userList.add(new User("1004","小黄",15,
                 new Address("广东省","广州市","黄埔区","鱼珠智谷")));

         userList.add(new User("1005","小江",16,
                 new Address("广东省","东莞市","松山湖","光大we谷")));

         userList.add(new User("1006","小梦",17,
                 new Address("湖北省","荆州市","荆州区","赤壁谷")));
     }


    @Override
    public User queryUser(User user) {

         Optional<User> userOptional=userList.stream().filter(u->{
             String userId=user.getUserId();
             return  judge(userId,u.getUserId());
         }).filter(u->{
             String userName=user.getUserName();
             return judge(userName,u.getUserName());
         }).filter(u->{
             Integer age=user.getAge();
             return null==age || age==u.getAge();
         }).findFirst();

        return userOptional.get();
    }

    private boolean judge(String userName, String uname) {
        if(StringUtils.isEmpty(userName)){
            return true;
        }
        return  userName.equals(uname);
    }

    @Override
    public Address queryUser(String userId) {

        Optional<User> userOptional=userList.stream().filter(u->{
            return  judge(userId,u.getUserId());
        }).findFirst();
        User user=userOptional.get();
        if(null==user)return null;
        else return user.getAddress();
    }
}
