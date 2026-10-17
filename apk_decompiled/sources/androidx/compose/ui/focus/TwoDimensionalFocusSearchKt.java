package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import defpackage.bv;
import defpackage.ky;
import defpackage.o;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TwoDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 2-D focus search";
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final FocusTargetNode activeNode(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.getFocusState() != FocusStateImpl.ActiveParent) {
            o.f("Searching for active node in inactive hierarchy");
            return null;
        }
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetNode);
        if (findActiveFocusNode != null) {
            return findActiveFocusNode;
        }
        o.f(NoActiveChild);
        return null;
    }

    /* renamed from: beamBeats-I7lrPNg, reason: not valid java name */
    private static final boolean m4460beamBeatsI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i) {
        if (beamBeats_I7lrPNg$inSourceBeam(rect3, i, rect) || !beamBeats_I7lrPNg$inSourceBeam(rect2, i, rect)) {
            return false;
        }
        if (!beamBeats_I7lrPNg$isInDirectionOfSearch(rect3, i, rect)) {
            return true;
        }
        FocusDirection.Companion companion = FocusDirection.Companion;
        return FocusDirection.m4388equalsimpl0(i, companion.m4395getLeftdhqQ8s()) || FocusDirection.m4388equalsimpl0(i, companion.m4398getRightdhqQ8s()) || beamBeats_I7lrPNg$majorAxisDistance(rect2, i, rect) < beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect3, i, rect);
    }

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect rect, int i, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m4388equalsimpl0(i, companion.m4395getLeftdhqQ8s()) || FocusDirection.m4388equalsimpl0(i, companion.m4398getRightdhqQ8s())) {
            return rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom();
        }
        if (FocusDirection.m4388equalsimpl0(i, companion.m4399getUpdhqQ8s()) || FocusDirection.m4388equalsimpl0(i, companion.m4392getDowndhqQ8s())) {
            return rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight();
        }
        o.f(InvalidFocusDirection);
        return false;
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(Rect rect, int i, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m4388equalsimpl0(i, companion.m4395getLeftdhqQ8s())) {
            return rect2.getLeft() >= rect.getRight();
        }
        if (FocusDirection.m4388equalsimpl0(i, companion.m4398getRightdhqQ8s())) {
            return rect2.getRight() <= rect.getLeft();
        }
        if (FocusDirection.m4388equalsimpl0(i, companion.m4399getUpdhqQ8s())) {
            return rect2.getTop() >= rect.getBottom();
        }
        if (FocusDirection.m4388equalsimpl0(i, companion.m4392getDowndhqQ8s())) {
            return rect2.getBottom() <= rect.getTop();
        }
        o.f(InvalidFocusDirection);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final float beamBeats_I7lrPNg$majorAxisDistance(Rect rect, int i, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (!FocusDirection.m4388equalsimpl0(i, companion.m4395getLeftdhqQ8s())) {
            if (FocusDirection.m4388equalsimpl0(i, companion.m4398getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m4388equalsimpl0(i, companion.m4399getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!FocusDirection.m4388equalsimpl0(i, companion.m4392getDowndhqQ8s())) {
                    o.f(InvalidFocusDirection);
                    return 0.0f;
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f = top - bottom;
            if (f >= 0.0f) {
                return 0.0f;
            }
            return f;
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f = top2 - bottom2;
        if (f >= 0.0f) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(Rect rect, int i, Rect rect2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (!FocusDirection.m4388equalsimpl0(i, companion.m4395getLeftdhqQ8s())) {
            if (FocusDirection.m4388equalsimpl0(i, companion.m4398getRightdhqQ8s())) {
                bottom = rect.getRight();
                bottom2 = rect2.getRight();
            } else if (FocusDirection.m4388equalsimpl0(i, companion.m4399getUpdhqQ8s())) {
                top = rect2.getTop();
                top2 = rect.getTop();
            } else {
                if (!FocusDirection.m4388equalsimpl0(i, companion.m4392getDowndhqQ8s())) {
                    o.f(InvalidFocusDirection);
                    return 0.0f;
                }
                bottom = rect.getBottom();
                bottom2 = rect2.getBottom();
            }
            f = bottom - bottom2;
            if (f >= 1.0f) {
                return 1.0f;
            }
            return f;
        }
        top = rect2.getLeft();
        top2 = rect.getLeft();
        f = top - top2;
        if (f >= 1.0f) {
        }
    }

    private static final Rect bottomRight(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    private static final void collectAccessibleChildren(DelegatableNode delegatableNode, MutableVector<FocusTargetNode> mutableVector) {
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, delegatableNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) bv.d(mutableVector2, 1);
            if ((node.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui() & m6573constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode = (FocusTargetNode) node;
                                if (focusTargetNode.isAttached() && !DelegatableNodeKt.requireLayoutNode(focusTargetNode).isDeactivated()) {
                                    if (focusTargetNode.fetchFocusProperties$ui().getCanFocus()) {
                                        mutableVector.add(focusTargetNode);
                                    } else {
                                        collectAccessibleChildren(focusTargetNode, mutableVector);
                                    }
                                }
                            } else if ((node.getKindSet$ui() & m6573constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = delegate$ui;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.add(node);
                                                node = null;
                                            }
                                            mutableVector3.add(delegate$ui);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild$ui();
                    }
                }
            }
        }
    }

    /* renamed from: findBestCandidate-4WY_MpI, reason: not valid java name */
    private static final FocusTargetNode m4461findBestCandidate4WY_MpI(MutableVector<FocusTargetNode> mutableVector, Rect rect, int i) {
        Rect translate;
        FocusDirection.Companion companion = FocusDirection.Companion;
        FocusTargetNode focusTargetNode = null;
        if (FocusDirection.m4388equalsimpl0(i, companion.m4395getLeftdhqQ8s())) {
            translate = rect.translate((rect.getRight() - rect.getLeft()) + 1.0f, 0.0f);
        } else if (FocusDirection.m4388equalsimpl0(i, companion.m4398getRightdhqQ8s())) {
            translate = rect.translate(-((rect.getRight() - rect.getLeft()) + 1.0f), 0.0f);
        } else if (FocusDirection.m4388equalsimpl0(i, companion.m4399getUpdhqQ8s())) {
            translate = rect.translate(0.0f, (rect.getBottom() - rect.getTop()) + 1.0f);
        } else {
            if (!FocusDirection.m4388equalsimpl0(i, companion.m4392getDowndhqQ8s())) {
                o.f(InvalidFocusDirection);
                return null;
            }
            translate = rect.translate(0.0f, -((rect.getBottom() - rect.getTop()) + 1.0f));
        }
        FocusTargetNode[] focusTargetNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            FocusTargetNode focusTargetNode2 = focusTargetNodeArr[i2];
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
                Rect focusRect = FocusTraversalKt.focusRect(focusTargetNode2);
                if (m4464isBetterCandidateI7lrPNg(focusRect, translate, rect, i)) {
                    focusTargetNode = focusTargetNode2;
                    translate = focusRect;
                }
            }
        }
        return focusTargetNode;
    }

    /* renamed from: findChildCorrespondingToFocusEnter--OM-vw8, reason: not valid java name */
    public static final boolean m4462findChildCorrespondingToFocusEnterOMvw8(FocusTargetNode focusTargetNode, int i, ky kyVar) {
        Rect rect;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        collectAccessibleChildren(focusTargetNode, mutableVector);
        if (mutableVector.getSize() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (mutableVector.getSize() == 0 ? null : mutableVector.content[0]);
            if (focusTargetNode2 != null) {
                return ((Boolean) kyVar.invoke(focusTargetNode2)).booleanValue();
            }
            return false;
        }
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m4388equalsimpl0(i, companion.m4393getEnterdhqQ8s())) {
            i = companion.m4398getRightdhqQ8s();
        }
        if (FocusDirection.m4388equalsimpl0(i, companion.m4398getRightdhqQ8s()) || FocusDirection.m4388equalsimpl0(i, companion.m4392getDowndhqQ8s())) {
            rect = topLeft(FocusTraversalKt.focusRect(focusTargetNode));
        } else {
            if (!FocusDirection.m4388equalsimpl0(i, companion.m4395getLeftdhqQ8s()) && !FocusDirection.m4388equalsimpl0(i, companion.m4399getUpdhqQ8s())) {
                o.f(InvalidFocusDirection);
                return false;
            }
            rect = bottomRight(FocusTraversalKt.focusRect(focusTargetNode));
        }
        FocusTargetNode m4461findBestCandidate4WY_MpI = m4461findBestCandidate4WY_MpI(mutableVector, rect, i);
        if (m4461findBestCandidate4WY_MpI != null) {
            return ((Boolean) kyVar.invoke(m4461findBestCandidate4WY_MpI)).booleanValue();
        }
        return false;
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m4463generateAndSearchChildren4C6V_qg(FocusTargetNode focusTargetNode, Rect rect, int i, ky kyVar) {
        if (m4465searchChildren4C6V_qg(focusTargetNode, rect, i, kyVar)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m4383searchBeyondBoundsOMvw8(focusTargetNode, i, new TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode(), focusTargetNode, rect, i, kyVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: isBetterCandidate-I7lrPNg, reason: not valid java name */
    public static final boolean m4464isBetterCandidateI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i) {
        if (!isBetterCandidate_I7lrPNg$isCandidate(rect, i, rect3)) {
            return false;
        }
        if (isBetterCandidate_I7lrPNg$isCandidate(rect2, i, rect3) && !m4460beamBeatsI7lrPNg(rect3, rect, rect2, i)) {
            return !m4460beamBeatsI7lrPNg(rect3, rect2, rect, i) && isBetterCandidate_I7lrPNg$weightedDistance(i, rect3, rect) < isBetterCandidate_I7lrPNg$weightedDistance(i, rect3, rect2);
        }
        return true;
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(Rect rect, int i, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m4388equalsimpl0(i, companion.m4395getLeftdhqQ8s())) {
            return (rect2.getRight() > rect.getRight() || rect2.getLeft() >= rect.getRight()) && rect2.getLeft() > rect.getLeft();
        }
        if (FocusDirection.m4388equalsimpl0(i, companion.m4398getRightdhqQ8s())) {
            return (rect2.getLeft() < rect.getLeft() || rect2.getRight() <= rect.getLeft()) && rect2.getRight() < rect.getRight();
        }
        if (FocusDirection.m4388equalsimpl0(i, companion.m4399getUpdhqQ8s())) {
            return (rect2.getBottom() > rect.getBottom() || rect2.getTop() >= rect.getBottom()) && rect2.getTop() > rect.getTop();
        }
        if (FocusDirection.m4388equalsimpl0(i, companion.m4392getDowndhqQ8s())) {
            return (rect2.getTop() < rect.getTop() || rect2.getBottom() <= rect.getTop()) && rect2.getBottom() < rect.getBottom();
        }
        o.f(InvalidFocusDirection);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(Rect rect, int i, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (!FocusDirection.m4388equalsimpl0(i, companion.m4395getLeftdhqQ8s())) {
            if (FocusDirection.m4388equalsimpl0(i, companion.m4398getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m4388equalsimpl0(i, companion.m4399getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!FocusDirection.m4388equalsimpl0(i, companion.m4392getDowndhqQ8s())) {
                    o.f(InvalidFocusDirection);
                    return 0.0f;
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f = top - bottom;
            if (f >= 0.0f) {
                return 0.0f;
            }
            return f;
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f = top2 - bottom2;
        if (f >= 0.0f) {
        }
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect, int i, Rect rect2) {
        float bottom;
        float top;
        float bottom2;
        float top2;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m4388equalsimpl0(i, companion.m4395getLeftdhqQ8s()) || FocusDirection.m4388equalsimpl0(i, companion.m4398getRightdhqQ8s())) {
            bottom = ((rect2.getBottom() - rect2.getTop()) / 2.0f) + rect2.getTop();
            top = rect.getTop();
            bottom2 = rect.getBottom();
            top2 = rect.getTop();
        } else {
            if (!FocusDirection.m4388equalsimpl0(i, companion.m4399getUpdhqQ8s()) && !FocusDirection.m4388equalsimpl0(i, companion.m4392getDowndhqQ8s())) {
                o.f(InvalidFocusDirection);
                return 0.0f;
            }
            bottom = ((rect2.getRight() - rect2.getLeft()) / 2.0f) + rect2.getLeft();
            top = rect.getLeft();
            bottom2 = rect.getRight();
            top2 = rect.getLeft();
        }
        return bottom - (((bottom2 - top2) / 2.0f) + top);
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i, Rect rect, Rect rect2) {
        long isBetterCandidate_I7lrPNg$majorAxisDistance = (long) isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i, rect);
        long isBetterCandidate_I7lrPNg$minorAxisDistance = (long) isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i, rect);
        return (isBetterCandidate_I7lrPNg$minorAxisDistance * isBetterCandidate_I7lrPNg$minorAxisDistance) + (13 * isBetterCandidate_I7lrPNg$majorAxisDistance * isBetterCandidate_I7lrPNg$majorAxisDistance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m4465searchChildren4C6V_qg(FocusTargetNode focusTargetNode, Rect rect, int i, ky kyVar) {
        FocusTargetNode m4461findBestCandidate4WY_MpI;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = focusTargetNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) bv.d(mutableVector2, 1);
            if ((node.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui() & m6573constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                if (focusTargetNode2.isAttached()) {
                                    mutableVector.add(focusTargetNode2);
                                }
                            } else if ((node.getKindSet$ui() & m6573constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node = delegate$ui;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.add(node);
                                                node = null;
                                            }
                                            mutableVector3.add(delegate$ui);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild$ui();
                    }
                }
            }
        }
        while (mutableVector.getSize() != 0 && (m4461findBestCandidate4WY_MpI = m4461findBestCandidate4WY_MpI(mutableVector, rect, i)) != null) {
            if (m4461findBestCandidate4WY_MpI.fetchFocusProperties$ui().getCanFocus()) {
                return ((Boolean) kyVar.invoke(m4461findBestCandidate4WY_MpI)).booleanValue();
            }
            if (m4463generateAndSearchChildren4C6V_qg(m4461findBestCandidate4WY_MpI, rect, i, kyVar)) {
                return true;
            }
            mutableVector.remove(m4461findBestCandidate4WY_MpI);
        }
        return false;
    }

    private static final Rect topLeft(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    /* renamed from: twoDimensionalFocusSearch-sMXa3k8, reason: not valid java name */
    public static final Boolean m4466twoDimensionalFocusSearchsMXa3k8(FocusTargetNode focusTargetNode, int i, Rect rect, ky kyVar) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[focusState.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return Boolean.valueOf(m4462findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i, kyVar));
            }
            if (i2 == 4) {
                return focusTargetNode.fetchFocusProperties$ui().getCanFocus() ? (Boolean) kyVar.invoke(focusTargetNode) : rect == null ? Boolean.valueOf(m4462findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i, kyVar)) : Boolean.valueOf(m4465searchChildren4C6V_qg(focusTargetNode, rect, i, kyVar));
            }
            o.n();
            return null;
        }
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild == null) {
            o.f(NoActiveChild);
            return null;
        }
        int i3 = iArr[activeChild.getFocusState().ordinal()];
        if (i3 == 1) {
            Boolean m4466twoDimensionalFocusSearchsMXa3k8 = m4466twoDimensionalFocusSearchsMXa3k8(activeChild, i, rect, kyVar);
            if (!q10.b(m4466twoDimensionalFocusSearchsMXa3k8, Boolean.FALSE)) {
                return m4466twoDimensionalFocusSearchsMXa3k8;
            }
            if (rect == null) {
                rect = FocusTraversalKt.focusRect(activeNode(activeChild));
            }
            return Boolean.valueOf(m4463generateAndSearchChildren4C6V_qg(focusTargetNode, rect, i, kyVar));
        }
        if (i3 == 2 || i3 == 3) {
            if (rect == null) {
                rect = FocusTraversalKt.focusRect(activeChild);
            }
            return Boolean.valueOf(m4463generateAndSearchChildren4C6V_qg(focusTargetNode, rect, i, kyVar));
        }
        if (i3 != 4) {
            o.n();
            return null;
        }
        o.f(NoActiveChild);
        return null;
    }
}
