package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import defpackage.hm;
import defpackage.p10;
import defpackage.vn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScrollableNestedScrollConnection implements NestedScrollConnection {
    public static final int $stable = 8;
    private boolean enabled;
    private final ScrollLogic scrollingLogic;

    public ScrollableNestedScrollConnection(ScrollLogic scrollLogic, boolean z) {
        this.scrollingLogic = scrollLogic;
        this.enabled = z;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final ScrollLogic getScrollingLogic() {
        return this.scrollingLogic;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo533onPostFlingRZ2iAVY(long j, long j2, hm hmVar) {
        ScrollableNestedScrollConnection$onPostFling$1 scrollableNestedScrollConnection$onPostFling$1;
        int i;
        long m7860getZero9UxMQ8M;
        long m7860getZero9UxMQ8M2;
        if (hmVar instanceof ScrollableNestedScrollConnection$onPostFling$1) {
            scrollableNestedScrollConnection$onPostFling$1 = (ScrollableNestedScrollConnection$onPostFling$1) hmVar;
            int i2 = scrollableNestedScrollConnection$onPostFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollableNestedScrollConnection$onPostFling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scrollableNestedScrollConnection$onPostFling$1.result;
                i = scrollableNestedScrollConnection$onPostFling$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    if (!this.enabled) {
                        m7860getZero9UxMQ8M = Velocity.Companion.m7860getZero9UxMQ8M();
                        return Velocity.m7840boximpl(m7860getZero9UxMQ8M);
                    }
                    if (this.scrollingLogic.isFlinging()) {
                        m7860getZero9UxMQ8M2 = Velocity.Companion.m7860getZero9UxMQ8M();
                        m7860getZero9UxMQ8M = Velocity.m7852minusAH228Gc(j2, m7860getZero9UxMQ8M2);
                        return Velocity.m7840boximpl(m7860getZero9UxMQ8M);
                    }
                    ScrollLogic scrollLogic = this.scrollingLogic;
                    scrollableNestedScrollConnection$onPostFling$1.J$0 = j2;
                    scrollableNestedScrollConnection$onPostFling$1.label = 1;
                    obj = scrollLogic.mo522doFlingAnimationQWom1Mo(j2, scrollableNestedScrollConnection$onPostFling$1);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = scrollableNestedScrollConnection$onPostFling$1.J$0;
                    p10.Q(obj);
                }
                m7860getZero9UxMQ8M2 = ((Velocity) obj).m7858unboximpl();
                m7860getZero9UxMQ8M = Velocity.m7852minusAH228Gc(j2, m7860getZero9UxMQ8M2);
                return Velocity.m7840boximpl(m7860getZero9UxMQ8M);
            }
        }
        scrollableNestedScrollConnection$onPostFling$1 = new ScrollableNestedScrollConnection$onPostFling$1(this, hmVar);
        Object obj2 = scrollableNestedScrollConnection$onPostFling$1.result;
        i = scrollableNestedScrollConnection$onPostFling$1.label;
        if (i != 0) {
        }
        m7860getZero9UxMQ8M2 = ((Velocity) obj2).m7858unboximpl();
        m7860getZero9UxMQ8M = Velocity.m7852minusAH228Gc(j2, m7860getZero9UxMQ8M2);
        return Velocity.m7840boximpl(m7860getZero9UxMQ8M);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public long mo534onPostScrollDzOQY0M(long j, long j2, int i) {
        return this.enabled ? this.scrollingLogic.mo523performRawScrollMKHz9U(j2) : Offset.Companion.m4532getZeroF1C5BW0();
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }
}
