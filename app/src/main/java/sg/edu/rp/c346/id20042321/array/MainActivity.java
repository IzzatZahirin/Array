package sg.edu.rp.c346.id20042321.array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    String[] fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        this.setTitle ("Array");

        fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Cherry";

        tv = findViewById (R.id.textView);

        String text = "Fruits\n";
        text += "======\n";

        for (int i = 0; i < fruits.length; i++){
            text += fruits[i] + "\n";
        }
        tv.setText (text);
    }
}