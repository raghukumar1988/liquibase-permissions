package com.lbg.liquibasepermissions;

import com.lbg.liquibasepermissions.service.LiquibasePermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.exit;

@SpringBootApplication
public class LiquibasePermissionsApplication implements CommandLineRunner {
	@Autowired
	private LiquibasePermissionsService liquibasePermissionsService;

	public static void main(String[] args) {
		SpringApplication.run(LiquibasePermissionsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if (args.length > 0 ) {
			System.out.println(liquibasePermissionsService.manageSchema(args[0].toString()));
		}else{
			System.out.println(liquibasePermissionsService.manageSchema());
		}

		//exit(0);
	}
}
