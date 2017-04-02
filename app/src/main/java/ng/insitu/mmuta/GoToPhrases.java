package ng.insitu.mmuta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class GoToPhrases extends AppCompatActivity {

    Button button;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_to_phrases);

        addListenerOnButton();
    }

    public int current_image_index = 0;

    public void addListenerOnButton(){

        imageView = (ImageView) findViewById(R.id.phrase_img);
        button = (Button) findViewById(R.id.btnChangePhrImg);

        //final int current_image_index = 0;

        final int[] images = {R.drawable.four,R.drawable.three,R.drawable.two,R.drawable.one};
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((images.length)> current_image_index) {
                    imageView.setImageResource(images[current_image_index]);
                    current_image_index++;
                     //current_image_index %= images.length;
                }// end of OnClick method

            }
        });
    }// end of addlisteneronbutton
}
