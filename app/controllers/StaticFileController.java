package controllers;

import java.io.File;

import play.mvc.Controller;
import play.mvc.Result;

public class StaticFileController extends Controller{

	public static Result getHtml(String pathname){
		File file = new File(pathname);
		return ok(file);
	}
}
