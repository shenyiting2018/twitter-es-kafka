package com.yiting.twittereskafka;

import com.google.common.collect.Lists;
import com.twitter.hbc.core.Constants;
import com.twitter.hbc.core.Hosts;
import com.twitter.hbc.core.HttpHosts;
import com.twitter.hbc.core.endpoint.StatusesFilterEndpoint;
import com.twitter.hbc.httpclient.auth.Authentication;
import com.twitter.hbc.httpclient.auth.OAuth1;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TwitterProducer {

    public TwitterProducer(){}



    public void createTwitterClient() {
        BlockingQueue<String> msgQueue = new LinkedBlockingQueue<String>(100000);

        Hosts hosebirdHosts = new HttpHosts(Constants.STREAM_HOST);
        StatusesFilterEndpoint hosebirdEndpoint = new StatusesFilterEndpoint();

        List<String> terms = Lists.newArrayList("kafka");
        hosebirdEndpoint.trackTerms(terms);

        Authentication hosebirdAuth = new OAuth1("consumerKey", "consumerSecret", "token", "secret");

    }

    public void run() {
        // Create a Twitter client

        // Create a Kafka producer

        // Loop to send tweets to Kafka
    }

    public static void main(String[] args) {
        new TwitterProducer().run();
    }
}
