package org.healthonnet.couchdbclient;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.ViewQuery;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;

/**
 * Simple example of using Extorp to fetch HonDocuments from the CouchDB store.
 * 
 * @author nolan
 *
 */
public class SimpleHonDocumentFetcher {

	public static CouchDbConnector createConnector(String username, String password) {
		
		HttpClient httpClient = new StdHttpClient.Builder()
				.host(Constants.HOST)
				.port(Constants.PORT)
				.username(username)
				.password(password)
				.build();
		
		CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
		return new StdCouchDbConnector(Constants.DATABASE, dbInstance);
	}
	
	public static ViewQuery getQueryForAllDocsOrderedByUrl() {
		
		return new ViewQuery()
				.designDocId("_design/by_url")
				.viewName("by_url")
				.staleOk(true)
				.includeDocs(true);
	}
	
	public static ViewQuery getQueryForAllDocsWithLanguage(String language) {
		return new ViewQuery()
				.designDocId("_design/by_language")
				.viewName("by_language")
				.staleOk(true)
				.includeDocs(true)
				.key(language);
	}
	
	
}
