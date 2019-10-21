package Suites;

import Tests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestBelleza.class, TestHogar.class, TestJuguete.class, TestTecnologia.class, TestTextil.class})
public class TestSuite1 {

}
