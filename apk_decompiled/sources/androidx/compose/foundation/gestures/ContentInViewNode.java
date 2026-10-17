package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.cq;
import defpackage.d41;
import defpackage.fg;
import defpackage.gg;
import defpackage.hm;
import defpackage.iy;
import defpackage.p01;
import defpackage.q10;
import defpackage.qn;
import defpackage.vn;
import defpackage.w01;
import defpackage.xn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContentInViewNode extends Modifier.Node implements BringIntoViewResponder, CompositionLocalConsumerModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private BringIntoViewSpec bringIntoViewSpec;
    private boolean childWasMaxVisibleBeforeViewportShrunk;
    private LayoutCoordinates focusedChild;
    private iy getFocusedRect;
    private boolean isAnimationRunning;
    private Orientation orientation;
    private boolean reverseDirection;
    private final ScrollingLogic scrollingLogic;
    private final boolean shouldAutoInvalidate;
    private boolean trackingFocusedChild;
    private final BringIntoViewRequestPriorityQueue bringIntoViewRequests = new BringIntoViewRequestPriorityQueue();
    private long viewportSize = IntSize.Companion.m7787getZeroYbymL2g();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Request {
        public static final int $stable = 8;
        private final fg continuation;
        private final iy currentBounds;

        public Request(iy iyVar, fg fgVar) {
            this.currentBounds = iyVar;
            this.continuation = fgVar;
        }

        public final fg getContinuation() {
            return this.continuation;
        }

        public final iy getCurrentBounds() {
            return this.currentBounds;
        }

        public String toString() {
            if (this.continuation.getContext().get(qn.d) != null) {
                throw new ClassCastException();
            }
            StringBuilder sb = new StringBuilder("Request@");
            int hashCode = hashCode();
            cq.f(16);
            String num = Integer.toString(hashCode, 16);
            num.getClass();
            sb.append(num);
            sb.append("(currentBounds()=");
            sb.append(this.currentBounds.invoke());
            sb.append(", continuation=");
            sb.append(this.continuation);
            sb.append(')');
            return sb.toString();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ContentInViewNode(Orientation orientation, ScrollingLogic scrollingLogic, boolean z, BringIntoViewSpec bringIntoViewSpec, iy iyVar) {
        this.orientation = orientation;
        this.scrollingLogic = scrollingLogic;
        this.reverseDirection = z;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.getFocusedRect = iyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateScrollDelta-I_oMVgE, reason: not valid java name */
    public final float m393calculateScrollDeltaI_oMVgE(BringIntoViewSpec bringIntoViewSpec, long j) {
        if (IntSize.m7780equalsimpl0(this.viewportSize, IntSize.Companion.m7787getZeroYbymL2g())) {
            return 0.0f;
        }
        Rect findBringIntoViewRequest = findBringIntoViewRequest();
        if (findBringIntoViewRequest == null) {
            findBringIntoViewRequest = this.trackingFocusedChild ? getFocusedChildBounds() : null;
            if (findBringIntoViewRequest == null) {
                return 0.0f;
            }
        }
        long m7794toSizeozmzZPI = IntSizeKt.m7794toSizeozmzZPI(this.viewportSize);
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return bringIntoViewSpec.calculateScrollDistance(findBringIntoViewRequest.getTop() - IntOffset.m7740getYimpl(j), findBringIntoViewRequest.getBottom() - findBringIntoViewRequest.getTop(), Float.intBitsToFloat((int) (4294967295L & m7794toSizeozmzZPI)));
        }
        if (i == 2) {
            return bringIntoViewSpec.calculateScrollDistance(findBringIntoViewRequest.getLeft() - IntOffset.m7739getXimpl(j), findBringIntoViewRequest.getRight() - findBringIntoViewRequest.getLeft(), Float.intBitsToFloat((int) (m7794toSizeozmzZPI >> 32)));
        }
        defpackage.o.n();
        return 0.0f;
    }

    /* renamed from: compareTo-TemP2vQ, reason: not valid java name */
    private final int m394compareToTemP2vQ(long j, long j2) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return q10.h((int) (j & 4294967295L), (int) (j2 & 4294967295L));
        }
        if (i == 2) {
            return q10.h((int) (j >> 32), (int) (j2 >> 32));
        }
        defpackage.o.n();
        return 0;
    }

    /* renamed from: compareTo-iLBOSCw, reason: not valid java name */
    private final int m395compareToiLBOSCw(long j, long j2) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return Float.compare(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        }
        if (i == 2) {
            return Float.compare(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)));
        }
        defpackage.o.n();
        return 0;
    }

    private final Rect computeDestination(Rect rect) {
        return rect.m4553translatek4lQ0M(Offset.m4508constructorimpl(m401relocationOffsetfbGrOKE(rect, this.viewportSize, IntOffset.Companion.m7750getZeronOccac()) ^ (-9223372034707292160L)));
    }

    private final Rect findBringIntoViewRequest() {
        MutableVector mutableVector = this.bringIntoViewRequests.requests;
        int size = mutableVector.getSize() - 1;
        Object[] objArr = mutableVector.content;
        Rect rect = null;
        if (size < objArr.length) {
            while (size >= 0) {
                Rect rect2 = (Rect) ((Request) objArr[size]).getCurrentBounds().invoke();
                if (rect2 != null) {
                    if (m395compareToiLBOSCw(rect2.m4549getSizeNHjbRc(), IntSizeKt.m7794toSizeozmzZPI(this.viewportSize)) > 0) {
                        return rect == null ? rect2 : rect;
                    }
                    rect = rect2;
                }
                size--;
            }
        }
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getFocusedChildBounds() {
        if (ComposeFoundationFlags.isKeepInViewFocusObservationChangeEnabled) {
            return (Rect) this.getFocusedRect.invoke();
        }
        if (!isAttached()) {
            return null;
        }
        LayoutCoordinates requireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(this);
        LayoutCoordinates layoutCoordinates = this.focusedChild;
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates != null) {
                return requireLayoutCoordinates.localBoundingBoxOf(layoutCoordinates, false);
            }
        }
        return null;
    }

    /* renamed from: isMaxVisible--EQwtKw, reason: not valid java name */
    private final boolean m396isMaxVisibleEQwtKw(Rect rect, long j, long j2) {
        long m401relocationOffsetfbGrOKE = m401relocationOffsetfbGrOKE(rect, j, j2);
        return Math.abs(Float.intBitsToFloat((int) (m401relocationOffsetfbGrOKE >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (m401relocationOffsetfbGrOKE & 4294967295L))) <= 0.5f;
    }

    /* renamed from: isMaxVisible--EQwtKw$default, reason: not valid java name */
    public static /* synthetic */ boolean m397isMaxVisibleEQwtKw$default(ContentInViewNode contentInViewNode, Rect rect, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = contentInViewNode.viewportSize;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = IntOffset.Companion.m7750getZeronOccac();
        }
        return contentInViewNode.m396isMaxVisibleEQwtKw(rect, j3, j2);
    }

    /* renamed from: launchAnimation--gyyYBs, reason: not valid java name */
    private final void m398launchAnimationgyyYBs(long j) {
        BringIntoViewSpec requireBringIntoViewSpec = requireBringIntoViewSpec();
        if (this.isAnimationRunning) {
            InlineClassHelperKt.throwIllegalStateException("launchAnimation called when previous animation was running");
        }
        UpdatableAnimationState updatableAnimationState = new UpdatableAnimationState(requireBringIntoViewSpec().getScrollAnimationSpec());
        p01.t(getCoroutineScope(), null, xn.g, new ContentInViewNode$launchAnimation$2(this, updatableAnimationState, requireBringIntoViewSpec, j, null), 1);
    }

    /* renamed from: launchAnimation--gyyYBs$default, reason: not valid java name */
    public static /* synthetic */ void m399launchAnimationgyyYBs$default(ContentInViewNode contentInViewNode, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = IntOffset.Companion.m7750getZeronOccac();
        }
        contentInViewNode.m398launchAnimationgyyYBs(j);
    }

    /* renamed from: onRemeasuredLegacy-ozmzZPI, reason: not valid java name */
    private final void m400onRemeasuredLegacyozmzZPI(long j) {
        Rect focusedChildBounds;
        long j2 = this.viewportSize;
        this.viewportSize = j;
        if (m394compareToTemP2vQ(j, j2) >= 0 || this.isAnimationRunning || this.trackingFocusedChild || (focusedChildBounds = getFocusedChildBounds()) == null || !m397isMaxVisibleEQwtKw$default(this, focusedChildBounds, j2, 0L, 2, null)) {
            return;
        }
        this.childWasMaxVisibleBeforeViewportShrunk = true;
    }

    /* renamed from: relocationOffset-fbGrOKE, reason: not valid java name */
    private final long m401relocationOffsetfbGrOKE(Rect rect, long j, long j2) {
        long m7794toSizeozmzZPI = IntSizeKt.m7794toSizeozmzZPI(j);
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            float calculateScrollDistance = requireBringIntoViewSpec().calculateScrollDistance(rect.getTop() - IntOffset.m7740getYimpl(j2), rect.getBottom() - rect.getTop(), Float.intBitsToFloat((int) (m7794toSizeozmzZPI & 4294967295L)));
            return Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(calculateScrollDistance) & 4294967295L));
        }
        if (i == 2) {
            return Offset.m4508constructorimpl((Float.floatToRawIntBits(requireBringIntoViewSpec().calculateScrollDistance(rect.getLeft() - IntOffset.m7739getXimpl(j2), rect.getRight() - rect.getLeft(), Float.intBitsToFloat((int) (m7794toSizeozmzZPI >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        defpackage.o.n();
        return 0L;
    }

    private final BringIntoViewSpec requireBringIntoViewSpec() {
        BringIntoViewSpec bringIntoViewSpec = this.bringIntoViewSpec;
        return bringIntoViewSpec == null ? (BringIntoViewSpec) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec()) : bringIntoViewSpec;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Object bringChildIntoView(iy iyVar, hm hmVar) {
        Rect rect = (Rect) iyVar.invoke();
        if (rect != null && !m397isMaxVisibleEQwtKw$default(this, rect, 0L, 0L, 3, null)) {
            gg ggVar = new gg(1, d41.C(hmVar));
            ggVar.u();
            if (this.bringIntoViewRequests.enqueue(new Request(iyVar, ggVar)) && !this.isAnimationRunning) {
                m399launchAnimationgyyYBs$default(this, 0L, 1, null);
            }
            Object s = ggVar.s();
            if (s == vn.d) {
                return s;
            }
        }
        return w01.a;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Rect calculateRectForParent(Rect rect) {
        if (IntSize.m7780equalsimpl0(this.viewportSize, IntSize.Companion.m7787getZeroYbymL2g())) {
            InlineClassHelperKt.throwIllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return computeDestination(rect);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* renamed from: getViewportSize-YbymL2g$foundation, reason: not valid java name */
    public final long m402getViewportSizeYbymL2g$foundation() {
        return this.viewportSize;
    }

    public final void onFocusBoundsChanged(LayoutCoordinates layoutCoordinates) {
        ContentInViewNode contentInViewNode;
        Rect focusedChildBounds;
        this.focusedChild = layoutCoordinates;
        if (!this.childWasMaxVisibleBeforeViewportShrunk || (focusedChildBounds = getFocusedChildBounds()) == null) {
            contentInViewNode = this;
        } else {
            contentInViewNode = this;
            if (!m397isMaxVisibleEQwtKw$default(contentInViewNode, focusedChildBounds, this.viewportSize, 0L, 2, null)) {
                contentInViewNode.trackingFocusedChild = true;
                m399launchAnimationgyyYBs$default(contentInViewNode, 0L, 1, null);
            }
        }
        contentInViewNode.childWasMaxVisibleBeforeViewportShrunk = false;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo356onRemeasuredozmzZPI(long j) {
        if (!ComposeFoundationFlags.isKeepInViewFocusObservationChangeEnabled) {
            m400onRemeasuredLegacyozmzZPI(j);
            return;
        }
        long j2 = this.viewportSize;
        this.viewportSize = j;
        if (m394compareToTemP2vQ(j, j2) >= 0) {
            return;
        }
        long m7733constructorimpl = !this.reverseDirection ? this.orientation == Orientation.Vertical ? IntOffset.m7733constructorimpl((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L) : IntOffset.m7733constructorimpl((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) : IntOffset.Companion.m7750getZeronOccac();
        Rect rect = (Rect) this.getFocusedRect.invoke();
        if (rect == null || this.isAnimationRunning || this.trackingFocusedChild || !m397isMaxVisibleEQwtKw$default(this, rect, j2, 0L, 2, null) || m397isMaxVisibleEQwtKw$default(this, rect, 0L, m7733constructorimpl, 1, null)) {
            return;
        }
        this.trackingFocusedChild = true;
        m398launchAnimationgyyYBs(m7733constructorimpl);
    }

    public final void update(Orientation orientation, boolean z, BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.reverseDirection = z;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }
}
