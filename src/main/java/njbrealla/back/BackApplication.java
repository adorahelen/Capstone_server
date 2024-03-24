package njbrealla.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // 생성 및 수정 시간 자동 업데이트
@SpringBootApplication
public class BackApplication {

    public static void main(String[] args) {

        SpringApplication.run(BackApplication.class, args);
    }

}
