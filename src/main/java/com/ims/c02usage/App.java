package com.ims.c02usage;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;

import java.io.IOException;
import java.util.List;

/**
 * @author: GaoXu
 * @date: 2020/5/24
 * @desc：请对类进行描述
 */
public class App {
    public static void main(String[] args) throws IOException {
        //1.模拟浏览器请求 3.使用代理ip
        WebClient webClient = new WebClient(BrowserVersion.CHROME/*,"163.204.241.149",9999*/);
        //4.取消css、JavaScript支持
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setJavaScriptEnabled(false);

        // 解析获取页面
        HtmlPage page = webClient.getPage("https://www.baidu.com/");
        /*System.out.println("网页html:" + page.asXml());*/

        //2.1 查找指定id的html dom元素
        /*HtmlDivision div = page.getHtmlElementById("navMenu");
        System.out.println(div.asXml());*/
        //2.2 根据tag名称查询所有tag
        /*DomNodeList<DomElement> aList = page.getElementsByTagName("a");
        for (int i = 0; i < aList.getLength(); i++) {
            DomElement a = aList.get(i);
            System.out.println(a.asXml());
        }*/
        //2.3 xmpPath获取 html dom元素
        /*List<HtmlSpan> spanList = page.getByXPath("//div[@id='navMenu']/ul/li[2]/a/span");
        System.out.println(spanList.get(0).asText());*/

        //5.模拟按钮提交
        HtmlForm form = page.getFormByName("f");
        HtmlTextInput textField = form.getInputByName("wd");
        HtmlSubmitInput button = form.getInputByValue("百度一下");
        textField.setValueAttribute("java");
        HtmlPage resultPage = button.click();
        System.out.println(resultPage.asXml());
        // 关闭客户端，释放内存
        webClient.close();
    }
}
