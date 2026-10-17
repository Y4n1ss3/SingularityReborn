package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import defpackage.hm;
import defpackage.lb0;
import defpackage.ob0;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PressGestureScopeImpl implements PressGestureScope, Density {
    public static final int $stable = 0;
    private final /* synthetic */ Density $$delegate_0;
    private boolean isCanceled;
    private boolean isReleased;
    private final lb0 mutex = new ob0();

    public PressGestureScopeImpl(Density density) {
        this.$$delegate_0 = density;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object awaitRelease(hm hmVar) {
        PressGestureScopeImpl$awaitRelease$1 pressGestureScopeImpl$awaitRelease$1;
        Object obj;
        int i;
        if (hmVar instanceof PressGestureScopeImpl$awaitRelease$1) {
            pressGestureScopeImpl$awaitRelease$1 = (PressGestureScopeImpl$awaitRelease$1) hmVar;
            int i2 = pressGestureScopeImpl$awaitRelease$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$awaitRelease$1.label = i2 - Integer.MIN_VALUE;
                obj = pressGestureScopeImpl$awaitRelease$1.result;
                i = pressGestureScopeImpl$awaitRelease$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    pressGestureScopeImpl$awaitRelease$1.label = 1;
                    obj = tryAwaitRelease(pressGestureScopeImpl$awaitRelease$1);
                    Object obj2 = vn.d;
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    throw new GestureCancellationException("The press gesture was canceled.");
                }
                return w01.a;
            }
        }
        pressGestureScopeImpl$awaitRelease$1 = new PressGestureScopeImpl$awaitRelease$1(this, hmVar);
        obj = pressGestureScopeImpl$awaitRelease$1.result;
        i = pressGestureScopeImpl$awaitRelease$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final void cancel() {
        this.isCanceled = true;
        if (((ob0) this.mutex).c()) {
            ((ob0) this.mutex).f(null);
        }
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    public final void release() {
        this.isReleased = true;
        if (((ob0) this.mutex).c()) {
            ((ob0) this.mutex).f(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reset(hm hmVar) {
        PressGestureScopeImpl$reset$1 pressGestureScopeImpl$reset$1;
        int i;
        if (hmVar instanceof PressGestureScopeImpl$reset$1) {
            pressGestureScopeImpl$reset$1 = (PressGestureScopeImpl$reset$1) hmVar;
            int i2 = pressGestureScopeImpl$reset$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$reset$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pressGestureScopeImpl$reset$1.result;
                i = pressGestureScopeImpl$reset$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    lb0 lb0Var = this.mutex;
                    pressGestureScopeImpl$reset$1.label = 1;
                    Object d = ((ob0) lb0Var).d(pressGestureScopeImpl$reset$1);
                    vn vnVar = vn.d;
                    if (d == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                this.isReleased = false;
                this.isCanceled = false;
                return w01.a;
            }
        }
        pressGestureScopeImpl$reset$1 = new PressGestureScopeImpl$reset$1(this, hmVar);
        Object obj2 = pressGestureScopeImpl$reset$1.result;
        i = pressGestureScopeImpl$reset$1.label;
        if (i != 0) {
        }
        this.isReleased = false;
        this.isCanceled = false;
        return w01.a;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public int mo360roundToPxR2X_6o(long j) {
        return this.$$delegate_0.mo360roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public int mo361roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo361roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo362toDpGaN1DYA(long j) {
        return this.$$delegate_0.mo362toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo363toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo363toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo365toDpSizekrfVVM(long j) {
        return this.$$delegate_0.mo365toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public float mo366toPxR2X_6o(long j) {
        return this.$$delegate_0.mo366toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public float mo367toPx0680j_4(float f) {
        return this.$$delegate_0.mo367toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo368toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.mo368toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo369toSp0xMU5do(float f) {
        return this.$$delegate_0.mo369toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo370toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo370toSpkPz2Gy4(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object tryAwaitRelease(hm hmVar) {
        PressGestureScopeImpl$tryAwaitRelease$1 pressGestureScopeImpl$tryAwaitRelease$1;
        int i;
        if (hmVar instanceof PressGestureScopeImpl$tryAwaitRelease$1) {
            pressGestureScopeImpl$tryAwaitRelease$1 = (PressGestureScopeImpl$tryAwaitRelease$1) hmVar;
            int i2 = pressGestureScopeImpl$tryAwaitRelease$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$tryAwaitRelease$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pressGestureScopeImpl$tryAwaitRelease$1.result;
                i = pressGestureScopeImpl$tryAwaitRelease$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    if (!this.isReleased && !this.isCanceled) {
                        lb0 lb0Var = this.mutex;
                        pressGestureScopeImpl$tryAwaitRelease$1.label = 1;
                        Object d = ((ob0) lb0Var).d(pressGestureScopeImpl$tryAwaitRelease$1);
                        vn vnVar = vn.d;
                        if (d == vnVar) {
                            return vnVar;
                        }
                    }
                    return Boolean.valueOf(this.isReleased);
                }
                if (i != 1) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                ((ob0) this.mutex).f(null);
                return Boolean.valueOf(this.isReleased);
            }
        }
        pressGestureScopeImpl$tryAwaitRelease$1 = new PressGestureScopeImpl$tryAwaitRelease$1(this, hmVar);
        Object obj2 = pressGestureScopeImpl$tryAwaitRelease$1.result;
        i = pressGestureScopeImpl$tryAwaitRelease$1.label;
        if (i != 0) {
        }
        ((ob0) this.mutex).f(null);
        return Boolean.valueOf(this.isReleased);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo364toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo364toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo371toSpkPz2Gy4(int i) {
        return this.$$delegate_0.mo371toSpkPz2Gy4(i);
    }
}
