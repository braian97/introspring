package br.com.braianbarbon.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.braianbarbon.model.Person;

@Service
public class PersonService {

	private List<Person> listofPersons = new ArrayList<Person>();
	
	public List<Person> findall(){
		return this.listofPersons;
	}
	
	public Person findOne(String email) {
		for(Person person : this.listofPersons) {
			if(person.getEmail().equals(email)) {
				return person;
			}
		}
		return null;
	}
	
	public Map<String, String> insert(Person person){
		boolean isSuccess = this.listofPersons.add(person);
		Map<String,String> result = new HashMap<String,String>();
		if(isSuccess) {
			result.put("result", "Pessoa cadastrada com sucesso!!!");
		}else {
			result.put("result", "Não foi possivel cadastrar a pessoa!!!");
		}
		return result;
	}
}
