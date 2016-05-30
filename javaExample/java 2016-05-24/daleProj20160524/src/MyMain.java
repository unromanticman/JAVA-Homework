import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MyMain {

	public static void main(String[] args) throws Exception {
//		pract01(); //自訂buffer
//		pract02(); //使用BufferedReader
//		pract03(); //讀檔與寫檔
//		pract04(); //String的常用功能
		pract05("。！？");
	}

	public static void pract01() throws Exception {
		char[] buff = new char[128];
		FileReader fr = new FileReader("C:\\temp\\news20160524.txt");
//		FileReader fr = new FileReader("C:/temp/news20160524.txt");  //亦可使用 / 
		int num=0;
		while((num=fr.read(buff))!=-1) {
			for (int i=0;i<num;i++) {
				System.out.print(buff[i]);
			}
		}	
		fr.close();
	}
	
	public static void pract02() throws Exception {
		FileReader fr = new FileReader("C:\\temp\\news20160524.txt");
        BufferedReader bfr = new BufferedReader(fr);
        String str="";
        while ((str=bfr.readLine())!=null) {
        	System.out.println(str);
        }
	
		fr.close();		
	}
	
	public static void pract03() throws Exception {
		FileReader fr = new FileReader("C:\\temp\\news20160524.txt");
        BufferedReader bfr = new BufferedReader(fr);
        FileWriter fw = new FileWriter("C:\\temp\\news20160524.out");
        BufferedWriter bfw = new BufferedWriter(fw);
        String str="";
        while ((str=bfr.readLine())!=null) {
        	bfw.write(str);
        	bfw.newLine();
        }
        bfw.flush();
		fr.close();	
		bfw.close();
	}
	
	public static void pract04() {
		String str="abcdeabcdefghi";
		System.out.println(str.charAt(0));          //回傳index0的字元
		System.out.println(str.isEmpty());          //判斷字串是否為空字串
		System.out.println(str.length());           //回傳字串長度
		System.out.println(str.equals("abcdeabcdefghi"));  //判斷是否與"abcdeabcdefghi"相同
		System.out.println(str.concat("XYZ"));      //和"XYZ"串再一起
		System.out.println(str.indexOf("abc"));     //回傳"abc"第一次出現的index
		System.out.println(str.indexOf("abc",1));   //從index1開始找，回傳"abc"第一次出現的index
		System.out.println(str.indexOf("abX"));     //回傳-1
		System.out.println(str.startsWith("abc"));  //判斷字首是否是"ghi"
		System.out.println(str.endsWith("ghi"));    //判斷字尾是否是"ghi"
		System.out.println(str.substring(3));       //取index3至最後
		System.out.println(str.substring(3,6));     //取index3到5(6之前)
		System.out.println(str.trim());             //去除前後的空白
	}
	
	public static void pract05(String seperator) throws Exception {
		boolean isSeperator=false;
		FileReader fr = new FileReader("C:\\temp\\news20160524.txt");
        BufferedReader bfr = new BufferedReader(fr);
        FileWriter fw = new FileWriter("C:\\temp\\news20160524.out");
        BufferedWriter bfw = new BufferedWriter(fw);
        String str="",strAll="";
        while ((str=bfr.readLine())!=null) {
        	strAll=strAll+str;
        }

        for(int i=0;i<strAll.length();i++) {
        	//前面已經將 isSeperator 設為 true 時，直到目前的字元不是'」'就斷行，並將 isSeperator 設為 false
        	if (isSeperator && strAll.charAt(i)!='」') {
        		bfw.newLine();
        		isSeperator=false;
        	}
        	bfw.write(strAll.charAt(i));
        	//只要遇到分段符號 seperator 就將 isSeperator 旗標設為 true，直到斷行後再關掉
        	if (seperator.indexOf(strAll.charAt(i))!=-1) {
        		isSeperator=true;
        	}
        }
        bfw.flush();
		fr.close();	
		bfw.close();		
	}
}
