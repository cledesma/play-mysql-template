package com.github.cmled.service;

import java.util.List;

import model.Task;

public interface SimpleTaskService {

	public List<Task> listTasks();

	public Task getTask(Long id);

	public void deleteTask(Long id);

	public long createTask(Task task);
}
