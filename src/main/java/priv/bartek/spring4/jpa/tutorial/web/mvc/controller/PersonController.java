package priv.bartek.spring4.jpa.tutorial.web.mvc.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import priv.bartek.spring4.jpa.tutorial.model.Person;
import priv.bartek.spring4.jpa.tutorial.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;

	@PostConstruct
	public void postConstruct() {
		System.out.println("Person Controller created");
	}

		
	@RequestMapping("/all")
	public ModelAndView all() {
	
		List<Person> persons = personService.findAll();
		return new ModelAndView("browsePerson", "persons", persons);
	}

}
