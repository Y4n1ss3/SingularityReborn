package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import defpackage.ao0;
import defpackage.cc;
import defpackage.d41;
import defpackage.dq;
import defpackage.gi0;
import defpackage.hm;
import defpackage.i2;
import defpackage.iy;
import defpackage.jh;
import defpackage.ji0;
import defpackage.ky;
import defpackage.my;
import defpackage.p01;
import defpackage.p10;
import defpackage.ps0;
import defpackage.uf;
import defpackage.un;
import defpackage.vn;
import defpackage.w01;
import defpackage.x4;
import defpackage.y80;
import defpackage.yi;
import defpackage.z10;
import defpackage.zg;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic {
    public static final int $stable = 8;
    private Density density;
    private boolean isScrolling;
    private final ScrollConfig mouseWheelScrollConfig;
    private final my onScrollStopped;
    private z10 receivingMouseWheelEventsJob;
    private final ScrollingLogic scrollingLogic;
    private final zg channel = d41.b(Integer.MAX_VALUE, 6, null);
    private final MouseWheelVelocityTracker velocityTracker = new MouseWheelVelocityTracker();

    public MouseWheelScrollingLogic(ScrollingLogic scrollingLogic, ScrollConfig scrollConfig, my myVar, Density density) {
        this.scrollingLogic = scrollingLogic;
        this.mouseWheelScrollConfig = scrollConfig;
        this.onScrollStopped = myVar;
        this.density = density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateMouseWheelScroll(NestedScrollScope nestedScrollScope, AnimationState<Float, AnimationVector1D> animationState, float f, int i, ky kyVar, hm hmVar) {
        gi0 gi0Var = new gi0();
        gi0Var.d = animationState.getValue().floatValue();
        Object animateTo = SuspendAnimationKt.animateTo(animationState, new Float(f), AnimationSpecKt.tween$default(i, 0, EasingKt.getLinearEasing(), 2, null), true, new x4(gi0Var, this, nestedScrollScope, kyVar), hmVar);
        return animateTo == vn.d ? animateTo : w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animateMouseWheelScroll$lambda$0(gi0 gi0Var, MouseWheelScrollingLogic mouseWheelScrollingLogic, NestedScrollScope nestedScrollScope, ky kyVar, AnimationScope animationScope) {
        boolean isLowScrollingDelta;
        boolean isLowScrollingDelta2;
        float floatValue = ((Number) animationScope.getValue()).floatValue() - gi0Var.d;
        isLowScrollingDelta = MouseWheelScrollableKt.isLowScrollingDelta(floatValue);
        w01 w01Var = w01.a;
        if (!isLowScrollingDelta) {
            isLowScrollingDelta2 = MouseWheelScrollableKt.isLowScrollingDelta(floatValue - mouseWheelScrollingLogic.dispatchMouseWheelScroll(nestedScrollScope, floatValue));
            if (!isLowScrollingDelta2) {
                animationScope.cancelAnimation();
                return w01Var;
            }
            gi0Var.d += floatValue;
        }
        if (((Boolean) kyVar.invoke(Float.valueOf(gi0Var.d))).booleanValue()) {
            animationScope.cancelAnimation();
        }
        return w01Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object busyReceive(zg zgVar, hm hmVar) {
        return p10.n(new MouseWheelScrollingLogic$busyReceive$2(zgVar, null), hmVar);
    }

    /* renamed from: canConsumeDelta-Uv8p0NA, reason: not valid java name */
    private final boolean m482canConsumeDeltaUv8p0NA(ScrollingLogic scrollingLogic, long j) {
        float m551toSingleAxisDeltaFromAnglek4lQ0M = ComposeFoundationFlags.isMouseWheel1DAxisLockingEnabled ? scrollingLogic.m551toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic.m547reverseIfNeededMKHz9U(j)) : scrollingLogic.m549toFloatk4lQ0M(scrollingLogic.m547reverseIfNeededMKHz9U(j));
        if (m551toSingleAxisDeltaFromAnglek4lQ0M == 0.0f) {
            return false;
        }
        return m551toSingleAxisDeltaFromAnglek4lQ0M > 0.0f ? scrollingLogic.getScrollableState().getCanScrollForward() : scrollingLogic.getScrollableState().getCanScrollBackward();
    }

    private final void consume(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            changes.get(i).consume();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object dispatchMouseWheelScroll(ScrollingLogic scrollingLogic, MouseWheelScrollDelta mouseWheelScrollDelta, float f, float f2, hm hmVar) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
        int i;
        w01 w01Var;
        boolean isLowScrollingDelta;
        gi0 gi0Var;
        float f3;
        ScrollingLogic scrollingLogic2;
        long m490calculateVelocity9UxMQ8M;
        if (hmVar instanceof MouseWheelScrollingLogic$dispatchMouseWheelScroll$1) {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$1 = (MouseWheelScrollingLogic$dispatchMouseWheelScroll$1) hmVar;
            int i2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$1.label = i2 - Integer.MIN_VALUE;
                MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$12 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
                Object obj = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.result;
                i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.label;
                w01 w01Var2 = w01.a;
                Object obj2 = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    ji0 ji0Var = new ji0();
                    ji0Var.d = mouseWheelScrollDelta;
                    trackVelocity(mouseWheelScrollDelta);
                    MouseWheelScrollDelta sumOrNull = sumOrNull(this.channel);
                    if (sumOrNull != null) {
                        trackVelocity(sumOrNull);
                        ji0Var.d = ((MouseWheelScrollDelta) ji0Var.d).plus(sumOrNull);
                    }
                    gi0 gi0Var2 = new gi0();
                    w01Var = w01Var2;
                    float m549toFloatk4lQ0M = scrollingLogic.m549toFloatk4lQ0M(scrollingLogic.m547reverseIfNeededMKHz9U(((MouseWheelScrollDelta) ji0Var.d).m488getValueF1C5BW0()));
                    gi0Var2.d = m549toFloatk4lQ0M;
                    isLowScrollingDelta = MouseWheelScrollableKt.isLowScrollingDelta(m549toFloatk4lQ0M);
                    if (isLowScrollingDelta) {
                        return w01Var;
                    }
                    ji0 ji0Var2 = new ji0();
                    ji0Var2.d = AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
                    my mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(gi0Var2, ji0Var2, ji0Var, f, this, f2, scrollingLogic, null);
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$0 = scrollingLogic;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$1 = gi0Var2;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.F$0 = f2;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.label = 1;
                    if (userScroll(scrollingLogic, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3, mouseWheelScrollingLogic$dispatchMouseWheelScroll$12) != obj2) {
                        gi0Var = gi0Var2;
                        f3 = f2;
                        scrollingLogic2 = scrollingLogic;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        p10.Q(obj);
                        return w01Var2;
                    }
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f3 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.F$0;
                gi0Var = (gi0) mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$1;
                scrollingLogic2 = (ScrollingLogic) mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$0;
                p10.Q(obj);
                w01Var = w01Var2;
                m490calculateVelocity9UxMQ8M = this.velocityTracker.m490calculateVelocity9UxMQ8M();
                if (Velocity.m7848equalsimpl0(m490calculateVelocity9UxMQ8M, Velocity.Companion.m7860getZero9UxMQ8M())) {
                    m490calculateVelocity9UxMQ8M = scrollingLogic2.m552toVelocityadjELrA(scrollingLogic2.reverseIfNeeded(Math.signum(gi0Var.d)) * Math.min(Math.abs(gi0Var.d) / 100.0f, f3) * 1000.0f);
                }
                my myVar = this.onScrollStopped;
                Velocity m7840boximpl = Velocity.m7840boximpl(m490calculateVelocity9UxMQ8M);
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$0 = null;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$1 = null;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.label = 2;
                return myVar.invoke(m7840boximpl, mouseWheelScrollingLogic$dispatchMouseWheelScroll$12) != obj2 ? obj2 : w01Var;
            }
        }
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$1 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$1(this, hmVar);
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$122 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
        Object obj3 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.result;
        i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.label;
        w01 w01Var22 = w01.a;
        Object obj22 = vn.d;
        if (i != 0) {
        }
        m490calculateVelocity9UxMQ8M = this.velocityTracker.m490calculateVelocity9UxMQ8M();
        if (Velocity.m7848equalsimpl0(m490calculateVelocity9UxMQ8M, Velocity.Companion.m7860getZero9UxMQ8M())) {
        }
        my myVar2 = this.onScrollStopped;
        Velocity m7840boximpl2 = Velocity.m7840boximpl(m490calculateVelocity9UxMQ8M);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.L$0 = null;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.L$1 = null;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.label = 2;
        if (myVar2.invoke(m7840boximpl2, mouseWheelScrollingLogic$dispatchMouseWheelScroll$122) != obj22) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object dispatchMouseWheelScroll$waitNextScrollDelta(MouseWheelScrollingLogic mouseWheelScrollingLogic, ji0 ji0Var, gi0 gi0Var, ScrollingLogic scrollingLogic, ji0 ji0Var2, long j, hm hmVar) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;
        int i;
        ji0 ji0Var3;
        ScrollingLogic scrollingLogic2;
        ji0 ji0Var4;
        gi0 gi0Var2;
        MouseWheelScrollDelta mouseWheelScrollDelta;
        boolean z;
        boolean isLowScrollingDelta;
        MouseWheelScrollingLogic mouseWheelScrollingLogic2 = mouseWheelScrollingLogic;
        if (hmVar instanceof MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 = (MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) hmVar;
            int i2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.result;
                i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    if (j < 0) {
                        return Boolean.FALSE;
                    }
                    MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2(mouseWheelScrollingLogic2, null);
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$0 = mouseWheelScrollingLogic2;
                    ji0Var3 = ji0Var;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$1 = ji0Var3;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$2 = gi0Var;
                    scrollingLogic2 = scrollingLogic;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$3 = scrollingLogic2;
                    ji0Var4 = ji0Var2;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$4 = ji0Var4;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label = 1;
                    obj = d41.R(j, mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2, mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
                        return vnVar;
                    }
                    gi0Var2 = gi0Var;
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ji0 ji0Var5 = (ji0) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$4;
                    ScrollingLogic scrollingLogic3 = (ScrollingLogic) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$3;
                    gi0Var2 = (gi0) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$2;
                    ji0Var3 = (ji0) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$1;
                    MouseWheelScrollingLogic mouseWheelScrollingLogic3 = (MouseWheelScrollingLogic) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$0;
                    p10.Q(obj);
                    ji0Var4 = ji0Var5;
                    scrollingLogic2 = scrollingLogic3;
                    mouseWheelScrollingLogic2 = mouseWheelScrollingLogic3;
                }
                mouseWheelScrollDelta = (MouseWheelScrollDelta) obj;
                if (mouseWheelScrollDelta == null) {
                    MouseWheelScrollDelta m485copy9KIMszo$default = MouseWheelScrollDelta.m485copy9KIMszo$default(mouseWheelScrollDelta, 0L, 0L, ((MouseWheelScrollDelta) ji0Var3.d).getShouldApplyImmediately(), 3, null);
                    ji0Var3.d = m485copy9KIMszo$default;
                    gi0Var2.d = ComposeFoundationFlags.isMouseWheel1DAxisLockingEnabled ? scrollingLogic2.m551toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic2.m547reverseIfNeededMKHz9U(m485copy9KIMszo$default.m488getValueF1C5BW0())) : scrollingLogic2.m549toFloatk4lQ0M(scrollingLogic2.m547reverseIfNeededMKHz9U(m485copy9KIMszo$default.m488getValueF1C5BW0()));
                    ji0Var4.d = AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
                    mouseWheelScrollingLogic2.trackVelocity(mouseWheelScrollDelta);
                    isLowScrollingDelta = MouseWheelScrollableKt.isLowScrollingDelta(gi0Var2.d);
                    z = !isLowScrollingDelta;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1(hmVar);
        Object obj2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.result;
        i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label;
        if (i != 0) {
        }
        mouseWheelScrollDelta = (MouseWheelScrollDelta) obj2;
        if (mouseWheelScrollDelta == null) {
        }
        return Boolean.valueOf(z);
    }

    private final boolean isConsumed(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (changes.get(i).isConsumed()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: onMouseWheel-O0kMr_c, reason: not valid java name */
    private final boolean m483onMouseWheelO0kMr_c(PointerEvent pointerEvent, long j) {
        if (m482canConsumeDeltaUv8p0NA(this.scrollingLogic, this.mouseWheelScrollConfig.mo387calculateMouseWheelScroll8xgXZGE(this.density, pointerEvent, j))) {
            return !(this.channel.m(new MouseWheelScrollDelta(r3, ((PointerInputChange) yi.p0(pointerEvent.getChanges())).getUptimeMillis(), !this.mouseWheelScrollConfig.isSmoothScrollingEnabled() || this.mouseWheelScrollConfig.isPreciseWheelScroll(pointerEvent), null)) instanceof jh);
        }
        return this.isScrolling;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MouseWheelScrollDelta sumOrNull(zg zgVar) {
        MouseWheelScrollDelta mouseWheelScrollDelta = null;
        for (MouseWheelScrollDelta mouseWheelScrollDelta2 : untilNull(new i2(zgVar, 24))) {
            mouseWheelScrollDelta = mouseWheelScrollDelta == null ? mouseWheelScrollDelta2 : mouseWheelScrollDelta.plus(mouseWheelScrollDelta2);
        }
        return mouseWheelScrollDelta;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MouseWheelScrollDelta sumOrNull$lambda$0(zg zgVar) {
        Object g = zgVar.g();
        if (g instanceof jh) {
            g = null;
        }
        return (MouseWheelScrollDelta) g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackVelocity(MouseWheelScrollDelta mouseWheelScrollDelta) {
        this.velocityTracker.m489addDeltaUv8p0NA(mouseWheelScrollDelta.getTimeMillis(), mouseWheelScrollDelta.m488getValueF1C5BW0());
    }

    private final <E> ao0 untilNull(iy iyVar) {
        return new cc(new MouseWheelScrollingLogic$untilNull$1(iyVar, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object userScroll(ScrollingLogic scrollingLogic, my myVar, hm hmVar) {
        MouseWheelScrollingLogic$userScroll$1 mouseWheelScrollingLogic$userScroll$1;
        int i;
        if (hmVar instanceof MouseWheelScrollingLogic$userScroll$1) {
            mouseWheelScrollingLogic$userScroll$1 = (MouseWheelScrollingLogic$userScroll$1) hmVar;
            int i2 = mouseWheelScrollingLogic$userScroll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mouseWheelScrollingLogic$userScroll$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mouseWheelScrollingLogic$userScroll$1.result;
                i = mouseWheelScrollingLogic$userScroll$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    this.isScrolling = true;
                    MouseWheelScrollingLogic$userScroll$2 mouseWheelScrollingLogic$userScroll$2 = new MouseWheelScrollingLogic$userScroll$2(scrollingLogic, myVar, null);
                    mouseWheelScrollingLogic$userScroll$1.label = 1;
                    ps0 ps0Var = new ps0(mouseWheelScrollingLogic$userScroll$1, mouseWheelScrollingLogic$userScroll$1.getContext());
                    Object S = y80.S(ps0Var, ps0Var, mouseWheelScrollingLogic$userScroll$2);
                    vn vnVar = vn.d;
                    if (S == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                this.isScrolling = false;
                return w01.a;
            }
        }
        mouseWheelScrollingLogic$userScroll$1 = new MouseWheelScrollingLogic$userScroll$1(this, hmVar);
        Object obj2 = mouseWheelScrollingLogic$userScroll$1.result;
        i = mouseWheelScrollingLogic$userScroll$1.label;
        if (i != 0) {
        }
        this.isScrolling = false;
        return w01.a;
    }

    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public final void m484onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        int i = 0;
        if (!ComposeFoundationFlags.isMouseWheel1DAxisLockingEnabled) {
            if (pointerEventPass == PointerEventPass.Main && PointerEventType.m6041equalsimpl0(pointerEvent.m6034getType7fucELk(), PointerEventType.Companion.m6056getScroll7fucELk())) {
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                while (i < size) {
                    if (changes.get(i).isConsumed()) {
                        return;
                    } else {
                        i++;
                    }
                }
                if (m483onMouseWheelO0kMr_c(pointerEvent, j)) {
                    consume(pointerEvent);
                    return;
                }
                return;
            }
            return;
        }
        if (PointerEventType.m6041equalsimpl0(pointerEvent.m6034getType7fucELk(), PointerEventType.Companion.m6056getScroll7fucELk())) {
            List<PointerInputChange> changes2 = pointerEvent.getChanges();
            int size2 = changes2.size();
            while (i < size2) {
                if (changes2.get(i).isConsumed()) {
                    return;
                } else {
                    i++;
                }
            }
            if (pointerEventPass == PointerEventPass.Initial && this.isScrolling) {
                m483onMouseWheelO0kMr_c(pointerEvent, j);
                consume(pointerEvent);
            }
            if (pointerEventPass == PointerEventPass.Main && !this.isScrolling && m483onMouseWheelO0kMr_c(pointerEvent, j)) {
                consume(pointerEvent);
            }
        }
    }

    public final void startReceivingMouseWheelEvents(un unVar) {
        if (this.receivingMouseWheelEventsJob == null) {
            this.receivingMouseWheelEventsJob = p01.t(unVar, null, null, new MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(this, null), 3);
        }
    }

    public final void updateDensity(Density density) {
        this.density = density;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class MouseWheelScrollDelta {
        private final boolean shouldApplyImmediately;
        private final long timeMillis;
        private final long value;

        private MouseWheelScrollDelta(long j, long j2, boolean z) {
            this.value = j;
            this.timeMillis = j2;
            this.shouldApplyImmediately = z;
        }

        /* renamed from: copy-9KIMszo$default, reason: not valid java name */
        public static /* synthetic */ MouseWheelScrollDelta m485copy9KIMszo$default(MouseWheelScrollDelta mouseWheelScrollDelta, long j, long j2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                j = mouseWheelScrollDelta.value;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = mouseWheelScrollDelta.timeMillis;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                z = mouseWheelScrollDelta.shouldApplyImmediately;
            }
            return mouseWheelScrollDelta.m487copy9KIMszo(j3, j4, z);
        }

        /* renamed from: component1-F1C5BW0, reason: not valid java name */
        public final long m486component1F1C5BW0() {
            return this.value;
        }

        public final long component2() {
            return this.timeMillis;
        }

        public final boolean component3() {
            return this.shouldApplyImmediately;
        }

        /* renamed from: copy-9KIMszo, reason: not valid java name */
        public final MouseWheelScrollDelta m487copy9KIMszo(long j, long j2, boolean z) {
            return new MouseWheelScrollDelta(j, j2, z, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MouseWheelScrollDelta)) {
                return false;
            }
            MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) obj;
            return Offset.m4513equalsimpl0(this.value, mouseWheelScrollDelta.value) && this.timeMillis == mouseWheelScrollDelta.timeMillis && this.shouldApplyImmediately == mouseWheelScrollDelta.shouldApplyImmediately;
        }

        public final boolean getShouldApplyImmediately() {
            return this.shouldApplyImmediately;
        }

        public final long getTimeMillis() {
            return this.timeMillis;
        }

        /* renamed from: getValue-F1C5BW0, reason: not valid java name */
        public final long m488getValueF1C5BW0() {
            return this.value;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldApplyImmediately) + ((Long.hashCode(this.timeMillis) + (Offset.m4518hashCodeimpl(this.value) * 31)) * 31);
        }

        public final MouseWheelScrollDelta plus(MouseWheelScrollDelta mouseWheelScrollDelta) {
            return new MouseWheelScrollDelta(Offset.m4521plusMKHz9U(this.value, mouseWheelScrollDelta.value), Math.max(this.timeMillis, mouseWheelScrollDelta.timeMillis), this.shouldApplyImmediately, null);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
            sb.append((Object) Offset.m4524toStringimpl(this.value));
            sb.append(", timeMillis=");
            sb.append(this.timeMillis);
            sb.append(", shouldApplyImmediately=");
            return uf.e(sb, this.shouldApplyImmediately, ')');
        }

        public /* synthetic */ MouseWheelScrollDelta(long j, long j2, boolean z, dq dqVar) {
            this(j, j2, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float dispatchMouseWheelScroll(NestedScrollScope nestedScrollScope, float f) {
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        return scrollingLogic.m549toFloatk4lQ0M(scrollingLogic.m547reverseIfNeededMKHz9U(nestedScrollScope.mo491scrollByOzD1aCk(scrollingLogic.m550toOffsettuRUvjQ(scrollingLogic.reverseIfNeeded(f)), NestedScrollSource.Companion.m5969getUserInputWNlRxjI())));
    }
}
