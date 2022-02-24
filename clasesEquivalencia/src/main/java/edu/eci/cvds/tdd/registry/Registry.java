package edu.eci.cvds.tdd.registry;
import java.util.TreeMap; 

public class Registry {
	
	TreeMap<Integer, Person> register = new TreeMap<Integer,Person>();
	
    public RegisterResult registerVoter(Person p) {
		
		RegisterResult result = null;
		
        // TODO Validate person and return real result.
		if (register.containsKey( (Integer)(p.getId())) ) {
    		result = RegisterResult.DUPLICATED;
    	} 
		else if(p.isAlive() && (p.getAge()>=18)){
			
			result = RegisterResult.VALID;
			register.put((Integer)(p.getId()), p);
		}else if(!p.isAlive()){
			
			result = RegisterResult.DEAD;
		}else if(p.getAge()<18 && p.getAge() >= 0){
			
			result = RegisterResult.UNDERAGE;
		}else if(p.getAge() < 0 || (Integer)(p.getAge()) == null ){
			
			result = RegisterResult.INVALID_AGE;
		}
		
		
		return result;
    }
}