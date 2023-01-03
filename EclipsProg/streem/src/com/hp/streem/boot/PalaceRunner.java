package com.hp.streem.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.hp.streem.dto.PalaceDTO;

public class PalaceRunner {

	public static void main(String[] args) {
		
		Collection<PalaceDTO> palaceDTOs=new ArrayList<PalaceDTO>();
		
        palaceDTOs.add(new PalaceDTO("Mysore Palace", "Mysore", "Maharaja Krishnaraja Wodeyar IV", false, 150D));
        palaceDTOs.add(new PalaceDTO("Banglure Palace", "Banglure", "King", false, 250D));
        palaceDTOs.add(new PalaceDTO("Shivappa Nayaka Palace", "Shivamogga", "Shivapp Nayaka", false, 100D));
        palaceDTOs.add(new PalaceDTO("Buckingham Palace", "London", "John Nash", true, 5000D));
        palaceDTOs.add(new PalaceDTO("Lalitha Mahal Palace", "Mysore", "Maharaja Krishnaraja Wodeyar ", false, 50));
        palaceDTOs.add(new PalaceDTO("Jaganmohan Palace", "Mysore", "Mummadi Krishnaraja Wodeyar", false, 20));
		
        
        palaceDTOs.stream().filter(dto->dto.isDestroyed()!=false).collect(Collectors.toSet()).forEach(dto->System.out.println(dto));

        
        long count=palaceDTOs.stream()
        		.filter(dto->dto.isDestroyed())
        		.count();
        System.out.println("Count of Destroyed palace : "+count);
	}

}
