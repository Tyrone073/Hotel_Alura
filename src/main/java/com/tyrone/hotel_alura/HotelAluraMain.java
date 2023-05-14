package com.tyrone.hotel_alura;

import javax.swing.JFrame;

import com.tyrone.hotel_alura.view.HotelAluraFrame;

public class HotelAluraMain {//esta clase es para llamar al frame y permitir avanzar o cerrar al app

	public static void main(String[] args) {
		HotelAluraFrame aluraFrame = new HotelAluraFrame();

		aluraFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
