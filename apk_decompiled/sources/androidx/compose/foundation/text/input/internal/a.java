package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ky {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invokeSuspend$lambda$0;
        w01 invokeSuspend$lambda$02;
        Long l = (Long) obj;
        switch (this.d) {
            case 0:
                invokeSuspend$lambda$0 = AndroidLegacyPlatformTextInputServiceAdapter$startInput$2.AnonymousClass1.C00151.invokeSuspend$lambda$0(l.longValue());
                return invokeSuspend$lambda$0;
            default:
                invokeSuspend$lambda$02 = AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1.invokeSuspend$lambda$0(l.longValue());
                return invokeSuspend$lambda$02;
        }
    }
}
