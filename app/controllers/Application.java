package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render("Hello world"));
    }
    
    public static Result listTasks() {
    	return TODO;
    }
    
    public static Result createTask() {
    	return TODO;
    }
    
    public static Result deleteTask(Long id) {
    	return TODO;
    }
  
}
