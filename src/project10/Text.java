package project10;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Text {

	public static void main(String[] args) throws IOException {
		
		/*
		 *  getName()   返回文件名
			getPath()      返回文件相对路径
			getAbsoluteFile()    返回带绝对路径的文件名
			getAbsolutePath()  返回文件绝对路径
			getParent()      返回文件上层目录
			renameTo(file  newfile)   重命名
		 */
		
		
		File file=new File("D:\\abc\\abc.txt");
		File file2=new File("d:\\abc\\edg.txt");
		
		
		System.out.println(file.getName());
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
		//System.out.println(file.renameTo(file2));//重命名，要求file必须存在，file2必须不存在
		
		
		
		/*
		 *   exists() 文件是否存在
			 canWrite()  文件是否可写
			 canRead()  文件是否可读
			 isFile()  是否为文件
			 isDirectory() 是否为文件夹
			 lastModified()  最近的修改时间
			 length()  文件大小
		 * 
		 */
		System.out.println(file.exists());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.isFile());
		System.err.println(file.isDirectory());
		System.out.println(new Date(file.lastModified()));
		System.out.println(file.length());
		
		/*
		 *   createNewFile()  新建文件
			 delete()  删除文件
			 mkDir()  新建文件目录，如上层目录不存在，则不创建
			 mkDirs()   如上层目录不存在，则一并创建
			 list()  返回一个String数组，元素为目录下的文件名
			 listFiles()  返回一个File数组，元素为目录下的文件

		 */
		
		File file3=new File("d:\\abc\\hij.txt");
		if(!file3.exists())
		{
			file3.createNewFile();
		}
		
		file2.delete();
		
		File file4=new File("d:\\abc\\hello");
		if(!file4.exists())
		{
			file4.mkdir();
		}
		
		File file5=new File("d:\\abc\\son\\of\\a\\bitch");
		if(!file5.exists())
		{
			file5.mkdirs();
		}
		
		String[] fileName=file4.list();
		
		for(String s:fileName)
		{
			System.out.println(s);
		}
		
		File[] fileArray=file4.listFiles();
		for(File f:fileArray)
		{
			System.out.println(f.getName());
		}
	}

}
