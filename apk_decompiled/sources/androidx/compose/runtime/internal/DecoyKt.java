package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DecoyKt {
    @ComposeCompilerApi
    public static final Void illegalDecoyCallException(String str) {
        throw new IllegalStateException(uo.d("Function ", str, " should have been replaced by compiler."));
    }
}
