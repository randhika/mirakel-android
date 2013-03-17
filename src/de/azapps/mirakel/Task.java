package de.azapps.mirakel;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import android.content.ContentValues;

public class Task {
	private long id;
	private long list_id;
	private String name;
	private String content;
	private boolean done;
	private Date due;
	private int priority;
	private String created_at;
	private String updated_at;
	private Map<String, Boolean> edited = new HashMap<String, Boolean>();

	public Task(long id, long list_id, String name, String content,
			boolean done, Date due, int priority, String created_at,
			String updated_at) {
		this.id = id;
		this.list_id = list_id;
		this.name = name;
		this.content = content;
		this.done = done;
		this.due = due;
		this.priority = priority;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
		edited.put("id", true);
	}

	public long getListId() {
		return list_id;
	}

	public void setListId(long list_id) {
		this.list_id = list_id;
		edited.put("list_id", true);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		edited.put("name", true);
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		edited.put("content", true);
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
		edited.put("done", true);
	}

	public void toggleDone() {
		this.done = !this.done;
		edited.put("done", true);
	}

	public Date getDue() {
		return due;
	}

	public void setDue(Date due) {
		this.due = due;
		edited.put("due", true);
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
		edited.put("priority", true);
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	@Override
	public String toString() {
		return name;
	}

	public ContentValues getContentValues() {
		ContentValues cv = new ContentValues();
		cv.put("_id", id);
		cv.put("list_id", list_id);
		cv.put("name", name);
		cv.put("content", content);
		cv.put("done", done);
		cv.put("due", due.toString());
		cv.put("priority", priority);
		cv.put("created_at", created_at);
		cv.put("updated_at", updated_at);
		return cv;
	}

}
