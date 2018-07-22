package com.example.spring.basics.revision;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Quick")
public class QuickSortAlgorithm implements SortAlgorithm {
	public int sort(int[] num) {
		System.out.println("Inside Quick sort algorithm");
		return 3;
	}
}
