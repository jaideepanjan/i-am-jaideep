package com.hp.streem.boot;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

import com.hp.streem.constants.Typee;
import com.hp.streem.dto.WeaponDTO;

public class WeaponRunner {

	public static void main(String[] args) {
		
		Collection<WeaponDTO> weaponDTOs=new LinkedHashSet<WeaponDTO>();


		weaponDTOs.add (new WeaponDTO("Bow", "Glock", "Metal", 2458, Typee.IMPACT));
		weaponDTOs.add (new WeaponDTO("Greatsword", "Glock", "Metal", 26458, Typee.IMPACT));
		weaponDTOs.add (new WeaponDTO("Grimoire", "Glock", "Metal", 456, Typee.IMPACT));
		weaponDTOs.add (new WeaponDTO("Longsword", "Glock", "Metal", 46885, Typee.IMPACT));
		weaponDTOs.add (new WeaponDTO("Royal Spear", "Glock", "Metal", 466958, Typee.FIREARM));
		weaponDTOs.add (new WeaponDTO("Kunai ", "Glock", "Metal", 45886, Typee.THROWING));
		weaponDTOs.add (new WeaponDTO(" Chakram", "Glock", "Metal", 4698, Typee.THROWING));
		weaponDTOs.add (new WeaponDTO(" Shurikan", "Glock", "Metal", 46922, Typee.THROWING));
		weaponDTOs.add (new WeaponDTO(" Knives", "Glock", "Metal", 348565, Typee.THROWING));
		weaponDTOs.add (new WeaponDTO("Ryyk Blade", "Glock", "Metal", 4685, Typee.BLADED));
		weaponDTOs.add (new WeaponDTO("Vibraknucklers", "Glock", "Metal", 9512, Typee.BLADED));
		weaponDTOs.add (new WeaponDTO("Shotgun", "Glock", "Metal", 9874, Typee.FIREARM));
		weaponDTOs.add (new WeaponDTO(" Pistol", "Glock", "Metal", 65478, Typee.FIREARM));
		weaponDTOs.add (new WeaponDTO(" Revolver", "Glock", "Metal", 9745, Typee.FIREARM));
		weaponDTOs.add (new WeaponDTO("Torpedo ", "Glock", "Metal", 45865, Typee.EXPLOSIVE));
		weaponDTOs.add (new WeaponDTO("Rifle", "Glock", "Metal", 87756, Typee.EXPLOSIVE));
		weaponDTOs.add (new WeaponDTO("Rocket", "Glock", "Metal", 8887, Typee.EXPLOSIVE));
		weaponDTOs.add (new WeaponDTO("Field Gun", "Glock", "Metal", 8585, Typee.ARTILLERY));
		weaponDTOs.add (new WeaponDTO("Howitzer", "Glock", "Metal", 85596, Typee.ARTILLERY));
		weaponDTOs.add (new WeaponDTO("Mortar ", "Glock", "Metal", 45546, Typee.ARTILLERY));
		
		
		System.out.println("Printing the collection" );
		
		weaponDTOs.stream().forEach(ele->System.out.println(ele));
		System.out.println("Printing weapons price greater than 100");
		weaponDTOs.stream()
		.filter(dto->dto.getPrice()>100).collect(Collectors.toList())
		.forEach(ele->System.out.println(ele));
		
		System.out.println("Printing Weapons based on Madeby and madeof");
		
		weaponDTOs.stream().collect(Collectors.toList())
		.forEach(ele->System.out.println(ele.getMadeBy()+" "+ele.getMadeOf()));
		
		System.out.println("Printing Weapons names in descending order ");
		weaponDTOs.stream()
		.sorted().forEach(ele->System.out.println(ele.getName()));
		
		System.out.println("Printing the weapons based on names short by Madeby ");
		
		weaponDTOs.stream()
		.collect(Collectors.toList())
		.forEach(ele->System.out.println(ele.getMadeOf()));
		
		System.out.println("Printing weapons shorted by madeof ");
		weaponDTOs.stream()
		.forEach(m->System.out.println(m.getMadeOf()));
		
		System.out.println("Printing the weapons based on Shorted by price ");
		
		weaponDTOs.stream()
		.collect(Collectors.toList())
		.forEach(m->System.out.println(m.getPrice()));
		
		System.out.println("Printing weapons based on shorted by price in descending");
		
		weaponDTOs.stream()
		.sorted((j1,j2)->j2.getPrice().compareTo(j1.getPrice()))
		.forEach(j->System.out.println(j.getPrice()));
		
		System.out.println("Printing weapons based on Short by name and madeof in accending");
		
		weaponDTOs.stream()
		.sorted(n1,n2)->(n1.getName().compareTo(n2.getName()))
		.sorted(n1,n2)->(n1.getMadeOf().compareTo(n2.getMadeOf()))
		.forEach(n->System.out.println(n.getName()+" "+n.getMadeOf()));
		
		System.out.println("Printing weapon based sorted by type, madeby and name in descending ");
		
		weaponDTOs.stream()
		.sorted(n1,n2)->(n2.getType().compareTo(n1.getType()))
		.sorted(n1,n2)->(n2.getMadeOf().compareTo(n1.getMadeOf()))
		.sorted(n1,n2)->(n2.getName().compareTo(n1.getName()))
		.forEach(t->System.out.println(t.getType()+" "+t.getMadeBy()+" "+t.getName()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
