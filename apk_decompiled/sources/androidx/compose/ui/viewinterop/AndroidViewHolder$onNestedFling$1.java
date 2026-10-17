package androidx.compose.ui.viewinterop;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {634, 636}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class AndroidViewHolder$onNestedFling$1 extends us0 implements my {
    final /* synthetic */ boolean $consumed;
    final /* synthetic */ long $viewVelocity;
    int label;
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onNestedFling$1(boolean z, AndroidViewHolder androidViewHolder, long j, hm hmVar) {
        super(2, hmVar);
        this.$consumed = z;
        this.this$0 = androidViewHolder;
        this.$viewVelocity = j;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new AndroidViewHolder$onNestedFling$1(this.$consumed, this.this$0, this.$viewVelocity, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((AndroidViewHolder$onNestedFling$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r11 == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r11 == r3) goto L18;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NestedScrollDispatcher nestedScrollDispatcher;
        NestedScrollDispatcher nestedScrollDispatcher2;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            boolean z = this.$consumed;
            AndroidViewHolder androidViewHolder = this.this$0;
            vn vnVar = vn.d;
            if (z) {
                nestedScrollDispatcher = androidViewHolder.dispatcher;
                long j = this.$viewVelocity;
                long m7860getZero9UxMQ8M = Velocity.Companion.m7860getZero9UxMQ8M();
                this.label = 2;
                obj = nestedScrollDispatcher.m5950dispatchPostFlingRZ2iAVY(j, m7860getZero9UxMQ8M, this);
            } else {
                nestedScrollDispatcher2 = androidViewHolder.dispatcher;
                long m7860getZero9UxMQ8M2 = Velocity.Companion.m7860getZero9UxMQ8M();
                long j2 = this.$viewVelocity;
                this.label = 1;
                obj = nestedScrollDispatcher2.m5950dispatchPostFlingRZ2iAVY(m7860getZero9UxMQ8M2, j2, this);
            }
            return vnVar;
        }
        if (i == 1) {
            p10.Q(obj);
            ((Velocity) obj).m7858unboximpl();
        } else {
            if (i != 2) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
            ((Velocity) obj).m7858unboximpl();
        }
        return w01.a;
    }
}
