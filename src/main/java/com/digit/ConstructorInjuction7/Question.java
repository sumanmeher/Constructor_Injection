package com.digit.ConstructorInjuction7;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int qid;
	private String ques;
	private Map<User, Answers> answers;

	public Question(int qid, String ques, Map<User, Answers> answers) {
		super();
		this.qid = qid;
		this.ques = ques;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println("question id:" + qid);
		System.out.println("question name:" + ques);
		System.out.println("Answers....");
		Set<Entry<User, Answers>> es = answers.entrySet();
		Iterator<Entry<User, Answers>> itr = es.iterator();
		while (itr.hasNext()==true) {
			Entry<User, Answers> entry = itr.next();
			User u_name = entry.getKey();
			Answers v_value = entry.getValue();
			u_name.display();
			v_value.disp();
			System.out.println("==================");
		}
	}
}
