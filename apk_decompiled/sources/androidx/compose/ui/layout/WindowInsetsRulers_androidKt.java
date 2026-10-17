package androidx.compose.ui.layout;

import android.graphics.Rect;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.WindowInsetsRulers;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.NodeKindKt;
import androidx.compose.ui.node.TraversableNode;
import defpackage.g10;
import defpackage.na0;
import defpackage.pl0;
import defpackage.ut;
import defpackage.xa0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class WindowInsetsRulers_androidKt {
    private static final WindowInsetsRulers[] AnimatableInsetsRulers;
    public static final String RulerKey = "androidx.compose.ui.layout.WindowInsetsRulers";
    private static final g10 WindowInsetsTypeMap;

    static {
        na0 na0Var = new na0(8);
        WindowInsetsRulers.Companion companion = WindowInsetsRulers.Companion;
        na0Var.i(1, companion.getStatusBars());
        na0Var.i(2, companion.getNavigationBars());
        na0Var.i(4, companion.getCaptionBar());
        na0Var.i(8, companion.getIme());
        na0Var.i(16, companion.getSystemGestures());
        na0Var.i(32, companion.getMandatorySystemGestures());
        na0Var.i(64, companion.getTappableElement());
        na0Var.i(Fields.SpotShadowColor, companion.getDisplayCutout());
        WindowInsetsTypeMap = na0Var;
        AnimatableInsetsRulers = new WindowInsetsRulers[]{companion.getStatusBars(), companion.getNavigationBars(), companion.getCaptionBar(), companion.getTappableElement(), companion.getSystemGestures(), companion.getMandatorySystemGestures(), companion.getIme(), companion.getWaterfall(), companion.getDisplayCutout()};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier$Node] */
    public static final List<RectRulers> findDisplayCutouts(Placeable.PlacementScope placementScope) {
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        LayoutCoordinates findRootCoordinates = coordinates != null ? LayoutCoordinatesKt.findRootCoordinates(coordinates) : null;
        for (NodeCoordinator nodeCoordinator = findRootCoordinates instanceof NodeCoordinator ? (NodeCoordinator) findRootCoordinates : null; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.getWrapped$ui()) {
            int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.ColorFilter);
            boolean m6582getIncludeSelfInTraversalH91voCI = NodeKindKt.m6582getIncludeSelfInTraversalH91voCI(m6573constructorimpl);
            Modifier.Node tail = nodeCoordinator.getTail();
            if (m6582getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui()) != null) {
                for (Modifier.Node headNode = nodeCoordinator.headNode(m6582getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui() & m6573constructorimpl) != 0; headNode = headNode.getChild$ui()) {
                    if ((headNode.getKindSet$ui() & m6573constructorimpl) != 0) {
                        MutableVector mutableVector = null;
                        DelegatingNode delegatingNode = headNode;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                if (traversableNode.getTraverseKey() == RulerKey) {
                                    return ((WindowInsetsRulerProvider) traversableNode).getCutoutRulers();
                                }
                            } else if ((delegatingNode.getKindSet$ui() & m6573constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = delegatingNode.getDelegate$ui();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNode = delegate$ui;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                mutableVector.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            mutableVector.add(delegate$ui);
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild$ui();
                                    delegatingNode = delegatingNode;
                                }
                                if (i == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    if (headNode != tail) {
                    }
                }
            }
        }
        return ut.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier$Node] */
    public static final WindowInsetsAnimation findInsetsAnimationProperties(Placeable.PlacementScope placementScope, WindowInsetsRulers windowInsetsRulers) {
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        LayoutCoordinates findRootCoordinates = coordinates != null ? LayoutCoordinatesKt.findRootCoordinates(coordinates) : null;
        for (NodeCoordinator nodeCoordinator = findRootCoordinates instanceof NodeCoordinator ? (NodeCoordinator) findRootCoordinates : null; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.getWrapped$ui()) {
            int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.ColorFilter);
            boolean m6582getIncludeSelfInTraversalH91voCI = NodeKindKt.m6582getIncludeSelfInTraversalH91voCI(m6573constructorimpl);
            Modifier.Node tail = nodeCoordinator.getTail();
            if (m6582getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui()) != null) {
                for (Modifier.Node headNode = nodeCoordinator.headNode(m6582getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui() & m6573constructorimpl) != 0; headNode = headNode.getChild$ui()) {
                    if ((headNode.getKindSet$ui() & m6573constructorimpl) != 0) {
                        MutableVector mutableVector = null;
                        DelegatingNode delegatingNode = headNode;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                if (traversableNode.getTraverseKey() == RulerKey) {
                                    WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = (WindowWindowInsetsAnimationValues) ((WindowInsetsRulerProvider) traversableNode).getInsetsValues().d(windowInsetsRulers);
                                    return windowWindowInsetsAnimationValues != null ? windowWindowInsetsAnimationValues : NoWindowInsetsAnimation.INSTANCE;
                                }
                            } else if ((delegatingNode.getKindSet$ui() & m6573constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = delegatingNode.getDelegate$ui();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNode = delegate$ui;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                mutableVector.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            mutableVector.add(delegate$ui);
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild$ui();
                                    delegatingNode = delegatingNode;
                                }
                                if (i == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    if (headNode != tail) {
                    }
                }
            }
        }
        return NoWindowInsetsAnimation.INSTANCE;
    }

    /* renamed from: provideInsetsValues-cytEWk0, reason: not valid java name */
    private static final void m6382provideInsetsValuescytEWk0(RulerScope rulerScope, RectRulers rectRulers, long j, int i, int i2) {
        if (ValueInsets.m6374equalsimpl0(j, ValueInsets_androidKt.getUnsetValueInsets())) {
            return;
        }
        rulerScope.provides(rectRulers.getLeft(), (int) ((j >>> 48) & 65535));
        rulerScope.provides(rectRulers.getTop(), (int) ((j >>> 32) & 65535));
        rulerScope.provides(rectRulers.getRight(), i - ((int) ((j >>> 16) & 65535)));
        rulerScope.provides(rectRulers.getBottom(), i2 - ((int) (j & 65535)));
    }

    public static final void provideWindowInsetsRulers(RulerScope rulerScope, WindowInsetsRulerProvider windowInsetsRulerProvider) {
        long mo6242getSizeYbymL2g = rulerScope.getCoordinates().mo6242getSizeYbymL2g();
        pl0 insetsValues = windowInsetsRulerProvider.getInsetsListener().getInsetsValues();
        int i = (int) (mo6242getSizeYbymL2g >> 32);
        int i2 = (int) (mo6242getSizeYbymL2g & 4294967295L);
        WindowInsetsRulers[] windowInsetsRulersArr = AnimatableInsetsRulers;
        int length = windowInsetsRulersArr.length;
        int i3 = 0;
        while (i3 < length) {
            WindowInsetsRulers windowInsetsRulers = windowInsetsRulersArr[i3];
            Object d = insetsValues.d(windowInsetsRulers);
            d.getClass();
            WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = (WindowWindowInsetsAnimationValues) d;
            RulerScope rulerScope2 = rulerScope;
            m6382provideInsetsValuescytEWk0(rulerScope2, windowInsetsRulers.getCurrent(), windowWindowInsetsAnimationValues.m6383getCurrenthdzbrEE(), i, i2);
            if (windowWindowInsetsAnimationValues.isAnimating()) {
                m6382provideInsetsValuescytEWk0(rulerScope2, windowWindowInsetsAnimationValues.getSource(), windowWindowInsetsAnimationValues.m6385getSourceValueInsetshdzbrEE(), i, i2);
                m6382provideInsetsValuescytEWk0(rulerScope2, windowWindowInsetsAnimationValues.getTarget(), windowWindowInsetsAnimationValues.m6386getTargetValueInsetshdzbrEE(), i, i2);
            }
            m6382provideInsetsValuescytEWk0(rulerScope2, windowInsetsRulers.getMaximum(), windowWindowInsetsAnimationValues.m6384getMaximumhdzbrEE(), i, i2);
            i3++;
            rulerScope = rulerScope2;
        }
        RulerScope rulerScope3 = rulerScope;
        xa0 cutoutRects = windowInsetsRulerProvider.getCutoutRects();
        if (cutoutRects.e()) {
            List<RectRulers> cutoutRulers = windowInsetsRulerProvider.getCutoutRulers();
            Object[] objArr = cutoutRects.a;
            int i4 = cutoutRects.b;
            for (int i5 = 0; i5 < i4; i5++) {
                MutableState mutableState = (MutableState) objArr[i5];
                RectRulers rectRulers = cutoutRulers.get(i5);
                Rect rect = (Rect) mutableState.getValue();
                rulerScope3.provides(rectRulers.getLeft(), rect.left);
                rulerScope3.provides(rectRulers.getTop(), rect.top);
                rulerScope3.provides(rectRulers.getRight(), rect.right);
                rulerScope3.provides(rectRulers.getBottom(), rect.bottom);
            }
        }
    }
}
