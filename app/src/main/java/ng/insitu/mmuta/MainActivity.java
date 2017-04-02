package ng.insitu.mmuta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoNumbers(View view){
        //code here
        Intent intent = new Intent(this, GoToNumbers.class);
        TextView textView = (TextView) findViewById(R.id.numbers);
        startActivity(intent);
    }

    public void gotoPhrases(View view){
        //code here
        Intent intent = new Intent(this, GoToPhrases.class);
        TextView textView = (TextView) findViewById(R.id.phrases);
        startActivity(intent);
    }

    public void gotoFamily(View view){
        //code here
        Intent intent = new Intent(this, GoToFamily.class);
        TextView textView = (TextView) findViewById(R.id.family);
        startActivity(intent);
    }

    public void gotoObjs(View view){
        //code here
        Intent intent = new Intent(this, GoToObjs.class);
        TextView textView = (TextView) findViewById(R.id.objs);
        startActivity(intent);
    }
}
