package testng;

import org.testng.annotations.Test;

public class Class1 {
	@Test(groups = {"regression", "smoke"})
	public void method1() {
		System.out.println("Thread id is :"+Thread.currentThread().getId());
		System.out.println("method1");
	}
	
	@Test(groups = { "regression", "sanity"})
	public void method2() {
		System.out.println("Thread id is :"+Thread.currentThread().getId());
		System.out.println("method2");
	}

}
