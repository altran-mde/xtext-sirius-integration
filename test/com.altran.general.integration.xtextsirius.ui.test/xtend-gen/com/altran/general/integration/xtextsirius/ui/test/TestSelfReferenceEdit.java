package com.altran.general.integration.xtextsirius.ui.test;

import com.altran.general.integration.xtextsirius.test.reflang.refLang.Container;
import java.io.InputStream;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.espilce.commons.emf.testsupport.AModelLoader;
import org.espilce.commons.lang.loadhelper.ILoadHelper;
import org.espilce.commons.resource.WorkspaceUtils;
import org.espilce.commons.resource.loadhelper.WorkspacePluginLoadHelper;
import org.espilce.commons.testsupport.resource.ATestWorkspace;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class TestSelfReferenceEdit extends ATestWorkspace {
  private final String fileName = "test1.reflang";
  
  private final AModelLoader modelLoader = new AModelLoader() {
    @Override
    protected ILoadHelper createLoadHelper() {
      return TestSelfReferenceEdit.this.getLoadHelperX();
    }
  };
  
  private ILoadHelper loadHelper;
  
  private IFile file;
  
  @Before
  public void copyTestFile() {
    try {
      final ISafeRunnable _function = () -> {
        this.file = this.project.getFile(this.fileName);
        ILoadHelper _loadHelperX = this.getLoadHelperX();
        Class<? extends TestSelfReferenceEdit> _class = this.getClass();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("testData/refLangTest/");
        _builder.append(this.fileName);
        final InputStream contents = _loadHelperX.getContents(_class, _builder.toString());
        this.file.create(contents, true, null);
      };
      WorkspaceUtils.waitForWorkspaceChanges(_function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void checkFileExists() {
    try {
      Assert.assertNotNull(this.file);
      Assert.assertTrue(this.file.isAccessible());
      final EObject model = this.modelLoader.loadModel(this.file.getLocationURI().toURL());
      Assert.assertNotNull(model);
      Assert.assertTrue((model instanceof Container));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected ILoadHelper getLoadHelperX() {
    if ((this.loadHelper == null)) {
      this.loadHelper = this.createLoadHelper();
    }
    return this.loadHelper;
  }
  
  protected ILoadHelper createLoadHelper() {
    return new WorkspacePluginLoadHelper();
  }
}
