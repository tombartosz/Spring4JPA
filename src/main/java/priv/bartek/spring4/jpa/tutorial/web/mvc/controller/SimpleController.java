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
@RequestMapping("/")
public class SimpleController {
	
	@Autowired
	private PersonService personService;

	@PostConstruct
	public void postConstruct() {
		System.out.println("Simple Controller created");
	}

	@RequestMapping("/")
	public ModelAndView helloWorld() {

		Person p = new Person();

		String firstName = RandomStringUtils.randomAlphabetic(1).toUpperCase()
				+ RandomStringUtils.randomAlphabetic(RandomUtils.nextInt(1, 10)).toLowerCase();
		String surname = RandomStringUtils.randomAlphabetic(1).toUpperCase()
				+ RandomStringUtils.randomAlphabetic(RandomUtils.nextInt(1, 10)).toLowerCase();
		Date birthDate = new Date(RandomUtils.nextLong(0, new Date().getTime()));
		
		p.setBirthDate(birthDate);
		p.setFirstName(firstName);
		p.setSurname(surname);
		
		personService.save(p);

		String message = "Hello " + p.getFirstName() + " " + p.getSurname() + " born: " + p.getBirthDate();
		return new ModelAndView("welcome", "message", message);
	}
	
}
