/*
 * package com.producer.config.topic;
 * 
 * import java.util.HashMap; import java.util.Map;
 * 
 * import org.apache.kafka.clients.admin.AdminClientConfig; import
 * org.apache.kafka.clients.admin.NewTopic; import
 * org.springframework.beans.factory.annotation.Value; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.kafka.config.TopicBuilder; import
 * org.springframework.kafka.core.KafkaAdmin;
 * 
 * @Configuration public class TopicConfig {
 * 
 * @Value(value = "${general.topic.name}") private String topicName;
 * 
 * @Value(value = "${employee.topic.name}") private String employeeName;
 * 
 * 
 * @Bean public NewTopic generalTopics() { return
 * TopicBuilder.name("loan-process") .partitions(4) .replicas(1) .build(); }
 * 
 * @Bean public NewTopic generalTopic() { return
 * TopicBuilder.name("customer-loan-topic100") .partitions(4) .replicas(1)
 * .build(); }
 * 
 * 
 * @Bean public NewTopic employeeTopic() { return
 * TopicBuilder.name(employeeName) .partitions(5) .replicas(1) .build(); }
 * 
 * @Value(value = "${kafka.bootstrapServers:localhost:9092}") private String
 * bootstrapServers;
 * 
 * @Bean public KafkaAdmin kafkaAdmin() { Map<String, Object> configs = new
 * HashMap<>(); // Depending on you Kafka Cluster setup you need to configure //
 * additional properties!
 * configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
 * return new KafkaAdmin(configs); }
 * 
 * }
 */