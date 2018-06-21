package com.example.demo.client;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.apache.http.impl.client.HttpClients.createDefault;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PFSClientTest {

    @Test
    public void returnsOKforAValidRequest() throws IOException {
            CloseableHttpClient client = createDefault();
            HttpPost httpPost = new HttpPost("http://localhost:4001");
            PFSClient pfsClient = new PFSClient(httpPost);

            CloseableHttpResponse response = pfsClient.fetchResponse();

            assertThat(response.getStatusLine().getStatusCode(), equalTo(200));
            client.close();

    }
}
