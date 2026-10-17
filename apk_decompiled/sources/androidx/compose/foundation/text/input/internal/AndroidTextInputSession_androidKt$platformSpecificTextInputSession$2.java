package androidx.compose.foundation.text.input.internal;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", f = "AndroidTextInputSession.android.kt", l = {87}, m = "platformSpecificTextInputSession", v = 1)
/* loaded from: classes.dex */
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 extends im {
    int label;
    /* synthetic */ Object result;

    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2(hm hmVar) {
        super(hmVar);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AndroidTextInputSession_androidKt.platformSpecificTextInputSession(null, null, null, null, null, null, null, null, null, null, null, this);
    }
}
