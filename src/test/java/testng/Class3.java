package testng;

import org.testng.annotations.Test;

public class Class3 {
	@Test(groups ="smoke")
	public void method5() {
		System.out.println("Thread id is :"+Thread.currentThread().getId());
		System.out.println("method5");
	}
	@Test(groups = "regression")
	public void method6() {
		System.out.println("Thread id is :"+Thread.currentThread().getId());
		System.out.println("method6");
	}

}
