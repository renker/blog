package com.blog.person.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.blog.common.ui.Page;
import com.blog.person.condition.PersonCondition;
import com.blog.person.mapper.PersonMapper;
import com.blog.person.model.Person;


@Service
@Transactional
public class PersonServiceImpl implements IPersonService {
	
	@Resource
	private PersonMapper personMapper;

	public int deleteByPrimaryKey(String id) {
		return personMapper.deleteByPrimaryKey(id);
	}

	public int insert(Person record) {
		return personMapper.insert(record);
	}

	@Cacheable(value="personCache")
	public Person selectByPrimaryKey(String id) {
		return personMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKey(Person record) {
		return personMapper.updateByPrimaryKey(record);
	}

	public Person login(String account) {
		return personMapper.findByAccount(account);
	}

	public Person login(String account, String password) {
		return personMapper.findByAccountAndPassword(account, password);
	}

	public Page<Person> listPage(Page<Person> page,PersonCondition condition) {
		int num = personMapper.listPageCount(condition);
		if(num > 0){
			List<Person> list = personMapper.listPage(condition, new RowBounds(page.getCurrentPageIndex(), page.getPageSize()));
			page.setAllRecord(num);
			page.setResults(list);
		}
		return page;
	}
	
}
