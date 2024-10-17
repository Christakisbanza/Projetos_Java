package org.example.model.entities.Run;

import org.example.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReservationRun {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date checkIn = new Date();
        Date checkOut = new Date();

        System.out.print("Room number: ");
        int num = scanner.nextInt();

        try {
            System.out.println("Check-in date (dd/MM/yyyy):");
            checkIn = simpleDateFormat.parse(scanner.next());
            System.out.println("Check-Out date (dd/MM/yyyy):");
            checkOut = simpleDateFormat.parse(scanner.next());

            Reservation reservation = new Reservation(num, checkIn, checkOut);
            reservation.error();

            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.print("Enter data to update the reservation:");
            System.out.println("Check-in date (dd/MM/yyyy):");
            checkIn = simpleDateFormat.parse(scanner.next());
            System.out.println("Check-Out date (dd/MM/yyyy):");
            checkOut = simpleDateFormat.parse(scanner.next());

            reservation.upDateDates(checkIn, checkOut);

            System.out.println("Reservation: " + reservation);
        }
        catch (ParseException | IllegalArgumentException e){
            System.out.println("Invalid date: " + e.getMessage());
        }


        scanner.close();
    }









}
