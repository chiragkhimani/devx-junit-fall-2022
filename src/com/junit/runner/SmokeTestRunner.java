package com.junit.runner;

import com.junit.groups.MariaTest;
import com.junit.tests.DivisionTest;
import com.junit.tests.ModuloTest;
import com.junit.tests.MulTest;
import com.junit.groups.ChiragTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(MariaTest.class)
@Suite.SuiteClasses({DivisionTest.class, ModuloTest.class, MulTest.class})
public class SmokeTestRunner {

}
