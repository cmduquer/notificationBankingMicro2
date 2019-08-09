package com.microservicios2.clase2.notification.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.microservicios2.clase2.notification.stream.NotificationStreams;

@EnableBinding(NotificationStreams.class)
public class StreamsConfig {

}
