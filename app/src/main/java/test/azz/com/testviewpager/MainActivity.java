package test.azz.com.testviewpager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        View v1 = new View(this);
        View v2 = new View(this);
        View v3 = new View(this);
        View v4 = new View(this);
        v1.setBackgroundColor(Color.parseColor("#aaabcdef"));
        v2.setBackgroundColor(Color.parseColor("#aa000a00"));
        v3.setBackgroundColor(Color.parseColor("#aaabc000"));
        v4.setBackgroundColor(Color.parseColor("#aa000000"));

        List<View> views = new ArrayList<View>();
        views.add(v1);
        views.add(v2);
        views.add(v3);
        views.add(v4);

        viewPager.setAdapter(new AZPagerAdapter(views));
        viewPager.setPageTransformer(true, new ScrollOffsetTransformer());
        //左右各多加载2页（默认1页）
        viewPager.setOffscreenPageLimit(2);
    }
}
