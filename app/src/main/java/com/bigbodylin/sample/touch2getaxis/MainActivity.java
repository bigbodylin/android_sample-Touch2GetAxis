package com.bigbodylin.sample.touch2getaxis;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * This sample is showing touch event get XY point.
 *
 * @author garylin
 * @since 2017/11/24
 */
public class MainActivity extends Activity {

    private int y_axis,x_axis;
    private static String TAG = "MainActivity";

    private TextView mShowXYAxis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowXYAxis = findViewById(R.id.txt_xy_show);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG,"ACTION_DOWN");

                x_axis = (int) event.getX();
                y_axis = (int) event.getY();

                Log.i(TAG,"point x = "+x_axis);
                Log.i(TAG,"point y = "+y_axis);

                mShowXYAxis.setText(String.format(getString(R.string.show_xy_axis_format),x_axis,y_axis));
                break;

            case MotionEvent.ACTION_UP:
                Log.i(TAG,"ACTION_UP");

                x_axis = (int) event.getX();
                y_axis = (int) event.getY();

                Log.i(TAG,"point x = "+x_axis);
                Log.i(TAG,"point y = "+y_axis);

                mShowXYAxis.setText(String.format(getString(R.string.show_xy_axis_format),x_axis,y_axis));
                break;

            case MotionEvent.ACTION_MOVE:
                Log.i(TAG,"ACTION_MOVE");

                x_axis = (int) event.getX();
                y_axis = (int) event.getY();

                Log.i(TAG,"point x = "+x_axis);
                Log.i(TAG,"point y = "+y_axis);

                mShowXYAxis.setText(String.format(getString(R.string.show_xy_axis_format),x_axis,y_axis));
                break;

            default:
                break;

        }

        // If return true,it will be finished action.
        // If return false,it will not be finished action.
        return false;
    }
}
