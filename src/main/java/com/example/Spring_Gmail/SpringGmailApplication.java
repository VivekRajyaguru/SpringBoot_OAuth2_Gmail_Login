package com.example.Spring_Gmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class SpringGmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGmailApplication.class, args);
	}
}
