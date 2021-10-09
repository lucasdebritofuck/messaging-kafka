package br.com.lucasfuck.messaging.topic;

import org.apache.commons.lang3.StringUtils;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Component;

@Component
public class TopicProviderImpl implements TopicProvider {

    @Override
    public void create(String topicName) {
        if (StringUtils.isEmpty(topicName))
            return;

        TopicBuilder.name(topicName)
                .partitions(1)
                .build();
    }
}
