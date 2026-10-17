package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import defpackage.d41;
import defpackage.fg;
import defpackage.gg;
import defpackage.gi0;
import defpackage.hm;
import defpackage.j31;
import defpackage.kn;
import defpackage.ny;
import defpackage.o;
import defpackage.p10;
import defpackage.q10;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {
    private WindowInsetsAnimationController animationController;
    private z10 animationJob;
    private final CancellationSignal cancellationSignal = new CancellationSignal();
    private fg continuation;
    private final Density density;
    private boolean isControllerRequested;
    private float partialConsumption;
    private final SideCalculator sideCalculator;
    private final View view;
    private final AndroidWindowInsets windowInsets;

    public WindowInsetsNestedScrollConnection(AndroidWindowInsets androidWindowInsets, View view, SideCalculator sideCalculator, Density density) {
        this.windowInsets = androidWindowInsets;
        this.view = view;
        this.sideCalculator = sideCalculator;
        this.density = density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustInsets(float f) {
        Insets currentInsets;
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            currentInsets = windowInsetsAnimationController.getCurrentInsets();
            windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, Math.round(f)), 1.0f, 0.0f);
        }
    }

    private final void animationEnded() {
        boolean isReady;
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.animationController;
        if (windowInsetsAnimationController2 != null) {
            isReady = windowInsetsAnimationController2.isReady();
            if (isReady && (windowInsetsAnimationController = this.animationController) != null) {
                windowInsetsAnimationController.finish(this.windowInsets.isVisible());
            }
        }
        this.animationController = null;
        fg fgVar = this.continuation;
        if (fgVar != null) {
            fgVar.k(null, new ny() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$animationEnded$1
                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((Throwable) obj, (Void) obj2, (kn) obj3);
                    return w01.a;
                }

                public final void invoke(Throwable th, Void r2, kn knVar) {
                }
            });
        }
        this.continuation = null;
        z10 z10Var = this.animationJob;
        if (z10Var != null) {
            z10Var.cancel(new WindowInsetsAnimationCancelledException());
        }
        this.animationJob = null;
        this.partialConsumption = 0.0f;
        this.isControllerRequested = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* renamed from: fling-huYlsQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m835flinghuYlsQE(long j, float f, boolean z, hm hmVar) {
        WindowInsetsNestedScrollConnection$fling$1 windowInsetsNestedScrollConnection$fling$1;
        int i;
        Object animationController;
        long j2;
        WindowInsetsAnimationController e;
        Insets hiddenStateInsets;
        Insets shownStateInsets;
        Insets currentInsets;
        gi0 gi0Var;
        long j3;
        long j4;
        float f2 = f;
        if (hmVar instanceof WindowInsetsNestedScrollConnection$fling$1) {
            windowInsetsNestedScrollConnection$fling$1 = (WindowInsetsNestedScrollConnection$fling$1) hmVar;
            int i2 = windowInsetsNestedScrollConnection$fling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                windowInsetsNestedScrollConnection$fling$1.label = i2 - Integer.MIN_VALUE;
                WindowInsetsNestedScrollConnection$fling$1 windowInsetsNestedScrollConnection$fling$12 = windowInsetsNestedScrollConnection$fling$1;
                Object obj = windowInsetsNestedScrollConnection$fling$12.result;
                i = windowInsetsNestedScrollConnection$fling$12.label;
                Object obj2 = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    z10 z10Var = this.animationJob;
                    if (z10Var != null) {
                        z10Var.cancel(new WindowInsetsAnimationCancelledException());
                    }
                    this.animationJob = null;
                    this.partialConsumption = 0.0f;
                    if ((f2 == 0.0f && !z) || (this.animationController == null && this.windowInsets.isVisible() == z)) {
                        return Velocity.m7840boximpl(Velocity.Companion.m7860getZero9UxMQ8M());
                    }
                    windowInsetsNestedScrollConnection$fling$12.J$0 = j;
                    windowInsetsNestedScrollConnection$fling$12.F$0 = f2;
                    windowInsetsNestedScrollConnection$fling$12.label = 1;
                    animationController = getAnimationController(windowInsetsNestedScrollConnection$fling$12);
                    if (animationController != obj2) {
                        j2 = j;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        j3 = windowInsetsNestedScrollConnection$fling$12.J$0;
                        gi0Var = (gi0) windowInsetsNestedScrollConnection$fling$12.L$0;
                        p10.Q(obj);
                        return Velocity.m7840boximpl(this.sideCalculator.mo789consumedVelocityQWom1Mo(j3, gi0Var.d));
                    }
                    if (i != 3) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j4 = windowInsetsNestedScrollConnection$fling$12.J$0;
                    p10.Q(obj);
                    return Velocity.m7840boximpl(this.sideCalculator.mo789consumedVelocityQWom1Mo(j4, 0.0f));
                }
                f2 = windowInsetsNestedScrollConnection$fling$12.F$0;
                j2 = windowInsetsNestedScrollConnection$fling$12.J$0;
                p10.Q(obj);
                animationController = obj;
                float f3 = f2;
                e = j31.e(animationController);
                if (e != null) {
                    return Velocity.m7840boximpl(Velocity.Companion.m7860getZero9UxMQ8M());
                }
                SideCalculator sideCalculator = this.sideCalculator;
                hiddenStateInsets = e.getHiddenStateInsets();
                int valueOf = sideCalculator.valueOf(hiddenStateInsets);
                SideCalculator sideCalculator2 = this.sideCalculator;
                shownStateInsets = e.getShownStateInsets();
                int valueOf2 = sideCalculator2.valueOf(shownStateInsets);
                currentInsets = e.getCurrentInsets();
                int valueOf3 = this.sideCalculator.valueOf(currentInsets);
                if ((f3 <= 0.0f && valueOf3 == valueOf) || (f3 >= 0.0f && valueOf3 == valueOf2)) {
                    e.finish(valueOf3 == valueOf2);
                    this.animationController = null;
                    return Velocity.m7840boximpl(Velocity.Companion.m7860getZero9UxMQ8M());
                }
                SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = new SplineBasedFloatDecayAnimationSpec(this.density);
                float flingDistance = valueOf3 + splineBasedFloatDecayAnimationSpec.flingDistance(f3);
                float f4 = valueOf;
                boolean z2 = (flingDistance - f4) / ((float) (valueOf2 - valueOf)) > 0.5f;
                int i3 = z2 ? valueOf2 : valueOf;
                if (flingDistance > valueOf2 || flingDistance < f4) {
                    boolean z3 = z2;
                    gi0 gi0Var2 = new gi0();
                    WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(this, valueOf3, f3, splineBasedFloatDecayAnimationSpec, valueOf, valueOf2, gi0Var2, e, z3, null);
                    windowInsetsNestedScrollConnection$fling$12.L$0 = gi0Var2;
                    windowInsetsNestedScrollConnection$fling$12.J$0 = j2;
                    windowInsetsNestedScrollConnection$fling$12.label = 2;
                    if (p10.n(windowInsetsNestedScrollConnection$fling$2, windowInsetsNestedScrollConnection$fling$12) != obj2) {
                        gi0Var = gi0Var2;
                        j3 = j2;
                        return Velocity.m7840boximpl(this.sideCalculator.mo789consumedVelocityQWom1Mo(j3, gi0Var.d));
                    }
                } else {
                    WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new WindowInsetsNestedScrollConnection$fling$3(this, valueOf3, i3, f3, e, z2, null);
                    windowInsetsNestedScrollConnection$fling$12.J$0 = j2;
                    windowInsetsNestedScrollConnection$fling$12.label = 3;
                    if (p10.n(windowInsetsNestedScrollConnection$fling$3, windowInsetsNestedScrollConnection$fling$12) != obj2) {
                        j4 = j2;
                        return Velocity.m7840boximpl(this.sideCalculator.mo789consumedVelocityQWom1Mo(j4, 0.0f));
                    }
                }
                return obj2;
            }
        }
        windowInsetsNestedScrollConnection$fling$1 = new WindowInsetsNestedScrollConnection$fling$1(this, hmVar);
        WindowInsetsNestedScrollConnection$fling$1 windowInsetsNestedScrollConnection$fling$122 = windowInsetsNestedScrollConnection$fling$1;
        Object obj3 = windowInsetsNestedScrollConnection$fling$122.result;
        i = windowInsetsNestedScrollConnection$fling$122.label;
        Object obj22 = vn.d;
        if (i != 0) {
        }
        float f32 = f2;
        e = j31.e(animationController);
        if (e != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAnimationController(hm hmVar) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            return windowInsetsAnimationController;
        }
        gg ggVar = new gg(1, d41.C(hmVar));
        ggVar.u();
        this.continuation = ggVar;
        requestAnimationController();
        return ggVar.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 onReady$lambda$0(Throwable th, WindowInsetsAnimationController windowInsetsAnimationController, kn knVar) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAnimationController() {
        WindowInsetsController windowInsetsController;
        if (this.isControllerRequested) {
            return;
        }
        this.isControllerRequested = true;
        windowInsetsController = this.view.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.windowInsets.getType$foundation_layout(), -1L, null, this.cancellationSignal, j31.d(this));
        }
    }

    /* renamed from: scroll-8S9VItk, reason: not valid java name */
    private final long m836scroll8S9VItk(long j, float f) {
        Insets hiddenStateInsets;
        Insets shownStateInsets;
        Insets currentInsets;
        z10 z10Var = this.animationJob;
        if (z10Var != null) {
            z10Var.cancel(new WindowInsetsAnimationCancelledException());
            this.animationJob = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (f != 0.0f) {
            if (this.windowInsets.isVisible() != (f > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.partialConsumption = 0.0f;
                    requestAnimationController();
                    return this.sideCalculator.mo788consumedOffsetsMKHz9U(j);
                }
                SideCalculator sideCalculator = this.sideCalculator;
                hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
                int valueOf = sideCalculator.valueOf(hiddenStateInsets);
                SideCalculator sideCalculator2 = this.sideCalculator;
                shownStateInsets = windowInsetsAnimationController.getShownStateInsets();
                int valueOf2 = sideCalculator2.valueOf(shownStateInsets);
                currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int valueOf3 = this.sideCalculator.valueOf(currentInsets);
                if (valueOf3 == (f > 0.0f ? valueOf2 : valueOf)) {
                    this.partialConsumption = 0.0f;
                    return Offset.Companion.m4532getZeroF1C5BW0();
                }
                float f2 = valueOf3 + f + this.partialConsumption;
                int h = y80.h(Math.round(f2), valueOf, valueOf2);
                this.partialConsumption = f2 - Math.round(f2);
                if (h != valueOf3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, h), 1.0f, 0.0f);
                }
                return this.sideCalculator.mo788consumedOffsetsMKHz9U(j);
            }
        }
        return Offset.Companion.m4532getZeroF1C5BW0();
    }

    public final void dispose() {
        Insets currentInsets;
        Insets hiddenStateInsets;
        fg fgVar = this.continuation;
        if (fgVar != null) {
            fgVar.k(null, new ny() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$dispose$1
                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((Throwable) obj, (Void) obj2, (kn) obj3);
                    return w01.a;
                }

                public final void invoke(Throwable th, Void r2, kn knVar) {
                }
            });
        }
        z10 z10Var = this.animationJob;
        if (z10Var != null) {
            z10Var.cancel(null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            currentInsets = windowInsetsAnimationController.getCurrentInsets();
            hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
            windowInsetsAnimationController.finish(!q10.b(currentInsets, hiddenStateInsets));
        }
    }

    public final Density getDensity() {
        return this.density;
    }

    public final SideCalculator getSideCalculator() {
        return this.sideCalculator;
    }

    public final View getView() {
        return this.view;
    }

    public final AndroidWindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        animationEnded();
    }

    public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
        animationEnded();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo533onPostFlingRZ2iAVY(long j, long j2, hm hmVar) {
        return m835flinghuYlsQE(j2, this.sideCalculator.showMotion(Velocity.m7849getXimpl(j2), Velocity.m7850getYimpl(j2)), true, hmVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo534onPostScrollDzOQY0M(long j, long j2, int i) {
        return m836scroll8S9VItk(j2, this.sideCalculator.showMotion(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (4294967295L & j2))));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public Object mo837onPreFlingQWom1Mo(long j, hm hmVar) {
        return m835flinghuYlsQE(j, this.sideCalculator.hideMotion(Velocity.m7849getXimpl(j), Velocity.m7850getYimpl(j)), false, hmVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public long mo838onPreScrollOzD1aCk(long j, int i) {
        return m836scroll8S9VItk(j, this.sideCalculator.hideMotion(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j))));
    }

    public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i) {
        this.animationController = windowInsetsAnimationController;
        this.isControllerRequested = false;
        fg fgVar = this.continuation;
        if (fgVar != null) {
            fgVar.k(windowInsetsAnimationController, new l());
        }
        this.continuation = null;
    }
}
