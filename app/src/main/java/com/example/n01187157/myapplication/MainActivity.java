package com.example.n01187157.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //Inititating all the view
   public EditText edit_text_ex;
   public TextView Title;
   public TextView texter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //all the text views are ready to be used
        edit_text_ex=(EditText)findViewById(R.id.edit_text_example);
        texter=(TextView)findViewById(R.id.text_view_example);
        Title=(TextView)findViewById(R.id.titleview);

       edit_text_ex.setText("The magnifier is already integrated with platform widgets such as TextView, EditText, or WebView. It provides consistent text manipulation across applications. The widget comes with a simple API and can be used to magnify any View depending on your application’s context");
        Title.setText("This is an example of magnifier and how it works,when you select any text on the bottom .");
        texter.setText("Refernce :- https://developer.android.com/guide/topics/text/magnifier#java");






      //  final Magnifier magnifier = new Magnifier(view);
      //  magnifier.show(view.getWidth() / 2, view.getHeight() / 2);
       // magnifier.dismiss();




    }
}
