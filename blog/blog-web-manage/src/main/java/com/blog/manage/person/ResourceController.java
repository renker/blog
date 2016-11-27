package com.blog.manage.person;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.common.ui.BaseController;
import com.blog.common.ui.JsonResult;
import com.blog.common.ui.Status;

@Controller
@RequestMapping("manage/resource")
public class ResourceController extends BaseController{
	@RequestMapping("list")
	public String list(){
		return "manage/resource/resource_list";
	}
	
	@RequestMapping("autoScan")
	public JsonResult autoScan(){
		try {
			
			return jsonResult(Status.SUCCESS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonResult(Status.ERROR);
	}
}
