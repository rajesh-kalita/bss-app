package com.bss.bssrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

// We need to add Security Configuration by ourself. Default Configuration won't work:
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class, UserDetailsServiceAutoConfiguration.class })

// Since we haven't defined any security configuration, we cannot use this: 
// @SpringBootApplication 
public class BssRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BssRestApplication.class, args);
	}

}
