package androidx.compose.foundation;

import android.view.Surface;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.py;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1", f = "AndroidExternalSurface.android.kt", l = {130, 136}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 extends us0 implements my {
    final /* synthetic */ int $height;
    final /* synthetic */ Surface $surface;
    final /* synthetic */ int $width;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseAndroidExternalSurfaceState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState, Surface surface, int i, int i2, hm hmVar) {
        super(2, hmVar);
        this.this$0 = baseAndroidExternalSurfaceState;
        this.$surface = surface;
        this.$width = i;
        this.$height = i2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 = new BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(this.this$0, this.$surface, this.$width, this.$height, hmVar);
        baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1.L$0 = obj;
        return baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (r5.invoke(r6, r7, r8, r9, r11) == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (defpackage.cq.d(r12, r11) == r4) goto L19;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        un unVar;
        z10 z10Var;
        py pyVar;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            unVar = (un) this.L$0;
            z10Var = this.this$0.job;
            if (z10Var != null) {
                this.L$0 = unVar;
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    p10.Q(obj);
                    return w01.a;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            unVar = (un) this.L$0;
            p10.Q(obj);
        }
        BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 = new BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1(this.this$0, unVar);
        pyVar = this.this$0.onSurface;
        if (pyVar != null) {
            Surface surface = this.$surface;
            Integer num = new Integer(this.$width);
            Integer num2 = new Integer(this.$height);
            this.L$0 = null;
            this.label = 2;
        }
        return w01.a;
    }
}
