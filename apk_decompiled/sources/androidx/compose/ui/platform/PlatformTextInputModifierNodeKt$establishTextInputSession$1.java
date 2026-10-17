package androidx.compose.ui.platform;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {136}, m = "establishTextInputSession", v = 1)
/* loaded from: classes2.dex */
public final class PlatformTextInputModifierNodeKt$establishTextInputSession$1 extends im {
    int label;
    /* synthetic */ Object result;

    public PlatformTextInputModifierNodeKt$establishTextInputSession$1(hm hmVar) {
        super(hmVar);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PlatformTextInputModifierNodeKt.establishTextInputSession(null, null, this);
    }
}
