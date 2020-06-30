package com.app.minfo.util;

import com.app.minfo.model.Student;

public interface StudentUtil {

	public static void mapNotNullValues(Student source, Student student) {
		if(student!=null ) {
			if(student.getStdAddr()!=null) source.setStdAddr(student.getStdAddr());
			if(student.getStdCourse()!=null) source.setStdCourse(student.getStdCourse());
			if(student.getStdGen()!=null) source.setStdGen(student.getStdGen());
			if(student.getStdLangs()!=null && !student.getStdLangs().isEmpty()) source.setStdLangs(student.getStdLangs());
			if(student.getStdName()!=null) source.setStdName(student.getStdName());
		}
	}

}
