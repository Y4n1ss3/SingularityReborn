package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", l = {337, 339, 385}, m = "detectZoom", v = 1)
/* loaded from: classes.dex */
public final class TransformableKt$detectZoom$1 extends im {
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public TransformableKt$detectZoom$1(hm hmVar) {
        super(hmVar);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object detectZoom;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        detectZoom = TransformableKt.detectZoom(null, false, null, null, this);
        return detectZoom;
    }
}
