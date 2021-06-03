package teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestGrupaFixture.class, GrupaTestPentruMocks.class, TestGrupa.class, TestGrupaFixture.class})
@Categories.IncludeCategory(GetPromovabilitateCategory.class)
@Categories.ExcludeCategory({TesteUrgeneteCategory.class, ConstructorGrupaCategory.class})
public class SuitaCustom {
}
