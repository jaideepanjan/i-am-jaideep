package com.HP.association.things;

public class Person {
	public String name;
	public Email[] email;
	public Job job;

	public Person(String name) {
		super();
		this.name = name;
	}

	public void setEmail(Email[] email) {
		this.email = email;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public void printMadu() {
		System.out.println("Name of the Person : " + name);
		if (this.email != null) {
			for (int i = 0; i < email.length; i++) {
				Email ref = email[i];
				System.out.println(ref);
                 ref.printMadu();
			}

		}

		if (this.job != null) {
			this.job.printMadu();
		}
	}
}
