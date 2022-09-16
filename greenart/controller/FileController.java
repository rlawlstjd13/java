package kr.co.greenart.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import kr.co.greenart.model.file.FileRepository;

@Controller
@RequestMapping("/file")
public class FileController {
	@Autowired
	private FileRepository repo;
	
	@GetMapping
	public String fileForm() {
		return "fileForm";
	}
	@PostMapping
	public String submit(@RequestParam MultipartFile upload) {
		String filename = upload.getOriginalFilename();//getoriginal해야 파일이름?
		//Apache Commons FileUpload » 1.4 pom에추가함 라이브러리
		int result = repo.save(upload);
		
		return "redirect:file/result";
		
		
	}
	@GetMapping("/result")
	public String view() {
		return "fileview";
	}
	
	@GetMapping("/down")
	public ResponseEntity<Resource> down(@RequestParam String item) {
		Resource resource = repo.getByname(item);
		
		if(resource == null) {
			return (ResponseEntity<Resource>) ResponseEntity.notFound();		
			}
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		try {
			headers.add("Content-Disposition", "attachment; filename=" 
												+ URLEncoder.encode(item, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	
		return new ResponseEntity<>(resource, headers, HttpStatus.OK);
	}

}
