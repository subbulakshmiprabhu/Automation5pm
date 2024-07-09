package testng;

import org.testng.annotations.Test;

public class Class2 {
	@Test(groups = "sanity")
	public void method3() {
		System.out.println("Thread id is :"+Thread.currentThread().getId());
		System.out.println("method3");
	}
	@Test(groups = "sanity")
	public void method4() {
		System.out.println("Thread id is :"+Thread.currentThread().getId());
		System.out.println("method4");
	}

}
