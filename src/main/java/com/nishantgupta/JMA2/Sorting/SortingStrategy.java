package com.nishantgupta.JMA2.Sorting;

import java.util.List;

import com.nishantgupta.JMA2.Dto.UserDTO;

public interface SortingStrategy {
	
	 void applySort(List<UserDTO> userList);

}
