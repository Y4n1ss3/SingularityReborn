package androidx.compose.foundation.gestures;

import androidx.compose.ui.spatial.RectListKt;
import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {RectListKt.BitOffsetForGesturable}, m = "animateScrollBy-ubNVwUQ", v = 1)
/* loaded from: classes.dex */
public final class ScrollExtensionsKt$animateScrollBy$3 extends im {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ScrollExtensionsKt$animateScrollBy$3(hm hmVar) {
        super(hmVar);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ScrollExtensionsKt.m519animateScrollByubNVwUQ(null, 0L, null, this);
    }
}
