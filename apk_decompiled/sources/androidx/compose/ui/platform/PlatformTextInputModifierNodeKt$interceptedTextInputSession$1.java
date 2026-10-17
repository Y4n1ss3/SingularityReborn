package androidx.compose.ui.platform;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {184, 186}, m = "interceptedTextInputSession", v = 1)
/* loaded from: classes2.dex */
public final class PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 extends im {
    int label;
    /* synthetic */ Object result;

    public PlatformTextInputModifierNodeKt$interceptedTextInputSession$1(hm hmVar) {
        super(hmVar);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object interceptedTextInputSession;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        interceptedTextInputSession = PlatformTextInputModifierNodeKt.interceptedTextInputSession(null, null, null, this);
        return interceptedTextInputSession;
    }
}
