package lhf.test.jsoupTest;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class Test1 {

    @Test
    public void  t1() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://blog.java1234.com/index.html");

        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity httpEntity = response.getEntity();

        String content = EntityUtils.toString(httpEntity);
        response.close();

        //System.out.println(content);

        Document document = Jsoup.parse(content);
        Element title = document.getElementsByTag("title").first();
        Elements dateElements = document.select(".datas .date");
        for (Element element:dateElements){
            Elements a = element.getElementsByTag("a");
            System.out.println(a.text()+"===="+a.attr("href"));
        }
        System.out.println("title:"+title.text());

    }
}
