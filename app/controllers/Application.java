package controllers;

import models.Bar;
import play.data.Form;
import play.db.ebean.Model;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

import java.util.List;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result addBar() {
        Bar bar = Form.form(Bar.class).bindFromRequest().get();
        bar.save();
       // return redirect(routes.Application.Index);
        return index();
    }

    public static Result getBar() {
        List<Bar> bars = new Model.Finder(String.class, Bar.class).all();
        return ok(Json.toJson(bars));
    }
}
