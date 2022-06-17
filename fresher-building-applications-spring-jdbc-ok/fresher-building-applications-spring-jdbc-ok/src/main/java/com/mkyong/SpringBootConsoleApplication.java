package com.mkyong;

import com.mkyong.dao.CustomerRepository;
import com.mkyong.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;
import java.util.List;

import static java.lang.System.exit;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner
{
    @Autowired
    DataSource dataSource;

    @Autowired
    private CustomerRepository customerRepository;


    public static void main(String[] args) throws Exception {
        ApplicationContext appContext = SpringApplication.run(SpringBootConsoleApplication.class, args);

        //Lookup bean for use
        CustomerRepository customerRepositoryClone = appContext.getBean("customerRepository", CustomerRepository.class);

        //Use bean
        customerRepositoryClone.addCustomer("fresher", "fresher@gmail.com");
        List<Customer> list = customerRepositoryClone.findAll();
        list.forEach(x -> System.out.println(x));
    }

    @Override
    public void run(String... args) throws Exception {
        testInsert("Nguyen Thanh Phuoc", "phuocnt@gmail.com");
        testDisplay();
        exit(0);
    }

    public void testInsert(String name, String email){
        System.out.println("Add customer...");
        customerRepository.addCustomer(name, email);
    }

    public void testDisplay(){
        System.out.println("Display all customers...");
        List<Customer> list = customerRepository.findAll();
        list.forEach(x -> System.out.println(x));
    }

    public void showConnectionPoolInfo(){
        System.out.println("DATASOURCE = " + dataSource);
        // If you want to check the HikariDataSource settings
//        HikariDataSource newds = (HikariDataSource)dataSource;
//        System.out.println("DATASOURCE = " + newds.getMaximumPoolSize());
    }

    public void testConsole(String[] args){
        if (args.length <= 0) {
            System.err.println("[Usage] java xxx.jar {insert name email | display}");
        } else {
            if (args[0].equalsIgnoreCase("insert")) {
                System.out.println("Add customer...");
                String name = args[1];
                String email = args[2];
                customerRepository.addCustomer(name, email);
            }

            if (args[0].equalsIgnoreCase("display")) {
                System.out.println("Display all customers...");
                List<Customer> list = customerRepository.findAll();
                list.forEach(x -> System.out.println(x));
            }
            System.out.println("Done!");
        }
    }
}