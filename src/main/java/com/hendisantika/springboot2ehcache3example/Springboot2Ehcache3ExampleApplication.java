package com.hendisantika.springboot2ehcache3example;

import com.hendisantika.springboot2ehcache3example.model.Employee;
import com.hendisantika.springboot2ehcache3example.service.EmployeeManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class Springboot2Ehcache3ExampleApplication {
    private static Logger logger = LogManager.getLogger(Springboot2Ehcache3ExampleApplication.class);
    @Autowired
    private CacheManager cacheManager;

    @Autowired
    private EmployeeManager employeeManager;

    public static void main(String[] args) {
        SpringApplication.run(Springboot2Ehcache3ExampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            //This will hit the database
            logger.info(employeeManager.getEmployeeById(1L));

            //This will hit the cache - verify the message in console output
            logger.info(employeeManager.getEmployeeById(1L));

            //Access cache instance by name
            Cache cache = cacheManager.getCache("employeeCache");

            //Add entry to cache
            cache.put(5L, new Employee(5L, "Uchiha", "Madara"));

            //Get entry from cache
            logger.info(cache.get(5L).get());
        };
    }
}
