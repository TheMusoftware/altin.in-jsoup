import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class macbook  extends prices implements Iprice  {

    @Override
    public void getbanner() {

    }

    @Override
    public  void getui() throws IOException {
       final String link="https://www.trendyol.com/sr?attr=110|966383_1645&lc=103108&q=macbook%20pro%2016&qt=macbook%20pro%2016&st=macbook%20pro%2016&os=1";
        Document doc = Jsoup.connect(link).get();
       // String macid =doc.select("h3").get(0).text();
        String macprice =doc.select("prc-box-dscntd").get(0).text();

        System.out.println("  "+macprice);


    }
    public void mprice(){
        System.out.println();
    }
}
