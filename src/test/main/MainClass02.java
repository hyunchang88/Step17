package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		// 참조 data type을 비교 연산자로 비교 하면 동인한 객체인지를 비교하는 것임
		Car car1 = new Car("아반떼");
		Car car2 = new Car("아반떼");
		
		boolean result = car1 == car2;
		System.out.println(result);
	
		// new 할때마다 새로운 객체 생성이니
		// 결과는 false
		
		// 생성자에 인자로 전달하는 값이 같은 뿐이지 
		// 객체는 다른 객체 임
		
		// **************************************************
		
		Car car3 = car1;
		boolean result2 = car1 == car3;
		System.out.println(result2);
		
		// 이 경우가 같은 경우임
	}
}
