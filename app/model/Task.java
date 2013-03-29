package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {

	@Column(unique = true)
	@Id
	private long id;
	private String label;

	public long getId() {
		return id;
	}

	public String getLabel() {
		return label;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
