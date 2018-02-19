package com.gumtree.addressBook;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Address Book
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Person> addressBook = new ArrayList<Person>();
    	addressBook.add(new Person("Bill McKnight",Gender.MALE,IsoChronology.INSTANCE.date(1977,3, 16)));
    	addressBook.add(new Person("Paul Robinson",Gender.MALE,IsoChronology.INSTANCE.date(1985,1, 15)));
    	addressBook.add(new Person("Gemma Lane",Gender.FEMALE,IsoChronology.INSTANCE.date(1991, 11, 20)));
    	addressBook.add(new Person("Sarah Stone",Gender.FEMALE,IsoChronology.INSTANCE.date(1980,9, 20)));
    	addressBook.add(new Person("Wes Jackson",Gender.MALE,IsoChronology.INSTANCE.date(1974, 8, 14)));
    	//Number of male persons in the addressBook.
    	long maleCount = addressBook.stream().filter(p->p.getGender().equals(Gender.MALE)).count();
        System.out.println(" Male Count :" +maleCount );
        
        //Oldest Person in the addressBook.
        Comparator <Person> comparator = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());
        Person oldestPerson = addressBook.stream().max(comparator).get();
        System.out.println("Oldest Person: "+oldestPerson);
        
        LocalDate billDOB = LocalDate.of(1977, 3, 16);
        LocalDate paulDOB = LocalDate.of(1985, 1, 15);
        Period age = Period.between(billDOB,paulDOB);
        System.out.printf("Bill is %d years, %d months and %d days older than Paul.%n",
                age.getYears(), age.getMonths(), age.getDays());
        
    }
}
