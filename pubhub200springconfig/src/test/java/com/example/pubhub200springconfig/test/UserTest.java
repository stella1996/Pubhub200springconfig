package com.example.pubhub200springconfig.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.pubhub200springconfig.config.UserConfig;
import com.example.pubhub200springconfig.model.User;




public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       AbstractApplicationContext context= new AnnotationConfigApplicationContext(UserConfig.class);
       User user=(User) context.getBean(User.class);
       
       user.setEmailid("steffydavies@gmail.com");
       user.setName("steffy");
       user.setPassword("02091996");
       user.setUsername("steffy");
       System.out.println(user);
     
       context.close();

	}
	

}
