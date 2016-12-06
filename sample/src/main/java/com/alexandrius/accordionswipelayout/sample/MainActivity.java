package com.alexandrius.accordionswipelayout.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.alexandrius.accordionswipelayout.library.SwipeLayout;

public class MainActivity extends AppCompatActivity {

    SwipeLayout swipeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeLayout = (SwipeLayout) findViewById(R.id.swipe_layout);
        swipeLayout.setOnSwipeItemClickListener(new SwipeLayout.OnSwipeItemClickListener() {
            @Override
            public void onSwipeItemClick(boolean left, int index) {
                if (left) {
                    switch (index) {
                        case 0:
                            showToast("REFRESH");
                            break;
                    }
                } else {
                    switch (index) {
                        case 0:
                            showToast("REFRESH");
                            break;
                        case 1:
                            showToast("SETTINGS");
                            break;
                        case 2:
                            showToast("TRASH");
                            break;
                    }
                }
            }
        });
    }

    private void showToast(String toast) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }

    public void expandLeftAnimated(View view) {
        swipeLayout.setItemState(SwipeLayout.ITEM_STATE_LEFT_EXPAND, true);
    }

    public void expandRightAnimated(View view) {
        swipeLayout.setItemState(SwipeLayout.ITEM_STATE_RIGHT_EXPAND, true);
    }

    public void expandLeft(View view) {
        swipeLayout.setItemState(SwipeLayout.ITEM_STATE_LEFT_EXPAND, false);
    }

    public void expandRight(View view) {
        swipeLayout.setItemState(SwipeLayout.ITEM_STATE_RIGHT_EXPAND, false);
    }

    public void collapseAnimated(View view) {
        swipeLayout.setItemState(SwipeLayout.ITEM_STATE_COLLAPSED, true);
    }

    public void collapse(View view) {
        swipeLayout.setItemState(SwipeLayout.ITEM_STATE_COLLAPSED, false);
    }
}
