package androidx.compose.ui.viewinterop;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.relocation.BringIntoViewModifierNodeKt;
import defpackage.bq;
import defpackage.f30;
import defpackage.hm;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class BringIntoViewNode$requester$1 extends f30 implements ky {
    final /* synthetic */ BringIntoViewNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewNode$requester$1(BringIntoViewNode bringIntoViewNode) {
        super(1);
        this.this$0 = bringIntoViewNode;
    }

    public final void invoke(Rect rect) {
        if (this.this$0.isAttached()) {
            p01.t(this.this$0.getCoroutineScope(), null, null, new AnonymousClass1(this.this$0, rect, null), 3);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1", f = "AndroidViewHolder.android.kt", l = {764}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ Rect $rect;
        int label;
        final /* synthetic */ BringIntoViewNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BringIntoViewNode bringIntoViewNode, Rect rect, hm hmVar) {
            super(2, hmVar);
            this.this$0 = bringIntoViewNode;
            this.$rect = rect;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(this.this$0, this.$rect, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                BringIntoViewNode bringIntoViewNode = this.this$0;
                C00281 c00281 = new C00281(this.$rect);
                this.label = 1;
                Object bringIntoView = BringIntoViewModifierNodeKt.bringIntoView(bringIntoViewNode, c00281, this);
                vn vnVar = vn.d;
                if (bringIntoView == vnVar) {
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

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        /* renamed from: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00281 extends f30 implements iy {
            final /* synthetic */ Rect $rect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00281(Rect rect) {
                super(0);
                this.$rect = rect;
            }

            @Override // defpackage.iy
            public final Rect invoke() {
                return this.$rect;
            }
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Rect) obj);
        return w01.a;
    }
}
