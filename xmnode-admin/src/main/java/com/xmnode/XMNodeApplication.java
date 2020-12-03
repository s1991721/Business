package com.xmnode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author Mr.Lin
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class XMNodeApplication {
    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(XMNodeApplication.class, args);
    }
}
