package com.revature.eval.java.core;

public class EvaluationLauncher {

	public static void main(String[] args) {
		EvaluationService testMe = new EvaluationService();
		//Tests acronym maker
		String t1 = "Fad following bug investors bug me";
		System.out.println(testMe.wordCount(t1));
		
		
	}

}
