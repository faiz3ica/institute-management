package com.ics.institute.model.dto;

import lombok.Data;

@Data
public class CourseDTO {
	private int courseId;
	private String courseName;
	private String description;
	private int fees;
	private int duration;
}
