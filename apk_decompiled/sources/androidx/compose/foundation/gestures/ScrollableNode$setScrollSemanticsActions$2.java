package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", l = {579}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ScrollableNode$setScrollSemanticsActions$2 extends us0 implements my {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ ScrollableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$setScrollSemanticsActions$2(ScrollableNode scrollableNode, hm hmVar) {
        super(2, hmVar);
        this.this$0 = scrollableNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        ScrollableNode$setScrollSemanticsActions$2 scrollableNode$setScrollSemanticsActions$2 = new ScrollableNode$setScrollSemanticsActions$2(this.this$0, hmVar);
        scrollableNode$setScrollSemanticsActions$2.J$0 = ((Offset) obj).m4526unboximpl();
        return scrollableNode$setScrollSemanticsActions$2;
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m537invoke3MmeM6k(((Offset) obj).m4526unboximpl(), (hm) obj2);
    }

    /* renamed from: invoke-3MmeM6k, reason: not valid java name */
    public final Object m537invoke3MmeM6k(long j, hm hmVar) {
        return ((ScrollableNode$setScrollSemanticsActions$2) create(Offset.m4505boximpl(j), hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        Object m532semanticsScrollByd4ec7I;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                p10.Q(obj);
                return obj;
            }
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        long j = this.J$0;
        scrollingLogic = this.this$0.scrollingLogic;
        this.label = 1;
        m532semanticsScrollByd4ec7I = ScrollableKt.m532semanticsScrollByd4ec7I(scrollingLogic, j, this);
        vn vnVar = vn.d;
        return m532semanticsScrollByd4ec7I == vnVar ? vnVar : m532semanticsScrollByd4ec7I;
    }
}
