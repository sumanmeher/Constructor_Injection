package com.digit.ConstructorInjuction6;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int qid;
	private String name;
	private Map<String, String> answers;

	public Question() {
	}

	public Question(int qid, String name, Map<String, String> answers) {
		super();
		this.qid = qid;
		this.name = name;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println("question id:" + qid);
		System.out.println("question name:" + name);
		System.out.println("Answers....");
		Set<Entry<String, String>> set = answers.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			System.out.println(entry.getKey() + " Posted By:" + entry.getValue());
		}
	}
}
