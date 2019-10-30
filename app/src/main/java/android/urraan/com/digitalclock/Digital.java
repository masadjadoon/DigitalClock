package android.urraan.com.digitalclock;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RemoteViews;
import android.widget.TextClock;
import android.widget.TextView;

import static android.graphics.Color.BLACK;

public class Digital extends AppCompatActivity {

Button btn,butn;
TextView txt;
TextClock clock;
Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital);



        txt=findViewById(R.id.textView);
        btn=findViewById(R.id.btn1);
        butn=findViewById(R.id.btn2);
     //   clock=findViewById(R.id.textClock);
     //

      //  final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.Widget);

       /* btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //    RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.Widget);
            //    relativeLayout.setBackgroundColor(Color.RED);
                //relativeLayout.setBackgroundResource(R.color.colorAccent);
            }
        });*/
        butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          //      TextClock textClock = (TextClock) findViewById(R.id.textClock);
           //     textClock.setTextColor(Color.BLUE);
                // RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.Widget);
               // relativeLayout.setBackgroundColor(Color.parseColor("#000000"));
             //   ChangeColor();
            }
        });


        }

  public void ChangeColor()
   {
       clock=findViewById(R.id.textClock);
        TextClock textClock = (TextClock) findViewById(R.id.textClock);
        textClock.setTextColor(Color.BLUE);
     //   relativeLayout.setBackgroundColor(Color.BLUE);
      //  textClock.setBackgroundColor(Color.parseColor("#000000"));
       //textClock.setBackgroundColor(getResources().getColor(R.color.colorAccent));

   }

}
