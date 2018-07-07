package com.adneom.partition.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.ListUtils;
import org.springframework.stereotype.Service;

import com.adneom.partition.Partition;

/**
 * 
 * @author Moatez Ben Abdallah
 *
 */
@Service("partitionService")
public class PartitionImpl implements Partition{
	
	/**
	 * @param list input list of integers
	 * @param size sub list size
	 * @return list of sublists after partition
	 */
	public List<List<Integer>> partition(List<Integer> list, Integer size) {
		return ListUtils.partition(list, size);
	}

	/**
	 * @param list input list of integers
	 * @param size sub list size
	 * @return list of sublists after partition
	 */
    public List<List<Integer>> partitionWithoutLib(List<Integer> list, Integer size) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        ArrayList<Integer> subList = new ArrayList<Integer>();
        int resultListIndex = 0;
        int subListIndex;
        while (resultListIndex < list.size()) {
            subList.clear();
            for (subListIndex = 0; subListIndex < size; subListIndex++) {
                if ((subListIndex + resultListIndex) < list.size()) {
                    subList.add(list.get(resultListIndex + subListIndex));
                }
            }
            resultList.add((ArrayList<Integer>) subList.clone());
            resultListIndex += size;
        }
        return resultList;
    }
}
