package Tasks.WebCrawler;

public class SX7 {
    public static void main(String[] args) {
        java.util.Scanner val = new java.util.Scanner(System.in);
        System.out.println("输入一个Web网站的URL：");
        String url = val.nextLine();
        val.close();
        WebCrawler crawler = new WebCrawler(url);
        crawler.getUrl();
    }
}
