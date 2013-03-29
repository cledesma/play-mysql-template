package com.github.cmled.dao;

import java.util.List;

import model.Task;

public interface TaskDao {

	public Task find(Long id);

	public List<Task> findAll();

	public void removeById(Long id);

	public Task save(Task task);
}
