package edu.eci.cvds.tdd.registry;

public class Registry {
    public RegisterResult registerVoter(Person p) {
		
		RegisterResult result = null;
		
        // TODO Validate person and return real result.
		if(p.isAlive() && (p.getAge()>=18)){
			
			result = RegisterResult.VALID;
		}else if(!p.isAlive()){
			
			result = RegisterResult.DEAD;
		}else if(p.getAge()<18 && p.getAge() >= 0){
			
			result = RegisterResult.UNDERAGE;
		}else if(p.getAge() < 0){
			
			result = RegisterResult.INVALID_AGE;
		}
		
		return result;
    }
}