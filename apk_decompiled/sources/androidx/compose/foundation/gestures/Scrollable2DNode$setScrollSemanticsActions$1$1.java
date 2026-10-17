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
@bq(c = "androidx.compose.foundation.gestures.Scrollable2DNode$setScrollSemanticsActions$1$1", f = "Scrollable2D.kt", l = {285}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class Scrollable2DNode$setScrollSemanticsActions$1$1 extends us0 implements my {
    final /* synthetic */ float $x;
    final /* synthetic */ float $y;
    int label;
    final /* synthetic */ Scrollable2DNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Scrollable2DNode$setScrollSemanticsActions$1$1(Scrollable2DNode scrollable2DNode, float f, float f2, hm hmVar) {
        super(2, hmVar);
        this.this$0 = scrollable2DNode;
        this.$x = f;
        this.$y = f2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new Scrollable2DNode$setScrollSemanticsActions$1$1(this.this$0, this.$x, this.$y, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((Scrollable2DNode$setScrollSemanticsActions$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic2D scrollingLogic2D;
        Object m529semanticsScrollByd4ec7I;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            scrollingLogic2D = this.this$0.scrollingLogic;
            float f = this.$x;
            float f2 = this.$y;
            long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
            this.label = 1;
            m529semanticsScrollByd4ec7I = Scrollable2DKt.m529semanticsScrollByd4ec7I(scrollingLogic2D, m4508constructorimpl, this);
            vn vnVar = vn.d;
            if (m529semanticsScrollByd4ec7I == vnVar) {
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
