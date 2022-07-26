package com.geekbrains.tests.view.search


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.geekbrains.tests.R
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTestRecorder1 {

    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun mainActivityTestRecorder1() {
        val appCompatEditText = onView(
            allOf(
                withId(R.id.searchEditText),

                isDisplayed()
            )
        )
        appCompatEditText.perform(replaceText("ui"), closeSoftKeyboard())

        val appCompatEditText2 = onView(
            allOf(
                withId(R.id.searchEditText), withText("ui"),

                isDisplayed()
            )
        )
        appCompatEditText2.perform(pressImeActionButton())

        val materialButton = onView(
            allOf(
                withId(R.id.toDetailsActivityButton), withText("to details"),

                isDisplayed()
            )
        )
        materialButton.perform(click())

        val materialButton2 = onView(
            allOf(
                withId(R.id.decrementButton), withText("-"),

                isDisplayed()
            )
        )
        materialButton2.perform(click())

        val button = onView(
            allOf(
                withId(R.id.decrementButton), withText("-"),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()
            )
        )
        button.check(matches(isDisplayed()))

        val button2 = onView(
            allOf(
                withId(R.id.decrementButton), withText("-"),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()
            )
        )
        button2.check(matches(isDisplayed()))
    }

}
