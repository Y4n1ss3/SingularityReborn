package androidx.compose.ui.graphics.layer;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.graphics.layer.LayerSnapshotV22", f = "LayerSnapshot.android.kt", l = {225}, m = "toBitmap", v = 1)
/* loaded from: classes.dex */
public final class LayerSnapshotV22$toBitmap$1 extends im {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LayerSnapshotV22 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayerSnapshotV22$toBitmap$1(LayerSnapshotV22 layerSnapshotV22, hm hmVar) {
        super(hmVar);
        this.this$0 = layerSnapshotV22;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.toBitmap(null, this);
    }
}
