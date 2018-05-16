package gomez.martinez.guevara.recycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);
        ArrayList<Lugar> lugares = new ArrayList<>();

        lugares.add(new Lugar("https://www.thenational.ae/image/policy:1.664553:1507218840/Wk06-Mel5.jpg?f=16x9&w=1200&$p$f$w=204e5d9","Melbourne"));
        lugares.add(new Lugar("https://img.ev.mu/images/villes/5580/1605x642/5580.jpg","París"));
        lugares.add(new Lugar("https://imvid.depor.com/files/article_multimedia/uploads/2017/01/04/586d84f0dcf15.jpeg","Rio de Janeiro"));
        lugares.add(new Lugar("http://foodandtravel.mx/home/wp-content/uploads/2017/01/shutterstock_417642688-e1484160058190.jpg","Hamburgo"));

        rv.setLayoutManager(new GridLayoutManager(getApplicationContext(),1));
        rv.setHasFixedSize(true);
        rv.setAdapter(new LugarAdapter(getApplicationContext(),lugares));
    }
}
