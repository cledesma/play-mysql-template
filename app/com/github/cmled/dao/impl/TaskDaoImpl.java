package com.github.cmled.dao.impl;

import java.util.List;

import javax.persistence.Query;

import model.Task;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;

import com.github.cmled.dao.TaskDao;

public class TaskDaoImpl implements TaskDao {

	@Override
	public Task find(Long id) {
		return JPA.em().find(Task.class, id);
	}

	@Override
	@Transactional
	public List<Task> findAll() {
		Query query = JPA.em("carlolocal").createQuery("select id, label from Task");
		List<Task> tasks = query.getResultList();
		return tasks;
	}

	@Override
	public void removeById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Task save(Task task) {
		// TODO Auto-generated method stub
		return null;
	}

}
