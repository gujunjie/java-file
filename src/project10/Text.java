package project10;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Text {

	public static void main(String[] args) throws IOException {
		
		/*
		 *  getName()   �����ļ���
			getPath()      �����ļ����·��
			getAbsoluteFile()    ���ش�����·�����ļ���
			getAbsolutePath()  �����ļ�����·��
			getParent()      �����ļ��ϲ�Ŀ¼
			renameTo(file  newfile)   ������
		 */
		
		
		File file=new File("D:\\abc\\abc.txt");
		File file2=new File("d:\\abc\\edg.txt");
		
		
		System.out.println(file.getName());
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
		//System.out.println(file.renameTo(file2));//��������Ҫ��file������ڣ�file2���벻����
		
		
		
		/*
		 *   exists() �ļ��Ƿ����
			 canWrite()  �ļ��Ƿ��д
			 canRead()  �ļ��Ƿ�ɶ�
			 isFile()  �Ƿ�Ϊ�ļ�
			 isDirectory() �Ƿ�Ϊ�ļ���
			 lastModified()  ������޸�ʱ��
			 length()  �ļ���С
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
		 *   createNewFile()  �½��ļ�
			 delete()  ɾ���ļ�
			 mkDir()  �½��ļ�Ŀ¼�����ϲ�Ŀ¼�����ڣ��򲻴���
			 mkDirs()   ���ϲ�Ŀ¼�����ڣ���һ������
			 list()  ����һ��String���飬Ԫ��ΪĿ¼�µ��ļ���
			 listFiles()  ����һ��File���飬Ԫ��ΪĿ¼�µ��ļ�

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
