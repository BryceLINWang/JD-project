import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@EnableEurekaClient
@SpringCloudApplication
@MapperScan("edu.xalead.dao")
public class JDItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(JDItemApplication.class);
    }
}
