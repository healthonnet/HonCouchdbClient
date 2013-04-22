package org.healthonnet.couchdbclient.data;

import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * HonDocument representing a crawled web page and its attached metadata.
 * @author nolan
 *
 */
public class HonDocument {

	@JsonProperty("_id")
	private String id;
	
	@JsonProperty("_rev")
    private String rev;
	
	private String compressedContent;
	private String beginDate;
	private String endDate;
	private String location;
	private String domain;
	private String contentMD5;
	private String description;
	private String host;
	private HonHtmlContent htmlContent;
	private String language;
	private List<String> outwardsLinks;
	private double relevancyScore;
	private String snippet;
	private String sourceMD5;
	private long sourceMTime;
	private String title;
	private String url;
	
	@SuppressWarnings("unused")
	@JsonProperty("validate_doc_update")
	@JsonIgnore
	private String validateDocUpdate;
			
	@JsonIgnore		
	private Map<Object, Object> facets;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRev() {
		return rev;
	}
	public void setRev(String rev) {
		this.rev = rev;
	}
	public String getContentMD5() {
		return contentMD5;
	}
	public void setContentMD5(String contentMD5) {
		this.contentMD5 = contentMD5;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public HonHtmlContent getHtmlContent() {
		return htmlContent;
	}
	public void setHtmlContent(HonHtmlContent htmlContent) {
		this.htmlContent = htmlContent;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public List<String> getOutwardsLinks() {
		return outwardsLinks;
	}
	public void setOutwardsLinks(List<String> outwardsLinks) {
		this.outwardsLinks = outwardsLinks;
	}
	public double getRelevancyScore() {
		return relevancyScore;
	}
	public void setRelevancyScore(double relevancyScore) {
		this.relevancyScore = relevancyScore;
	}
	public String getSnippet() {
		return snippet;
	}
	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}
	public String getSourceMD5() {
		return sourceMD5;
	}
	public void setSourceMD5(String sourceMD5) {
		this.sourceMD5 = sourceMD5;
	}
	public long getSourceMTime() {
		return sourceMTime;
	}
	public void setSourceMTime(long sourceMTime) {
		this.sourceMTime = sourceMTime;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	public String getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getCompressedContent() {
		return compressedContent;
	}
	public void setCompressedContent(String compressedContent) {
		this.compressedContent = compressedContent;
	}
	
	public Map<Object, Object> getFacets() {
		return facets;
	}
	public void setFacets(Map<Object, Object> facets) {
		this.facets = facets;
	}
	@Override
	public String toString() {
		return "HonDocument [id=" + id + ", \n\trev=" + rev
				+ ", \n\tcompressedContent=" + compressedContent + ", \n\tbeginDate="
				+ beginDate + ", \n\tendDate=" + endDate + ", \n\tlocation=" + location
				+ ", \n\tdomain=" + domain + ", \n\tcontentMD5=" + contentMD5
				+ ", \n\tdescription=" + description + ", \n\thost=" + host
				+ ", \n\thtmlContent=" + htmlContent + ", \n\tlanguage=" + language
				+ ", \n\toutwardsLinks=" + outwardsLinks + ", \n\trelevancyScore="
				+ relevancyScore + ", \n\tsnippet=" + snippet + ", \n\tsourceMD5="
				+ sourceMD5 + ", \n\tsourceMTime=" + sourceMTime + ", \n\ttitle="
				+ title + ", \n\turl=" + url + ", \n\tvalidateDocUpdate="
				+ validateDocUpdate + ", \n\tfacets=" + facets + "]";
	}

}
