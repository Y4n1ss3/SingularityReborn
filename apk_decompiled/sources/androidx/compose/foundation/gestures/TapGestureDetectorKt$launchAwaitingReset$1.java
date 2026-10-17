package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", f = "TapGestureDetector.kt", l = {498, 500}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$launchAwaitingReset$1 extends us0 implements my {
    final /* synthetic */ my $block;
    final /* synthetic */ z10 $resetJob;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$launchAwaitingReset$1(z10 z10Var, my myVar, hm hmVar) {
        super(2, hmVar);
        this.$resetJob = z10Var;
        this.$block = myVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        TapGestureDetectorKt$launchAwaitingReset$1 tapGestureDetectorKt$launchAwaitingReset$1 = new TapGestureDetectorKt$launchAwaitingReset$1(this.$resetJob, this.$block, hmVar);
        tapGestureDetectorKt$launchAwaitingReset$1.L$0 = obj;
        return tapGestureDetectorKt$launchAwaitingReset$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TapGestureDetectorKt$launchAwaitingReset$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r6.invoke(r0, r5) == r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r6.n(r5) == r4) goto L17;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        un unVar;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            unVar = (un) this.L$0;
            if (ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled) {
                z10 z10Var = this.$resetJob;
                this.L$0 = unVar;
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    p10.Q(obj);
                    return w01.a;
                }
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            unVar = (un) this.L$0;
            p10.Q(obj);
        }
        my myVar = this.$block;
        this.L$0 = null;
        this.label = 2;
    }
}
