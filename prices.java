import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class prices implements Iprice {
    @Override
    public void getbanner() {
        for (int i=0;i<80;i++){
            System.out.print("#");
        }

    }

    @Override
    //Get Values from Website
    public void getui() throws IOException {
        final String link ="https://altin.in/";
        Document doc = Jsoup.connect(link).get();
        usd = Float.parseFloat(doc.select("h2#dfiy").get(0).text());
        eur = Float.parseFloat(doc.select("h2#efiy").get(0).text());
        gbp = Float.parseFloat(doc.select("h2#sfiy").get(0).text());
        xau = doc.select("h2#ofiy").get(0).text();

        System.out.println("  USD"+"                     "+"EUR"+"                       "+"GBP "+"                "+"XAU");
        System.out.println("  "+usd+"                   "+eur+"                   "+gbp+"            "+xau);





    }

    protected float usd;
    protected float eur;
    protected float gbp;
    protected String xau;









}
