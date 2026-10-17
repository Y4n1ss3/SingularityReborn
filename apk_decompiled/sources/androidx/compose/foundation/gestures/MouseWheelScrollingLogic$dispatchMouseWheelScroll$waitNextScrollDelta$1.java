package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {266}, m = "dispatchMouseWheelScroll$waitNextScrollDelta", v = 1)
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 extends im {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1(hm hmVar) {
        super(hmVar);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object dispatchMouseWheelScroll$waitNextScrollDelta;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        dispatchMouseWheelScroll$waitNextScrollDelta = MouseWheelScrollingLogic.dispatchMouseWheelScroll$waitNextScrollDelta(null, null, null, null, null, 0L, this);
        return dispatchMouseWheelScroll$waitNextScrollDelta;
    }
}
