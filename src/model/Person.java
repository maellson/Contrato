package model;

public class Person {

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
	public Person (String name, int age) { 
	  this.name = name; this.age = age; 
	}
	/** 
	* Nome da pessoa 
	*/ 
	public String name () { return name;} 
	/** 
	* A idade da pessoa 
	*/ 
	public /*@ pure @*/ int age () { return age;} 
	/** 
	* Alterar a idade da pessoa 
	* @ param newAge O novo valor para a idade 
	*/
	
	/*@
	 @ requires newAge>=0; 
	 @ ensures age() == newAge ;
	 @*/

	public void setAge (int newAge) {   
		if (newAge >= 0) {
			age = newAge; 
			System.out.println("Idade inserida com Sucesso");
		}
		
		 else System.out.println("erro de entrada.. valor negativo");
		}
}
