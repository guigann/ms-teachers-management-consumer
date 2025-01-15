package com.guigan.consumer.infrastruture.event.kafka;

import com.guigan.consumer.kafka.contracts.Event;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class TeacherEventConsumerImpl implements TeacherEventConsumer{
    @Override
    public void consume(ConsumerRecord<String, Event> event) {
        log.info("[CONSUMER] - [TeacherEventConsumerImpl.class] - Evento consumido: {}", event);
    }
}
