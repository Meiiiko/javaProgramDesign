package Tasks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//复制图片
public class YL7_2 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\user\\Pictures\\树的早晨\\第二次约会1.jpg");
            fileOutputStream = new FileOutputStream("C:\\Users\\user\\Pictures\\树的早晨\\DateTwo.jpg");
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
            System.out.println("图片复制成功");
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }
        }
    }
}


