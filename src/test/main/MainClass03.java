package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		String name1 = "김구라";
		String name2 = "김구라";
		String name3 = new String("김구라");
		String name4 = new String("김구라");
		
		System.out.println("name1:"+name1);
		System.out.println("name3:"+name3);
		
		 // 동등비교연산자는 문자열의 참조값을 비교하는 것
		if(name1==name3){
			System.out.println("참조값이 같아요");
		}else{
			System.out.println("참조값이 달라요");
		}
		
		// java에서 문자열을 비교할때 동등비교연산자로 비교하면 안됨
		// 메소드로 비교해
		if(name1.equals(name3)){
			System.out.println("내용이 같아요");
		}else{
			System.out.println("내용이 달라요");
		}
	}
}
