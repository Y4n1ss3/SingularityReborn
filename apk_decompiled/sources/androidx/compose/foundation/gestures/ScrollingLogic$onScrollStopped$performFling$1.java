package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", l = {833, 836, 839}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ScrollingLogic$onScrollStopped$performFling$1 extends us0 implements my {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onScrollStopped$performFling$1(ScrollingLogic scrollingLogic, hm hmVar) {
        super(2, hmVar);
        this.this$0 = scrollingLogic;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.this$0, hmVar);
        scrollingLogic$onScrollStopped$performFling$1.J$0 = ((Velocity) obj).m7858unboximpl();
        return scrollingLogic$onScrollStopped$performFling$1;
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m553invokesFctU(((Velocity) obj).m7858unboximpl(), (hm) obj2);
    }

    /* renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m553invokesFctU(long j, hm hmVar) {
        return ((ScrollingLogic$onScrollStopped$performFling$1) create(Velocity.m7840boximpl(j), hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (r14 == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        NestedScrollDispatcher nestedScrollDispatcher;
        long j2;
        NestedScrollDispatcher nestedScrollDispatcher2;
        long j3;
        long j4;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            j = this.J$0;
            nestedScrollDispatcher = this.this$0.nestedScrollDispatcher;
            this.J$0 = j;
            this.label = 1;
            obj = nestedScrollDispatcher.m5952dispatchPreFlingQWom1Mo(j, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j4 = this.J$1;
                    j3 = this.J$0;
                    p10.Q(obj);
                    return Velocity.m7840boximpl(Velocity.m7852minusAH228Gc(j3, Velocity.m7852minusAH228Gc(j4, ((Velocity) obj).m7858unboximpl())));
                }
                j2 = this.J$1;
                j = this.J$0;
                p10.Q(obj);
                long m7858unboximpl = ((Velocity) obj).m7858unboximpl();
                nestedScrollDispatcher2 = this.this$0.nestedScrollDispatcher;
                long m7852minusAH228Gc = Velocity.m7852minusAH228Gc(j2, m7858unboximpl);
                this.J$0 = j;
                this.J$1 = m7858unboximpl;
                this.label = 3;
                obj = nestedScrollDispatcher2.m5950dispatchPostFlingRZ2iAVY(m7852minusAH228Gc, m7858unboximpl, this);
                if (obj != vnVar) {
                    j3 = j;
                    j4 = m7858unboximpl;
                    return Velocity.m7840boximpl(Velocity.m7852minusAH228Gc(j3, Velocity.m7852minusAH228Gc(j4, ((Velocity) obj).m7858unboximpl())));
                }
                return vnVar;
            }
            j = this.J$0;
            p10.Q(obj);
        }
        long m7852minusAH228Gc2 = Velocity.m7852minusAH228Gc(j, ((Velocity) obj).m7858unboximpl());
        ScrollingLogic scrollingLogic = this.this$0;
        this.J$0 = j;
        this.J$1 = m7852minusAH228Gc2;
        this.label = 2;
        obj = scrollingLogic.mo522doFlingAnimationQWom1Mo(m7852minusAH228Gc2, this);
        if (obj != vnVar) {
            j2 = m7852minusAH228Gc2;
            long m7858unboximpl2 = ((Velocity) obj).m7858unboximpl();
            nestedScrollDispatcher2 = this.this$0.nestedScrollDispatcher;
            long m7852minusAH228Gc3 = Velocity.m7852minusAH228Gc(j2, m7858unboximpl2);
            this.J$0 = j;
            this.J$1 = m7858unboximpl2;
            this.label = 3;
            obj = nestedScrollDispatcher2.m5950dispatchPostFlingRZ2iAVY(m7852minusAH228Gc3, m7858unboximpl2, this);
            if (obj != vnVar) {
            }
        }
        return vnVar;
    }
}
