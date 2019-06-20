package kr.or.kftc.hr.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import kr.or.kftc.hr.domain.Employee;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class EmployeeRepositoryTest {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void initTest() {

    }

    @Test
    public void findAll() throws Exception {
        Assert.assertEquals(107L, employeeRepository.count());
    }

    @Test
    public void jointest() throws Exception {
        Employee one = employeeRepository.findById(100L).get();
        System.out.println(one);
        Assert.assertNotNull(one);
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

        System.out.println(one.getDepartment());
        Assert.assertNotNull(one.getDepartment());
    }
}