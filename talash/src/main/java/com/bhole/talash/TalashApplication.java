package com.bhole.talash;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class TalashApplication {

	public static void main(String[] args)throws Exception{
	    SpringApplication app = new SpringApplication(TalashApplication.class);
	    Map<String, Object> pro = new HashMap<>();
	    pro.put("server.address", InetAddress.getByName("dell-desktop"));
	    pro.put("server.port", 9090);
	    app.setDefaultProperties(pro);
		app.run(args);
	}

}
