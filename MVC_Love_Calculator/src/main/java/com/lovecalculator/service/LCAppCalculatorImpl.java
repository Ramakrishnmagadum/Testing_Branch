package com.lovecalculator.service;

import org.springframework.stereotype.Service;

@Service
public class LCAppCalculatorImpl implements LCAppCalculator {

	public String lovecalculation(String username, String Crushname) {
String username;
String name ;
if(name=="ram"){
}
System.out.println(1/0);
		int size = (username.length() + Crushname.length()) % 5;
//		FLAME   -->Friend , Love , Affection , Marrige ,Enemy
		String[] value = { "Friend", "Love", "Affection", "Marrige", "Enemy"};
		String key = value[size + 1];
		return key;
	}

}
