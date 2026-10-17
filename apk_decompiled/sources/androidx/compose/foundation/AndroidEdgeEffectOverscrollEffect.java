package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import defpackage.bq;
import defpackage.dq;
import defpackage.hm;
import defpackage.ij0;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;
import defpackage.yi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    public static final int $stable = 0;
    private long containerSize;
    private final Density density;
    private final EdgeEffectWrapper edgeEffectWrapper;
    private boolean invalidationEnabled;
    private final DelegatableNode node;
    private long pointerId;
    private final SuspendingPointerInputModifierNode pointerInputNode;
    private long pointerPosition;
    private final MutableState<w01> redrawSignal;
    private boolean scrollCycleInProgress;

    private AndroidEdgeEffectOverscrollEffect(Context context, Density density, long j, PaddingValues paddingValues) {
        this.density = density;
        this.pointerPosition = Offset.Companion.m4531getUnspecifiedF1C5BW0();
        EdgeEffectWrapper edgeEffectWrapper = new EdgeEffectWrapper(context, ColorKt.m4815toArgb8_81llA(j));
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.redrawSignal = SnapshotStateKt.mutableStateOf(w01.a, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.containerSize = Size.Companion.m4594getZeroNHjbRc();
        this.pointerId = PointerId.m6078constructorimpl(-1L);
        SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode = SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1

            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            @bq(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", l = {783, 787}, m = "invokeSuspend", v = 1)
            /* renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends ij0 implements my {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, hm hmVar) {
                    super(hmVar);
                    this.this$0 = androidEdgeEffectOverscrollEffect;
                }

                @Override // defpackage.mc
                public final hm create(Object obj, hm hmVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, hmVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // defpackage.my
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
                
                    if (r14 != r4) goto L18;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005a -> B:6:0x005d). Please report as a decompilation issue!!! */
                @Override // defpackage.mc
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    AnonymousClass1 anonymousClass1;
                    AwaitPointerEventScope awaitPointerEventScope;
                    Object obj2;
                    long j;
                    int i = this.label;
                    vn vnVar = vn.d;
                    if (i == 0) {
                        p10.Q(obj);
                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                        this.L$0 = awaitPointerEventScope2;
                        this.label = 1;
                        anonymousClass1 = this;
                        obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope2, false, null, anonymousClass1, 2, null);
                        if (obj != vnVar) {
                            awaitPointerEventScope = awaitPointerEventScope2;
                        }
                        return vnVar;
                    }
                    if (i == 1) {
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        p10.Q(obj);
                        anonymousClass1 = this;
                    } else {
                        if (i != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        p10.Q(obj);
                        anonymousClass1 = this;
                        List<PointerInputChange> changes = ((PointerEvent) obj).getChanges();
                        ArrayList arrayList = new ArrayList(changes.size());
                        int size = changes.size();
                        int i2 = 0;
                        for (int i3 = 0; i3 < size; i3++) {
                            PointerInputChange pointerInputChange = changes.get(i3);
                            if (pointerInputChange.getPressed()) {
                                arrayList.add(pointerInputChange);
                            }
                        }
                        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = anonymousClass1.this$0;
                        int size2 = arrayList.size();
                        while (true) {
                            if (i2 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = arrayList.get(i2);
                            long m6098getIdJ3iCeTQ = ((PointerInputChange) obj2).m6098getIdJ3iCeTQ();
                            j = androidEdgeEffectOverscrollEffect.pointerId;
                            if (PointerId.m6080equalsimpl0(m6098getIdJ3iCeTQ, j)) {
                                break;
                            }
                            i2++;
                        }
                        PointerInputChange pointerInputChange2 = (PointerInputChange) obj2;
                        if (pointerInputChange2 == null) {
                            pointerInputChange2 = (PointerInputChange) yi.q0(arrayList);
                        }
                        if (pointerInputChange2 != null) {
                            anonymousClass1.this$0.pointerId = pointerInputChange2.m6098getIdJ3iCeTQ();
                            anonymousClass1.this$0.pointerPosition = pointerInputChange2.m6101getPositionF1C5BW0();
                        }
                        if (arrayList.isEmpty()) {
                            anonymousClass1.this$0.pointerId = PointerId.m6078constructorimpl(-1L);
                            return w01.a;
                        }
                        anonymousClass1.L$0 = awaitPointerEventScope;
                        anonymousClass1.label = 2;
                        obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, anonymousClass1, 1, null);
                    }
                    PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
                    anonymousClass1.this$0.pointerId = pointerInputChange3.m6098getIdJ3iCeTQ();
                    anonymousClass1.this$0.pointerPosition = pointerInputChange3.m6101getPositionF1C5BW0();
                    anonymousClass1.L$0 = awaitPointerEventScope;
                    anonymousClass1.label = 2;
                    obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, anonymousClass1, 1, null);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(AndroidEdgeEffectOverscrollEffect.this, null), hmVar);
                return awaitEachGesture == vn.d ? awaitEachGesture : w01.a;
            }
        });
        this.pointerInputNode = SuspendingPointerInputModifierNode;
        this.node = Build.VERSION.SDK_INT >= 31 ? new StretchOverscrollNode(SuspendingPointerInputModifierNode, this, edgeEffectWrapper) : new GlowOverscrollNode(SuspendingPointerInputModifierNode, this, edgeEffectWrapper, paddingValues);
    }

    private final void animateToReleaseIfNeeded() {
        boolean z;
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            invalidateOverscroll$foundation();
        }
    }

    /* renamed from: pullBottom-k-4lQ0M, reason: not valid java name */
    private final float m200pullBottomk4lQ0M(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (m207displacementF1C5BW0$foundation() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        EdgeEffect orCreateBottomEffect = this.edgeEffectWrapper.getOrCreateBottomEffect();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(orCreateBottomEffect) == 0.0f ? Float.intBitsToFloat((int) (this.containerSize & 4294967295L)) * (-edgeEffectCompat.onPullDistanceCompat(orCreateBottomEffect, -intBitsToFloat2, 1.0f - intBitsToFloat)) : Float.intBitsToFloat(i);
    }

    /* renamed from: pullLeft-k-4lQ0M, reason: not valid java name */
    private final float m201pullLeftk4lQ0M(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (m207displacementF1C5BW0$foundation() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect orCreateLeftEffect = this.edgeEffectWrapper.getOrCreateLeftEffect();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(orCreateLeftEffect) == 0.0f ? Float.intBitsToFloat((int) (this.containerSize >> 32)) * edgeEffectCompat.onPullDistanceCompat(orCreateLeftEffect, intBitsToFloat2, 1.0f - intBitsToFloat) : Float.intBitsToFloat(i);
    }

    /* renamed from: pullRight-k-4lQ0M, reason: not valid java name */
    private final float m202pullRightk4lQ0M(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (m207displacementF1C5BW0$foundation() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect orCreateRightEffect = this.edgeEffectWrapper.getOrCreateRightEffect();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(orCreateRightEffect) == 0.0f ? Float.intBitsToFloat((int) (this.containerSize >> 32)) * (-edgeEffectCompat.onPullDistanceCompat(orCreateRightEffect, -intBitsToFloat2, intBitsToFloat)) : Float.intBitsToFloat(i);
    }

    /* renamed from: pullTop-k-4lQ0M, reason: not valid java name */
    private final float m203pullTopk4lQ0M(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (m207displacementF1C5BW0$foundation() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        EdgeEffect orCreateTopEffect = this.edgeEffectWrapper.getOrCreateTopEffect();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(orCreateTopEffect) == 0.0f ? Float.intBitsToFloat((int) (this.containerSize & 4294967295L)) * edgeEffectCompat.onPullDistanceCompat(orCreateTopEffect, intBitsToFloat2, intBitsToFloat) : Float.intBitsToFloat(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /* renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m204releaseOppositeOverscrollk4lQ0M(long j) {
        boolean z;
        if (this.edgeEffectWrapper.isLeftAnimating()) {
            int i = (int) (j >> 32);
            if (Float.intBitsToFloat(i) < 0.0f) {
                EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateLeftEffect(), Float.intBitsToFloat(i));
                z = this.edgeEffectWrapper.isLeftAnimating();
                if (this.edgeEffectWrapper.isRightAnimating()) {
                    int i2 = (int) (j >> 32);
                    if (Float.intBitsToFloat(i2) > 0.0f) {
                        EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateRightEffect(), Float.intBitsToFloat(i2));
                        z = z || this.edgeEffectWrapper.isRightAnimating();
                    }
                }
                if (this.edgeEffectWrapper.isTopAnimating()) {
                    int i3 = (int) (j & 4294967295L);
                    if (Float.intBitsToFloat(i3) < 0.0f) {
                        EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateTopEffect(), Float.intBitsToFloat(i3));
                        z = z || this.edgeEffectWrapper.isTopAnimating();
                    }
                }
                if (this.edgeEffectWrapper.isBottomAnimating()) {
                    int i4 = (int) (j & 4294967295L);
                    if (Float.intBitsToFloat(i4) > 0.0f) {
                        EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateBottomEffect(), Float.intBitsToFloat(i4));
                        return z || this.edgeEffectWrapper.isBottomAnimating();
                    }
                }
                return z;
            }
        }
        z = false;
        if (this.edgeEffectWrapper.isRightAnimating()) {
        }
        if (this.edgeEffectWrapper.isTopAnimating()) {
        }
        if (this.edgeEffectWrapper.isBottomAnimating()) {
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo205applyToFlingBMRW4eQ(long j, my myVar, hm hmVar) {
        AndroidEdgeEffectOverscrollEffect$applyToFling$1 androidEdgeEffectOverscrollEffect$applyToFling$1;
        int i;
        long j2;
        long m7852minusAH228Gc;
        if (hmVar instanceof AndroidEdgeEffectOverscrollEffect$applyToFling$1) {
            androidEdgeEffectOverscrollEffect$applyToFling$1 = (AndroidEdgeEffectOverscrollEffect$applyToFling$1) hmVar;
            int i2 = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidEdgeEffectOverscrollEffect$applyToFling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidEdgeEffectOverscrollEffect$applyToFling$1.result;
                i = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
                w01 w01Var = w01.a;
                if (i == 0) {
                    if (i == 1) {
                        p10.Q(obj);
                        return w01Var;
                    }
                    if (i != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = androidEdgeEffectOverscrollEffect$applyToFling$1.J$0;
                    p10.Q(obj);
                    m7852minusAH228Gc = Velocity.m7852minusAH228Gc(j2, ((Velocity) obj).m7858unboximpl());
                    this.scrollCycleInProgress = false;
                    if (Velocity.m7849getXimpl(m7852minusAH228Gc) <= 0.0f) {
                        EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.edgeEffectWrapper.getOrCreateLeftEffect(), y80.P(Velocity.m7849getXimpl(m7852minusAH228Gc)));
                    } else if (Velocity.m7849getXimpl(m7852minusAH228Gc) < 0.0f) {
                        EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.edgeEffectWrapper.getOrCreateRightEffect(), -y80.P(Velocity.m7849getXimpl(m7852minusAH228Gc)));
                    }
                    if (Velocity.m7850getYimpl(m7852minusAH228Gc) <= 0.0f) {
                        EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.edgeEffectWrapper.getOrCreateTopEffect(), y80.P(Velocity.m7850getYimpl(m7852minusAH228Gc)));
                    } else if (Velocity.m7850getYimpl(m7852minusAH228Gc) < 0.0f) {
                        EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.edgeEffectWrapper.getOrCreateBottomEffect(), -y80.P(Velocity.m7850getYimpl(m7852minusAH228Gc)));
                    }
                    animateToReleaseIfNeeded();
                    return w01Var;
                }
                p10.Q(obj);
                boolean m4587isEmptyimpl = Size.m4587isEmptyimpl(this.containerSize);
                Object obj2 = vn.d;
                if (m4587isEmptyimpl) {
                    Object m7840boximpl = Velocity.m7840boximpl(j);
                    androidEdgeEffectOverscrollEffect$applyToFling$1.label = 1;
                    if (myVar.invoke(m7840boximpl, androidEdgeEffectOverscrollEffect$applyToFling$1) != obj2) {
                        return w01Var;
                    }
                } else {
                    long Velocity = VelocityKt.Velocity((!this.edgeEffectWrapper.isLeftStretched() || Velocity.m7849getXimpl(j) >= 0.0f) ? (!this.edgeEffectWrapper.isRightStretched() || Velocity.m7849getXimpl(j) <= 0.0f) ? 0.0f : -EdgeEffectCompat.INSTANCE.absorbToRelaxIfNeeded(this.edgeEffectWrapper.getOrCreateRightEffect(), -Velocity.m7849getXimpl(j), Float.intBitsToFloat((int) (this.containerSize >> 32)), this.density) : EdgeEffectCompat.INSTANCE.absorbToRelaxIfNeeded(this.edgeEffectWrapper.getOrCreateLeftEffect(), Velocity.m7849getXimpl(j), Float.intBitsToFloat((int) (this.containerSize >> 32)), this.density), (!this.edgeEffectWrapper.isTopStretched() || Velocity.m7850getYimpl(j) >= 0.0f) ? (!this.edgeEffectWrapper.isBottomStretched() || Velocity.m7850getYimpl(j) <= 0.0f) ? 0.0f : -EdgeEffectCompat.INSTANCE.absorbToRelaxIfNeeded(this.edgeEffectWrapper.getOrCreateBottomEffect(), -Velocity.m7850getYimpl(j), Float.intBitsToFloat((int) (4294967295L & this.containerSize)), this.density) : EdgeEffectCompat.INSTANCE.absorbToRelaxIfNeeded(this.edgeEffectWrapper.getOrCreateTopEffect(), Velocity.m7850getYimpl(j), Float.intBitsToFloat((int) (4294967295L & this.containerSize)), this.density));
                    if (!Velocity.m7848equalsimpl0(Velocity, Velocity.Companion.m7860getZero9UxMQ8M())) {
                        invalidateOverscroll$foundation();
                    }
                    long m7852minusAH228Gc2 = Velocity.m7852minusAH228Gc(j, Velocity);
                    Object m7840boximpl2 = Velocity.m7840boximpl(m7852minusAH228Gc2);
                    androidEdgeEffectOverscrollEffect$applyToFling$1.J$0 = m7852minusAH228Gc2;
                    androidEdgeEffectOverscrollEffect$applyToFling$1.label = 2;
                    obj = myVar.invoke(m7840boximpl2, androidEdgeEffectOverscrollEffect$applyToFling$1);
                    if (obj != obj2) {
                        j2 = m7852minusAH228Gc2;
                        m7852minusAH228Gc = Velocity.m7852minusAH228Gc(j2, ((Velocity) obj).m7858unboximpl());
                        this.scrollCycleInProgress = false;
                        if (Velocity.m7849getXimpl(m7852minusAH228Gc) <= 0.0f) {
                        }
                        if (Velocity.m7850getYimpl(m7852minusAH228Gc) <= 0.0f) {
                        }
                        animateToReleaseIfNeeded();
                        return w01Var;
                    }
                }
                return obj2;
            }
        }
        androidEdgeEffectOverscrollEffect$applyToFling$1 = new AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, hmVar);
        Object obj3 = androidEdgeEffectOverscrollEffect$applyToFling$1.result;
        i = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
        w01 w01Var2 = w01.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fe  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo206applyToScrollRhakbz0(long j, int i, ky kyVar) {
        float m224destretchMultiplierGyEprt8;
        float m200pullBottomk4lQ0M;
        float intBitsToFloat;
        int i2;
        float m202pullRightk4lQ0M;
        float intBitsToFloat2;
        long m4508constructorimpl;
        Offset.Companion companion;
        long m4520minusMKHz9U;
        EdgeEffectWrapper edgeEffectWrapper;
        boolean z;
        boolean z2;
        int i3;
        boolean z3;
        if (Size.m4587isEmptyimpl(this.containerSize)) {
            return ((Offset) kyVar.invoke(Offset.m4505boximpl(j))).m4526unboximpl();
        }
        if (!this.scrollCycleInProgress) {
            if (this.edgeEffectWrapper.isLeftStretched()) {
                m201pullLeftk4lQ0M(Offset.Companion.m4532getZeroF1C5BW0());
            }
            if (this.edgeEffectWrapper.isRightStretched()) {
                m202pullRightk4lQ0M(Offset.Companion.m4532getZeroF1C5BW0());
            }
            if (this.edgeEffectWrapper.isTopStretched()) {
                m203pullTopk4lQ0M(Offset.Companion.m4532getZeroF1C5BW0());
            }
            if (this.edgeEffectWrapper.isBottomStretched()) {
                m200pullBottomk4lQ0M(Offset.Companion.m4532getZeroF1C5BW0());
            }
            this.scrollCycleInProgress = true;
        }
        m224destretchMultiplierGyEprt8 = AndroidOverscroll_androidKt.m224destretchMultiplierGyEprt8(i);
        long m4523timestuRUvjQ = Offset.m4523timestuRUvjQ(j, m224destretchMultiplierGyEprt8);
        int i4 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i4) != 0.0f) {
            if (this.edgeEffectWrapper.isTopStretched() && Float.intBitsToFloat(i4) < 0.0f) {
                m200pullBottomk4lQ0M = m203pullTopk4lQ0M(m4523timestuRUvjQ);
                if (!this.edgeEffectWrapper.isTopStretched()) {
                    this.edgeEffectWrapper.getOrCreateTopEffect().finish();
                }
                if (m200pullBottomk4lQ0M == Float.intBitsToFloat((int) (m4523timestuRUvjQ & 4294967295L))) {
                    intBitsToFloat = Float.intBitsToFloat(i4);
                }
                intBitsToFloat = m200pullBottomk4lQ0M / m224destretchMultiplierGyEprt8;
            } else if (this.edgeEffectWrapper.isBottomStretched() && Float.intBitsToFloat(i4) > 0.0f) {
                m200pullBottomk4lQ0M = m200pullBottomk4lQ0M(m4523timestuRUvjQ);
                if (!this.edgeEffectWrapper.isBottomStretched()) {
                    this.edgeEffectWrapper.getOrCreateBottomEffect().finish();
                }
                if (m200pullBottomk4lQ0M == Float.intBitsToFloat((int) (m4523timestuRUvjQ & 4294967295L))) {
                    intBitsToFloat = Float.intBitsToFloat(i4);
                }
                intBitsToFloat = m200pullBottomk4lQ0M / m224destretchMultiplierGyEprt8;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                if (this.edgeEffectWrapper.isLeftStretched() && Float.intBitsToFloat(i2) < 0.0f) {
                    m202pullRightk4lQ0M = m201pullLeftk4lQ0M(m4523timestuRUvjQ);
                    if (!this.edgeEffectWrapper.isLeftStretched()) {
                        this.edgeEffectWrapper.getOrCreateLeftEffect().finish();
                    }
                    if (m202pullRightk4lQ0M == Float.intBitsToFloat((int) (m4523timestuRUvjQ >> 32))) {
                        intBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                    intBitsToFloat2 = m202pullRightk4lQ0M / m224destretchMultiplierGyEprt8;
                } else if (this.edgeEffectWrapper.isRightStretched() && Float.intBitsToFloat(i2) > 0.0f) {
                    m202pullRightk4lQ0M = m202pullRightk4lQ0M(m4523timestuRUvjQ);
                    if (!this.edgeEffectWrapper.isRightStretched()) {
                        this.edgeEffectWrapper.getOrCreateRightEffect().finish();
                    }
                    if (m202pullRightk4lQ0M == Float.intBitsToFloat((int) (m4523timestuRUvjQ >> 32))) {
                        intBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                    intBitsToFloat2 = m202pullRightk4lQ0M / m224destretchMultiplierGyEprt8;
                }
                m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
                companion = Offset.Companion;
                if (!Offset.m4513equalsimpl0(m4508constructorimpl, companion.m4532getZeroF1C5BW0())) {
                    invalidateOverscroll$foundation();
                }
                m4520minusMKHz9U = Offset.m4520minusMKHz9U(j, m4508constructorimpl);
                long m4526unboximpl = ((Offset) kyVar.invoke(Offset.m4505boximpl(m4520minusMKHz9U))).m4526unboximpl();
                long m4520minusMKHz9U2 = Offset.m4520minusMKHz9U(m4520minusMKHz9U, m4526unboximpl);
                if ((Float.intBitsToFloat((int) (m4520minusMKHz9U >> 32)) == 0.0f || Float.intBitsToFloat((int) (m4520minusMKHz9U & 4294967295L)) != 0.0f) && (Float.intBitsToFloat((int) (m4526unboximpl >> 32)) != 0.0f || Float.intBitsToFloat((int) (m4526unboximpl & 4294967295L)) != 0.0f)) {
                    edgeEffectWrapper = this.edgeEffectWrapper;
                    if (!edgeEffectWrapper.isLeftStretched() || edgeEffectWrapper.isTopStretched() || edgeEffectWrapper.isRightStretched() || edgeEffectWrapper.isBottomStretched()) {
                        animateToReleaseIfNeeded();
                    }
                }
                if (NestedScrollSource.m5957equalsimpl0(i, NestedScrollSource.Companion.m5969getUserInputWNlRxjI())) {
                    int i5 = (int) (m4520minusMKHz9U2 >> 32);
                    if (Float.intBitsToFloat(i5) > 0.5f) {
                        m201pullLeftk4lQ0M(m4520minusMKHz9U2);
                    } else {
                        if (Float.intBitsToFloat(i5) >= -0.5f) {
                            z2 = false;
                            i3 = (int) (m4520minusMKHz9U2 & 4294967295L);
                            if (Float.intBitsToFloat(i3) <= 0.5f) {
                                m203pullTopk4lQ0M(m4520minusMKHz9U2);
                            } else if (Float.intBitsToFloat(i3) < -0.5f) {
                                m200pullBottomk4lQ0M(m4520minusMKHz9U2);
                            } else {
                                z3 = false;
                                if (!z2 || z3) {
                                    z = true;
                                    if (!Offset.m4513equalsimpl0(m4520minusMKHz9U, companion.m4532getZeroF1C5BW0())) {
                                        z = m204releaseOppositeOverscrollk4lQ0M(j) || z;
                                    }
                                    if (z) {
                                        invalidateOverscroll$foundation();
                                    }
                                    return Offset.m4521plusMKHz9U(m4508constructorimpl, m4526unboximpl);
                                }
                            }
                            z3 = true;
                            if (!z2) {
                            }
                            z = true;
                            if (!Offset.m4513equalsimpl0(m4520minusMKHz9U, companion.m4532getZeroF1C5BW0())) {
                            }
                            if (z) {
                            }
                            return Offset.m4521plusMKHz9U(m4508constructorimpl, m4526unboximpl);
                        }
                        m202pullRightk4lQ0M(m4520minusMKHz9U2);
                    }
                    z2 = true;
                    i3 = (int) (m4520minusMKHz9U2 & 4294967295L);
                    if (Float.intBitsToFloat(i3) <= 0.5f) {
                    }
                    z3 = true;
                    if (!z2) {
                    }
                    z = true;
                    if (!Offset.m4513equalsimpl0(m4520minusMKHz9U, companion.m4532getZeroF1C5BW0())) {
                    }
                    if (z) {
                    }
                    return Offset.m4521plusMKHz9U(m4508constructorimpl, m4526unboximpl);
                }
                z = false;
                if (!Offset.m4513equalsimpl0(m4520minusMKHz9U, companion.m4532getZeroF1C5BW0())) {
                }
                if (z) {
                }
                return Offset.m4521plusMKHz9U(m4508constructorimpl, m4526unboximpl);
            }
            intBitsToFloat2 = 0.0f;
            m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
            companion = Offset.Companion;
            if (!Offset.m4513equalsimpl0(m4508constructorimpl, companion.m4532getZeroF1C5BW0())) {
            }
            m4520minusMKHz9U = Offset.m4520minusMKHz9U(j, m4508constructorimpl);
            long m4526unboximpl2 = ((Offset) kyVar.invoke(Offset.m4505boximpl(m4520minusMKHz9U))).m4526unboximpl();
            long m4520minusMKHz9U22 = Offset.m4520minusMKHz9U(m4520minusMKHz9U, m4526unboximpl2);
            if (Float.intBitsToFloat((int) (m4520minusMKHz9U >> 32)) == 0.0f) {
            }
            edgeEffectWrapper = this.edgeEffectWrapper;
            if (!edgeEffectWrapper.isLeftStretched()) {
            }
            animateToReleaseIfNeeded();
            if (NestedScrollSource.m5957equalsimpl0(i, NestedScrollSource.Companion.m5969getUserInputWNlRxjI())) {
            }
            z = false;
            if (!Offset.m4513equalsimpl0(m4520minusMKHz9U, companion.m4532getZeroF1C5BW0())) {
            }
            if (z) {
            }
            return Offset.m4521plusMKHz9U(m4508constructorimpl, m4526unboximpl2);
        }
        intBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
        }
        intBitsToFloat2 = 0.0f;
        m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
        companion = Offset.Companion;
        if (!Offset.m4513equalsimpl0(m4508constructorimpl, companion.m4532getZeroF1C5BW0())) {
        }
        m4520minusMKHz9U = Offset.m4520minusMKHz9U(j, m4508constructorimpl);
        long m4526unboximpl22 = ((Offset) kyVar.invoke(Offset.m4505boximpl(m4520minusMKHz9U))).m4526unboximpl();
        long m4520minusMKHz9U222 = Offset.m4520minusMKHz9U(m4520minusMKHz9U, m4526unboximpl22);
        if (Float.intBitsToFloat((int) (m4520minusMKHz9U >> 32)) == 0.0f) {
        }
        edgeEffectWrapper = this.edgeEffectWrapper;
        if (!edgeEffectWrapper.isLeftStretched()) {
        }
        animateToReleaseIfNeeded();
        if (NestedScrollSource.m5957equalsimpl0(i, NestedScrollSource.Companion.m5969getUserInputWNlRxjI())) {
        }
        z = false;
        if (!Offset.m4513equalsimpl0(m4520minusMKHz9U, companion.m4532getZeroF1C5BW0())) {
        }
        if (z) {
        }
        return Offset.m4521plusMKHz9U(m4508constructorimpl, m4526unboximpl22);
    }

    /* renamed from: displacement-F1C5BW0$foundation, reason: not valid java name */
    public final long m207displacementF1C5BW0$foundation() {
        long j = this.pointerPosition;
        if ((InlineClassHelperKt.DualUnsignedFloatMask & j) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            j = SizeKt.m4595getCenteruvyYCjk(this.containerSize);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public final boolean getInvalidationEnabled$foundation() {
        return this.invalidationEnabled;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public DelegatableNode getNode() {
        return this.node;
    }

    public final MutableState<w01> getRedrawSignal$foundation() {
        return this.redrawSignal;
    }

    public final void invalidateOverscroll$foundation() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(w01.a);
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        if (edgeEffect != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        return (edgeEffect4 == null || EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect4) == 0.0f) ? false : true;
    }

    public final void setInvalidationEnabled$foundation(boolean z) {
        this.invalidationEnabled = z;
    }

    /* renamed from: updateSize-uvyYCjk$foundation, reason: not valid java name */
    public final void m208updateSizeuvyYCjk$foundation(long j) {
        boolean m4581equalsimpl0 = Size.m4581equalsimpl0(this.containerSize, Size.Companion.m4594getZeroNHjbRc());
        boolean m4581equalsimpl02 = Size.m4581equalsimpl0(j, this.containerSize);
        this.containerSize = j;
        if (!m4581equalsimpl02) {
            this.edgeEffectWrapper.m281updateSizeozmzZPI(IntSize.m7777constructorimpl((y80.P(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (y80.P(Float.intBitsToFloat((int) (j >> 32))) << 32)));
        }
        if (m4581equalsimpl0 || m4581equalsimpl02) {
            return;
        }
        animateToReleaseIfNeeded();
    }

    public static /* synthetic */ void getInvalidationEnabled$foundation$annotations() {
    }

    public /* synthetic */ AndroidEdgeEffectOverscrollEffect(Context context, Density density, long j, PaddingValues paddingValues, dq dqVar) {
        this(context, density, j, paddingValues);
    }
}
