package Xebia.entity;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflections {
	public static void main(String[] args) {
	
		Class<Datas> rclass=Datas.class;
		
		Field[] fields=rclass.getDeclaredFields();
				Method[] methods=rclass.getMethods();
		int modifiers=rclass.getModifiers();
		
		for(Field f:fields)
		{
			System.out.println(Modifier.isPublic(f.getModifiers()));
			System.out.println(f);
			
		}
		System.out.println("\n\n");
		
		for(Method m:methods)
		{
			System.out.println(m);
		}
		System.out.println("\n\n");
			System.out.println(Modifier.isPublic(modifiers));
		
	}
}
