package ssmredis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssmredis.model.User;
import ssmredis.repository.UserRepository;
@SpringBootApplication
@MapperScan("ssmredis.mapper")//将项目中对应的mapper类的路径加进来就可以了
public class SsmRedisApplication {
	public static void main(String[] args) {
		SpringApplication.run(SsmRedisApplication.class, args);
	}
}