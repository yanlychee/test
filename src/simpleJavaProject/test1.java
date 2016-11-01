package simpleJavaProject;

import java.util.ArrayList;
import java.util.List;

public class test1 {
	public static void main(String args[]){
		String str="this is; simple java project";
		String[] strArr =str.split(";");
		int len =strArr.length;
		List<String> testList =new ArrayList<>();
		System.out.print(len);
	}
}




  