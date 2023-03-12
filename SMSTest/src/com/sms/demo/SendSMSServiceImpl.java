package com.sms.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;

import javax.net.ssl.HttpsURLConnection;

public class SendSMSServiceImpl implements SendSMSService {

	@Override
	public void sendSMS(String messageContent, String phoneNumbers) {
		// TODO Auto-generated method stub
		try {
			messageContent = URLEncoder.encode(messageContent, "UTF-8");
			String apiKey = "SVqawLu5lWQBh82e04mznMXgHct3oFU9DZxkAYJKfGCPNR7jTdeCVglvkqArxEhcYGjQf9t217J8OTdi";
			String senderId = "FastSM";
			String route = "p";
			String language = "english";
			String myUrl = "https://www.fast2sms.com/dev/bulkV2?"+ 
					"authorization="+apiKey+
					"&senderId="+senderId+
					"&message="+messageContent+
					"&language="+language+
					"&route="+route+
					"&numbers="+phoneNumbers;
			// sending get request
			URL url = new URL(myUrl);
			HttpsURLConnection httpsURLconnection = (HttpsURLConnection)url.openConnection();
			httpsURLconnection.setRequestMethod("GET");
			httpsURLconnection.setRequestProperty("User-Agent", "Mozilla/5.0");
			httpsURLconnection.setRequestProperty("cache-control", "no-cache");
			System.out.println("wait");

			// verify if the message is sent successfully
			int code = httpsURLconnection.getResponseCode();
			System.out.println("response code : " + code);
			
			StringBuffer response = new StringBuffer();
			BufferedReader br = new BufferedReader(new InputStreamReader(httpsURLconnection.getInputStream()));
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				} else response.append(line);
			}
			
			System.out.println(response);
		} catch (Exception e) { e.printStackTrace(); }
	}
	
}
