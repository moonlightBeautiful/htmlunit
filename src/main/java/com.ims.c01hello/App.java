package com.ims.c01hello;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 * @author: GaoXu
 * @date: 2020/5/24
 * @desc：请对类进行描述
 */
public class App {
    public static void main(String[] args) throws IOException {
        // 实例化Web客户端
        WebClient webClient = new WebClient();
        // 解析获取页面
        HtmlPage page = webClient.getPage("http://www.java1234.com");
        System.out.println("网页html:" + page.asXml());
        System.out.println("==================================");
        System.out.println("网页文本：" + page.asText());
        // 关闭客户端，释放内存
        webClient.close();
    }
}
