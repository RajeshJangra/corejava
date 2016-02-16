package com.xebia.training;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

import static org.junit.Assert.*;
public class PersonalDetailsTest {
	@SuppressWarnings( "unchecked" )
	@Test
	public void callTest() throws InterruptedException, ExecutionException {
		
	PersonalDetailsUtils personalDetailsUtils=new PersonalDetailsUtils(512);
	 ExecutorService executorService = Executors.newFixedThreadPool(6);
	 Future<PersonalDetail> futurePersonalDetail=executorService.submit(personalDetailsUtils);
	 PersonalDetail personalDetail=futurePersonalDetail.get();
	 PersonalDetail personalDetail2=new PersonalDetail(512, "A+", "237JHD", "DSU779", "DS87DS");
	 assertEquals(personalDetail,personalDetail2);
}
}
