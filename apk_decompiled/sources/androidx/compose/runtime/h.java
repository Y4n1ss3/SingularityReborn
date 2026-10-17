package androidx.compose.runtime;

import androidx.compose.runtime.NextFrameEndCallbackQueue;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements ky {
    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 markFrameComplete$lambda$0;
        markFrameComplete$lambda$0 = NextFrameEndCallbackQueue.markFrameComplete$lambda$0((NextFrameEndCallbackQueue.NextFrameEndAwaiter) obj);
        return markFrameComplete$lambda$0;
    }
}
