package helloWorld;

import helloWorld.builder.entity.Auto;
import helloWorld.builder.impl.AutoBuilder;

public class main {

	
	public static void main(String[]args){
		String ahoj = "789456123";
		
		int aaa = 5;

		int bbb = 5;

		int tt = 666;
		
		int tt4 = 666;

		int ddd = 5;
		
		int bcf=552;
		
		AutoBuilder builder = new AutoBuilder();
		Auto auto = builder.build();
		System.out.print(auto);

	}
}
