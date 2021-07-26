import java.io.*;

public class Staff {
 
    public Employee faangPup() {
        return new Employee("Steve", "Company Pup", "Provides Moral Support", "pup.jpg");
    }

    public Employee cjobes() {
		return new Employee("Colton", "Lead Naps Analyst", "What do you mean I'm not valuable to the company?", "colton.jpg");
    }

    public Employee kevylees() {
	return new Employee("Kevin Lee", "Podcast Host", "Check out my podcast called WhatSupy", "Kevi.jpg");
    }
}