package androidx.compose.foundation.text.selection;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl", f = "PlatformSelectionBehaviors.android.kt", l = {369, 380}, m = "classifyText-M8tDOmk", v = 1)
/* loaded from: classes.dex */
public final class PlatformSelectionBehaviorsImpl$classifyText$1 extends im {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PlatformSelectionBehaviorsImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformSelectionBehaviorsImpl$classifyText$1(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, hm hmVar) {
        super(hmVar);
        this.this$0 = platformSelectionBehaviorsImpl;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object m1494classifyTextM8tDOmk;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m1494classifyTextM8tDOmk = this.this$0.m1494classifyTextM8tDOmk(null, 0L, null, this);
        return m1494classifyTextM8tDOmk;
    }
}
