package priv.bartek.spring4.jpa.tutorial.web.mvc.controller;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import priv.bartek.spring4.jpa.tutorial.model.Item;
import priv.bartek.spring4.jpa.tutorial.model.Person;
import priv.bartek.spring4.jpa.tutorial.service.PersonService;
import priv.bartek.spring4.jpa.tutorial.toys.JavaEightToys;

@Controller
@RequestMapping("/")
public class SimpleController {
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private JavaEightToys toys;

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
		
		Item item = new Item("Book: " + RandomStringUtils.randomAlphabetic(10), RandomUtils.nextDouble(0, 100));
		Set<Item> items = new HashSet<>();
		
		items.add(item);
		p.setItems(items);
		
		
		personService.save(p);

		//String message = "Hello " + p.getFirstName() + " " + p.getSurname() + " born: " + p.getBirthDate();
		String message = "Play: " + toys.oddPlay();
		return new ModelAndView("welcome", "message", message);
	}
	
}
