package com.SpringbootPostgres.SpringbootPostgres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentdemoController 
{
	@Autowired
	StudentdemoRepository srepo;
	@RequestMapping("/test")
	public String test()
	{
		return "this is a student demo test with portgres  SQL";
	}
	
	@RequestMapping("/datasave")
	public String save(@RequestBody Studentdemo s)
	{
		srepo.save(s);
		return "data saved";
	}
	
	@RequestMapping("/showall")
	public List<Studentdemo> all()
	{
		return srepo.findAll();
	}
}
