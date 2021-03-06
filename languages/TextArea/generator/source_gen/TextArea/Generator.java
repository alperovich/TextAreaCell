package TextArea;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateModuleInterpreted2;
import jetbrains.mps.smodel.language.LanguageRegistry;
import jetbrains.mps.smodel.language.LanguageRuntime;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.module.SModuleReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import main.QueriesGenerated;
import jetbrains.mps.generator.runtime.TemplateModuleBase;
import java.util.Collection;
import org.jetbrains.mps.openapi.language.SLanguage;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Arrays;
import jetbrains.mps.generator.runtime.TemplateMappingPriorityRule;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class Generator extends TemplateModuleInterpreted2 {

  public Generator(LanguageRegistry languageRegistry, LanguageRuntime sourceLanguage, jetbrains.mps.smodel.Generator generator) {
    super(languageRegistry, sourceLanguage, generator);
  }

  @NotNull
  @Override
  public SModuleReference getModuleReference() {
    return PersistenceFacade.getInstance().createModuleReference("161ea483-b082-49f4-a05d-e1b7b1676040(TextArea#01)");
  }

  @Override
  protected void fillTemplateModels(TemplateModuleInterpreted2.TemplateModels models) {
    models.templates("r:9e4a2132-e1fe-47d4-b319-109130d3dbcf", QueriesGenerated.class);
  }

  @Override
  protected void fillReferencedGenerators(TemplateModuleBase.ReferencedGenerators referencedGenerators) {
    referencedGenerators.extended("0647eca7-da98-422a-8a8b-6ebc0bd014ea(jetbrains.mps.lang.editor#1129914002149)");
  }

  @Override
  public Collection<SLanguage> getTargetLanguages() {
    SLanguage[] rv = new SLanguage[2];
    rv[0] = MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage");
    rv[1] = MetaAdapterFactory.getLanguage(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, "jetbrains.mps.lang.smodel");
    return Arrays.asList(rv);
  }

  @Override
  public Collection<TemplateMappingPriorityRule> getPriorities() {
    return TemplateUtil.asCollection(TemplateUtil.createStrictlyTogetherRule(TemplateUtil.createRefExternal("161ea483-b082-49f4-a05d-e1b7b1676040(TextArea#01)", TemplateUtil.createRefNormal("r:9e4a2132-e1fe-47d4-b319-109130d3dbcf(main@generator)", "2609283871296645420", "main")), TemplateUtil.createRefExternal("0647eca7-da98-422a-8a8b-6ebc0bd014ea(jetbrains.mps.lang.editor#1129914002149)", TemplateUtil.createRefNormal("r:00000000-0000-4000-0000-011c8959029f(jetbrains.mps.lang.editor.generator.baseLanguage.template.main@generator)", "1096629760203", "MAPPING_main"))));
  }
}
