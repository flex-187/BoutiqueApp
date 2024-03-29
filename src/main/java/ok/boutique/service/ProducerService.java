package ok.boutique.service;

import java.util.List;

import ok.boutique.entity.Producer;

public interface ProducerService {

	void createNewProducer(String name, String countryOrigin);
	void update(Producer producer);
	Producer findById(int id);
	Producer findByName(String name);
	void deleteById(int id);
	
	List<Producer> findAll();
	
	boolean existsByName(String name);
	void createNewProducer(Producer producer);
	
	
	
}
