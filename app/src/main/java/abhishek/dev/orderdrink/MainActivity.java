package abhishek.dev.orderdrink;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.app.ActionBar;

import info.hoang8f.widget.FButton;

public class MainActivity extends AppCompatActivity {

    Button btnsignin,btnsignup;
    TextView txtlogan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsignup = (Button) findViewById(R.id.btnsignup);
        btnsignin = (Button) findViewById(R.id.btnsignin);
        txtlogan = (TextView) findViewById(R.id.txtlogan);

       btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,Signup.class);
                startActivity(in);
                finish();
            }
        });

        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,Signin.class);
                startActivity(in);
                finish();
            }
        });

    }

}
