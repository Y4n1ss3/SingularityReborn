package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import defpackage.bq;
import defpackage.hm;
import defpackage.oy;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", f = "AnchoredDraggable.kt", l = {1347}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$animateTo$4 extends us0 implements oy {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$4(AnchoredDraggableState<T> anchoredDraggableState, AnimationSpec<Float> animationSpec, hm hmVar) {
        super(4, hmVar);
        this.$this_animateTo = anchoredDraggableState;
        this.$animationSpec = animationSpec;
    }

    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t, hm hmVar) {
        AnchoredDraggableKt$animateTo$4 anchoredDraggableKt$animateTo$4 = new AnchoredDraggableKt$animateTo$4(this.$this_animateTo, this.$animationSpec, hmVar);
        anchoredDraggableKt$animateTo$4.L$0 = anchoredDragScope;
        anchoredDraggableKt$animateTo$4.L$1 = draggableAnchors;
        anchoredDraggableKt$animateTo$4.L$2 = t;
        return anchoredDraggableKt$animateTo$4.invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object animateTo;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            DraggableAnchors draggableAnchors = (DraggableAnchors) this.L$1;
            Object obj2 = this.L$2;
            AnchoredDraggableState<T> anchoredDraggableState = this.$this_animateTo;
            float lastVelocity = anchoredDraggableState.getLastVelocity();
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            animateTo = AnchoredDraggableKt.animateTo(anchoredDraggableState, lastVelocity, anchoredDragScope, draggableAnchors, obj2, animationSpec, this);
            vn vnVar = vn.d;
            if (animateTo == vnVar) {
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

    @Override // defpackage.oy
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((AnchoredDragScope) obj, (DraggableAnchors<DraggableAnchors>) obj2, (DraggableAnchors) obj3, (hm) obj4);
    }
}
