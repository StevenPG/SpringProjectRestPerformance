package com.stevenpg.restperformance.springintegration;

import org.springframework.integration.transformer.Transformer;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class NotFoundExceptionHandler implements Transformer
{

    @Override
    public Message<?> transform(Message<?> message) {
        return null;
    }
}
