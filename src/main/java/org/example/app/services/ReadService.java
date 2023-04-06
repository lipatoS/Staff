package org.example.app.services;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.app.entities.Employee;


import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class ReadService {

    public void readData(String path) {

        try {
            Gson gson = new Gson();

            Reader reader = Files.newBufferedReader(Paths.get(path));

            List<Employee> employee = gson.fromJson(reader,
                    new TypeToken<List<Employee>>() {}.getType());

            AtomicInteger cnt = new AtomicInteger(0);

            employee.forEach(employees -> System.out.println(cnt.incrementAndGet() + ") " +
                    employees.getName() + " " +
                    employees.getPosition() + " " +
                    employees.getPhone() + " " +
                    employees.getSalary())
            );

            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}