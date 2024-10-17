package org.example.model.entities.Run;

import org.example.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReservationRun {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date checkIn = new Date();
        Date checkOut = new Date();

        System.out.print("Room number: ");
        int num = scanner.nextInt();

        try{
            System.out.println("Check-in date (dd/MM/yyyy):");
            checkIn = simpleDateFormat.parse(scanner.next());
            System.out.println("Check-Out date (dd/MM/yyyy):");
            checkOut = simpleDateFormat.parse(scanner.next());
        }catch (ParseException e){
            System.out.println("Data não encontrada !");
        }
        if(checkOut.before(checkIn)){
            System.out.println("Error in reservation: Check-out date must be after check-in date !");
        }else {
            Reservation reservation = new Reservation(num, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.print("Enter data to update the reservation:");
            System.out.println("Check-in date (dd/MM/yyyy):");
            checkIn = simpleDateFormat.parse(scanner.next());
            System.out.println("Check-Out date (dd/MM/yyyy):");
            checkOut = simpleDateFormat.parse(scanner.next());

            String error = reservation.upDateDates(checkIn,checkOut);

            if (error == null){
                System.out.println("Reservation: " + reservation);
            }else {
                System.out.println("Error: " + error);
            }

        }



        scanner.close();
    }









}
