package com.xebia.training.MapInterface;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;

import com.xebia.training.Employee1.PersonalDetails;
import com.xebia.training.Employee1.PersonalDetails.MarritalStatus;
import com.xebia.training.Employee2.PersonalDetailsData;

public class PersonalDetailsDataTest {

	@Test
	public void test() throws InterruptedException, ExecutionException {
		
		List<PersonalDetails> list = new ArrayList<>();
		PersonalDetails personalDetails = new PersonalDetails(1,1, "dcbj33", "83eb3", "o+",MarritalStatus.valueOf("SINGLE"),"web321");
		list.add(personalDetails);
		
		ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);
		PersonalDetailsData personalDetailsData = new PersonalDetailsData(1);
		Future<List<PersonalDetails>> futureTask2 = executor1.submit(personalDetailsData);
		List<PersonalDetails> personalDetails1 = futureTask2.get();
		
		
		assertEquals(list,personalDetails1);
		
		
	}

}
