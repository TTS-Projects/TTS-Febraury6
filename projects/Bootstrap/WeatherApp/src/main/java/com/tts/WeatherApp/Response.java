package com.tts.WeatherApp;

import java.util.List;
import java.util.Map;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Response {
    private Map<String, String> coord;
    private List<Map<String, String>> weather;
    private String base;
    private Map<String, String> main;
    private Map<String, String> wind;
    
	private Map<String, String> clouds;
    private String dt;
    private Map<String, String> sys;
    private String id;
    private String name;
    private String cod;
    
    @Override
	public String toString() {
		return "Response [coord=" + coord + ", weather=" + weather + ", base=" + base + ", main=" + main + ", wind="
				+ wind + ", clouds=" + clouds + ", dt=" + dt + ", sys=" + sys + ", id=" + id + ", name=" + name
				+ ", cod=" + cod + "]";
	}
    
    
}