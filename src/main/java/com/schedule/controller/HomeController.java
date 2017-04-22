package com.schedule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schedule.beans.User;
import com.schedule.service.UserService;

@Controller
public class HomeController {

	@Autowired
	@Qualifier("userService")
	private UserService userService;

	@RequestMapping(value = "/")
	public String toIndex() {
		return "index";
	}

	@RequestMapping(value = "/test", // url
			method = RequestMethod.POST, // 请求方法
			consumes = "application/json", // 请求数据格式
			produces = "application/json;charset=UTF-8"// 返回数据格式
	)
	@ResponseBody
	public User test(@RequestBody User user) throws Exception {
		// if (true) {
		// throw new BaseException("测试");
		// }
		// System.out.println(user);
		user = userService.addUser(user);
		// System.out.println(user);
		return user;
	}

}
