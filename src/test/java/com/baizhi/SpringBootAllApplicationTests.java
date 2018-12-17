package com.baizhi;

import com.baizhi.entity.Person;
import com.baizhi.mapper.PersonMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootAllApplicationTests {
    @Autowired
    PersonMapper personMapper;
    @Test
    public void test1() {
        List<Person> people = personMapper.selectAll();
        for (Person person : people) {
            System.out.println(person);
        }



    }

}

