package models;

import models.Course;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CourseTest {
    Course yogaCourse;

    @Before
    public void before(){
        yogaCourse = Course
                .builder()
                .courseName("Vinyasa")
                .town("Edinburgh")
                .rating(5)
                .build();
    }

    @Test
    public void checkHasName(){
        assertEquals("Vinyasa",yogaCourse.getCourseName());
    }

    @Test
    public void checkHasTown(){
        assertEquals("Edinburgh",yogaCourse.getTown());
    }

    @Test
    public void checkHasRating(){
        assertEquals(5, yogaCourse.getRating());
    }
}
