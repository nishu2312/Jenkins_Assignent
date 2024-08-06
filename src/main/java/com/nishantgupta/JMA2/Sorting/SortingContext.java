package com.nishantgupta.JMA2.Sorting;

import java.util.List;

import com.nishantgupta.JMA2.Dto.UserDTO;

public class SortingContext {

	   private SortingStrategy sortingStrategy;

	    public void setSortingStrategy(SortingStrategy sortingStrategy) {
	        this.sortingStrategy = sortingStrategy;
	    }

	    public void applySort(List<UserDTO> userList) {
	        sortingStrategy.applySort(userList);
	    }
	}