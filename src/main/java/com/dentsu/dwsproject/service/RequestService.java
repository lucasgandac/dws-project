package com.dentsu.dwsproject.service;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import com.dentsu.dwsproject.entity.Band;

public interface RequestService {

	public String getBandas() throws IOException, InterruptedException;
	public void saveCache(ArrayList<Band> bandas);
	
}
