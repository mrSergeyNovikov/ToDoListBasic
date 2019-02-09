package ToDo;

import java.util.Scanner;

public class ListRunner {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ToDoList list = new ToDoList();
		printOut();
		int param = scanner.nextInt();
		while (param != 0) {
			switch (param) {
			case 1:
				System.out.println("Пожалуйста, введите название задачи, которую нужно добавить в список!");
				scanner.nextLine();
				String task1 = scanner.nextLine();
				list.addToList(task1);
				System.out.println("Задача добавлена!");
				System.out.println("Пожалуйста, выберите команду от 0-6!");
				param = scanner.nextInt();
				break;
			case 2:
				System.out.println("Список задач:");
				list.printToDoList();
				System.out.println("Пожалуйста, выберите команду от 0-6!");
				param = scanner.nextInt();
				break;
			case 3:
				System.out.println("Пожалуйста, введите номер задачи, которую хотите изменить!");
				int i = scanner.nextInt();
				System.out.println("Введите название новой задачи!");
				scanner.nextLine();
				String task3 = scanner.nextLine();
				list.changeTask(i, task3);
				System.out.println("Задача изменена!");
				System.out.println("Пожалуйста, выберите команду от 0-6!");
				param = scanner.nextInt();
				break;
			case 4:
				System.out.println("Введите название задачу, которую нужно удалить!");
				scanner.nextLine();
				String task4 = scanner.nextLine();
				list.removeTask(task4);
				System.out.println("Задача удалена!");
				System.out.println("Пожалуйста, выберите команду от 0-6!");
				param = scanner.nextInt();
				break;
			case 5:
				System.out.println("Введите название задачи!");
				scanner.nextLine();
				String task5 = scanner.nextLine();
				System.out.println("Позиция этой задачи: " + list.getTaskPriority(task5));
				System.out.println("Пожалуйста, выберите команду от 0-6!");
				param = scanner.nextInt();
				break;
			case 6:
				System.out.println("Введите номер позиции в которую нужно добавить задачу !");
				scanner.nextLine();
				int position = scanner.nextInt();
				System.out.println("Введите название задачи!");
				scanner.nextLine();
				String task6 = scanner.nextLine();
				list.addListAtPosition(position, task6);
				System.out.println("Задача добавлена!");
				System.out.println("Пожалуйста, выберите команду от 0-6!");
				param = scanner.nextInt();
				break;
			default:
				System.out.println("Неверная команда! Вы вышли из программы!");
				param = 0;
				break;
			}

		}

	}

	public static void printOut() {
		System.out.println("Пожалуйста выберите команду. Нажмите :\n" 
				+ "1 - добавить новую задачу в список \n"
				+ "2 - распечатать список задач \n" 
				+ "3 - изменить задачу в списке \n"
				+ "4 - удалить задачу со списка \n" 
				+ "5 - для получения позиции задачи в списке\n"
				+ "6 - добавить задачу в определенную позицию в списке\n" 
				+ "нажмите 0 - для выхода\n\n"
				+ "ПОСЛЕ ВЫБОРА НАЖМИТЕ - 'ENTER'\n");
	}
}
