package com.movie.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.swing.plaf.synth.SynthSeparatorUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.movie.domain.BookVO;
import com.movie.domain.TheatherVO;
import com.movie.repository.BookDao;

import ch.qos.logback.core.net.SyslogOutputStream;

@Controller
@RequestMapping("book")
public class BookController {

	@Autowired
	private BookDao bookDao;
	
	@RequestMapping("select")
	public String select() {
		return "book/select";
	}
	
	@RequestMapping("seat")
	public String seat(@ModelAttribute BookVO book, Model model) {
		List<BookVO>list = bookDao.getSeatList(book.getTt_num(), book.getBk_wDate(), book.getRg_time());	

		model.addAttribute("list", list);
		for(BookVO b : list) {
			System.out.println();
		}
				
		model.addAttribute(book);
/*		model.addAttribute("tt_num", book.getTt_num());
		model.addAttribute("bk_wDate", book.getBk_wDate());
		model.addAttribute("rg_time", book.getRg_time());*/
		return "book/seat";
	}
	
	@RequestMapping("seatSelected")
	public String seatSelected(@RequestParam("seatNum") String[] str, HttpServletRequest request, Model model, @RequestParam("bk_wDate")String bk_wDate,  @RequestParam("tt_num")String tt_num,@RequestParam("rg_time")String rg_time) {
	
		for(int i=0; i<str.length; i++) {
			System.out.println(i+":"+str[i]);
		}
		
		
		for (int i=0;i<str.length; i++) {
			String tt_seatNum = str[i];
			bookDao.updateBookPlaced(tt_seatNum);
		}
		
		
		return "redirect:/book/select";
	}
	
	
	
	
	
}
