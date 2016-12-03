package com.newconstructs.controller.home;

import com.newconstructs.domain.Animal;
import com.newconstructs.domain.api.Layout;
import com.newconstructs.service.api.AnimalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;
import java.util.Collections;
import java.util.List;


@Controller
public class HomeController {
  @Inject
  private AnimalService animalService;
  
  @Layout(
    title = "",
    description = "",
    selectedNav = "all"
  )
  @RequestMapping(value = {"/", "/home"})
  public String init(ModelMap modelMap) {
    List<Animal> animals = animalService.findAll();
    
    modelMap.put("animals", animals);
    List<Animal> dogs = animalService.findByDog();
    modelMap.put("dogs", dogs);
    List<Animal> cats = animalService.findByCat();
    modelMap.put("cats", cats);
    List<Animal> snakes = animalService.findBySnake();
    modelMap.put("snakes", snakes);
    List<Animal> rabbits = animalService.findByRabbit();
    modelMap.put("rabbits", rabbits);
    
    return "home";
    
    
  }
  

  @Layout(selectedNav = "all", description = "", title = "")
  @RequestMapping(value = {"/rate"})
 
  public String init1(ModelMap modelMap) {
	  List<Animal> lifes = animalService.getSortedanimalByRate();
	  modelMap.put("lifes", lifes);
	  List<Animal> lifemin = animalService.mimimumRating();
	  modelMap.put("lifemin", lifemin);
	  List<Animal> lifemax = animalService.maxRating();
	  modelMap.put("lifemax", lifemax);
	  return "rate";
	    
	    
  }
}