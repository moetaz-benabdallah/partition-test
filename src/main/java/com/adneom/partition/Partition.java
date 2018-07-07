package com.adneom.partition;

import java.util.List;

/**
 * 
 * @author Moatez Ben Abdallah
 *
 */
public interface Partition {

	public List<List<Integer>> partition(List<Integer> list, Integer size);
	
	public List<List<Integer>> partitionWithoutLib(List<Integer> list, Integer size);
}
