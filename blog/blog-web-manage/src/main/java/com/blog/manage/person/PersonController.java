package com.blog.manage.person;

import javax.annotation.Resource;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blog.common.ui.BaseController;
import com.blog.common.ui.JsonResult;
import com.blog.common.ui.Page;
import com.blog.common.ui.Status;
import com.blog.common.utils.MD5Util;
import com.blog.common.utils.UUIDUtil;
import com.blog.person.condition.PersonCondition;
import com.blog.person.model.Person;
import com.blog.person.service.IPersonService;

@Controller
@RequestMapping("/manage/person")
public class PersonController extends BaseController{
	@Resource
	private IPersonService personService;
	
	@RequestMapping(value="index",method=RequestMethod.GET)
	// @RequiresPermissions("person:list")
	public String index(){
		return "manage/person/person_list";
	}
	
	@RequestMapping(value="list",method=RequestMethod.POST)
	@ResponseBody
	public Page<Person> list(Page<Person> page,PersonCondition condition){
		page = personService.listPage(page, condition);
		return page;
	}
	
	@RequestMapping("toCreate/layer")
	public String toCreate(){
		return "manage/person/person_create";
	}
	
	@RequiresPermissions("person.toCreate")
	@RequestMapping(value="doCreate",method=RequestMethod.POST)
	@ResponseBody
	public JsonResult doAdd(Person person){
		try {
			person.setId(UUIDUtil.randomUUID());
			person.setSalt(UUIDUtil.randomUUID());
			person.setPassword(MD5Util.MD5(person.getPassword(), person.getSalt()));
			personService.insert(person);
			return jsonResult(Status.SUCCESS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonResult(Status.ERROR);
	}
	
	@RequestMapping("toEdit/{id}")
	public String toEdit(@PathVariable("id")String id){
		return "";
	}
	
	@RequestMapping("doEdit")
	public String doEdit(){
		return "";
	}
	
}
