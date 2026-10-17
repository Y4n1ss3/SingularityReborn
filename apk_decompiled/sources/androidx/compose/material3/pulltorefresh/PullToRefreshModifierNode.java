package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import defpackage.dq;
import defpackage.hm;
import defpackage.iy;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PullToRefreshModifierNode extends DelegatingNode implements NestedScrollConnection {
    public static final int $stable = 8;
    private final MutableFloatState distancePulled$delegate;
    private boolean enabled;
    private boolean isRefreshing;
    private DelegatableNode nestedScrollNode;
    private iy onRefresh;
    private PullToRefreshState state;
    private float threshold;
    private final MutableFloatState verticalOffset$delegate;

    private PullToRefreshModifierNode(boolean z, iy iyVar, boolean z2, PullToRefreshState pullToRefreshState, float f) {
        this.isRefreshing = z;
        this.onRefresh = iyVar;
        this.enabled = z2;
        this.state = pullToRefreshState;
        this.threshold = f;
        this.nestedScrollNode = NestedScrollNodeKt.nestedScrollModifierNode(this, null);
        this.verticalOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.distancePulled$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, w01] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateToHidden(hm hmVar) {
        PullToRefreshModifierNode$animateToHidden$1 pullToRefreshModifierNode$animateToHidden$1;
        int i;
        try {
            if (hmVar instanceof PullToRefreshModifierNode$animateToHidden$1) {
                pullToRefreshModifierNode$animateToHidden$1 = (PullToRefreshModifierNode$animateToHidden$1) hmVar;
                int i2 = pullToRefreshModifierNode$animateToHidden$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pullToRefreshModifierNode$animateToHidden$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = pullToRefreshModifierNode$animateToHidden$1.result;
                    i = pullToRefreshModifierNode$animateToHidden$1.label;
                    if (i != 0) {
                        p10.Q(obj);
                        PullToRefreshState pullToRefreshState = this.state;
                        pullToRefreshModifierNode$animateToHidden$1.label = 1;
                        Object animateToHidden = pullToRefreshState.animateToHidden(pullToRefreshModifierNode$animateToHidden$1);
                        vn vnVar = vn.d;
                        if (animateToHidden == vnVar) {
                            return vnVar;
                        }
                    } else {
                        if (i != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                    }
                    setDistancePulled(0.0f);
                    setVerticalOffset(0.0f);
                    this = w01.a;
                    return this;
                }
            }
            if (i != 0) {
            }
            setDistancePulled(0.0f);
            setVerticalOffset(0.0f);
            this = w01.a;
            return this;
        } catch (Throwable th) {
            this.setDistancePulled(0.0f);
            this.setVerticalOffset(0.0f);
            throw th;
        }
        pullToRefreshModifierNode$animateToHidden$1 = new PullToRefreshModifierNode$animateToHidden$1(this, hmVar);
        Object obj2 = pullToRefreshModifierNode$animateToHidden$1.result;
        i = pullToRefreshModifierNode$animateToHidden$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateToThreshold(hm hmVar) {
        PullToRefreshModifierNode$animateToThreshold$1 pullToRefreshModifierNode$animateToThreshold$1;
        int i;
        try {
            if (hmVar instanceof PullToRefreshModifierNode$animateToThreshold$1) {
                pullToRefreshModifierNode$animateToThreshold$1 = (PullToRefreshModifierNode$animateToThreshold$1) hmVar;
                int i2 = pullToRefreshModifierNode$animateToThreshold$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pullToRefreshModifierNode$animateToThreshold$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = pullToRefreshModifierNode$animateToThreshold$1.result;
                    i = pullToRefreshModifierNode$animateToThreshold$1.label;
                    if (i != 0) {
                        p10.Q(obj);
                        PullToRefreshState pullToRefreshState = this.state;
                        pullToRefreshModifierNode$animateToThreshold$1.label = 1;
                        Object animateToThreshold = pullToRefreshState.animateToThreshold(pullToRefreshModifierNode$animateToThreshold$1);
                        vn vnVar = vn.d;
                        if (animateToThreshold == vnVar) {
                            return vnVar;
                        }
                    } else {
                        if (i != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                    }
                    if (isAttached()) {
                        setDistancePulled(getThresholdPx());
                        setVerticalOffset(getThresholdPx());
                    }
                    return w01.a;
                }
            }
            if (i != 0) {
            }
            if (isAttached()) {
            }
            return w01.a;
        } finally {
            if (isAttached()) {
                setDistancePulled(getThresholdPx());
                setVerticalOffset(getThresholdPx());
            }
        }
        pullToRefreshModifierNode$animateToThreshold$1 = new PullToRefreshModifierNode$animateToThreshold$1(this, hmVar);
        Object obj2 = pullToRefreshModifierNode$animateToThreshold$1.result;
        i = pullToRefreshModifierNode$animateToThreshold$1.label;
    }

    private final float calculateVerticalOffset() {
        if (getAdjustedDistancePulled() <= getThresholdPx()) {
            return getAdjustedDistancePulled();
        }
        float g = y80.g(Math.abs(getProgress()) - 1.0f, 0.0f, 2.0f);
        return getThresholdPx() + (getThresholdPx() * (g - (((float) Math.pow(g, 2.0d)) / 4.0f)));
    }

    /* renamed from: consumeAvailableOffset-MK-Hz9U, reason: not valid java name */
    private final long m3004consumeAvailableOffsetMKHz9U(long j) {
        float distancePulled;
        if (this.isRefreshing) {
            distancePulled = 0.0f;
        } else {
            float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) + getDistancePulled();
            if (intBitsToFloat < 0.0f) {
                intBitsToFloat = 0.0f;
            }
            distancePulled = intBitsToFloat - getDistancePulled();
            setDistancePulled(intBitsToFloat);
            setVerticalOffset(calculateVerticalOffset());
        }
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(distancePulled) & 4294967295L));
    }

    private final float getAdjustedDistancePulled() {
        return getDistancePulled() * 0.5f;
    }

    private final float getDistancePulled() {
        return this.distancePulled$delegate.getFloatValue();
    }

    private final float getProgress() {
        return getAdjustedDistancePulled() / getThresholdPx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getThresholdPx() {
        return DelegatableNodeKt.requireDensity(this).mo361roundToPx0680j_4(this.threshold);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getVerticalOffset() {
        return this.verticalOffset$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onRelease(float f, hm hmVar) {
        PullToRefreshModifierNode$onRelease$1 pullToRefreshModifierNode$onRelease$1;
        int i;
        if (hmVar instanceof PullToRefreshModifierNode$onRelease$1) {
            pullToRefreshModifierNode$onRelease$1 = (PullToRefreshModifierNode$onRelease$1) hmVar;
            int i2 = pullToRefreshModifierNode$onRelease$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pullToRefreshModifierNode$onRelease$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pullToRefreshModifierNode$onRelease$1.result;
                i = pullToRefreshModifierNode$onRelease$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    if (this.isRefreshing) {
                        return new Float(0.0f);
                    }
                    if (getAdjustedDistancePulled() > getThresholdPx()) {
                        this.onRefresh.invoke();
                    }
                    if (getDistancePulled() == 0.0f || f < 0.0f) {
                        f = 0.0f;
                    }
                    pullToRefreshModifierNode$onRelease$1.F$0 = f;
                    pullToRefreshModifierNode$onRelease$1.label = 1;
                    Object animateToHidden = animateToHidden(pullToRefreshModifierNode$onRelease$1);
                    Object obj2 = vn.d;
                    if (animateToHidden == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f = pullToRefreshModifierNode$onRelease$1.F$0;
                    p10.Q(obj);
                }
                setDistancePulled(0.0f);
                return new Float(f);
            }
        }
        pullToRefreshModifierNode$onRelease$1 = new PullToRefreshModifierNode$onRelease$1(this, hmVar);
        Object obj3 = pullToRefreshModifierNode$onRelease$1.result;
        i = pullToRefreshModifierNode$onRelease$1.label;
        if (i != 0) {
        }
        setDistancePulled(0.0f);
        return new Float(f);
    }

    private final void setDistancePulled(float f) {
        this.distancePulled$delegate.setFloatValue(f);
    }

    private final void setVerticalOffset(float f) {
        this.verticalOffset$delegate.setFloatValue(f);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final iy getOnRefresh() {
        return this.onRefresh;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final PullToRefreshState getState() {
        return this.state;
    }

    /* renamed from: getThreshold-D9Ej5fM, reason: not valid java name */
    public final float m3005getThresholdD9Ej5fM() {
        return this.threshold;
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        delegate(this.nestedScrollNode);
        p01.t(getCoroutineScope(), null, null, new PullToRefreshModifierNode$onAttach$1(this, null), 3);
        setVerticalOffset(this.isRefreshing ? getThresholdPx() : 0.0f);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo534onPostScrollDzOQY0M(long j, long j2, int i) {
        if (this.state.isAnimating()) {
            return Offset.Companion.m4532getZeroF1C5BW0();
        }
        if (!this.enabled) {
            return Offset.Companion.m4532getZeroF1C5BW0();
        }
        if (!NestedScrollSource.m5957equalsimpl0(i, NestedScrollSource.Companion.m5969getUserInputWNlRxjI())) {
            return Offset.Companion.m4532getZeroF1C5BW0();
        }
        long m3004consumeAvailableOffsetMKHz9U = m3004consumeAvailableOffsetMKHz9U(j2);
        p01.t(getCoroutineScope(), null, null, new PullToRefreshModifierNode$onPostScroll$1(this, null), 3);
        return m3004consumeAvailableOffsetMKHz9U;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo837onPreFlingQWom1Mo(long j, hm hmVar) {
        PullToRefreshModifierNode$onPreFling$1 pullToRefreshModifierNode$onPreFling$1;
        int i;
        float f;
        if (hmVar instanceof PullToRefreshModifierNode$onPreFling$1) {
            pullToRefreshModifierNode$onPreFling$1 = (PullToRefreshModifierNode$onPreFling$1) hmVar;
            int i2 = pullToRefreshModifierNode$onPreFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pullToRefreshModifierNode$onPreFling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pullToRefreshModifierNode$onPreFling$1.result;
                i = pullToRefreshModifierNode$onPreFling$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    float m7850getYimpl = Velocity.m7850getYimpl(j);
                    pullToRefreshModifierNode$onPreFling$1.F$0 = 0.0f;
                    pullToRefreshModifierNode$onPreFling$1.label = 1;
                    obj = onRelease(m7850getYimpl, pullToRefreshModifierNode$onPreFling$1);
                    Object obj2 = vn.d;
                    if (obj == obj2) {
                        return obj2;
                    }
                    f = 0.0f;
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f = pullToRefreshModifierNode$onPreFling$1.F$0;
                    p10.Q(obj);
                }
                return Velocity.m7840boximpl(VelocityKt.Velocity(f, ((Number) obj).floatValue()));
            }
        }
        pullToRefreshModifierNode$onPreFling$1 = new PullToRefreshModifierNode$onPreFling$1(this, hmVar);
        Object obj3 = pullToRefreshModifierNode$onPreFling$1.result;
        i = pullToRefreshModifierNode$onPreFling$1.label;
        if (i != 0) {
        }
        return Velocity.m7840boximpl(VelocityKt.Velocity(f, ((Number) obj3).floatValue()));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo838onPreScrollOzD1aCk(long j, int i) {
        return this.state.isAnimating() ? Offset.Companion.m4532getZeroF1C5BW0() : !this.enabled ? Offset.Companion.m4532getZeroF1C5BW0() : (!NestedScrollSource.m5957equalsimpl0(i, NestedScrollSource.Companion.m5969getUserInputWNlRxjI()) || Float.intBitsToFloat((int) (4294967295L & j)) >= 0.0f) ? Offset.Companion.m4532getZeroF1C5BW0() : m3004consumeAvailableOffsetMKHz9U(j);
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setOnRefresh(iy iyVar) {
        this.onRefresh = iyVar;
    }

    public final void setRefreshing(boolean z) {
        this.isRefreshing = z;
    }

    public final void setState(PullToRefreshState pullToRefreshState) {
        this.state = pullToRefreshState;
    }

    /* renamed from: setThreshold-0680j_4, reason: not valid java name */
    public final void m3006setThreshold0680j_4(float f) {
        this.threshold = f;
    }

    public final void update() {
        p01.t(getCoroutineScope(), null, null, new PullToRefreshModifierNode$update$1(this, null), 3);
    }

    public /* synthetic */ PullToRefreshModifierNode(boolean z, iy iyVar, boolean z2, PullToRefreshState pullToRefreshState, float f, dq dqVar) {
        this(z, iyVar, z2, pullToRefreshState, f);
    }
}
