package com.ics.institute.model.course;

import lombok.Data;

@Data
public class Course {
	private int courseId;
	private String courseName;
	private String description;
	private int fees;
	private int duration;
}
