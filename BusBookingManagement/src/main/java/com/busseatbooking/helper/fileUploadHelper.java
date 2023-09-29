package com.busseatbooking.helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class fileUploadHelper {
	
	//public final String UPLOAD_DIR="C:\\Users\\shikhar\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\BusBookingManagement\\src\\main\\resources\\static\\image";
	public final String UPLOAD_DIR= new ClassPathResource("static/image/").getFile().getAbsolutePath();

	public fileUploadHelper() throws IOException
	{
		
	}
	
	public boolean  uploadFile(MultipartFile multipartFile) {
		boolean f=false;
	
		try {
			
		//InputStream is=	multipartFile.getInputStream();
		//byte data[]= new byte[is.available()];	
		//is.read();
		
		//write
		//FileOutputStream fos = new FileOutputStream(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename());
		//fos.write(data);
		//fos.close();
		//fos.flush();
		//f=true;
			Files.copy(multipartFile.getInputStream(),Paths.get(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
		
			f=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}

	
	
}
