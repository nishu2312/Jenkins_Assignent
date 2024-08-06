package com.nishantgupta.JMA2.Sorting;

import java.util.Comparator;
import java.util.List;

import com.nishantgupta.JMA2.Dto.UserDTO;

public class AgeSortingStrategy implements SortingStrategy {

    public void applySort(List<UserDTO> userList) {
        userList.sort(Comparator.comparingInt(userDTO -> Integer.parseInt(userDTO.getAge())));
    }
}
