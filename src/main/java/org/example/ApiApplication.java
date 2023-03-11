package org.example;


import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
public class ApiApplication {
    public static void main(@NotNull String[] args) {
        SpringApplication.run(ApiApplication.class, args);
        log.info("程序已启动");
    }
}
