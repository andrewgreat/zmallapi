package first.greatsky;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@MapperScan("first.greatsky.mapper") //扫描的mapper
@SpringBootApplication
public class GreatskyApplication {

	@RequestMapping("/")
	String index() {
		return "Hello Spring Boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(GreatskyApplication.class, args);
	}

}

