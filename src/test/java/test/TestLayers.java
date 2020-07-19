package test;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import org.junit.Test;

import com.tngtech.archunit.core.importer.ClassFileImporter;

public class TestLayers {

 @Test
 public void testLayers() {
  layeredArchitecture()
    .layer("BusinessLogic").definedBy("..model..")
    .layer("Infra").definedBy("..infrastructure..")
    .whereLayer("BusinessLogic").mayOnlyBeAccessedByLayers("Infra")
    .whereLayer("Infra").mayNotBeAccessedByAnyLayer()
    .check(new ClassFileImporter().importPackages("notifications"));
 }
}
