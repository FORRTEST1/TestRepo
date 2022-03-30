package com.example.firstapp;

import static org.junit.Assert.assertEquals;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testStuNameDisp() {
        ActivityScenario scenario = rule.getScenario();
        scenario.onActivity(activity -> {
            TextView tv = (TextView) activity.findViewById(R.id.nameText);

            // check invisibility at start
            assertEquals(tv.getVisibility(), View.INVISIBLE);

            // check text string
            assertEquals(tv.getText().toString(),
                    activity.getResources().getString(R.string.student_name));

            // failed test
            // assertEquals(tv.getText().toString(), "name");

            // check show button
            Button show_btn = (Button) activity.findViewById(R.id.showBtn);
            show_btn.performClick();
            assertEquals(tv.getVisibility(), View.VISIBLE);
        });
    }
}