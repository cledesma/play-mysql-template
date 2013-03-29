package controllers;

import java.util.List;

import model.Task;
import play.mvc.Controller;
import play.mvc.Http.RequestBody;
import play.mvc.Result;

import com.github.cmled.json.model.CreateTaskRequest;
import com.github.cmled.service.SimpleTaskService;
import com.github.cmled.service.impl.SimpleTaskServiceImpl;
import com.google.gson.Gson;

public class TaskController extends Controller {

	public static Result listTasks() {
		SimpleTaskService taskService = new SimpleTaskServiceImpl();
		List<Task> taskList = taskService.listTasks();
		return ok(taskList.toString());
	}

	public static Result getTask(Long id) {
		return TODO;
	}

	public static Result createTask() {
		RequestBody body = request().body();
		Gson gson = new Gson();
		CreateTaskRequest createTaskRequest = gson.fromJson(body.asText(),
				CreateTaskRequest.class);

		return ok(createTaskRequest.getLabel());
	}

	public static Result deleteTask(Long id) {
		return TODO;
	}

}
