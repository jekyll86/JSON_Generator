package model;
import java.io.Serializable;


public class Evento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer startTime;
	private Integer endTime;
	private Double lat;
	private Double lon;
	private Integer idEventType;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStartTime() {
		return startTime;
	}
	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}
	public Integer getEndTime() {
		return endTime;
	}
	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double d) {
		this.lat = d;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double d) {
		this.lon = d;
	}
	public Integer getIdEventType() {
		return idEventType;
	}
	public void setIdEventType(Integer idEventType) {
		this.idEventType = idEventType;
	}
	
	
	

}
