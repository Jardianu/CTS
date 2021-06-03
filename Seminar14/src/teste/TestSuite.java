package teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({GrupaTestPentruMocks.class, TestGrupa.class, TestGrupaFixture.class})
public class TestSuite {
}
