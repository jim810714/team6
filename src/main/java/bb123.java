
		import java.io.BufferedInputStream;
		import java.io.BufferedOutputStream;
		import java.io.FileOutputStream;
		import java.io.IOException;
		import java.io.InputStream;
		import java.net.MalformedURLException;
		import java.net.URL;

public class bb123 {


			public static void main(String[] args) throws MalformedURLException  {
				URL url = new URL("https://cdn2.ettoday.net/images/1136/d1136498.jpg");
			
				try(InputStream is = url.openStream();
					BufferedInputStream bis = new BufferedInputStream(is);
					
					FileOutputStream fos = new FileOutputStream("c:\\iii\\a.png");
					BufferedOutputStream bos = new BufferedOutputStream(fos);
				){
					//假設下載圖片共1026 Bytes
					byte[] buffer = new byte[1024];
					int length;
					while ((length = bis.read(buffer)) != -1) {
						bos.write(buffer,0,length);
					}
					System.out.println("finish");
				}catch (IOException e) {
					e.printStackTrace();
				}

			}
}