package com.newconstructs.service;


import com.newconstructs.domain.Animal;
import com.newconstructs.domain.Animal.AnimalType;
import com.newconstructs.service.api.AnimalService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Collections;
import java.util.*;


@Service
public class AnimalServiceImpl implements AnimalService {
  private static final List<Animal> ANIMALS;

  static {
    ANIMALS = new ArrayList<>();

    ANIMALS.add(new Animal(AnimalType.DOG, "Spot", 10, 7, 17, 0,36));
    ANIMALS.add(new Animal(AnimalType.DOG, "Rover", 15, 5, 2, 6,30));
    ANIMALS.add(new Animal(AnimalType.DOG, "Fido", 8, 6, 12, 15,13));
    ANIMALS.add(new Animal(AnimalType.CAT, "Mittens", 18, 3, 3, 0,40));
    ANIMALS.add(new Animal(AnimalType.CAT, "Snowball", 5, 0, 14, 1,16));
    ANIMALS.add(new Animal(AnimalType.CAT, "Waffles", 8, 11, 2, 18,11));
    ANIMALS.add(new Animal(AnimalType.SNAKE, "Slider", 6, 16, 14, 3,39));
    ANIMALS.add(new Animal(AnimalType.SNAKE, "Milton", 16, 6, 11, 17,27));
    ANIMALS.add(new Animal(AnimalType.SNAKE, "Spike", 6, 18, 2, 5,27));
    ANIMALS.add(new Animal(AnimalType.SNAKE, "Alice", 9, 11, 4, 6,27));
    ANIMALS.add(new Animal(AnimalType.RABBIT, "Flopsy", 14, 0, 12, 2,32));
    ANIMALS.add(new Animal(AnimalType.RABBIT, "Peter", 18, 18, 14, 3,65));
    ANIMALS.add(new Animal(AnimalType.RABBIT, "Oreo", 7, 4, 9, 1,22));
  }
  /*public AnimalServiceImpl(ArrayList<Animal> ANIMALS) {
      AnimalServiceImpl.ANIMALS = ANIMALS;
  }*/
  @Override
  public List<Animal> findAll() {

    return ANIMALS;
  }
  

@Override
public List<Animal> findByCat() {
	// TODO Auto-generated method stub
	List<Animal> resultcat = new ArrayList<Animal>();
	for (Animal anicat : ANIMALS) {
	  if (anicat.getAnimalType() == AnimalType.CAT) {
	    resultcat.add(anicat);
	  }
	}
	return resultcat;
	
}
@Override
public List<Animal> findByRabbit() {
	// TODO Auto-generated method stub
	List<Animal> resultrabbit = new ArrayList<Animal>();
	for (Animal anirabbit : ANIMALS) {
	  if (anirabbit.getAnimalType() == AnimalType.RABBIT) {
	    resultrabbit.add(anirabbit);
	  }
	}
	return resultrabbit;
}
@Override
public List<Animal> findBySnake() {
	// TODO Auto-generated method stub
	List<Animal> resultsnake = new ArrayList<Animal>();
	for (Animal anisnake : ANIMALS) {
	  if (anisnake.getAnimalType() == AnimalType.SNAKE) {
	    resultsnake.add(anisnake);
	  }
	}
	return resultsnake;
}

@Override
public List<Animal> findByDog() {
	List<Animal> resultdog = new ArrayList<Animal>();
	for (Animal anidog : ANIMALS) {
	  if (anidog.getAnimalType() == AnimalType.DOG) {
	    resultdog.add(anidog);
	  }
	}
	return resultdog;

}

@Override
public List<Animal> getSortedanimalByRate() {
    Collections.sort(ANIMALS, Animal.rateComparator);
    return ANIMALS;
}


@Override
public List<Animal> mimimumRating() {
	// TODO Auto-generated method stub
	return ANIMALS.subList(ANIMALS.size()-1, ANIMALS.size());
}


@Override
public List<Animal> maxRating() {
	// TODO Auto-generated method stub
	return ANIMALS.subList(0, 1);
}


@Override
public List<Animal> dogMimimumRating() {
	List<Animal> resultdogmin = new ArrayList<Animal>();
	for (Animal anidog : ANIMALS) {
		  if (anidog.getAnimalType() == AnimalType.DOG) {
		    resultdogmin.add(anidog);
		  }
		}
	// TODO Auto-generated method stub
	 return resultdogmin.subList(resultdogmin.size()-1, resultdogmin.size());
}


@Override
public List<Animal> dogMaxRating() {
	List<Animal> resultdogmax = new ArrayList<Animal>();
	for (Animal anidog : ANIMALS) {
		  if (anidog.getAnimalType() == AnimalType.DOG) {
		    resultdogmax.add(anidog);
		  }
		}
	// TODO Auto-generated method stub
	 return resultdogmax.subList(0,1);
}


@Override
public List<Animal> catMimimumRating() {
	List<Animal> resultcatmin = new ArrayList<Animal>();
	for (Animal anidog : ANIMALS) {
		  if (anidog.getAnimalType() == AnimalType.CAT) {
		    resultcatmin.add(anidog);
		  }
		}
	// TODO Auto-generated method stub
	 return resultcatmin.subList(resultcatmin.size()-1, resultcatmin.size());
	 
}


@Override
public List<Animal> catMaxRating() {
	// TODO Auto-generated method stub
	List<Animal> resultcatmax = new ArrayList<Animal>();
	for (Animal anidog : ANIMALS) {
		  if (anidog.getAnimalType() == AnimalType.CAT) {
		    resultcatmax.add(anidog);
		  }
		}
	// TODO Auto-generated method stub
	 return resultcatmax.subList(0,1);

}


@Override
public List<Animal> rabMimimumRating() {
	// TODO Auto-generated method stub
	List<Animal> resultrabmin = new ArrayList<Animal>();
	for (Animal anidog : ANIMALS) {
		  if (anidog.getAnimalType() == AnimalType.RABBIT) {
		    resultrabmin.add(anidog);
		  }
		}
	// TODO Auto-generated method stub
	 return resultrabmin.subList(resultrabmin.size()-1, resultrabmin.size());
	 
}

@Override
public List<Animal> rabMaxRating() {
	// TODO Auto-generated method stub
	List<Animal> resultrabmax = new ArrayList<Animal>();
	for (Animal anidog : ANIMALS) {
		  if (anidog.getAnimalType() == AnimalType.RABBIT) {
		    resultrabmax.add(anidog);
		  }
		}
	// TODO Auto-generated method stub
	 return resultrabmax.subList(0,1);
}


@Override
public List<Animal> snakMimimumRating() {
	// TODO Auto-generated method stub
	List<Animal> resultsnkmin = new ArrayList<Animal>();
	for (Animal anidog : ANIMALS) {
		  if (anidog.getAnimalType() == AnimalType.SNAKE) {
		    resultsnkmin.add(anidog);
		  }
		}
	// TODO Auto-generated method stub
	 return resultsnkmin.subList(resultsnkmin.size()-1, resultsnkmin.size());
	 
}


@Override
public List<Animal> snakMaxRating() {
	// TODO Auto-generated method stub
	List<Animal> resultsnkmax = new ArrayList<Animal>();
	for (Animal anidog : ANIMALS) {
		  if (anidog.getAnimalType() == AnimalType.SNAKE) {
		    resultsnkmax.add(anidog);
		  }
		}
	// TODO Auto-generated method stub
	 return resultsnkmax.subList(0,1);
}


@Override
public double averageRating() {
	// TODO Auto-generated method stub
	int sum = 0;
	int count=0;
	List<Animal> averagevar = new ArrayList<Animal>();
	
	for (Animal anidog : ANIMALS){
		
		sum=sum+anidog.getRate();
		
		count++;
		
		
	}
	return Math.round(sum/count);
}


@Override
public double averageDogRating() {
	// TODO Auto-generated method stub
	double sum=0;
	int count=0;
	List<Animal> resultdog = new ArrayList<Animal>();
	for (Animal anidog : ANIMALS) {
	  if (anidog.getAnimalType() == AnimalType.DOG) {
	    sum=sum+anidog.getRate();
	    count++;
	  }
	}
	return Math.round(sum/count);
}


@Override
public double averageCatRating() {
	// TODO Auto-generated method stub
	double sum=0;
	int count=0;
	List<Animal> resultdog = new ArrayList<Animal>();
	for (Animal anidog : ANIMALS) {
	  if (anidog.getAnimalType() == AnimalType.CAT) {
	    sum=sum+anidog.getRate();
	    count++;
	  }
	}
	return Math.round(sum/count);
}


@Override
public double averageSnakeRating() {
	// TODO Auto-generated method stub
	double sum=0;
	int count=0;
	List<Animal> resultdog = new ArrayList<Animal>();
	for (Animal anidog : ANIMALS) {
	  if (anidog.getAnimalType() == AnimalType.SNAKE) {
	    sum=sum+anidog.getRate();
	    count++;
	  }
	}
	return Math.round(sum/count);
}


@Override
public double averageRabbitRating() {
	// TODO Auto-generated method stub
	double sum=0;
	int count=0;
	List<Animal> resultdog = new ArrayList<Animal>();
	for (Animal anidog : ANIMALS) {
	  if (anidog.getAnimalType() == AnimalType.RABBIT) {
	    sum=sum+anidog.getRate();
	    count++;
	  }
	}
	return Math.round(sum/count);
}


}


