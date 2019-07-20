package com.hendisantika.springboot2ehcache3example.service;

import com.hendisantika.springboot2ehcache3example.model.Employee;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot2-ehcache3-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-21
 * Time: 06:28
 */
@Service
public class EmployeeManager {
    static HashMap<Long, Employee> db = new HashMap<>();

    static {
        db.put(1L, new Employee(1L, "Uzumaki", "Naruto"));
        db.put(2L, new Employee(2L, "Uchiha", "Sasuke"));
        db.put(3L, new Employee(3L, "Haruno", "Sakura"));
        db.put(4L, new Employee(4L, "Hatake", "Kakashi"));
    }

    @Cacheable(cacheNames = "employeeCache", key = "#id")
    public Employee getEmployeeById(Long id) {
        System.out.println("Getting employee from DB");
        return db.get(id);
    }
}