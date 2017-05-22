package bt.gov.dit.database;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String nameString;
    String passwordString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final DatabaseHandler db = new DatabaseHandler(this);
        Button submit = (Button)findViewById(R.id.submit);
        final EditText name = (EditText)findViewById(R.id.username);
        final EditText password = (EditText)findViewById(R.id.password);
        final Intent intent = new Intent(this, ListUsers.class);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameString = name.getText().toString();
                passwordString = password.getText().toString();
                db.addUser(new User(nameString, passwordString));
                Toast.makeText(getApplication(),"Successfully added username:"+nameString+"\nPassword:"+passwordString+" into the database", Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });




        //this should be added from the editext
        //complete the code


    }
}
