package ex13_3;
import java.io.*;

//import com.sun.jndi.url.rmi.rmiURLContext; 
public class ex13_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			FileInputStream fileInputStream=new FileInputStream("D:\\eclipse\\java_ee\\HelloWord\\src\\ex13_3\\ex13_8.java");
			InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream,"UTF-8");//加上字符串整理功能
			FileOutputStream fileOutputStream=new FileOutputStream("D:\\eclipse\\java_ee\\HelloWord\\src\\ex13_3\\ex13_8.bak");
			OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream);//加上字符串整理功能
			int ch=0;
			//一字符方式显示文本
			while((ch=inputStreamReader.read())!=-1) {
				System.out.print((char) ch);//输出字符
				outputStreamWriter.write(ch);
			}
			System.out.println();
			inputStreamReader.close();
			outputStreamWriter.close();


			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
