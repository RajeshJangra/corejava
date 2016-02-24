package Xebia;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.UserConfig;
import Xebia.entity.User;


public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext springContext = new AnnotationConfigApplicationContext(UserConfig.class);
       //List <User> users=new ArrayList<User>();
       User bean = (User) springContext.getBean("user");
       System.out.println("User name: " + bean.getName());
        System.out.println("User skill: " + bean.getSkill());
    	
    	
        springContext.close();	
    }
}
