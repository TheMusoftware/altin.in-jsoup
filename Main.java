import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        prices prices=new prices();
        macbook macbook=new macbook();

        for (int i=0;i<9999;i++){
            TimeUnit.SECONDS.sleep(3);
            prices.getbanner();
            prices.getui();
            prices.getbanner();

        }





    }
}