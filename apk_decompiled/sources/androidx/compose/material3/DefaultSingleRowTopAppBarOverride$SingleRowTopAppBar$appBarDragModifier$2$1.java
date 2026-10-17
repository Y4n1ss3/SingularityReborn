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
@bq(c = "androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1", f = "AppBar.kt", l = {2555}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1 extends us0 implements ny {
    final /* synthetic */ SingleRowTopAppBarOverrideScope $this_SingleRowTopAppBar;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1(SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope, hm hmVar) {
        super(3, hmVar);
        this.$this_SingleRowTopAppBar = singleRowTopAppBarOverrideScope;
    }

    public final Object invoke(un unVar, float f, hm hmVar) {
        DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1 defaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1 = new DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1(this.$this_SingleRowTopAppBar, hmVar);
        defaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1.F$0 = f;
        return defaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1.invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            float f = this.F$0;
            TopAppBarState state = this.$this_SingleRowTopAppBar.getScrollBehavior().getState();
            DecayAnimationSpec<Float> flingAnimationSpec = this.$this_SingleRowTopAppBar.getScrollBehavior().getFlingAnimationSpec();
            AnimationSpec<Float> snapAnimationSpec = this.$this_SingleRowTopAppBar.getScrollBehavior().getSnapAnimationSpec();
            this.label = 1;
            obj2 = AppBarKt.settleAppBar(state, f, flingAnimationSpec, snapAnimationSpec, this);
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
