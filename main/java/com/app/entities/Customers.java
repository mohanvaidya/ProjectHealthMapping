
package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "customers")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customers extends BaseEntity {
	@Column(name = "first_name",length  = 20)

	private String firstname;

	@Column(name = "last_name", length  = 20)

	private String lastname;

	@Column(length = 20)

	private int age;

	@Column(length = 20)

	private int height;

	@Column(length = 20)

	private int weight;

	@Column(length = 50)
	private String HealthChallenges;

	//@Column(length = 20, nullable = false)
 @Transient


	    
	private int BMI;

    // BMI formula: weight(kg) / height(m^2)
//	@Column(length = 20, nullable = false)

	private int BMR;

	//@Column(length = 20, nullable = false)

	private int musclemass;

	//@Column(length = 20, nullable = false)

	private int TSF;

//	@Column(length = 20, nullable = false)

	private int Bio_age;

	public double calculateBMI() {
        double heightInMeters = height / 100; // Convert height to meters
        return weight / (heightInMeters * heightInMeters);} 
}
