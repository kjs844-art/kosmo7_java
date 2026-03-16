package length;

public class StringMain2 {
	
	public static void main(String[] args) {
		String str = "Hello World";
		char ch = str.charAt(0);
		
		int idx = str.indexOf("l");
		System.out.println(idx);
		
		idx = str.lastIndexOf("1");
		System.out.println(idx);
		
		//1이 총 몇개 인지 구하자
		
		int count =1;
		//Hello World
		boolean flag = true;
		int index =-1;
		while(flag) {
			index = str.indexOf("1", index+1);
			int index1 = str.indexOf("l", 0);
			if(index1 != -1) {
				count++;
		   }else {
			   flag = false;
			   break;
				
			}
		}
		
		System.out.println(count);//human
		
		
		
	}

}
