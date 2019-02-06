package ToDo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ToDoList {
	List<String> toDoList = new ArrayList<>();

	// добавить элемент в список задач
	public void addToList(String task) {
		toDoList.add(task);
	}

	// добавить задачу в конкретную позицию
	public void addListAtPosition(int position, String task) {
		toDoList.add(position, task);
	}

	// распечатать список задач
	public void printToDoList() {
		for (int i = 0; i < toDoList.size(); i++) {
			System.out.println(i + " - " + toDoList.get(i));

		}
	}
	
	// изменить задачу
	public void changeTask(int index, String task) {
		toDoList.set(index, task);
	}
}
