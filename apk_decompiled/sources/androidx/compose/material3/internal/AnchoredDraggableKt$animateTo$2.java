package androidx.compose.material3.internal;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import defpackage.bq;
import defpackage.gi0;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.oy;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {682}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$animateTo$2 extends us0 implements oy {
    final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$2(AnchoredDraggableState<T> anchoredDraggableState, float f, hm hmVar) {
        super(4, hmVar);
        this.$this_animateTo = anchoredDraggableState;
        this.$velocity = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(AnchoredDragScope anchoredDragScope, gi0 gi0Var, float f, float f2) {
        anchoredDragScope.dragTo(f, f2);
        gi0Var.d = f;
        return w01.a;
    }

    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t, hm hmVar) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(this.$this_animateTo, this.$velocity, hmVar);
        anchoredDraggableKt$animateTo$2.L$0 = anchoredDragScope;
        anchoredDraggableKt$animateTo$2.L$1 = draggableAnchors;
        anchoredDraggableKt$animateTo$2.L$2 = t;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            float positionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
            if (!Float.isNaN(positionOf)) {
                final gi0 gi0Var = new gi0();
                float offset = Float.isNaN(this.$this_animateTo.getOffset()) ? 0.0f : this.$this_animateTo.getOffset();
                gi0Var.d = offset;
                float f = this.$velocity;
                AnimationSpec animationSpec = (AnimationSpec) this.$this_animateTo.getAnimationSpec().invoke();
                my myVar = new my() { // from class: androidx.compose.material3.internal.c
                    @Override // defpackage.my
                    public final Object invoke(Object obj2, Object obj3) {
                        w01 invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = AnchoredDraggableKt$animateTo$2.invokeSuspend$lambda$0(AnchoredDragScope.this, gi0Var, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        return invokeSuspend$lambda$0;
                    }
                };
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object animate = SuspendAnimationKt.animate(offset, positionOf, f, animationSpec, myVar, this);
                vn vnVar = vn.d;
                if (animate == vnVar) {
                    return vnVar;
                }
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

    @Override // defpackage.oy
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((AnchoredDragScope) obj, (DraggableAnchors<DraggableAnchors>) obj2, (DraggableAnchors) obj3, (hm) obj4);
    }
}
