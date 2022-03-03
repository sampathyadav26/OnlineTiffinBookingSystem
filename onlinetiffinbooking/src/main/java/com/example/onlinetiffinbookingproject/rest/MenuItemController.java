package com.example.onlinetiffinbookingproject.rest;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.onlinetiffinbookingproject.entity.MenuItem;
import com.example.onlinetiffinbookingproject.service.MenuItemService;




@Controller
@RequestMapping("/menuItems")
public class MenuItemController {

	private MenuItemService menuItemService;
	
	public MenuItemController( MenuItemService theMenuItemService) {
		menuItemService = theMenuItemService;
	}

	// add mapping for "/list"

	@GetMapping("/list")
	public String listMenuItems(Model theModel) {
		
		// get Medicines from database
		List<MenuItem> theMenuItem = menuItemService.findAll();
		
		// add to the spring model
		theModel.addAttribute("menuitem", theMenuItem);
		
		return "menuItems/list-menuItem";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		MenuItem theMenuItem = new MenuItem();
		
		theModel.addAttribute("menuItem", theMenuItem);
		
		return "menuItems/menuItem-form";
	}

	@PostMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("menuItemId") int theId,Model theModel) {
		
		// get the Medicine from the service
		MenuItem theMenuItem = menuItemService.findById(theId);
		
		// set Medicine as a model attribute to pre-populate the form
		theModel.addAttribute("menuItem", theMenuItem);
		
		// send over to our form
		return "menuItems/menuItem-form";			
	}
	
	
	@PostMapping("/save")
	public String saveMedicine(@ModelAttribute("menuItem") MenuItem theMenuItem) {
		
		// save the Medicine
		menuItemService.save(theMenuItem);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/menuItems/list";
	}
	
	
	@PostMapping("/delete")
	public String delete(@RequestParam("menuItemId") int theId) {
		
		// delete the medicine
		menuItemService.deleteById(theId);
		
		// redirect to /medicines/list
		return "redirect:/menuItems/list";
		
	}
}

