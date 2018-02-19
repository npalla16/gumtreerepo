package com.gumtree.addressBook;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;

public class Person {
String name;
LocalDate dob;
Gender gender;

public Person(String name, Gender gender, LocalDate dob) {
	super();
	this.name = name;
	this.gender = gender;
	this.dob = dob;
}
public LocalDate getDob() {
	return dob;
}
public Gender getGender() {
	return gender;
}
public String getName() {
	return name;
}
public int getAge() {
	return dob.until(IsoChronology.INSTANCE.dateNow()).getYears();
}
@Override
public String toString()
{
    return "Person [name=" + name + ", gender=" + gender + ", age=" + getAge()
            + "]";
}
}
