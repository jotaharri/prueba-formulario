package com.globalia.belive.prueba.models;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class UserModel {

	private String name;
	private String lastName;
	private String phone;
	private String email;
	// Conversion de fecha
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dateBird;
	private String password;
	
}