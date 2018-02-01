package com.igormaznitsa.upom.logictests;

import static org.junit.Assert.assertTrue;

import java.io.File;

public abstract class AbstractLogicTest {
  public File getFolder(final String name) throws Exception {
    final String classFolder = AbstractLogicTest.class.getPackage().getName().replace('.', File.separatorChar);
    final File baseFolder = new File(new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()), classFolder);
    final File testFolder = new File(baseFolder,name);
    assertTrue("can't find "+testFolder, testFolder.isDirectory());
    return testFolder;
  }
}
