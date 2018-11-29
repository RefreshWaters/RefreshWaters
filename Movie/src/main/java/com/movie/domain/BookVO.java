package com.movie.domain;
/*예약번호	bk_num	int
아이디	mb_ID	varchar(20)
영화번호	mv_num	varchar(50)
상영관	tt_num	varchar(20)
좌석번호	tt_seatNum	varchar(20)
예매일	bk_date	varchar(20)
관람일	bk_wDate	varchar(20)
관람시간	rg_time	varchar(20)
가격	bk_price	varchar(20)
결제여부	bk_paid	varchar(20)
상영등록번호	rg_num	int*/

public class BookVO {
	private Integer bk_num;
	private String mb_ID;
	private String mv_num;
	private String tt_num;
	private String tt_seatNum;
	private String bk_date;
	private String bk_wDate;
	private String rg_time;
	private String bk_price;
	private String bk_paid;
	private Integer rg_num;
	private String bk_placed;
	
	public void setBk_placed(String bk_placed) {
		this.bk_placed = bk_placed;
	}
	public String getBk_placed() {
		return bk_placed;
	}
	public Integer getBk_num() {
		return bk_num;
	}
	public void setBk_num(Integer bk_num) {
		this.bk_num = bk_num;
	}
	public String getMb_ID() {
		return mb_ID;
	}
	public void setMb_ID(String mb_ID) {
		this.mb_ID = mb_ID;
	}
	public String getMv_num() {
		return mv_num;
	}
	public void setMv_num(String mv_num) {
		this.mv_num = mv_num;
	}
	public String getTt_num() {
		return tt_num;
	}
	public void setTt_num(String tt_num) {
		this.tt_num = tt_num;
	}
	public String getTt_seatNum() {
		return tt_seatNum;
	}
	public void setTt_seatNum(String tt_seatNum) {
		this.tt_seatNum = tt_seatNum;
	}
	public String getBk_date() {
		return bk_date;
	}
	public void setBk_date(String bk_date) {
		this.bk_date = bk_date;
	}
	public String getBk_wDate() {
		return bk_wDate;
	}
	public void setBk_wDate(String bk_wDate) {
		this.bk_wDate = bk_wDate;
	}
	public String getRg_time() {
		return rg_time;
	}
	public void setRg_time(String rg_time) {
		this.rg_time = rg_time;
	}
	public String getBk_price() {
		return bk_price;
	}
	public void setBk_price(String bk_price) {
		this.bk_price = bk_price;
	}
	public String getBk_paid() {
		return bk_paid;
	}
	public void setBk_paid(String bk_paid) {
		this.bk_paid = bk_paid;
	}
	public Integer getRg_num() {
		return rg_num;
	}
	public void setRg_num(Integer rg_num) {
		this.rg_num = rg_num;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [bk_num=");
		builder.append(bk_num);
		builder.append(", mb_ID=");
		builder.append(mb_ID);
		builder.append(", mv_num=");
		builder.append(mv_num);
		builder.append(", tt_num=");
		builder.append(tt_num);
		builder.append(", tt_seatNum=");
		builder.append(tt_seatNum);
		builder.append(", bk_date=");
		builder.append(bk_date);
		builder.append(", bk_wDate=");
		builder.append(bk_wDate);
		builder.append(", rg_time=");
		builder.append(rg_time);
		builder.append(", bk_price=");
		builder.append(bk_price);
		builder.append(", bk_paid=");
		builder.append(bk_paid);
		builder.append(", rg_num=");
		builder.append(rg_num);
		builder.append(", bk_placed=");
		builder.append(bk_placed);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
}




