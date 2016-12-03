package com.newconstructs.domain;

import java.util.Comparator;

public class Animal {
  public enum AnimalType {DOG, CAT, SNAKE, RABBIT}


  private AnimalType animalType;
  private String     name;
  private int        offense;
  private int        defense;
  private int        health;
  private int        items;
  private int        rate;
  

  public Animal(AnimalType animalType, String name, int offense, int defense, int health, int items,int rate) {

    this.animalType = animalType;
    this.name = name;
    this.offense = offense;
    this.defense = defense;
    this.health = health;
    this.items = items;
    this.rate=rate;
  }

  public AnimalType getAnimalType() {

    return animalType;
  }

  public void setAnimalType(AnimalType animalType) {

    this.animalType = animalType;
  }

  public String getName() {

    return name;
  }

  public void setName(String name) {

    this.name = name;
  }

  public int getOffense() {

    return offense;
  }

  public void setOffense(int offense) {

    this.offense = offense;
  }

  public int getDefense() {

    return defense;
  }

  public void setDefense(int defense) {

    this.defense = defense;
  }

  public int getHealth() {

    return health;
  }

  public void setHealth(int health) {

    this.health = health;
  }

  public int getItems() {

    return items;
  }

  public void setItems(int items) {

    this.items = items;
  }

public int getRate() {
	return rate;
}

public void setRate(int rate) {
	this.rate = rate;
}
public static Comparator<Animal> rateComparator = new Comparator<Animal>() {
    @Override
    public int compare(Animal jc1, Animal jc2) {
        return (jc2.getRate() < jc1.getRate() ? -1 :
                (jc2.getRate() == jc1.getRate() ? 0 : 1));
      }
};


@Override
public String toString() {
	return "Animal [animalType=" + animalType + ", name=" + name + ", offense=" + offense + ", defense=" + defense
			+ ", health=" + health + ", items=" + items + ", rate=" + rate + "]";
}

}
