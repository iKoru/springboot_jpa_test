package kr.or.kftc.hr;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Override
	@Transactional // lazy로딩은 transaction안에서 동작해야한다.
	public void run(String... args) throws Exception {

	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public Module datatypeHibernateModule() {
		return new Hibernate5Module();
	}
}
