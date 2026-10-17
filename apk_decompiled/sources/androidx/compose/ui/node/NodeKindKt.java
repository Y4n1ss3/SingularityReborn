package androidx.compose.ui.node;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Actual_jvmAndAndroidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNodeKt;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusPropertiesModifierNodeKt;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnPlacedNode;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import androidx.compose.ui.semantics.SemanticsModifier;
import defpackage.ad0;
import defpackage.ta0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class NodeKindKt {
    private static final int Inserted = 1;
    private static final int Removed = 2;
    private static final int Updated = 0;
    private static final ta0 classToKindSetMap;

    static {
        ta0 ta0Var = ad0.a;
        classToKindSetMap = new ta0();
    }

    public static final void autoInvalidateInsertedNode(Modifier.Node node) {
        if (!node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateInsertedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 1);
    }

    public static final void autoInvalidateNodeIncludingDelegates(Modifier.Node node, int i, int i2) {
        if (!(node instanceof DelegatingNode)) {
            autoInvalidateNodeSelf(node, i & node.getKindSet$ui(), i2);
            return;
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        autoInvalidateNodeSelf(node, delegatingNode.getSelfKindSet$ui() & i, i2);
        int i3 = (~delegatingNode.getSelfKindSet$ui()) & i;
        for (Modifier.Node delegate$ui = delegatingNode.getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
            autoInvalidateNodeIncludingDelegates(delegate$ui, i3, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void autoInvalidateNodeSelf(Modifier.Node node, int i, int i2) {
        if (i2 != 0 || node.getShouldAutoInvalidate()) {
            if ((NodeKind.m6573constructorimpl(2) & i) != 0 && (node instanceof LayoutModifierNode)) {
                LayoutModifierNodeKt.invalidateMeasurement((LayoutModifierNode) node);
                if (i2 == 2) {
                    DelegatableNodeKt.m6414requireCoordinator64DMado(node, NodeKind.m6573constructorimpl(2)).onRelease();
                }
            }
            if ((NodeKind.m6573constructorimpl(Fields.SpotShadowColor) & i) != 0 && i2 != 2) {
                DelegatableNodeKt.requireLayoutNode(node).invalidateMeasurements$ui();
            }
            if ((NodeKind.m6573constructorimpl(4194304) & i) != 0 && i2 != 2) {
                LayoutNode.requestRelayout$ui$default(DelegatableNodeKt.requireLayoutNode(node), false, 1, null);
            }
            if ((NodeKind.m6573constructorimpl(Fields.RotationX) & i) != 0 && (node instanceof GlobalPositionAwareModifierNode)) {
                if (i2 == 1) {
                    LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(node);
                    requireLayoutNode.setGloballyPositionedObservers(requireLayoutNode.getGloballyPositionedObservers() + 1);
                } else if (i2 == 2) {
                    DelegatableNodeKt.requireLayoutNode(node).setGloballyPositionedObservers(r1.getGloballyPositionedObservers() - 1);
                }
                if (i2 != 2) {
                    DelegatableNodeKt.requireLayoutNode(node).invalidateOnPositioned$ui();
                }
            }
            if ((NodeKind.m6573constructorimpl(4) & i) != 0 && (node instanceof DrawModifierNode)) {
                DrawModifierNodeKt.invalidateDraw((DrawModifierNode) node);
            }
            if ((NodeKind.m6573constructorimpl(8) & i) != 0 && (node instanceof SemanticsModifierNode)) {
                DelegatableNodeKt.requireLayoutNode(node).setSemanticsInvalidated$ui(true);
            }
            if ((NodeKind.m6573constructorimpl(64) & i) != 0 && (node instanceof ParentDataModifierNode)) {
                ParentDataModifierNodeKt.invalidateParentData((ParentDataModifierNode) node);
            }
            if ((NodeKind.m6573constructorimpl(Fields.CameraDistance) & i) != 0 && (node instanceof FocusPropertiesModifierNode)) {
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
                if (specifiesCanFocusProperty(focusPropertiesModifierNode)) {
                    FocusPropertiesModifierNodeKt.invalidateFocusProperties(focusPropertiesModifierNode);
                }
            }
            if ((NodeKind.m6573constructorimpl(Fields.TransformOrigin) & i) != 0 && (node instanceof FocusEventModifierNode)) {
                FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) node);
            }
            if ((i & NodeKind.m6573constructorimpl(2097152)) != 0 && (node instanceof IndirectPointerInputModifierNode) && i2 == 2) {
                ((IndirectPointerInputModifierNode) node).onCancelIndirectPointerInput();
            }
        }
    }

    public static final void autoInvalidateRemovedNode(Modifier.Node node) {
        if (!node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateRemovedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 2);
    }

    public static final void autoInvalidateUpdatedNode(Modifier.Node node) {
        if (!node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateUpdatedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int calculateNodeKindSetFrom(Modifier.Node node) {
        int m6573constructorimpl;
        if (node.getKindSet$ui() != 0) {
            return node.getKindSet$ui();
        }
        ta0 ta0Var = classToKindSetMap;
        Object classKeyForObject = Actual_jvmAndAndroidKt.classKeyForObject(node);
        int a = ta0Var.a(classKeyForObject);
        if (a >= 0) {
            return ta0Var.c[a];
        }
        int m6573constructorimpl2 = NodeKind.m6573constructorimpl(1);
        if (node instanceof LayoutModifierNode) {
            m6573constructorimpl2 |= NodeKind.m6573constructorimpl(2);
        }
        if (node instanceof DrawModifierNode) {
            m6573constructorimpl2 |= NodeKind.m6573constructorimpl(4);
        }
        if (node instanceof SemanticsModifierNode) {
            m6573constructorimpl2 |= NodeKind.m6573constructorimpl(8);
        }
        if (node instanceof PointerInputModifierNode) {
            m6573constructorimpl2 |= NodeKind.m6573constructorimpl(16);
        }
        if (node instanceof ModifierLocalModifierNode) {
            m6573constructorimpl2 |= NodeKind.m6573constructorimpl(32);
        }
        if (node instanceof ParentDataModifierNode) {
            m6573constructorimpl2 |= NodeKind.m6573constructorimpl(64);
        }
        if (node instanceof OnPlacedNode) {
            m6573constructorimpl = NodeKind.m6573constructorimpl(4194304);
        } else {
            if (!(node instanceof LayoutAwareModifierNode)) {
                if (node instanceof MeasuredSizeAwareModifierNode) {
                    m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.SpotShadowColor);
                }
                if (node instanceof GlobalPositionAwareModifierNode) {
                    m6573constructorimpl2 |= NodeKind.m6573constructorimpl(Fields.RotationX);
                }
                if (node instanceof ApproachLayoutModifierNode) {
                    m6573constructorimpl2 |= NodeKind.m6573constructorimpl(Fields.RotationY);
                }
                if (node instanceof FocusTargetNode) {
                    m6573constructorimpl2 |= NodeKind.m6573constructorimpl(Fields.RotationZ);
                }
                if (node instanceof FocusPropertiesModifierNode) {
                    m6573constructorimpl2 |= NodeKind.m6573constructorimpl(Fields.CameraDistance);
                }
                if (node instanceof FocusEventModifierNode) {
                    m6573constructorimpl2 |= NodeKind.m6573constructorimpl(Fields.TransformOrigin);
                }
                if (node instanceof KeyInputModifierNode) {
                    m6573constructorimpl2 |= NodeKind.m6573constructorimpl(8192);
                }
                if (node instanceof RotaryInputModifierNode) {
                    m6573constructorimpl2 |= NodeKind.m6573constructorimpl(Fields.Clip);
                }
                if (node instanceof CompositionLocalConsumerModifierNode) {
                    m6573constructorimpl2 |= NodeKind.m6573constructorimpl(Fields.CompositingStrategy);
                }
                if (node instanceof SoftKeyboardInterceptionModifierNode) {
                    m6573constructorimpl2 |= NodeKind.m6573constructorimpl(Fields.RenderEffect);
                }
                if (node instanceof TraversableNode) {
                    m6573constructorimpl2 |= NodeKind.m6573constructorimpl(Fields.ColorFilter);
                }
                if (node instanceof BringIntoViewModifierNode) {
                    m6573constructorimpl2 |= NodeKind.m6573constructorimpl(Fields.BlendMode);
                }
                if (node instanceof UnplacedAwareModifierNode) {
                    m6573constructorimpl2 |= NodeKind.m6573constructorimpl(1048576);
                }
                if (node instanceof IndirectPointerInputModifierNode) {
                    m6573constructorimpl2 |= NodeKind.m6573constructorimpl(2097152);
                }
                if (node instanceof BeyondBoundsLayoutProviderModifierNode) {
                    m6573constructorimpl2 |= NodeKind.m6573constructorimpl(GroupFlagsKt.IsNodeFlag);
                }
                ta0Var.h(m6573constructorimpl2, classKeyForObject);
                return m6573constructorimpl2;
            }
            m6573constructorimpl2 |= NodeKind.m6573constructorimpl(Fields.SpotShadowColor);
            m6573constructorimpl = NodeKind.m6573constructorimpl(4194304);
        }
        m6573constructorimpl2 |= m6573constructorimpl;
        if (node instanceof GlobalPositionAwareModifierNode) {
        }
        if (node instanceof ApproachLayoutModifierNode) {
        }
        if (node instanceof FocusTargetNode) {
        }
        if (node instanceof FocusPropertiesModifierNode) {
        }
        if (node instanceof FocusEventModifierNode) {
        }
        if (node instanceof KeyInputModifierNode) {
        }
        if (node instanceof RotaryInputModifierNode) {
        }
        if (node instanceof CompositionLocalConsumerModifierNode) {
        }
        if (node instanceof SoftKeyboardInterceptionModifierNode) {
        }
        if (node instanceof TraversableNode) {
        }
        if (node instanceof BringIntoViewModifierNode) {
        }
        if (node instanceof UnplacedAwareModifierNode) {
        }
        if (node instanceof IndirectPointerInputModifierNode) {
        }
        if (node instanceof BeyondBoundsLayoutProviderModifierNode) {
        }
        ta0Var.h(m6573constructorimpl2, classKeyForObject);
        return m6573constructorimpl2;
    }

    public static final int calculateNodeKindSetFromIncludingDelegates(Modifier.Node node) {
        if (!(node instanceof DelegatingNode)) {
            return calculateNodeKindSetFrom(node);
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        int selfKindSet$ui = delegatingNode.getSelfKindSet$ui();
        for (Modifier.Node delegate$ui = delegatingNode.getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
            selfKindSet$ui |= calculateNodeKindSetFromIncludingDelegates(delegate$ui);
        }
        return selfKindSet$ui;
    }

    /* renamed from: contains-64DMado, reason: not valid java name */
    public static final boolean m6581contains64DMado(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: getIncludeSelfInTraversal-H91voCI, reason: not valid java name */
    public static final boolean m6582getIncludeSelfInTraversalH91voCI(int i) {
        return ((NodeKind.m6573constructorimpl(Fields.SpotShadowColor) & i) != 0) | ((i & NodeKind.m6573constructorimpl(4194304)) != 0);
    }

    /* renamed from: or-64DMado, reason: not valid java name */
    public static final int m6583or64DMado(int i, int i2) {
        return i | i2;
    }

    private static final boolean specifiesCanFocusProperty(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        CanFocusChecker canFocusChecker = CanFocusChecker.INSTANCE;
        canFocusChecker.reset();
        focusPropertiesModifierNode.applyFocusProperties(canFocusChecker);
        return canFocusChecker.isCanFocusSet();
    }

    private static /* synthetic */ void getInserted$annotations() {
    }

    private static /* synthetic */ void getRemoved$annotations() {
    }

    private static /* synthetic */ void getUpdated$annotations() {
    }

    public static final int calculateNodeKindSetFrom(Modifier.Element element) {
        int m6573constructorimpl = NodeKind.m6573constructorimpl(1);
        if (element instanceof LayoutModifier) {
            m6573constructorimpl |= NodeKind.m6573constructorimpl(2);
        }
        if (element instanceof DrawModifier) {
            m6573constructorimpl |= NodeKind.m6573constructorimpl(4);
        }
        if (element instanceof SemanticsModifier) {
            m6573constructorimpl |= NodeKind.m6573constructorimpl(8);
        }
        if (element instanceof PointerInputModifier) {
            m6573constructorimpl |= NodeKind.m6573constructorimpl(16);
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            m6573constructorimpl |= NodeKind.m6573constructorimpl(32);
        }
        if (element instanceof FocusEventModifier) {
            m6573constructorimpl |= NodeKind.m6573constructorimpl(Fields.TransformOrigin);
        }
        if (element instanceof FocusOrderModifier) {
            m6573constructorimpl |= NodeKind.m6573constructorimpl(Fields.CameraDistance);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            m6573constructorimpl |= NodeKind.m6573constructorimpl(Fields.RotationX);
        }
        if (element instanceof ParentDataModifier) {
            m6573constructorimpl |= NodeKind.m6573constructorimpl(64);
        }
        if (element instanceof OnPlacedModifier) {
            m6573constructorimpl |= NodeKind.m6573constructorimpl(4194304);
        }
        if (element instanceof OnRemeasuredModifier) {
            m6573constructorimpl |= NodeKind.m6573constructorimpl(Fields.SpotShadowColor);
        }
        return element instanceof BringIntoViewModifierNode ? NodeKind.m6573constructorimpl(Fields.BlendMode) | m6573constructorimpl : m6573constructorimpl;
    }
}
