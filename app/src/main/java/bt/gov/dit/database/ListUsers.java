package bt.gov.dit.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TableLayout;

import java.util.List;

public class ListUsers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_users);

        final DatabaseHandler db = new DatabaseHandler(this);
        List<User> users = db.getAllUsers();


        for (User cn : users) {
            String log = "Id: " + cn.get_id() + " ,Name: " + cn.get_name() + " ,Phone: " + cn.get_password();
            // Writing Contacts to log
            Log.d("Name: ", log);
        }
    }
}
