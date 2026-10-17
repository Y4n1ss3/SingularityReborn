package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", f = "Scrollable.kt", l = {532}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ScrollableNode$onKeyEvent$1 extends us0 implements my {
    final /* synthetic */ long $scrollAmount;
    int label;
    final /* synthetic */ ScrollableNode this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ long $scrollAmount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, hm hmVar) {
            super(2, hmVar);
            this.$scrollAmount = j;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scrollAmount, hmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.my
        public final Object invoke(NestedScrollScope nestedScrollScope, hm hmVar) {
            return ((AnonymousClass1) create(nestedScrollScope, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
            ((NestedScrollScope) this.L$0).mo491scrollByOzD1aCk(this.$scrollAmount, NestedScrollSource.Companion.m5969getUserInputWNlRxjI());
            return w01.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$onKeyEvent$1(ScrollableNode scrollableNode, long j, hm hmVar) {
        super(2, hmVar);
        this.this$0 = scrollableNode;
        this.$scrollAmount = j;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ScrollableNode$onKeyEvent$1(this.this$0, this.$scrollAmount, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((ScrollableNode$onKeyEvent$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            scrollingLogic = this.this$0.scrollingLogic;
            MutatePriority mutatePriority = MutatePriority.UserInput;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scrollAmount, null);
            this.label = 1;
            Object scroll = scrollingLogic.scroll(mutatePriority, anonymousClass1, this);
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
