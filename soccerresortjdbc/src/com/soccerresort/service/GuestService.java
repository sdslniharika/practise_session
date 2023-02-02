package com.soccerresort.service;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import com.soccerresort.entity.GuestDetails;

import static java.lang.Integer.parseInt;

public class GuestService {

	public static void main(String args[])
	{
		try{
			Class.forName("org.postgresql.Driver");

			// 2 create connection
			String url = "jdbc:postgresql://localhost:5432/soccerresortdb";
			String username = "postgres", password = "Lemon@4321#";
			Connection connection = DriverManager.getConnection(url, username, password);
			PreparedStatement preparedStatement= connection.prepareStatement("insert into soccerResortDb(?,?,?,?,?,?)");

			Scanner sc=new Scanner(System.in);
			while(true)
			{
				System.out.println("Enter Id:");
				int id= sc.nextInt();

				System.out.println("Enter customer name:");
				String customername= sc.nextLine();

				System.out.println("Enter customer dob:");
				String customerdob= sc.nextLine();
				String[]  dob=customerdob.split("-");
				Date date=new Date(parseInt(dob[0]),parseInt(dob[1]));

				System.out.println("Enter hobby:");
				String customerHobby= sc.nextLine();

				System.out.println("Enter Language:");
				String customerLanguage= sc.nextLine();

				System.out.println("Enter Country:");
				String customerCountry= sc.nextLine();



				preparedStatement.setInt(1,id);
				preparedStatement.setString(2,customername);
				preparedStatement.setDate(3,dob);
				preparedStatement.setString(4,customerCountry);
				preparedStatement.setString(5,customerLanguage);
				preparedStatement.setString(6,customerHobby);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	private int index = 0;

	public int guestIndex() {
		return index++;
	}

	public void populateGuest(GuestDetails details) {



	}




}
