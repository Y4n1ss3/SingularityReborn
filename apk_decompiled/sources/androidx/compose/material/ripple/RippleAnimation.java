package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.dq;
import defpackage.hm;
import defpackage.kf0;
import defpackage.nj;
import defpackage.o;
import defpackage.oj;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RippleAnimation {
    public static final int $stable = 8;
    private final Animatable<Float, AnimationVector1D> animatedAlpha;
    private final Animatable<Float, AnimationVector1D> animatedCenterPercent;
    private final Animatable<Float, AnimationVector1D> animatedRadiusPercent;
    private final boolean bounded;
    private final MutableState finishRequested$delegate;
    private final nj finishSignalDeferred;
    private final MutableState finishedFadingIn$delegate;
    private Offset origin;
    private final float radius;
    private Float startRadius;
    private Offset targetCenter;

    private RippleAnimation(Offset offset, float f, boolean z) {
        this.origin = offset;
        this.radius = f;
        this.bounded = z;
        this.animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedRadiusPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedCenterPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        oj ojVar = new oj(true);
        ojVar.H(null);
        this.finishSignalDeferred = ojVar;
        Boolean bool = Boolean.FALSE;
        this.finishedFadingIn$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.finishRequested$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeIn(hm hmVar) {
        Object n = p10.n(new RippleAnimation$fadeIn$2(this, null), hmVar);
        return n == vn.d ? n : w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeOut(hm hmVar) {
        Object n = p10.n(new RippleAnimation$fadeOut$2(this, null), hmVar);
        return n == vn.d ? n : w01.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getFinishRequested() {
        return ((Boolean) this.finishRequested$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getFinishedFadingIn() {
        return ((Boolean) this.finishedFadingIn$delegate.getValue()).booleanValue();
    }

    private final void setFinishRequested(boolean z) {
        this.finishRequested$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setFinishedFadingIn(boolean z) {
        this.finishedFadingIn$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (fadeOut(r0) == r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (((defpackage.oj) r7).r(r0) != r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (fadeIn(r0) == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animate(hm hmVar) {
        RippleAnimation$animate$1 rippleAnimation$animate$1;
        int i;
        if (hmVar instanceof RippleAnimation$animate$1) {
            rippleAnimation$animate$1 = (RippleAnimation$animate$1) hmVar;
            int i2 = rippleAnimation$animate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rippleAnimation$animate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rippleAnimation$animate$1.result;
                i = rippleAnimation$animate$1.label;
                Object obj2 = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    rippleAnimation$animate$1.label = 1;
                } else if (i == 1) {
                    p10.Q(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            p10.Q(obj);
                            return w01.a;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    rippleAnimation$animate$1.label = 3;
                }
                setFinishedFadingIn(true);
                nj njVar = this.finishSignalDeferred;
                rippleAnimation$animate$1.label = 2;
            }
        }
        rippleAnimation$animate$1 = new RippleAnimation$animate$1(this, hmVar);
        Object obj3 = rippleAnimation$animate$1.result;
        i = rippleAnimation$animate$1.label;
        Object obj22 = vn.d;
        if (i != 0) {
        }
        setFinishedFadingIn(true);
        nj njVar2 = this.finishSignalDeferred;
        rippleAnimation$animate$1.label = 2;
    }

    /* renamed from: draw-4WTKRHQ, reason: not valid java name */
    public final void m1576draw4WTKRHQ(DrawScope drawScope, long j) {
        if (this.startRadius == null) {
            this.startRadius = Float.valueOf(RippleAnimationKt.m1578getRippleStartRadiusuvyYCjk(drawScope.mo5335getSizeNHjbRc()));
        }
        if (this.origin == null) {
            this.origin = Offset.m4505boximpl(drawScope.mo5334getCenterF1C5BW0());
        }
        if (this.targetCenter == null) {
            this.targetCenter = Offset.m4505boximpl(OffsetKt.Offset(Size.m4585getWidthimpl(drawScope.mo5335getSizeNHjbRc()) / 2.0f, Size.m4582getHeightimpl(drawScope.mo5335getSizeNHjbRc()) / 2.0f));
        }
        float floatValue = (!getFinishRequested() || getFinishedFadingIn()) ? this.animatedAlpha.getValue().floatValue() : 1.0f;
        Float f = this.startRadius;
        f.getClass();
        float lerp = MathHelpersKt.lerp(f.floatValue(), this.radius, this.animatedRadiusPercent.getValue().floatValue());
        Offset offset = this.origin;
        offset.getClass();
        float m4516getXimpl = Offset.m4516getXimpl(offset.m4526unboximpl());
        Offset offset2 = this.targetCenter;
        offset2.getClass();
        float lerp2 = MathHelpersKt.lerp(m4516getXimpl, Offset.m4516getXimpl(offset2.m4526unboximpl()), this.animatedCenterPercent.getValue().floatValue());
        Offset offset3 = this.origin;
        offset3.getClass();
        float m4517getYimpl = Offset.m4517getYimpl(offset3.m4526unboximpl());
        Offset offset4 = this.targetCenter;
        offset4.getClass();
        long Offset = OffsetKt.Offset(lerp2, MathHelpersKt.lerp(m4517getYimpl, Offset.m4517getYimpl(offset4.m4526unboximpl()), this.animatedCenterPercent.getValue().floatValue()));
        long m4760copywmQWz5c$default = Color.m4760copywmQWz5c$default(j, Color.m4763getAlphaimpl(j) * floatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            DrawScope.m5316drawCircleVaOC9Bg$default(drawScope, m4760copywmQWz5c$default, lerp, Offset, 0.0f, null, null, 0, 120, null);
            return;
        }
        float m4585getWidthimpl = Size.m4585getWidthimpl(drawScope.mo5335getSizeNHjbRc());
        float m4582getHeightimpl = Size.m4582getHeightimpl(drawScope.mo5335getSizeNHjbRc());
        int m4750getIntersectrtfAjoo = ClipOp.Companion.m4750getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5259clipRectN_I0leg(0.0f, 0.0f, m4585getWidthimpl, m4582getHeightimpl, m4750getIntersectrtfAjoo);
            DrawScope.m5316drawCircleVaOC9Bg$default(drawScope, m4760copywmQWz5c$default, lerp, Offset, 0.0f, null, null, 0, 120, null);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    public final void finish() {
        setFinishRequested(true);
        ((oj) this.finishSignalDeferred).K(w01.a);
    }

    public /* synthetic */ RippleAnimation(Offset offset, float f, boolean z, dq dqVar) {
        this(offset, f, z);
    }
}
