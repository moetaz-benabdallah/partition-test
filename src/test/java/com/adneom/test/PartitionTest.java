package com.adneom.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.adneom.configuration.AppConfig;
import com.adneom.partition.Partition;

/**
 * 
 * @author Moatez Ben Abdallah
 *
 */
public class PartitionTest {
	
	private AbstractApplicationContext context;
	private Partition partitionService;
	
	public PartitionTest() {
		this.context = new AnnotationConfigApplicationContext(AppConfig.class);
		this.partitionService = (Partition) context.getBean("partitionService");
	}
	
	/**
	 * Test of partition method
	 */
	@Test
	public void shouldSplitListIntoNSublists() {
	    List<Integer> initList = new ArrayList<Integer>
	    		(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));	 
	    
	    List<List<Integer>> subSets = this.partitionService.partition(initList, 3);
	 
	    List<Integer> lastPartition = subSets.get(2);

	    List<Integer> expectedLastPartition = new ArrayList<Integer>(Arrays.asList(7, 8));
	    assertEquals(subSets.size(), 3);
	    assertEquals(lastPartition, expectedLastPartition);
	}
	

}
