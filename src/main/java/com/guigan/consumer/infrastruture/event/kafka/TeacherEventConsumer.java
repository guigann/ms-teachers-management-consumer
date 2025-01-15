package com.guigan.consumer.infrastruture.event.kafka;

import com.guigan.consumer.kafka.contracts.Event;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

public interface TeacherEventConsumer {
    @KafkaListener(topics = "${TOPIC_TEACHER_INFO:teacher-info-topic}", groupId = "${GROUP_ID:teacher-info-group}")
    void consume(ConsumerRecord<String, Event> event);
}
