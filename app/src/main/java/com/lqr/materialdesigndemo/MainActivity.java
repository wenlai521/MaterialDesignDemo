package com.lqr.materialdesigndemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getLayoutInflater();
    }

    private void jumpToActivity(Class activityClass) {
        startActivity(new Intent(this, activityClass));
    }

    public void swipeRefreshLayout(View view) {
        jumpToActivity(SwipeRefreshLayoutActivity.class);
    }


    public void listPopupWindow(View view) {
        jumpToActivity(ListPopupWindowActivity.class);
    }

    public void popupMenu(View view) {
        jumpToActivity(PopupMenuActivity.class);
    }

    public void linearLayoutCompat(View view) {
        jumpToActivity(LinearLayoutCompatActivity.class);
    }

    public void recyclerView(View view) {
        jumpToActivity(RecyclerViewActivity.class);
    }

    public void recyclerViewDecorationOne(View view) {
        jumpToActivity(RecyclerVIewDecorationActivityOne.class);
    }

    public void recyclerViewDecorationTwo(View view) {
        jumpToActivity(RecyclerVIewDecorationActivityTwo.class);
    }

    public void recyclerViewDecorationThree(View view) {
        jumpToActivity(RecyclerVIewDecorationActivityThree.class);
    }

    public void itemTouchHelper(View view) {
        jumpToActivity(ItemTouchHelperActivity.class);
    }
}
