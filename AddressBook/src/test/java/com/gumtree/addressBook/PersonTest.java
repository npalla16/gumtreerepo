package com.gumtree.addressBook;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class PersonTest {

	@Test
	public void getNameTest(){
		List<Person> person = testData();
		String name = "ppp qqq";
		Assert.assertEquals(person.get(1).getName(),name);
	}
	
	@Test
	public void getAgeTest(){
		List<Person> person = testData();
		Assert.assertEquals(person.get(2).getAge(),26);
	}
	
	public  List<Person> testData(){
		List<Person> addressBook = new ArrayList<Person>();
    	addressBook.add(new Person("abc def",Gender.MALE,IsoChronology.INSTANCE.date(1977,3, 16)));
    	addressBook.add(new Person("ppp qqq",Gender.MALE,IsoChronology.INSTANCE.date(1985,1, 15)));
    	addressBook.add(new Person("ssss kk",Gender.FEMALE,IsoChronology.INSTANCE.date(1991, 11, 20)));
    	return addressBook;
	}
}
