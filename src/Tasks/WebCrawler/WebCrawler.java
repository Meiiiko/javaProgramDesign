package Tasks.WebCrawler;

import java.util.ArrayList;
import java.util.Scanner;
public class WebCrawler {
    private String webUrl;
    public WebCrawler(String webUrl) {
        this.webUrl = webUrl;
    }
    public void getUrl(){
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add(webUrl);
        while(!list1.isEmpty()&&list2.size()<=20){
            String urlString = list1.remove(0);
            if(!list2.contains(urlString)){
                list2.add(urlString);
                System.out.println("发现URL："+urlString);
                for (String s:getSubURL(urlString)){
                    if(!list2.contains(s)){
                        list1.add(s);
                    }
                }
            }
        }
        System.out.println("运行结束");
        }
    private ArrayList<String> getSubURL(String urlString){
        ArrayList<String> list = new ArrayList<>();
            try {
                java.net.URL url = new java.net.URL(urlString);
                Scanner val = new Scanner(url.openStream());
                int current = 0;
                while (val.hasNext()){
                    String line = val.nextLine();
                    current=line.indexOf("http://",current);
                    while (current>0){
                        int endIndex = line.indexOf("\"",current);
                        if(endIndex>0){
                            list.add(line.substring(current,endIndex));
                            current=line.indexOf("http://"+endIndex);
                        }else {
                            current=-1;
                        }
                    }
                    val.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return list;
    }
}
