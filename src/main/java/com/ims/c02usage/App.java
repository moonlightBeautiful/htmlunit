package com.ims.c02usage;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;

import java.io.IOException;
import java.util.List;

/**
 * @author: GaoXu
 * @date: 2020/5/24
 * @desc��������������
 */
public class App {
    public static void main(String[] args) throws IOException {
        //1.ģ����������� 3.ʹ�ô���ip
        WebClient webClient = new WebClient(BrowserVersion.CHROME/*,"163.204.241.149",9999*/);
        //4.ȡ��css��JavaScript֧��
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setJavaScriptEnabled(false);

        // ������ȡҳ��
        HtmlPage page = webClient.getPage("https://www.baidu.com/");
        /*System.out.println("��ҳhtml:" + page.asXml());*/

        //2.1 ����ָ��id��html domԪ��
        /*HtmlDivision div = page.getHtmlElementById("navMenu");
        System.out.println(div.asXml());*/
        //2.2 ����tag���Ʋ�ѯ����tag
        /*DomNodeList<DomElement> aList = page.getElementsByTagName("a");
        for (int i = 0; i < aList.getLength(); i++) {
            DomElement a = aList.get(i);
            System.out.println(a.asXml());
        }*/
        //2.3 xmpPath��ȡ html domԪ��
        /*List<HtmlSpan> spanList = page.getByXPath("//div[@id='navMenu']/ul/li[2]/a/span");
        System.out.println(spanList.get(0).asText());*/

        //5.ģ�ⰴť�ύ
        HtmlForm form = page.getFormByName("f");
        HtmlTextInput textField = form.getInputByName("wd");
        HtmlSubmitInput button = form.getInputByValue("�ٶ�һ��");
        textField.setValueAttribute("java");
        HtmlPage resultPage = button.click();
        System.out.println(resultPage.asXml());
        // �رտͻ��ˣ��ͷ��ڴ�
        webClient.close();
    }
}
