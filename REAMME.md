��飺
    httpunit������Ϊjava������Ŀ�Դʵ�֣���һ��û�н�����������
    ��Щ��վ����js���ɵ�ҳ�棬httpclientץȡ�����ģ�Ҫʹ��httpunit��httpunit����rhinojsģ��js���С�
    httpunitС��Ŀ�п��ԣ�ץȡ���˾ͻ������httpclient+jsoup�ٶȿ죬����httpunit���httpclient+jsoupʹ�á�
    ������ȡ��Ŀ��ѡ��httpunit����httpclient+jsoup��
����
    1.����jar������һ��
    2.��ȡ��ҳ
        WebClient webClient = new WebClient();
        HtmlPage page = webClient.getPage("http://www.java1234.com");
        webClient.close();
�÷�
    1.ģ�����������
    2.��ȡdomԪ�� 
        xpath����Ҫ
        ÿһ����ǩ����httpunit��װ�����ض�����
    3.ʹ�ô���ip
        66ip��վ�ң����ip�����ã��ٻ�һ����
        ��ʱ�����ip������
    4.ȡ��css��JavaScript֧��
    5.ģ�ⰴť���
ʵս
    ��ȡ�ٶ�����Դ
        1.httpclient��ȡ����ȡ��������Ϊ��Դ������ajax����js���ý�ȥ�ġ�
            ͨ���ҵ�ajax������ʹ��httpclient��ȡ�����Ǻ��鷳
        2.httpunit��ȡ����Ҫ�����ȡҳ�����ݣ��ȴ�10�������ȡ������ʱ�����js��
            ��֪���ȴ�����js�Ž����꣺forѭ�����жϷ�����Դdiv�Ƿ������ݣ�ѭ��3�ξͿ��ԡ�