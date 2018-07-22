package com.example.spring.basics.revision;

public class BinarySearchImpl {

	private SortAlgorithm sortAlgorithm;


	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}


	public void sorting() {
		sortAlgorithm.sort(new int[] { 1, 2, 3, 4 });
	}
	

}
