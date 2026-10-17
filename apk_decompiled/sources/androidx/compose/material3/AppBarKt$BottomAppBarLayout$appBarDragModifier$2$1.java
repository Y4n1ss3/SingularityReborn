package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import defpackage.bq;
import defpackage.hm;
import defpackage.ny;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1", f = "AppBar.kt", l = {1344}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1 extends us0 implements ny {
    final /* synthetic */ BottomAppBarScrollBehavior $activeScrollBehavior;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1(BottomAppBarScrollBehavior bottomAppBarScrollBehavior, hm hmVar) {
        super(3, hmVar);
        this.$activeScrollBehavior = bottomAppBarScrollBehavior;
    }

    public final Object invoke(un unVar, float f, hm hmVar) {
        AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1 appBarKt$BottomAppBarLayout$appBarDragModifier$2$1 = new AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1(this.$activeScrollBehavior, hmVar);
        appBarKt$BottomAppBarLayout$appBarDragModifier$2$1.F$0 = f;
        return appBarKt$BottomAppBarLayout$appBarDragModifier$2$1.invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            float f = this.F$0;
            BottomAppBarState state = this.$activeScrollBehavior.getState();
            DecayAnimationSpec<Float> flingAnimationSpec = this.$activeScrollBehavior.getFlingAnimationSpec();
            AnimationSpec<Float> snapAnimationSpec = this.$activeScrollBehavior.getSnapAnimationSpec();
            this.label = 1;
            obj2 = AppBarKt.settleAppBarBottom(state, f, flingAnimationSpec, snapAnimationSpec, this);
            vn vnVar = vn.d;
            if (obj2 == vnVar) {
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

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((un) obj, ((Number) obj2).floatValue(), (hm) obj3);
    }
}
