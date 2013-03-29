package com.github.cmled.service.impl;

import java.util.List;

import model.Task;

import com.github.cmled.dao.TaskDao;
import com.github.cmled.dao.impl.TaskDaoImpl;
import com.github.cmled.service.SimpleTaskService;

public class SimpleTaskServiceImpl implements SimpleTaskService {

	private TaskDao taskDao;

	private TaskDao getTaskDaoInstance() {
		if (taskDao == null) {
			taskDao = new TaskDaoImpl();
		}
		return taskDao;
	}

	public List<Task> listTasks() {
		return getTaskDaoInstance().findAll();
	}

	public Task getTask(Long id) {
		return getTaskDaoInstance().find(id);
	}

	public void deleteTask(Long id) {
		getTaskDaoInstance().removeById(id);
	}

	public long createTask(Task task) {
		Task savedTask = getTaskDaoInstance().save(task);
		return savedTask.getId();
	}

}
