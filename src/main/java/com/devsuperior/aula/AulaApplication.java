package com.devsuperior.aula;

import com.devsuperior.aula.Services.SalaryService;
import com.devsuperior.aula.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.naming.Name;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	@Autowired
	private SalaryService salaryService;


	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("maria",4000.00);
		System.out.println(salaryService.netSalary(employee));
	}
}
