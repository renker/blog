package com.blog.person.service;

import com.blog.common.ui.Page;
import com.blog.person.condition.PersonCondition;
import com.blog.person.model.Person;

public interface IPersonService {
	int deleteByPrimaryKey(String id);

    int insert(Person record);
    
    Person selectByPrimaryKey(String id);
    
    int updateByPrimaryKey(Person record);
    
    Person login(String account);
    
    Person login(String account,String password);
    
    Page<Person> listPage(Page<Person> page,PersonCondition condition);
}
