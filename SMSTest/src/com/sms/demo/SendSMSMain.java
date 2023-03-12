package com.sms.demo;

import java.util.Scanner;

public class SendSMSMain {
		
	public static void main(String[] args) {
		System.out.println("Application to send SMS to Phone Numbers");
		System.out.println("Welcome, please enter below details to proceed");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type 'continue' to proceed : ");
		String userResponse = scanner.nextLine();
		if (userResponse.equals("continue")) {
		
		System.out.print("Enter Phone Number : ");
		String phoneNumber = scanner.nextLine();
		System.out.print("Enter Your Message : ");
		String messageContent = scanner.nextLine();
		
		SendSMSServiceImpl sendSMSServiceImpl = new SendSMSServiceImpl();
		sendSMSServiceImpl.sendSMS(messageContent, phoneNumber);
		} else System.out.println("Exiting.");
		scanner.close();
	}
}