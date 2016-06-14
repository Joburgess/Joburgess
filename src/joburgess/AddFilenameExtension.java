package joburgess;

import java.io.File;

public class AddFilenameExtension {

	public boolean changeFilenameExtension(String oldPath,String newPath){
		File oldDirect=new File(oldPath);
		
		if(oldDirect!=null&&oldDirect.isDirectory()){
			File[] files=oldDirect.listFiles();
			for (File file : files) {
				if(file!=null&&file.isFile()){
					System.out.println(file.getAbsolutePath());
					file.renameTo(new File(file.getAbsolutePath()+".jpg"));
				}
			}
		}else{
			System.out.println("需要修改的文件所在的目录有问题！");
			System.out.println();
		}
		
		return false;
	}

	public static void main(String[] args) {
		AddFilenameExtension e=new AddFilenameExtension();
		e.changeFilenameExtension("G:/LOST.DIR/", "G:/");
	}
	
}
