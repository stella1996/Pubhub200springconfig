package com.example.pubhub200springconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.pubhub200springconfig.model.User;

@Configuration
public class UserConfig {
@Bean(initMethod="init",destroyMethod="destroy")
	public User user()
	{
		return new User();
	}

}
