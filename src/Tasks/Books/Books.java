package Tasks.Books;
import java.util.ArrayList;
class Data {
    private static ArrayList<Books>list=new ArrayList<Books>();
    static int query(String id){
        int i = 0,index = -1;
        for (Books b : list){
            if(id.equals(b.id)){
                index = i;
                break;
            }
            i++;
        }
        return index;
    }
    static String add(Books b){
        list.add(b);
        return "添加成功";
    }
    static String editNum(String id,int num){
        Books b = list.get(query(id));
        b.num = b.num+num;
        list.set(query(id),b);
        return "要听假的图书已存在，仅更新库存.";
    }
    static String del(String id){
        list.remove(query(id));
        return "删除成功";
    }
    public static void show(String id){
        Books b = list.get(query(id));
        System.out.println(b.toString());
    }
    static void showAll(){
        if(list.size()==0){
            System.out.println("库中没有任何数据");
            return;
            }
        for(Books b:list){
            System.out.println(b.toString());
        }
    }
}
public class Books {
    public String id,name,author;
    public int num;

    public static void show(String id) {
        if(Data.query(id)==-1){
            System.out.println("要查询的编号不存在！");
        }else{
            Data.show(id);
        }
    }

    public static void showAll(){
        Data.showAll();
    }

    public static String del(String id){
        if(Data.query(id)==-1){
            return "要删除的数据不存在";
        }else {
            return Data.del(id);
        }
    }

    public boolean chkID(String id){
        char first = id.charAt(0);
        return Character.isLetter(first)&&id.length()==6;
    }

    public String add(){
        if(Data.query(id)==-1){
            return Data.add(this);
        }else{
            return Data.editNum(id,num);
        }
    }

    @Override
    public String toString() {
        return "Books{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", num=" + num +
                '}';
    }
}
