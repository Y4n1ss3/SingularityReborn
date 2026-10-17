package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", l = {371}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ScrollableNode$drag$2$1 extends us0 implements my {
    final /* synthetic */ my $forEachDelta;
    final /* synthetic */ ScrollingLogic $this_with;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$drag$2$1(my myVar, ScrollingLogic scrollingLogic, hm hmVar) {
        super(2, hmVar);
        this.$forEachDelta = myVar;
        this.$this_with = scrollingLogic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(NestedScrollScope nestedScrollScope, ScrollingLogic scrollingLogic, DragEvent.DragDelta dragDelta) {
        nestedScrollScope.mo492scrollByWithOverscrollOzD1aCk(Offset.m4523timestuRUvjQ(scrollingLogic.m548singleAxisOffsetMKHz9U(dragDelta.m415getDeltaF1C5BW0()), dragDelta.isIndirectPointerEvent() ? -1.0f : 1.0f), NestedScrollSource.Companion.m5969getUserInputWNlRxjI());
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        ScrollableNode$drag$2$1 scrollableNode$drag$2$1 = new ScrollableNode$drag$2$1(this.$forEachDelta, this.$this_with, hmVar);
        scrollableNode$drag$2$1.L$0 = obj;
        return scrollableNode$drag$2$1;
    }

    @Override // defpackage.my
    public final Object invoke(NestedScrollScope nestedScrollScope, hm hmVar) {
        return ((ScrollableNode$drag$2$1) create(nestedScrollScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            my myVar = this.$forEachDelta;
            m mVar = new m(2, nestedScrollScope, this.$this_with);
            this.label = 1;
            Object invoke = myVar.invoke(mVar, this);
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
