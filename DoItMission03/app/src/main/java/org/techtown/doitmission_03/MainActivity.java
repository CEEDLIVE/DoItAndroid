package org.techtown.doitmission_03;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView ivTop, ivBottom;
    private BitmapDrawable bitmapTop, bitmapBottom;
    private int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivTop = findViewById(R.id.ivTop);
        ivBottom = findViewById(R.id.ivBottom);

        Resources res = getResources();
        bitmapTop = (BitmapDrawable) res.getDrawable(R.drawable.chrysanthemum);
        bitmapBottom = (BitmapDrawable) res.getDrawable(R.drawable.desert);

        int bitmapTopWidth = bitmapTop.getIntrinsicWidth();
        int bitmapTopHeight = bitmapTop.getIntrinsicHeight();

        ivTop.setImageDrawable(bitmapTop);
        ivTop.getLayoutParams().width = bitmapTopWidth;
        ivTop.getLayoutParams().height = bitmapTopHeight;

        // set bitmap (bottom)
        int bitmapBottomWidth = bitmapBottom.getIntrinsicWidth();
        int bitmapBottomHeight = bitmapBottom.getIntrinsicHeight();

        ivBottom.setImageDrawable(bitmapBottom);
        ivBottom.getLayoutParams().width = bitmapBottomWidth;
        ivBottom.getLayoutParams().height = bitmapBottomHeight;
    }

    public void onButtonChangeClicked(View v) {
        changeImage();
    }

    private void changeImage() {
        Resources res = getResources();

        if (0 == imageIndex) {
            bitmapTop = (BitmapDrawable) res.getDrawable(R.drawable.desert);
            bitmapBottom = (BitmapDrawable) res.getDrawable(R.drawable.chrysanthemum);

            imageIndex = 1;
        } else if (1 == imageIndex) {
            bitmapTop = (BitmapDrawable) res.getDrawable(R.drawable.chrysanthemum);
            bitmapBottom = (BitmapDrawable) res.getDrawable(R.drawable.desert);

            imageIndex = 0;
        }

        int bitmapTopWidth = bitmapTop.getIntrinsicWidth();
        int bitmapTopHeight = bitmapTop.getIntrinsicHeight();

        ivTop.setImageDrawable(bitmapTop);
        ivTop.getLayoutParams().width = bitmapTopWidth;
        ivTop.getLayoutParams().height = bitmapTopHeight;

        // set bitmap (bottom)
        int bitmapBottomWidth = bitmapBottom.getIntrinsicWidth();
        int bitmapBottomHeight = bitmapBottom.getIntrinsicHeight();

        ivBottom.setImageDrawable(bitmapBottom);
        ivBottom.getLayoutParams().width = bitmapBottomWidth;
        ivBottom.getLayoutParams().height = bitmapBottomHeight;
    }

}
