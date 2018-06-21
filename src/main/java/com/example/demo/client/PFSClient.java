package com.example.demo.client;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;


public class PFSClient {

    private HttpPost httpPost;

    public PFSClient(HttpPost httpPost) {

        this.httpPost = httpPost;
    }

    public CloseableHttpResponse fetchResponse() throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        return client.execute(httpPost);
    }

//    public PFSClient(httppost) {
//
//    }
//
//    public fetchResponse(){
//        // execute a request to url in the httppost object
//
//    }

}
