package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import defpackage.hm;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;
import defpackage.vt;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnchoredDraggableKt {
    public static final <T> DraggableAnchors<T> DraggableAnchors(ky kyVar) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        kyVar.invoke(draggableAnchorsConfig);
        return new MapDraggableAnchors(draggableAnchorsConfig.getAnchors$material3());
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource) {
        return DraggableKt.draggable$default(modifier, anchoredDraggableState.getDraggableState$material3(), orientation, z, mutableInteractionSource, anchoredDraggableState.isAnimationRunning(), null, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, null), z2, 32, null);
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            mutableInteractionSource = null;
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z3, z4, mutableInteractionSource);
    }

    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, T t, float f, hm hmVar) {
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t, null, new AnchoredDraggableKt$animateTo$2(anchoredDraggableState, f, null), hmVar, 2, null);
        return anchoredDrag$default == vn.d ? anchoredDrag$default : w01.a;
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f, hm hmVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            f = anchoredDraggableState.getLastVelocity();
        }
        return animateTo(anchoredDraggableState, obj, f, hmVar);
    }

    public static final <T> Modifier draggableAnchors(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, my myVar) {
        return modifier.then(new DraggableAnchorsElement(anchoredDraggableState, myVar, orientation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> MapDraggableAnchors<T> emptyDraggableAnchors() {
        return new MapDraggableAnchors<>(vt.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <I> Object restartable(iy iyVar, my myVar, hm hmVar) {
        AnchoredDraggableKt$restartable$1 anchoredDraggableKt$restartable$1;
        int i;
        if (hmVar instanceof AnchoredDraggableKt$restartable$1) {
            anchoredDraggableKt$restartable$1 = (AnchoredDraggableKt$restartable$1) hmVar;
            int i2 = anchoredDraggableKt$restartable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anchoredDraggableKt$restartable$1.label = i2 - Integer.MIN_VALUE;
                Object obj = anchoredDraggableKt$restartable$1.result;
                i = anchoredDraggableKt$restartable$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(iyVar, myVar, null);
                    anchoredDraggableKt$restartable$1.label = 1;
                    Object n = p10.n(anchoredDraggableKt$restartable$2, anchoredDraggableKt$restartable$1);
                    vn vnVar = vn.d;
                    if (n == vnVar) {
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
        anchoredDraggableKt$restartable$1 = new AnchoredDraggableKt$restartable$1(hmVar);
        Object obj2 = anchoredDraggableKt$restartable$1.result;
        i = anchoredDraggableKt$restartable$1.label;
        if (i != 0) {
        }
        return w01.a;
    }

    public static final <T> Object snapTo(AnchoredDraggableState<T> anchoredDraggableState, T t, hm hmVar) {
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t, null, new AnchoredDraggableKt$snapTo$2(null), hmVar, 2, null);
        return anchoredDrag$default == vn.d ? anchoredDrag$default : w01.a;
    }
}
