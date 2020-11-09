package com.eh.cxf;

import lombok.SneakyThrows;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class ClientTest {
    @SneakyThrows
    public static void main(String[] args) {
        // 创建HttpClient实例
        HttpClient httpClient = HttpClients.custom().build();
        // 调用
        HttpResponse httpResponse = httpClient.execute(new HttpGet("http://localhost:9999/hello/book/1"));
        // 将InputStream转换成String输出
        System.out.println(EntityUtils.toString(httpResponse.getEntity()));
    }
}
