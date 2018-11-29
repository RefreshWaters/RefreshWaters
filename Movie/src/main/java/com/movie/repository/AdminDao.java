package com.movie.repository;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.movie.domain.MovieVO;
import com.movie.domain.RegisterVO;

@Repository
public class AdminDao {
	
	@Autowired
	JdbcTemplate jtl;
	
	SimpleJdbcInsert sji;
	
	public void insertRg(RegisterVO mvo) {
		sji = new SimpleJdbcInsert(jtl).withTableName("register");
		sji.execute(new BeanPropertySqlParameterSource(mvo));
	}
	
	public void insertMv(MovieVO movie, HttpServletRequest request) {
		sji = new SimpleJdbcInsert(jtl).withTableName("movie");
		sji.execute(new BeanPropertySqlParameterSource(movie));
	}
	
}
