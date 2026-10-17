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
@bq(c = "androidx.compose.foundation.gestures.Scrollable2DNode$setScrollSemanticsActions$2", f = "Scrollable2D.kt", l = {289}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class Scrollable2DNode$setScrollSemanticsActions$2 extends us0 implements my {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ Scrollable2DNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Scrollable2DNode$setScrollSemanticsActions$2(Scrollable2DNode scrollable2DNode, hm hmVar) {
        super(2, hmVar);
        this.this$0 = scrollable2DNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        Scrollable2DNode$setScrollSemanticsActions$2 scrollable2DNode$setScrollSemanticsActions$2 = new Scrollable2DNode$setScrollSemanticsActions$2(this.this$0, hmVar);
        scrollable2DNode$setScrollSemanticsActions$2.J$0 = ((Offset) obj).m4526unboximpl();
        return scrollable2DNode$setScrollSemanticsActions$2;
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m530invoke3MmeM6k(((Offset) obj).m4526unboximpl(), (hm) obj2);
    }

    /* renamed from: invoke-3MmeM6k, reason: not valid java name */
    public final Object m530invoke3MmeM6k(long j, hm hmVar) {
        return ((Scrollable2DNode$setScrollSemanticsActions$2) create(Offset.m4505boximpl(j), hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic2D scrollingLogic2D;
        Object m529semanticsScrollByd4ec7I;
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
        scrollingLogic2D = this.this$0.scrollingLogic;
        this.label = 1;
        m529semanticsScrollByd4ec7I = Scrollable2DKt.m529semanticsScrollByd4ec7I(scrollingLogic2D, j, this);
        vn vnVar = vn.d;
        return m529semanticsScrollByd4ec7I == vnVar ? vnVar : m529semanticsScrollByd4ec7I;
    }
}
