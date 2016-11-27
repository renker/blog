package com.blog.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.blog.person.model.Person;
import com.blog.person.service.IPersonService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
@ActiveProfiles("dev")
public class PersonTest {
	@Resource
	private IPersonService personService;
	
	@Test
	public void test(){
		Person person = personService.login("root");
		System.out.println(person.getAccount());
	}
	
}
