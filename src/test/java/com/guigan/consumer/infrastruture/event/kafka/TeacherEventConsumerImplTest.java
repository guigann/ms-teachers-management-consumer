package com.guigan.consumer.infrastruture.event.kafka;

import com.guigan.consumer.kafka.contracts.Event;
import com.guigan.consumer.kafka.contracts.Teacher;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class TeacherEventConsumerImplTest {

    private TeacherEventConsumerImpl teacherEventConsumerImpl;

    @BeforeEach
    void setUp() {
        teacherEventConsumerImpl = new TeacherEventConsumerImpl();
    }

    @Test
    void shouldConsumeEventSuccessfully() {
        final Event event1 = new Event();
        event1.setUuid("d7e06e0f-f45d-4f62-98c3-a07d8612ca08");
        event1.setCreatedDate("createdDate");
        final Teacher teacher = new Teacher();
        teacher.setId(0);
        teacher.setName("name");
        event1.setTeachers(List.of(teacher));
        final ConsumerRecord<String, Event> event = new ConsumerRecord<>("topic", 0, 0L, "key", event1);

        teacherEventConsumerImpl.consume(event);
    }
}
