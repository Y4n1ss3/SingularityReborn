package androidx.compose.ui.platform;

import android.content.res.Resources;
import androidx.compose.ui.R;
import androidx.compose.ui.contentcapture.ContentCaptureManager;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsSortKt;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.er;
import defpackage.g10;
import defpackage.ky;
import defpackage.la0;
import defpackage.o;
import defpackage.q10;
import defpackage.ti;
import defpackage.ui;
import defpackage.y80;
import defpackage.yi;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean accessibilityEquals(AccessibilityAction<?> accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!q10.b(accessibilityAction.getLabel(), accessibilityAction2.getLabel())) {
            return false;
        }
        if (accessibilityAction.getAction() != null || accessibilityAction2.getAction() == null) {
            return accessibilityAction.getAction() == null || accessibilityAction2.getAction() != null;
        }
        return false;
    }

    private static final String createStateDescriptionForTextField(SemanticsNode semanticsNode, Resources resources) {
        SemanticsConfiguration config = semanticsNode.copyWithMergingEnabled$ui().getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Collection collection = (Collection) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getContentDescription());
        if (collection != null && !collection.isEmpty()) {
            return null;
        }
        Collection collection2 = (Collection) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getText());
        if (collection2 != null && !collection2.isEmpty()) {
            return null;
        }
        CharSequence charSequence = (CharSequence) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getEditableText());
        if (charSequence == null || charSequence.length() == 0) {
            return resources.getString(R.string.state_empty);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enabled(SemanticsNode semanticsNode) {
        return !semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getDisabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean excludeLineAndPageGranularities(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui.contains(semanticsProperties.getEditableText()) && !q10.b(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getFocused()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode findClosestParentNode = findClosestParentNode(semanticsNode.getLayoutNode$ui(), AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1.INSTANCE);
        if (findClosestParentNode != null) {
            SemanticsConfiguration semanticsConfiguration = findClosestParentNode.getSemanticsConfiguration();
            if (!(semanticsConfiguration != null ? q10.b(SemanticsConfigurationKt.getOrNull(semanticsConfiguration, semanticsProperties.getFocused()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutNode findClosestParentNode(LayoutNode layoutNode, ky kyVar) {
        for (LayoutNode parent$ui = layoutNode.getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            if (((Boolean) kyVar.invoke(parent$ui)).booleanValue()) {
                return parent$ui;
            }
        }
        return null;
    }

    public static final boolean getDisableContentCapture() {
        return ContentCaptureManager.Companion.isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getInfoIsCheckable(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getRole());
        boolean z = toggleableState != null;
        if (((Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getSelected())) != null) {
            if (!(role != null ? Role.m6824equalsimpl0(role.m6827unboximpl(), Role.Companion.m6835getTabo7Vup1c()) : false)) {
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getInfoStateDescriptionOrNull(SemanticsNode semanticsNode, Resources resources) {
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Object orNull = SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getStateDescription());
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getRole());
        if (toggleableState != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i == 1) {
                if ((role == null ? false : Role.m6824equalsimpl0(role.m6827unboximpl(), Role.Companion.m6834getSwitcho7Vup1c())) && orNull == null) {
                    orNull = resources.getString(R.string.state_on);
                }
            } else if (i == 2) {
                if ((role == null ? false : Role.m6824equalsimpl0(role.m6827unboximpl(), Role.Companion.m6834getSwitcho7Vup1c())) && orNull == null) {
                    orNull = resources.getString(R.string.state_off);
                }
            } else {
                if (i != 3) {
                    o.n();
                    return null;
                }
                if (orNull == null) {
                    orNull = resources.getString(R.string.indeterminate);
                }
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (!(role == null ? false : Role.m6824equalsimpl0(role.m6827unboximpl(), Role.Companion.m6835getTabo7Vup1c())) && orNull == null) {
                orNull = booleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                if (orNull == null) {
                    ui range = progressBarRangeInfo.getRange();
                    float floatValue = Float.valueOf(((ti) range).b).floatValue();
                    ti tiVar = (ti) range;
                    float f = tiVar.a;
                    float current = floatValue - Float.valueOf(f).floatValue() == 0.0f ? 0.0f : (progressBarRangeInfo.getCurrent() - Float.valueOf(f).floatValue()) / (Float.valueOf(tiVar.b).floatValue() - Float.valueOf(f).floatValue());
                    if (current < 0.0f) {
                        current = 0.0f;
                    }
                    if (current > 1.0f) {
                        current = 1.0f;
                    }
                    orNull = resources.getString(R.string.template_percent, Integer.valueOf(current != 0.0f ? current == 1.0f ? 100 : y80.h(Math.round(current * 100.0f), 1, 99) : 0));
                }
            } else if (orNull == null) {
                orNull = resources.getString(R.string.in_progress);
            }
        }
        if (semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties.getEditableText())) {
            orNull = createStateDescriptionForTextField(semanticsNode, resources);
        }
        return (String) orNull;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString getInfoText(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getEditableText());
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getText());
        return annotatedString == null ? list != null ? (AnnotatedString) yi.q0(list) : null : annotatedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRtl(SemanticsNode semanticsNode) {
        return semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScreenReaderFocusable(SemanticsNode semanticsNode, Resources resources) {
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getContentDescription());
        return !SemanticsOwnerKt.isHidden(semanticsNode) && (semanticsNode.getUnmergedConfig$ui().isMergingSemanticsOfDescendants() || (semanticsNode.isUnmergedLeafNode$ui() && ((list != null ? (String) yi.q0(list) : null) != null || getInfoText(semanticsNode) != null || getInfoStateDescriptionOrNull(semanticsNode, resources) != null || getInfoIsCheckable(semanticsNode))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean propertiesDeleted(SemanticsNode semanticsNode, SemanticsConfiguration semanticsConfiguration) {
        Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = semanticsConfiguration.iterator();
        while (it.hasNext()) {
            if (!semanticsNode.getConfig().contains(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final void setDisableContentCapture(boolean z) {
        ContentCaptureManager.Companion.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTraversalValues(g10 g10Var, la0 la0Var, la0 la0Var2, Resources resources) {
        la0Var.a();
        la0Var2.a();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) g10Var.b(-1);
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
        semanticsNode.getClass();
        List<SemanticsNode> subtreeSortedByGeometryGrouping = SemanticsSortKt.subtreeSortedByGeometryGrouping(semanticsNode, new AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$1(g10Var), new AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$2(resources), y80.D(semanticsNode));
        int v = y80.v(subtreeSortedByGeometryGrouping);
        int i = 1;
        if (1 > v) {
            return;
        }
        while (true) {
            int id = subtreeSortedByGeometryGrouping.get(i - 1).getId();
            int id2 = subtreeSortedByGeometryGrouping.get(i).getId();
            la0Var.g(id, id2);
            la0Var2.g(id2, id);
            if (i == v) {
                return;
            } else {
                i++;
            }
        }
    }

    @er
    public static /* synthetic */ void getDisableContentCapture$annotations() {
    }
}
