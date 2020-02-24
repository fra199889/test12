package logic;

import java.util.ArrayList;
import java.util.List;

public class LogIn {
	 public List<String> username=new ArrayList<>();
	 private String password;
	 
	
	 
	 public Boolean checkAccountAlreadyExist(String username) {
		 return this.username.contains(username);
	 }}
