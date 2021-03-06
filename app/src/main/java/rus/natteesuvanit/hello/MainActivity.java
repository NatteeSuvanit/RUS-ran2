package rus.natteesuvanit.hello;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    //Explicit
    private EditText userEditText, passwordEditText;;
    private ImageView imageView;
    private static final String urlLogo = "http://swiftcodingthai.com/rus/image/logo_rus.png";
    private String userString, passwordString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widgot
        userEditText = (EditText) findViewById(R.id.editText4);
        passwordEditText = (EditText) findViewById(R.id.editText5);
        imageView = (ImageView) findViewById(R.id.imageView6);

        //Load Image Form Server
        Picasso.with(this).load(urlLogo).into(imageView);
    } // Main Method

    public void ClickSignIn(View view) {

        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        //Check Space
        if (userString.equals("") || passwordString.equals("")) {
            //Have Space
            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this, "Have Space",
                    "Please Fill All Blank");



        }else{
            //No Space
        }   //if

    }   // ClickSign


    public void ClickSignUpMain(View view){
        startActivity(new Intent(MainActivity.this, SignUpActivity.class));
    }


}   // Main Class นี้คือคลาสหลัก
