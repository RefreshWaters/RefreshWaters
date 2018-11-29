package com.movie.web;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.movie.domain.MovieVO;
import com.movie.domain.RegisterVO;
import com.movie.repository.AdminDao;

@Controller
@RequestMapping("admin")
public class AdminController {

	@Autowired
	private AdminDao adminDao;
	
	@RequestMapping("main")
	public String main() {
		return "admin/main";
	}
	
	@RequestMapping(value="register", method=RequestMethod.GET)
	public String register() {
		return "admin/register";
	}
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	public String register(@ModelAttribute RegisterVO mvo, HttpServletRequest request) {
/*		String[] ttNum = request.getParameterValues("tt_num");
			mvo.setTt_num(ttNum[0]);*/
		adminDao.insertRg(mvo);
		return "redirect:/";
	}
	
	@RequestMapping(value="movie", method=RequestMethod.GET)
	public String movie() {
		return "admin/movie";
	}
	
	@RequestMapping(value="movie", method=RequestMethod.POST)
	public String movie(HttpServletRequest request, 
			@ModelAttribute MovieVO mv, 
			@RequestParam("image") MultipartFile multi
			) throws Exception {
		String filename = null;
		ServletContext application = request.getServletContext();
		String realPath = application.getRealPath("/upload");
		filename = multi.getOriginalFilename();
		File dic = new File(realPath);
		if(!dic.exists()) {
			dic.mkdir();
		}
		File file = new File(realPath, filename);
		
		IOUtils.copy(multi.getInputStream(), new FileOutputStream(file));
		mv.setMv_postImage(filename);
		adminDao.insertMv(mv, request);
		return "redirect:/admin/main";
	}
	
	@RequestMapping("tables")
	public String tables() {
		return "admin/tables";
	}
	
	
	
	

	
	
	
}
