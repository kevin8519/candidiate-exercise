package com.newconstructs.service.api;

import com.newconstructs.domain.Animal;
import com.newconstructs.domain.Animal.AnimalType;

import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;


@Validated
public interface AnimalService {
  public List<Animal> findAll();
  
  public List<Animal> findByDog();
  
  public List<Animal> findByCat();
  public List<Animal> findByRabbit();
  public List<Animal> findBySnake();
  
  public List<Animal> getSortedanimalByRate();
  
  public List<Animal> mimimumRating();
  public List<Animal> maxRating();
  
  public List<Animal> dogMimimumRating();
  public List<Animal>dogMaxRating();
  
  public List<Animal> catMimimumRating();
  public List<Animal>catMaxRating();
  public List<Animal> rabMimimumRating();
  public List<Animal>rabMaxRating();
  public List<Animal> snakMimimumRating();
  public List<Animal>snakMaxRating();
  public double averageRating();
  
  public double averageDogRating();
  public double averageCatRating();
  public double averageSnakeRating();
  public double averageRabbitRating();
  
}


