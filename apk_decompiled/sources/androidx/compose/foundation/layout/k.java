package androidx.compose.foundation.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ WindowInsetsNestedScrollConnection e;

    public /* synthetic */ k(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i) {
        this.d = i;
        this.e = windowInsetsNestedScrollConnection;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        DisposableEffectResult rememberWindowInsetsConnection_VRgvIgI$lambda$1$0;
        w01 invokeSuspend$lambda$0;
        int i = this.d;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.e;
        switch (i) {
            case 0:
                rememberWindowInsetsConnection_VRgvIgI$lambda$1$0 = WindowInsetsConnection_androidKt.rememberWindowInsetsConnection_VRgvIgI$lambda$1$0(windowInsetsNestedScrollConnection, (DisposableEffectScope) obj);
                return rememberWindowInsetsConnection_VRgvIgI$lambda$1$0;
            default:
                invokeSuspend$lambda$0 = WindowInsetsNestedScrollConnection$fling$3.AnonymousClass1.invokeSuspend$lambda$0(windowInsetsNestedScrollConnection, (Animatable) obj);
                return invokeSuspend$lambda$0;
        }
    }
}
