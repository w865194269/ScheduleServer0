package com.schedule.beans;

/**
 * @version 创建时间：2017年4月23日 下午6:54:38
 *
 *          根据课程信息查询的课程信息
 */
public class CSchedule {

	private int id;
	private String tName;// 教师姓名
	private String cId;// 课程id
	private int number;// 上课人数
	private String address;// 上课地点
	private String section;// 上课节次
	private String week;// 上课周次
	private String term;// 课程学期

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

}
