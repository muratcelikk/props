package com.cal.props;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cal.props.util.Cars;

@Controller
public class HomeController {

	List<Cars> ls = new ArrayList<Cars>();
	int Count = 0; //Count eklenmezse ID=0 hep olur..

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("data", ls);
		return "home";
	}

	@RequestMapping(value = "/carInsert", method = RequestMethod.POST)
	public String carInsert(Cars cars) {
		Count++; //0-->1 id=1 olur.
		cars.setId(Count);
		ls.add(cars);
		return "redirect:/";
	}
}
