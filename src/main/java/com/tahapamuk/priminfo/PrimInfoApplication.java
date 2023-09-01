package com.tahapamuk.priminfo;

import com.tahapamuk.priminfo.repository.PrimRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimInfoApplication {
	@Autowired
	private PrimRepo primRepo;

	public static void main(String[] args) {
		SpringApplication.run(PrimInfoApplication.class, args);
	}

}
