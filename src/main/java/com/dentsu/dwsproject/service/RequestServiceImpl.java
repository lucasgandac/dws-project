package com.dentsu.dwsproject.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import com.dentsu.dwsproject.entity.Band;



public class RequestServiceImpl implements RequestService{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String getBandas() throws IOException, InterruptedException {// create a client
		var client = HttpClient.newHttpClient();

		// create a request
		var request = HttpRequest.newBuilder(
		       URI.create("https://iws-brazil-labs-iws-recruiting-bands-staging.iwsbrazil.io/api/full"))
		   .header("accept", "application/json")
		   .build();

		// use the client to send the request
		var response = client.send(request,HttpResponse.BodyHandlers.ofString());

		// the response:
		String bandas = response.body();
		ArrayList<Band> bandasLista = new ArrayList<Band>();
		System.out.println(bandas);
		return response.body();
	}

	@Override
	public void saveCache(ArrayList<Band> bands) {        
		Transaction transaction = null;

		Session session = sessionFactory.getCurrentSession();

		try {
		// start a transaction
		transaction = session.beginTransaction();
		// save the student objects
		session.save(bands);
		// commit transaction
		transaction.commit();
	} catch (Exception e) {
		if (transaction != null) {
			transaction.rollback();
		}
		e.printStackTrace();
	}
		
	}

}
