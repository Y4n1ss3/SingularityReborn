package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", f = "Scrollable.kt", l = {575}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ScrollableNode$setScrollSemanticsActions$1$1 extends us0 implements my {
    final /* synthetic */ float $x;
    final /* synthetic */ float $y;
    int label;
    final /* synthetic */ ScrollableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$setScrollSemanticsActions$1$1(ScrollableNode scrollableNode, float f, float f2, hm hmVar) {
        super(2, hmVar);
        this.this$0 = scrollableNode;
        this.$x = f;
        this.$y = f2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ScrollableNode$setScrollSemanticsActions$1$1(this.this$0, this.$x, this.$y, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((ScrollableNode$setScrollSemanticsActions$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        Object m532semanticsScrollByd4ec7I;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            scrollingLogic = this.this$0.scrollingLogic;
            float f = this.$x;
            float f2 = this.$y;
            long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
            this.label = 1;
            m532semanticsScrollByd4ec7I = ScrollableKt.m532semanticsScrollByd4ec7I(scrollingLogic, m4508constructorimpl, this);
            vn vnVar = vn.d;
            if (m532semanticsScrollByd4ec7I == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
