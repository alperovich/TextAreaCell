package TextArea.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.editor.behavior.AbstractComponent__BehaviorDescriptor;
import jetbrains.mps.scope.ListScope;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration__BehaviorDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class CellModel_TextArea_Constraints extends BaseConstraintsDescriptor {
  public CellModel_TextArea_Constraints() {
    super(CONCEPTS.CellModel_TextArea$G_);
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    BaseReferenceConstraintsDescriptor d0 = new BaseReferenceConstraintsDescriptor(LINKS.propertyDeclaration$Zi0D, this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }
      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseScopeProvider() {
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_qcfkis_a0a0a0a0a1a0a0a0c;
          }
          @Override
          public Scope createScope(final ReferenceConstraintsContext _context) {
            SNode editorComponent = SNodeOperations.getNodeAncestor(_context.getContextNode(), CONCEPTS.BaseEditorComponent$Sy, true, false);
            SNode editedConcept = AbstractComponent__BehaviorDescriptor.getConceptDeclaration_id67EYkym$wx3.invoke(editorComponent);
            return ListScope.forResolvableElements(AbstractConceptDeclaration__BehaviorDescriptor.getPropertyDeclarations_idhEwILLM.invoke(editedConcept));
          }
        };
      }
    };
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(d0.getReference(), d0);
    return references;
  }
  private static final SNodePointer breakingNode_qcfkis_a0a0a0a0a1a0a0a0c = new SNodePointer("r:86c0270d-fe03-400d-8267-bcad4bc845cd(TextArea.constraints)", "6836281137582785396");

  private static final class CONCEPTS {
    /*package*/ static final SConcept CellModel_TextArea$G_ = MetaAdapterFactory.getConcept(0x57e598f96f954540L, 0x9a9774ff1e983c96L, 0x243609db3acb153bL, "TextArea.structure.CellModel_TextArea");
    /*package*/ static final SConcept BaseEditorComponent$Sy = MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xfba0eb7c50L, "jetbrains.mps.lang.editor.structure.BaseEditorComponent");
  }

  private static final class LINKS {
    /*package*/ static final SReferenceLink propertyDeclaration$Zi0D = MetaAdapterFactory.getReferenceLink(0x57e598f96f954540L, 0x9a9774ff1e983c96L, 0x243609db3acb153bL, 0xf9eb070d8cL, "propertyDeclaration");
  }
}
