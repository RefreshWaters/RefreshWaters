package com.movie.repository;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBodyReturnValueHandler;

import com.movie.domain.BookVO;


@Repository
public class BookDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	private SimpleJdbcInsert simpleJdbcInsert;
	
	@PostConstruct
	public void init() {
		simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName("book");

	}
	

	public List<BookVO> getSeatList(String tt_num, String bk_wDate, String rg_time) {
		/*String sql = "select *" + 
				"from theather t left outer join book b " + 
				"on t.tt_num = b.tt_num " + 
				"and t.tt_seatNum = b.tt_seatNum " + 
				"and t.tt_num=? " +
				"and bk_wDate=? " + 
				"and rg_time=? " +
				"order by t.tt_seatNum asc ";*/
		//String sql = "select t.tt_num, t.tt_seatNum, bk_num, mb_ID, mv_num, bk_date, bk_wDate, rg_time, bk_price, bk_paid, rg_num from theather t left outer join book b on t.tt_num = b.tt_num and t.tt_seatNum = b.tt_seatNum and t.tt_num=? and bk_wDate=? and rg_time=? order by tt_seatNum asc";
		String sql="select * from book where tt_num=? and bk_wDate=? and rg_time=? order by tt_seatNum asc";
		//select * from book where tt_num="1" and bk_wDate="2018-11-30" and rg_time="11:30" order by tt_seatNum asc;

		//String[] seatArr = jdbcTemplate.query(sql, new Object[], String.class, book.getTt_num(),book.getBk_wDate(), book.getRg_time());
		List<BookVO> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<BookVO>(BookVO.class), tt_num, bk_wDate, rg_time);
		return list;
	}
	
//	public void insert(Book book) {
//		simpleJdbcInsert.execute(new BeanPropertySqlParameterSource(book));
//		 
//	}
	
	public void updateBookPlaced(String tt_seatNum) {
		String sql = "UPDATE book SET bk_placed=? WHERE tt_seatNum=?";
		jdbcTemplate.update(sql, "T", tt_seatNum);
	}

}
