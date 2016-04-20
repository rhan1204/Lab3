package com.example.rohan.lab3.tests;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.rohan.lab3.MainActivity;
import com.example.rohan.lab3.R;

/**
 * Created by rohan on 4/20/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
        MainActivity mainActivity;

        public JUnit_test() {
            super(MainActivity.class);
        }


        public void test_first() {
            mainActivity = getActivity();



            assertEquals(4,2+2);
        }
    }

