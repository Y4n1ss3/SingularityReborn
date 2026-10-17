package androidx.compose.foundation.layout;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", f = "WindowInsetsConnection.android.kt", l = {301, 327, 352}, m = "fling-huYlsQE", v = 1)
/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection$fling$1 extends im {
    float F$0;
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, hm hmVar) {
        super(hmVar);
        this.this$0 = windowInsetsNestedScrollConnection;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object m835flinghuYlsQE;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m835flinghuYlsQE = this.this$0.m835flinghuYlsQE(0L, 0.0f, false, this);
        return m835flinghuYlsQE;
    }
}
