package com.xworkz.chats.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="chats_table")
public class ChatsEntity {
	
	@Id
	@Column(name="chat_id")
	private int id;
	
	@Column(name="chat_shop_name")
	private int shopName;
	
	@Column(name="chats_chats")
	private int chat;
	
	@Column(name="chats_toh")
	private int typeOfHandover;
	
	@Column(name="chats_mop")
	private int modeOfPayment;
	
	@Column(name="chats_quantity")
	private int quantity;
	
	@Column(name="chats_price")
	private int prime;
	
	

}
