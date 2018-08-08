package com.revature.eval.java.core;

public class EvaluationLauncher {

	public static void main(String[] args) {
		EvaluationService testMe = new EvaluationService();
		//Tests acronym maker
		String t1 = "Fad following bug investors";
		String t2 = "counter science iguanas";
		String t3 = " portable   network graphics  ";
		String t4 = "Complementary metal-oxide semiconductor";
		System.out.println(t1 + " is abbreviated as " + testMe.acronym(t1));
		System.out.println(t2 + " is abbreviated as " + testMe.acronym(t2));
		System.out.println(t3 + " is abbreviated as " + testMe.acronym(t3));
		System.out.println(t4 + " is abbreviated as " + testMe.acronym(t4));
	}

}
