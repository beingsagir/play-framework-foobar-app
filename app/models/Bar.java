package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * Created by Sagiruddin on 2/26/2015.
 */

@Entity
public class Bar extends Model{

    @Id
    public String id;

    public String name;

}
