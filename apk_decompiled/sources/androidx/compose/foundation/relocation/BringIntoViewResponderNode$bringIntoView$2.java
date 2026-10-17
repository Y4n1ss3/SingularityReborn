package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.relocation.BringIntoViewModifierNodeKt;
import defpackage.bq;
import defpackage.hm;
import defpackage.iy;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.xy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class BringIntoViewResponderNode$bringIntoView$2 extends us0 implements my {
    final /* synthetic */ iy $boundsProvider;
    final /* synthetic */ LayoutCoordinates $childCoordinates;
    final /* synthetic */ iy $parentRect;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BringIntoViewResponderNode this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", f = "BringIntoViewResponder.kt", l = {183}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ iy $boundsProvider;
        final /* synthetic */ LayoutCoordinates $childCoordinates;
        int label;
        final /* synthetic */ BringIntoViewResponderNode this$0;

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final /* synthetic */ class C00111 extends xy implements iy {
            final /* synthetic */ iy $boundsProvider;
            final /* synthetic */ LayoutCoordinates $childCoordinates;
            final /* synthetic */ BringIntoViewResponderNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00111(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, iy iyVar) {
                super(0, p10.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.this$0 = bringIntoViewResponderNode;
                this.$childCoordinates = layoutCoordinates;
                this.$boundsProvider = iyVar;
            }

            @Override // defpackage.iy
            public final Rect invoke() {
                Rect bringIntoView$localRect;
                bringIntoView$localRect = BringIntoViewResponderNode.bringIntoView$localRect(this.this$0, this.$childCoordinates, this.$boundsProvider);
                return bringIntoView$localRect;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, iy iyVar, hm hmVar) {
            super(2, hmVar);
            this.this$0 = bringIntoViewResponderNode;
            this.$childCoordinates = layoutCoordinates;
            this.$boundsProvider = iyVar;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, hmVar);
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
                BringIntoViewResponder responder = this.this$0.getResponder();
                C00111 c00111 = new C00111(this.this$0, this.$childCoordinates, this.$boundsProvider);
                this.label = 1;
                Object bringChildIntoView = responder.bringChildIntoView(c00111, this);
                vn vnVar = vn.d;
                if (bringChildIntoView == vnVar) {
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

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", f = "BringIntoViewResponder.kt", l = {191}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends us0 implements my {
        final /* synthetic */ iy $parentRect;
        int label;
        final /* synthetic */ BringIntoViewResponderNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BringIntoViewResponderNode bringIntoViewResponderNode, iy iyVar, hm hmVar) {
            super(2, hmVar);
            this.this$0 = bringIntoViewResponderNode;
            this.$parentRect = iyVar;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass2(this.this$0, this.$parentRect, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass2) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                BringIntoViewResponderNode bringIntoViewResponderNode = this.this$0;
                iy iyVar = this.$parentRect;
                this.label = 1;
                Object bringIntoView = BringIntoViewModifierNodeKt.bringIntoView(bringIntoViewResponderNode, iyVar, this);
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderNode$bringIntoView$2(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, iy iyVar, iy iyVar2, hm hmVar) {
        super(2, hmVar);
        this.this$0 = bringIntoViewResponderNode;
        this.$childCoordinates = layoutCoordinates;
        this.$boundsProvider = iyVar;
        this.$parentRect = iyVar2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        BringIntoViewResponderNode$bringIntoView$2 bringIntoViewResponderNode$bringIntoView$2 = new BringIntoViewResponderNode$bringIntoView$2(this.this$0, this.$childCoordinates, this.$boundsProvider, this.$parentRect, hmVar);
        bringIntoViewResponderNode$bringIntoView$2.L$0 = obj;
        return bringIntoViewResponderNode$bringIntoView$2;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((BringIntoViewResponderNode$bringIntoView$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        un unVar = (un) this.L$0;
        p01.t(unVar, null, null, new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, null), 3);
        return p01.t(unVar, null, null, new AnonymousClass2(this.this$0, this.$parentRect, null), 3);
    }
}
