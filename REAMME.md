简介：
    httpunit，被誉为java浏览器的开源实现，是一个没有界面的浏览器。
    有些网站是用js生成的页面，httpclient抓取不到的，要使用httpunit。httpunit采用rhinojs模拟js运行。
    httpunit小项目中可以，抓取多了就会很慢。httpclient+jsoup速度快，所以httpunit混合httpclient+jsoup使用。
    根据爬取的目标选择httpunit还是httpclient+jsoup。
编码
    1.引入jar包，就一个
    2.