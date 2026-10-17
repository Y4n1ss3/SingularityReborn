package androidx.compose.ui.platform;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {2374, 2410}, m = "boundsUpdatesEventLoop$ui", v = 1)
/* loaded from: classes2.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 extends im {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, hm hmVar) {
        super(hmVar);
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.boundsUpdatesEventLoop$ui(this);
    }
}
