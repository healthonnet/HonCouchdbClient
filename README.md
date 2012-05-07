HON CouchDB Client
=========================

Java library to be used to interact with the live HON CouchDB service, which contains crawled web pages of HON-certified sites.

The library uses [Ektorp][2] to query the CouchDB database.

Installation
----------

Download the code and install it:

```
git clone https://github.com/HON-Khresmoi/HonCouchdbClient
cd HonCouchdbClient
mvn install
```

Then add the following to your pom.xml:

```xml
<dependencies>
  ...
  <dependency>
  	<groupId>org.healthonnet.couchdb</groupId>
  	<artifactId>hon-couchdb-client</artifactId>
  	<version>0.0.1-SNAPSHOT</version>
  </dependency>
  ...
</dependencies>
```

Example Usage
-----------

```java
// Insert your top-secret username and password here!
CouchDbConnector dbConnector = SimpleHonDocumentFetcher.createConnector("MY_USER_NAME", "MY_PASSWORD");

// Iterates through all docs, ordered by URL
ViewQuery query = SimpleHonDocumentFetcher.getQueryForAllDocsOrderedByUrl();

//
// More queries you can use
//
//ViewQuery query = SimpleHonDocumentFetcher.getQueryForAllDocsWithLanguage("en");
//ViewQuery query = SimpleHonDocumentFetcher.getQueryForAllDocsWithLanguage("fr");


// Grab the first page of 10 results
Page<HonDocument> firstPage = dbConnector.queryForPage(query, PageRequest.firstPage(10), HonDocument.class);

System.out.println("First page!");
for (HonDocument document : firstPage) {
	System.out.println(document);
}

// Grab the second page of 10 results. And so on.
Page<HonDocument> secondPage = dbConnector.queryForPage(query, firstPage.getNextPageRequest(), HonDocument.class);

System.out.println("Second page!");
for (HonDocument document : secondPage) {
	System.out.println(document);
}
```

The above code will print out something like this:

```
First page!
HonDocument [id=<someid>, 
	rev=1-aea1adbc8a6399408f2c9d4d88da3a27, 
	contentMD5=12ba129be7177d33c2d4e6fd2eaa7d07, 
	description=null, 
	host=original.url.com, 
	htmlContent=HonHtmlContent [h1=[Discussions], text= blah blah blah], h3=null], 
	language=en, 
	outwardsLinks=[http://some.site.com, http://another.site.com], 
	relevancyScore=0.0, 
	snippet= Blah blah blah a snippet, 
	sourceMD5=a2942d85c976519047d009b40beee142, 
	sourceMTime=1335767480, 
	title=Some title of the page, 
	url=http://original.url.com/somepage]
	... [redacted] ...
Second page!
HonDocument [id=<someotherid>, 
	rev=1-dcd65b10d6d2833d400de36d2594b8d9, 
	contentMD5=60b49c6b108b95eebecab684e4ea4e55, 
	description=A description of the site, 
	host=another.original.url.com, 
	htmlContent=HonHtmlContent [h1=[Some header text], text= Blah blah blah]], 
	language=en, 
	outwardsLinks=[http://a.bunch.of.outgoing.links.com, http://heres.another.com], 
	relevancyScore=0.0, 
	snippet=Some snippet text, 
	sourceMD5=82736aa23c7460992f1964a9a4f2a454, 
	sourceMTime=1335901707, 
	title=Some title, 
	url=http://the.url.com]
	... [redacted] ...

```

Developer
-----------

Nolan Lawson

Health on the Net Foundation

License
-----------

[Apache 2.0][1].

[1]: http://www.apache.org/licenses/LICENSE-2.0.html
[2]: https://github.com/helun/Ektorp
