package com.chapter03;

import org.springframework.context.ApplicationEvent;

public class CourseFullEvent extends ApplicationEvent {
	private Course course;
	public CourseFullEvent(Object source, Course course) {
		super(source);
		this.setCourse(course);
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
}
