package com.bitmakers.firstjobs.app_data;

import com.bitmakers.firstjobs.model_class.CityList;
import com.bitmakers.firstjobs.model_class.JobDetailsList;
import com.bitmakers.firstjobs.model_class.JobFavouriteList;
import com.bitmakers.firstjobs.model_class.JobList;

import java.util.ArrayList;

public class AppData {
	
	public static String finalResultFromServer = null;
	public static String finalDeatilsResultFromServer = null;
	public static ArrayList<JobList> homeJobList = new ArrayList<JobList>();
	public static ArrayList<CityList> cityLists = new ArrayList<CityList>();

	public static ArrayList<JobDetailsList> jobDetailsLists = new ArrayList<JobDetailsList>();

	public static ArrayList<JobFavouriteList> newsFavListt = new ArrayList<JobFavouriteList>();
	public static ArrayList<String> newsKey = new ArrayList<String>();
	public static ArrayList<JobList> searchJobList = new ArrayList<JobList>();



}
