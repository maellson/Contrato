package model;
public class PoupSimples{
private int saldo; 
 //@ invariant 0 <= saldo() && saldo() < 2000;

public /*@ pure @*/  int saldo() {
	return saldo;
}

 //@ requires valor > 0;
 //@ ensures saldo() > \old(saldo());
public void deposito (int valor) { 
	if (valor <= 0) { 
	System.out.println("Valor inválido");} 
  saldo = saldo+ valor;
  
}


}