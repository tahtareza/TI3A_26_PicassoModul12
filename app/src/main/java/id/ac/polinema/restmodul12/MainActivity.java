package id.ac.polinema.restmodul12;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView ivHero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String imageUri = "https://cms-assets.tutsplus.com/uploads/users/21/posts/19431/featured_image/CodeFeature.jpg";//url gambar
        ivHero = (ImageView) findViewById(R.id.iv_hero);
        Picasso.with(getApplicationContext())
                .load(imageUri)
                .placeholder(R.drawable.photoid)
                .error(R.drawable.error)
                .into(ivHero); //memanggil gambar dan diletakkan pada ivHero
    }
}
