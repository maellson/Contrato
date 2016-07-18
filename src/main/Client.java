package main;

import java.util.Scanner;

import model.Person;

public class Client {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);  
		Person p = new Person("Miguel" , 27);
		 System.out.println("Qual a nova idade para o " + p.name() + "?"); 
		 
		 int nova = scanner.nextInt();  
		
		 if (nova >= 0){  
			 p.setAge(nova); 
			 System.out.println("Alteração efectuada com sucesso");
		  } 
		 else 
		System.out.println("Idade inválida");
	}

}
