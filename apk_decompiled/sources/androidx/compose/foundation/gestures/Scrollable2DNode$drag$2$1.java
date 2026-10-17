package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.Scrollable2DNode$drag$2$1", f = "Scrollable2D.kt", l = {191}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class Scrollable2DNode$drag$2$1 extends us0 implements my {
    final /* synthetic */ my $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Scrollable2DNode$drag$2$1(my myVar, hm hmVar) {
        super(2, hmVar);
        this.$forEachDelta = myVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(NestedScrollScope nestedScrollScope, DragEvent.DragDelta dragDelta) {
        nestedScrollScope.mo492scrollByWithOverscrollOzD1aCk(dragDelta.m415getDeltaF1C5BW0(), NestedScrollSource.Companion.m5969getUserInputWNlRxjI());
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        Scrollable2DNode$drag$2$1 scrollable2DNode$drag$2$1 = new Scrollable2DNode$drag$2$1(this.$forEachDelta, hmVar);
        scrollable2DNode$drag$2$1.L$0 = obj;
        return scrollable2DNode$drag$2$1;
    }

    @Override // defpackage.my
    public final Object invoke(NestedScrollScope nestedScrollScope, hm hmVar) {
        return ((Scrollable2DNode$drag$2$1) create(nestedScrollScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            my myVar = this.$forEachDelta;
            p pVar = new p(nestedScrollScope, 0);
            this.label = 1;
            Object invoke = myVar.invoke(pVar, this);
            vn vnVar = vn.d;
            if (invoke == vnVar) {
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
