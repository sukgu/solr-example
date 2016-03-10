package com.sushil.myapp.solr;

import javax.annotation.Resource;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@Configuration
@EnableSolrRepositories(basePackages={"com.sushil.myapp.solr"}, multicoreSupport=true)
public class SolrContext {

  static final String SOLR_HOST = "http://localhost:8983/solr/techproducts";

  @Resource private Environment environment;

  @Bean
  public SolrServer solrServer() {
    String solrHost = environment.getRequiredProperty(SOLR_HOST);
    return new HttpSolrServer(solrHost);
  }
}
