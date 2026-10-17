package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import defpackage.bq;
import defpackage.gi0;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {1119}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ScrollableKt$semanticsScrollBy$2 extends us0 implements my {

    /* renamed from: $$v$c$androidx-compose-ui-geometry-Offset$-offset$0, reason: not valid java name */
    final /* synthetic */ long f14$$v$c$androidxcomposeuigeometryOffset$offset$0;
    final /* synthetic */ gi0 $previousValue;
    final /* synthetic */ ScrollingLogic $this_semanticsScrollBy;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$semanticsScrollBy$2(ScrollingLogic scrollingLogic, long j, gi0 gi0Var, hm hmVar) {
        super(2, hmVar);
        this.$this_semanticsScrollBy = scrollingLogic;
        this.f14$$v$c$androidxcomposeuigeometryOffset$offset$0 = j;
        this.$previousValue = gi0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(gi0 gi0Var, ScrollingLogic scrollingLogic, NestedScrollScope nestedScrollScope, float f, float f2) {
        gi0Var.d += scrollingLogic.reverseIfNeeded(scrollingLogic.m549toFloatk4lQ0M(nestedScrollScope.mo491scrollByOzD1aCk(scrollingLogic.m550toOffsettuRUvjQ(scrollingLogic.reverseIfNeeded(f - gi0Var.d)), NestedScrollSource.Companion.m5969getUserInputWNlRxjI())));
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(this.$this_semanticsScrollBy, this.f14$$v$c$androidxcomposeuigeometryOffset$offset$0, this.$previousValue, hmVar);
        scrollableKt$semanticsScrollBy$2.L$0 = obj;
        return scrollableKt$semanticsScrollBy$2;
    }

    @Override // defpackage.my
    public final Object invoke(NestedScrollScope nestedScrollScope, hm hmVar) {
        return ((ScrollableKt$semanticsScrollBy$2) create(nestedScrollScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            p10.Q(obj);
            NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            float m549toFloatk4lQ0M = this.$this_semanticsScrollBy.m549toFloatk4lQ0M(this.f14$$v$c$androidxcomposeuigeometryOffset$offset$0);
            l lVar = new l(this.$previousValue, this.$this_semanticsScrollBy, nestedScrollScope, i2);
            this.label = 1;
            Object animate$default = SuspendAnimationKt.animate$default(0.0f, m549toFloatk4lQ0M, 0.0f, null, lVar, this, 12, null);
            vn vnVar = vn.d;
            if (animate$default == vnVar) {
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
