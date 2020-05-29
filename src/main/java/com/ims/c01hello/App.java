package com.ims.c01hello;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 * @author: GaoXu
 * @date: 2020/5/24
 * @desc��������������
 */
public class App {
    public static void main(String[] args) throws IOException {
        // ʵ����Web�ͻ���
        WebClient webClient = new WebClient();
        // ������ȡҳ��
        HtmlPage page = webClient.getPage("http://www.java1234.com");
        System.out.println("��ҳhtml:" + page.asXml());
        System.out.println("==================================");
        System.out.println("��ҳ�ı���" + page.asText());
        // �رտͻ��ˣ��ͷ��ڴ�
        webClient.close();
    }
}
