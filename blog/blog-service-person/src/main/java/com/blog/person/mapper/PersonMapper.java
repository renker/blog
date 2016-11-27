package com.blog.person.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import com.blog.person.condition.PersonCondition;
import com.blog.person.model.Person;


@Repository
public interface PersonMapper {
    int deleteByPrimaryKey(String id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
    
    Person findByAccount(String account);
    
    Person findByAccountAndPassword(@Param("account")String account,@Param("password")String password);
    
    List<Person> listPage(@Param("condition")PersonCondition condition,RowBounds rowBounds);
    
    int listPageCount(@Param("condition")PersonCondition condition);
}