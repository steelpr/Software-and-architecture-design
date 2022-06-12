package Main;

import java.util.Scanner;

import AbstractFactory.AbstractFactory;
import AbstractFactory.Color;
import AbstractFactory.FactoryProducer;
import AbstractFactory.TypeDoll;
import Command.Bike;
import Command.Board;
import Command.Command;
import Command.Controller;
import Command.Doll;
import Observer.SubjectBike;
import Observer.SubjectDoll;
import Observer.Workshop;
import Singleton.SantaClaus;

public class Main {

	public static void main(String[] args) {
		SantaClaus connection = SantaClaus.getInstance();
		connection.postMessage("Welcome Santa Claus");

		Board board = new Board();
		Command needBike = new Bike(board);
		Command needDoll = new Doll(board);

		Controller command = new Controller();

		System.out.println("Choose toy:");
		System.out.println("press 0 for exit, For bike press 1, for doll press 2");

		Scanner scan = new Scanner(System.in);
		int toyCode = scan.nextInt();

		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		AbstractFactory shapeFactory = FactoryProducer.getFactory("TYPE");
		Workshop toy = new Workshop();

		while (toyCode != 0) {
			if (toyCode == 1) {
				new SubjectBike(toy);
				command.setCommand(needBike);
				command.pressButton();

				System.out.println("press 1 for blue bike, press 2 for red bike, press 2 for green bike");
				int color = scan.nextInt();

				switch (color) {
				case 1:
					Color blue = colorFactory.getColor("BLUE");
					blue.fill();
					toy.setState("blue");
					break;

				case 2:
					Color red = colorFactory.getColor("RED");
					red.fill();
					toy.setState("red");
					break;

				case 3:
					Color green = colorFactory.getColor("GREEN");
					green.fill();
					toy.setState("green");
					break;
				default:
					System.out.println("wrong code");
				}

			} else if (toyCode == 2) {
				new SubjectDoll(toy);

				command.setCommand(needDoll);
				command.pressButton();

				System.out.println("press 1 for baby doll, press 2 for barbie doll");

				int type = scan.nextInt();

				switch (type) {
				case 1:
					TypeDoll babyDoll = shapeFactory.getType("BABY");
					toy.setState("baby");
					babyDoll.made();
					break;

				case 2:
					TypeDoll barbieDoll = shapeFactory.getType("BARBIE");
					toy.setState("barbie");
					barbieDoll.made();
					break;
				default:
					System.out.println("wrong code");
				}
			} else {
				System.out.println("wrong code");
			}
			System.out.println("- - - - - - - - - ");
			System.out.println("Choose toy:");
			System.out.println("press 0 for exit, For bike press 1, for doll press 2");
			toyCode = scan.nextInt();
		}

	}
}
