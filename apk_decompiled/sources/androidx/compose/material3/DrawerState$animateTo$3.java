package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.AnchoredDragScope;
import androidx.compose.foundation.gestures.DraggableAnchors;
import defpackage.bq;
import defpackage.gi0;
import defpackage.hm;
import defpackage.oy;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.DrawerState$animateTo$3", f = "NavigationDrawer.kt", l = {274}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DrawerState$animateTo$3 extends us0 implements oy {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ DrawerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerState$animateTo$3(DrawerState drawerState, float f, AnimationSpec<Float> animationSpec, hm hmVar) {
        super(4, hmVar);
        this.this$0 = drawerState;
        this.$velocity = f;
        this.$animationSpec = animationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(AnchoredDragScope anchoredDragScope, gi0 gi0Var, float f, float f2) {
        anchoredDragScope.dragTo(f, f2);
        gi0Var.d = f;
        return w01.a;
    }

    @Override // defpackage.oy
    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<DrawerValue> draggableAnchors, DrawerValue drawerValue, hm hmVar) {
        DrawerState$animateTo$3 drawerState$animateTo$3 = new DrawerState$animateTo$3(this.this$0, this.$velocity, this.$animationSpec, hmVar);
        drawerState$animateTo$3.L$0 = anchoredDragScope;
        drawerState$animateTo$3.L$1 = draggableAnchors;
        drawerState$animateTo$3.L$2 = drawerValue;
        return drawerState$animateTo$3.invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            float positionOf = ((DraggableAnchors) this.L$1).positionOf((DrawerValue) this.L$2);
            if (!Float.isNaN(positionOf)) {
                gi0 gi0Var = new gi0();
                float currentOffset = Float.isNaN(this.this$0.getCurrentOffset()) ? 0.0f : this.this$0.getCurrentOffset();
                gi0Var.d = currentOffset;
                float f = this.$velocity;
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                q0 q0Var = new q0(anchoredDragScope, gi0Var, 2);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object animate = SuspendAnimationKt.animate(currentOffset, positionOf, f, animationSpec, q0Var, this);
                vn vnVar = vn.d;
                if (animate == vnVar) {
                    return vnVar;
                }
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
