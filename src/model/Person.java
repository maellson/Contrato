package model;

public class Person {
	
	//@ invariant name() != null && age() >= 0 ;
	/** 
	* Nome da pessoa 
	*/ 
	private String name; 
	/** 
	* A idade da pessoa 
	*/ 
	private int age; 
	/** 
	* Construtor 
	*/ 
	
	public Person (String newName, int newAge) { 
	  this.name = newName; this.age = newAge; 
	}
	/** 
	* Nome da pessoa 
	*/ 
	public /*@ pure @*/String name () { return name;} 
	/** 
	* A idade da pessoa 
	*/ 
	public /*@ pure @*/ int age () { return age;} 
	/** 
	* Alterar a idade da pessoa 
	* @ param newAge O novo valor para a idade 
	*/
	/*@
	 @ requires newAge >= 0;
	 @ ensures age() == newAge;
	 @*/

	public void setAge (int newAge) {   
			age = newAge; 
	}
			
}
