package login.com.loginexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.ed1);
        et2=(EditText)findViewById(R.id.ed2);
        btn1=(Button)findViewById(R.id.bt3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().matches("") && et2.getText().toString().matches(""))
                {
                    Toast.makeText(MainActivity.this,"Username and Password Both Field Required",Toast.LENGTH_LONG).show();
                }
                else {
                    if(et1.getText().toString().matches(""))
                    {
                        Toast.makeText(MainActivity.this,"Username Field Required",Toast.LENGTH_LONG).show();
                    }else if(et2.getText().toString().matches(""))
                    {
                        Toast.makeText(MainActivity.this,"Password Field Required",Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this,"Login Successfully",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
