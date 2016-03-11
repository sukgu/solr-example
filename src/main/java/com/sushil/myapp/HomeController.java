package com.sushil.myapp;

import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrInputDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		SolrServer ss = (SolrServer)new ApplicationContextProvider().getApplicationContext().getBean("solrServer");
		List<SolrInputDocument> docs = new ArrayList<SolrInputDocument>();
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField("name", "SUSHIL");
		doc.addField("id", "change.me");
		//doc.addField("address", "SUSHIL_ADDRESS");
		//doc.addField("class", "SUSHIL_CLASS");
		docs.add(doc);
		UpdateResponse ur1 = null;
		try {
			ur1 = ss.add(docs); System.out.println( "ADD:"+ur1.getResponse() );
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UpdateResponse ur = null;
		try {
			ur = ss.commit( true, true );
		    System.out.println( "COMMIT:"+ur.getResponse() );
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		model.addAttribute("uRStatus", ur.getStatus() );
		model.addAttribute("solrToString", ur.toString() );
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String searchPage(Locale locale, Model model) {
		return "search";
	}
	

	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String resultPage(Locale locale, Model model) {
		return "result";
	}
	
	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public String doSearch(@RequestParam("name") String data, Locale locale, Model model) {
		SolrServer server = (SolrServer)new ApplicationContextProvider().getApplicationContext().getBean("solrServer");
		SolrQuery query = new SolrQuery();
	    query.setQuery( data );
	    //query.get(data);
	    QueryResponse rsp=null;
		try {
			rsp = server.query( query );
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	    System.out.println( rsp.getResults() );
		model.addAttribute("r1", rsp.getResults().toString());
		return "result";
	}
	
}
