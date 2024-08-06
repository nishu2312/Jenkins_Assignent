package com.nishantgupta.JMA2.Sorting;

import java.util.Comparator;
import java.util.List;

import com.nishantgupta.JMA2.Dto.UserDTO;

public class NameSortingStrategy implements SortingStrategy {

	   public void applySort(List<UserDTO> userList) {
	        userList.sort(Comparator.comparing(UserDTO::getName));
	    }
	}