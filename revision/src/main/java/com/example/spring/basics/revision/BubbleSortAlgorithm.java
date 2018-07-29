package com.example.spring.basics.revision;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
	public int sort(int[] num) {
		System.out.println("Inside bubble sort algorithm");
		return 3;
	}
}
