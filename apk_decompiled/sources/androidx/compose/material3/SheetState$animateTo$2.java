package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.internal.AnchoredDragScope;
import androidx.compose.material3.internal.DraggableAnchors;
import defpackage.bq;
import defpackage.gi0;
import defpackage.hm;
import defpackage.oy;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.SheetState$animateTo$2", f = "SheetDefaults.kt", l = {245}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SheetState$animateTo$2 extends us0 implements oy {
    final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ SheetState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SheetState$animateTo$2(SheetState sheetState, float f, FiniteAnimationSpec<Float> finiteAnimationSpec, hm hmVar) {
        super(4, hmVar);
        this.this$0 = sheetState;
        this.$velocity = f;
        this.$animationSpec = finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(AnchoredDragScope anchoredDragScope, gi0 gi0Var, float f, float f2) {
        anchoredDragScope.dragTo(f, f2);
        gi0Var.d = f;
        return w01.a;
    }

    @Override // defpackage.oy
    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<SheetValue> draggableAnchors, SheetValue sheetValue, hm hmVar) {
        SheetState$animateTo$2 sheetState$animateTo$2 = new SheetState$animateTo$2(this.this$0, this.$velocity, this.$animationSpec, hmVar);
        sheetState$animateTo$2.L$0 = anchoredDragScope;
        sheetState$animateTo$2.L$1 = draggableAnchors;
        sheetState$animateTo$2.L$2 = sheetValue;
        return sheetState$animateTo$2.invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            p10.Q(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            float positionOf = ((DraggableAnchors) this.L$1).positionOf((SheetValue) this.L$2);
            if (!Float.isNaN(positionOf)) {
                gi0 gi0Var = new gi0();
                float offset$material3 = Float.isNaN(this.this$0.getOffset$material3()) ? 0.0f : this.this$0.getOffset$material3();
                gi0Var.d = offset$material3;
                float f = this.$velocity;
                FiniteAnimationSpec<Float> finiteAnimationSpec = this.$animationSpec;
                q0 q0Var = new q0(anchoredDragScope, gi0Var, i2);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object animate = SuspendAnimationKt.animate(offset$material3, positionOf, f, finiteAnimationSpec, q0Var, this);
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
