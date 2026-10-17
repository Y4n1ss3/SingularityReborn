package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2", f = "MouseWheelScrollable.kt", l = {150}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic$userScroll$2 extends us0 implements my {
    final /* synthetic */ my $block;
    final /* synthetic */ ScrollingLogic $this_userScroll;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$userScroll$2(ScrollingLogic scrollingLogic, my myVar, hm hmVar) {
        super(2, hmVar);
        this.$this_userScroll = scrollingLogic;
        this.$block = myVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new MouseWheelScrollingLogic$userScroll$2(this.$this_userScroll, this.$block, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((MouseWheelScrollingLogic$userScroll$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            ScrollingLogic scrollingLogic = this.$this_userScroll;
            MutatePriority mutatePriority = MutatePriority.UserInput;
            my myVar = this.$block;
            this.label = 1;
            Object scroll = scrollingLogic.scroll(mutatePriority, myVar, this);
            vn vnVar = vn.d;
            if (scroll == vnVar) {
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
