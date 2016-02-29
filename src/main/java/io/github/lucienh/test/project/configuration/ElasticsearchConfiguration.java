package io.github.lucienh.test.project.configuration;

import org.apache.log4j.Logger;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@ConfigurationProperties(prefix = "elasticsearch")
@EnableElasticsearchRepositories(basePackages = ProjectConfig.PATH + ".dao.es")
public class ElasticsearchConfiguration {
    private static final Logger logger = Logger.getLogger(ElasticsearchConfiguration.class.getName());
    private String clusterName;
    private String nodes;

    public ElasticsearchConfiguration() {
    }

    public ElasticsearchConfiguration(String clusterName, String nodes) {
        this.clusterName = clusterName;
        this.nodes = nodes;
    }

    @Bean
    public Client client() {
        logger.info("Es : clusterName -> " + clusterName + " nodes -> " + nodes);
        Settings settings = ImmutableSettings.settingsBuilder().put("cluster.name", clusterName).build();
        TransportClient client = new TransportClient(settings);
        for (String clusterNode : nodes.split(",")) {
            String ip = clusterNode.split(":")[0];
            String port = clusterNode.split(":")[1];
            client.addTransportAddress(new InetSocketTransportAddress(ip, Integer.parseInt(port)));
        }
        return client;
    }

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchTemplate(client());
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getNodes() {
        return nodes;
    }

    public void setNodes(String nodes) {
        this.nodes = nodes;
    }
}
