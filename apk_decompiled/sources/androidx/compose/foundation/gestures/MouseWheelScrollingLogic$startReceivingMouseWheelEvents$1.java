package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.ui.unit.Density;
import defpackage.bq;
import defpackage.cq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.zg;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1", f = "MouseWheelScrollable.kt", l = {135, 138}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 extends us0 implements my {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MouseWheelScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(MouseWheelScrollingLogic mouseWheelScrollingLogic, hm hmVar) {
        super(2, hmVar);
        this.this$0 = mouseWheelScrollingLogic;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 = new MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(this.this$0, hmVar);
        mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1.L$0 = obj;
        return mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r12 != r4) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #1 {all -> 0x0086, blocks: (B:5:0x0032, B:8:0x003e, B:14:0x0050), top: B:4:0x0032 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0081 -> B:4:0x0032). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1;
        un unVar;
        Throwable th2;
        un unVar2;
        Density density;
        float f;
        Density density2;
        float f2;
        ScrollingLogic scrollingLogic;
        Object dispatchMouseWheelScroll;
        boolean x;
        zg zgVar;
        int i = this.label;
        vn vnVar = vn.d;
        if (i != 0) {
            try {
                if (i == 1) {
                    unVar = (un) this.L$0;
                    p10.Q(obj);
                    MouseWheelScrollingLogic.MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollingLogic.MouseWheelScrollDelta) obj;
                    density = this.this$0.density;
                    f = MouseWheelScrollableKt.AnimationThreshold;
                    float mo367toPx0680j_4 = density.mo367toPx0680j_4(f);
                    density2 = this.this$0.density;
                    f2 = MouseWheelScrollableKt.AnimationSpeed;
                    float mo367toPx0680j_42 = density2.mo367toPx0680j_4(f2);
                    MouseWheelScrollingLogic mouseWheelScrollingLogic = this.this$0;
                    scrollingLogic = mouseWheelScrollingLogic.scrollingLogic;
                    this.L$0 = unVar;
                    this.label = 2;
                    mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 = this;
                    dispatchMouseWheelScroll = mouseWheelScrollingLogic.dispatchMouseWheelScroll(scrollingLogic, mouseWheelScrollDelta, mo367toPx0680j_4, mo367toPx0680j_42, mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1);
                } else {
                    if (i != 2) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    unVar = (un) this.L$0;
                    p10.Q(obj);
                    mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 = this;
                    try {
                        unVar2 = unVar;
                        x = cq.x(unVar2.getCoroutineContext());
                        MouseWheelScrollingLogic mouseWheelScrollingLogic2 = this.this$0;
                        if (x) {
                            mouseWheelScrollingLogic2.receivingMouseWheelEventsJob = null;
                            return w01.a;
                        }
                        zgVar = mouseWheelScrollingLogic2.channel;
                        this.L$0 = unVar2;
                        this.label = 1;
                        Object i2 = zgVar.i(this);
                        if (i2 == vnVar) {
                            return vnVar;
                        }
                        try {
                            unVar = unVar2;
                            obj = i2;
                            MouseWheelScrollingLogic.MouseWheelScrollDelta mouseWheelScrollDelta2 = (MouseWheelScrollingLogic.MouseWheelScrollDelta) obj;
                            density = this.this$0.density;
                            f = MouseWheelScrollableKt.AnimationThreshold;
                            float mo367toPx0680j_43 = density.mo367toPx0680j_4(f);
                            density2 = this.this$0.density;
                            f2 = MouseWheelScrollableKt.AnimationSpeed;
                            float mo367toPx0680j_422 = density2.mo367toPx0680j_4(f2);
                            MouseWheelScrollingLogic mouseWheelScrollingLogic3 = this.this$0;
                            scrollingLogic = mouseWheelScrollingLogic3.scrollingLogic;
                            this.L$0 = unVar;
                            this.label = 2;
                            dispatchMouseWheelScroll = mouseWheelScrollingLogic3.dispatchMouseWheelScroll(scrollingLogic, mouseWheelScrollDelta2, mo367toPx0680j_43, mo367toPx0680j_422, mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1);
                        } catch (Throwable th3) {
                            th2 = th3;
                            th = th2;
                            mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1.this$0.receivingMouseWheelEventsJob = null;
                            throw th;
                        }
                        mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 = this;
                    } catch (Throwable th4) {
                        th2 = th4;
                        mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 = this;
                        th = th2;
                        mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1.this$0.receivingMouseWheelEventsJob = null;
                        throw th;
                    }
                    this = mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1;
                }
            } catch (Throwable th5) {
                th = th5;
                mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 = this;
                mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1.this$0.receivingMouseWheelEventsJob = null;
                throw th;
            }
        } else {
            p10.Q(obj);
            unVar2 = (un) this.L$0;
            x = cq.x(unVar2.getCoroutineContext());
            MouseWheelScrollingLogic mouseWheelScrollingLogic22 = this.this$0;
            if (x) {
            }
        }
    }
}
