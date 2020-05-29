package com.ims.c03action;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @author: GaoXu
 * @date: 2020/5/24
 * @desc：请对类进行描述
 */
public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        //httpclient测试爬取百度云  分享资源div为空
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet("https://pan.baidu.com/share/home?uk=305605848#category/type=0");
        httpget.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:50.0) Gecko/20100101 Firefox/50.0");
        CloseableHttpResponse response = httpclient.execute(httpget);
        HttpEntity entity=response.getEntity();
        System.out.println("网页内容："+ EntityUtils.toString(entity, "utf-8"));
        response.close();

        //httpunit爬取百度云 等待解析js在获取页面内容
        WebClient webClient=new WebClient(BrowserVersion.CHROME);
        HtmlPage page=webClient.getPage("https://pan.baidu.com/share/home?uk=305605848#category/type=0");
        Thread.sleep(10000);
        System.out.println("网页html:"+page.asXml());
        webClient.close();
    }
}
