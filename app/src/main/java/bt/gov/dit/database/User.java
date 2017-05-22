package bt.gov.dit.database;

/**
 * Created by darshan on 5/22/17.
 */

public class User {

    int _id;
    String _name;
    String _password;

    public User() {

    }
    public User(int id, String name, String _password){
        this._id = id;
        this._name = name;
        this._password = _password;
    }

    // constructor
    public User(String name, String _password){
        this._name = name;
        this._password = _password;
    }
    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }




}
