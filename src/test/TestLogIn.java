package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logic.LogIn;

public class TestLogIn {
	@Test
	   public void signUpAndAccountAlreadyExist() {
		  LogIn login=new LogIn();
		  login.username.add("marco12");
		  Boolean check=login.checkAccountAlreadyExist("Marco12");
		  assertEquals(true,check);
}}

/*Voglio constatare che la funzione che verifica se un utente già esiste funzioni.Ho coverage 100% , >0 errors/failures ,quindi penso che non funzioni.In realtà il bug è nel test,poichè
il tester pensa erroneamente che "Luca123" e "luca123" siano stringhe uguali,dimenticandosi che java è un linguaggio case sensitive,yuttavia questo errore non potrebbe mai comunque verificarsi,
poiche nella nostra piattaforma gli username sono tutti convertiti in minusculo al momento delle registrazione dell'utente(nella funzione sign up)*/
	   

/*public Boolean signUp(String insertedUsername,String insertedPassword) {
     this.username.add(insertedUsername.toLowerCase());
     this.password=insertedPassword;
     return true;

 
}*/

