package com.greenhood.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "COMMENTS")
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private LocalDateTime timeStamp;
	
	@Size(min=0, max=5, message = "Please provide rating 0 to 5")
	private String commentString;
	
	private Float rating;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="planterId")
	private Planter planter;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customerId")
	private Customer customer;
	
//	@JsonIgnore
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "planter")
//	private List<Comment> comments = new ArrayList<>();

}
