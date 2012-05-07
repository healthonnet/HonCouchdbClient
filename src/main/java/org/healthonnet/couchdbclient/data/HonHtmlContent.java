package org.healthonnet.couchdbclient.data;

import java.util.List;

/**
 * HTML content extracted from a HonDocument.
 * 
 * @author nolan
 *
 */
public class HonHtmlContent {

	private List<String> h1;
	private String text;
	private List<String> h2;
	private List<String> h3;
	
	public List<String> getH1() {
		return h1;
	}
	public void setH1(List<String> h1) {
		this.h1 = h1;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<String> getH2() {
		return h2;
	}
	public void setH2(List<String> h2) {
		this.h2 = h2;
	}
	public List<String> getH3() {
		return h3;
	}
	public void setH3(List<String> h3) {
		this.h3 = h3;
	}
	@Override
	public String toString() {
		return "HonHtmlContent [h1=" + h1 + ", text=" + text + ", h2=" + h2
				+ ", h3=" + h3 + "]";
	}
}
