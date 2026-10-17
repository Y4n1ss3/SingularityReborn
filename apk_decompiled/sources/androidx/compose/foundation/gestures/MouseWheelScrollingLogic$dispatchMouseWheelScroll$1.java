package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {288, 346}, m = "dispatchMouseWheelScroll", v = 1)
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 extends im {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MouseWheelScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$1(MouseWheelScrollingLogic mouseWheelScrollingLogic, hm hmVar) {
        super(hmVar);
        this.this$0 = mouseWheelScrollingLogic;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object dispatchMouseWheelScroll;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        dispatchMouseWheelScroll = this.this$0.dispatchMouseWheelScroll(null, null, 0.0f, 0.0f, this);
        return dispatchMouseWheelScroll;
    }
}
