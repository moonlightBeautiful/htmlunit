简介：
    httpunit，被誉为java浏览器的开源实现，是一个没有界面的浏览器。
    有些网站是用js生成的页面，httpclient抓取不到的，要使用httpunit。httpunit采用rhinojs模拟js运行。
    httpunit小项目中可以，抓取多了就会很慢。httpclient+jsoup速度快，所以httpunit混合httpclient+jsoup使用。
    根据爬取的目标选择httpunit还是httpclient+jsoup。
编码
    1.引入jar包，就一个
    2.爬取网页
        WebClient webClient = new WebClient();
        HtmlPage page = webClient.getPage("http://www.java1234.com");
        webClient.close();
用法
    1.模拟浏览器请求
    2.获取dom元素 
        xpath很重要
        每一个标签都被httpunit封装成了特定的类
    3.使用代理ip
        66ip网站找，如果ip不管用，再换一个。
        有时候代理ip不管用
    4.取消css、JavaScript支持
    5.模拟按钮点击
实战
    爬取百度云资源
        1.httpclient爬取，爬取不到，因为资源都是用ajax请求，js设置进去的。
            通过找到ajax请求能使用httpclient爬取，但是很麻烦
        2.httpunit爬取，不要立马获取页面内容，等待10几秒待获取，给点时间解析js。
            不知道等待几秒js才解析完：for循环，判断分享资源div是否有数据，循环3次就可以。