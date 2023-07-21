package springmvcsearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {												//File Uploading

	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "fileform";
	}
	
	@RequestMapping(path="/uplodeimage", method=RequestMethod.POST)
	public String uploadForm(@RequestParam("profile") CommonsMultipartFile file, HttpSession s, Model m) {
		System.out.println("File upload handler");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		
		byte[] data = file.getBytes();
		//we have to save file to server...
		String path = s.getServletContext().getRealPath("/");        									//path of spring mvc folder
		String path1 = s.getServletContext().getRealPath("/")+file.getOriginalFilename();				//we add image in that springmvcsearch folder
		String path2 = s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"images"+File.separator+file.getOriginalFilename();  //we try to add this image in image folder of that project
		System.out.println(path);
		System.out.println(path1);
		System.out.println(path2);
		
		try {
			FileOutputStream fos = new FileOutputStream(path2);
			fos.write(data);
			fos.close();
			
			m.addAttribute("msg", "Uploaded Successfully...");
			m.addAttribute("filename", file.getOriginalFilename());
			
			System.out.println("File Uploaded...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Uploading Error...");
			m.addAttribute("msg", "Uploading Error...");
		}
		
		return "success_file";
	}
}


//	at [E:\PG-DAC\DAC Classes\Web Based Programming\Learn wih Durgesh\WORKSHOP\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\ springmvcsearch\ upload_f340a106_deac_4f18_9fd4_3cf3023aa7e5_00000000.tmp ]
																																					//upto here			