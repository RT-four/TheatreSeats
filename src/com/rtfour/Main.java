package com.rtfour;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("The Sydney Opera House", 8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        Collections.shuffle(seatCopy);
        System.out.println("Printing shuffled seatCopy");
        printList(seatCopy);
        Collections.sort(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);
        Collections.shuffle(seatCopy);
        System.out.println("Printing shuffled seatCopy");
        printList(seatCopy);
        sortList(seatCopy);
        System.out.println("Printing custom sorted seatCopy");
        printList(seatCopy);


    }

    public static void printList(List<Theatre.Seat> list) {
        System.out.println("=================================================");
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=================================================");
    }

    public static void sortList(List<? extends Theatre.Seat> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}

