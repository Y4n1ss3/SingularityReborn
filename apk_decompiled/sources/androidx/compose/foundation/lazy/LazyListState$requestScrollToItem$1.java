package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1", f = "LazyListState.kt", l = {413}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class LazyListState$requestScrollToItem$1 extends us0 implements my {
    int label;
    final /* synthetic */ LazyListState this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1$1", f = "LazyListState.kt", l = {}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        int label;

        public AnonymousClass1(hm hmVar) {
            super(2, hmVar);
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(ScrollScope scrollScope, hm hmVar) {
            return ((AnonymousClass1) create(scrollScope, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                p10.Q(obj);
                return w01.a;
            }
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$requestScrollToItem$1(LazyListState lazyListState, hm hmVar) {
        super(2, hmVar);
        this.this$0 = lazyListState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new LazyListState$requestScrollToItem$1(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((LazyListState$requestScrollToItem$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            LazyListState lazyListState = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            Object scroll$default = ScrollableState.scroll$default(lazyListState, null, anonymousClass1, this, 1, null);
            vn vnVar = vn.d;
            if (scroll$default == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
