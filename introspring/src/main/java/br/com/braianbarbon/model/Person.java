package br.com.braianbarbon.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Person {
private String name;
private String email;
private String cellPhone;
@JsonFormat(pattern = "YYYY-MM-dd")
private LocalDate birthDay;

public Person(String name, String email, String cellPhone, LocalDate birthDay) {
	this.name = name;
	this.email = email;
	this.cellPhone = cellPhone;
	this.birthDay = birthDay;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCellPhone() {
	return cellPhone;
}
public void setCellPhone(String cellPhone) {
	this.cellPhone = cellPhone;
}
public LocalDate getBirthDay() {
	return birthDay;
}
public void setBirthDay(LocalDate birthDay) {
	this.birthDay = birthDay;
}



}
