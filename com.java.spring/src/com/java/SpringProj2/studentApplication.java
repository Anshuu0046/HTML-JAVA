package com.java.SpringProj2;

public class studentApplication {
	public static void main(String[] args) {
//		student s1 = new student("Anshuman", 21);
//		System.out.println(s1);
		ApplicationContext c1 = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("Object is created: ");
		student s = context.getBean("stud1", student.class);
//		s1.setStudName("Anshuman");
//		s1.setStudId(20046);
		System.out.println("Name: " + s1.getStudName());
		System.out.println("Id: " + s1.getStudId());
//	}

}
