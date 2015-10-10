package test.azz.com.testviewpager;

import android.support.v4.view.ViewPager.PageTransformer;
import android.util.Log;
import android.view.View;

/**
 * Created by AZZ on 15/10/8.
 */
public class ScrollOffsetTransformer implements PageTransformer {
    @Override
    public void transformPage(View page, float position) {
        Log.d("azzz", "page = " + page + ",pos = " + position);

        if (position > 0) {
            page.setTranslationX(-100 * position);
        }
    }
}
