package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import defpackage.g2;
import defpackage.hm;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ScrollableNode$ensureMouseWheelScrollNodeInitialized$1 extends g2 implements my {
    public ScrollableNode$ensureMouseWheelScrollNodeInitialized$1(Object obj) {
        super(2, obj, ScrollableNode.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m536invokesFctU(((Velocity) obj).m7858unboximpl(), (hm) obj2);
    }

    /* renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m536invokesFctU(long j, hm hmVar) {
        Object ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped;
        ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped = ScrollableNode.ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped((ScrollableNode) this.receiver, j, hmVar);
        return ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped;
    }
}
