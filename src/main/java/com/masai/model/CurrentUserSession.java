package com.masai.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CurrentUserSession {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(unique = true)
	private Integer customerId;
	
	private String uuid;
	
	private LocalDateTime localDateTime;
	

	public CurrentUserSession(Integer customerId, String uuid, LocalDateTime localDateTime) {
		super();
		this.customerId = customerId;
		this.uuid = uuid;
		this.localDateTime = localDateTime;
	}
	
	
	
	
}