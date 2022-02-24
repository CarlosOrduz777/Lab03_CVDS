package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;


public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person("Andres", 1029796, 25, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    @Test
    public void underAgeRegistryResult() {

        Person person = new Person("Miguel", 1565748, 15, Gender.UNIDENTIFIED, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    
    @Test
    public void invalidAgeRegistryResult() {

        Person person = new Person("Andrea", 354654515, -30, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    
    @Test
    public void deadRegistryResult() {

        Person person = new Person("Camilo", 564655465, 86, Gender.MALE, false);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }

	 @Test
    public void validateRegistryDuplicatedResult() { 
    	Person person = new Person("Votante3",100002,30,Gender.MALE,true);
        Person person2 = new Person("Votante4",100002,86,Gender.FEMALE,true);
        
        registry.registerVoter(person);
        RegisterResult result2 = registry.registerVoter(person2);
        
        Assert.assertEquals(RegisterResult.DUPLICATED, result2);
    }
    // TODO Complete with more test cases
}