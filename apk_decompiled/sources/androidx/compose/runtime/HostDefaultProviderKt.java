package androidx.compose.runtime;

import defpackage.ms;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HostDefaultProviderKt {
    private static final ProvidableCompositionLocal<HostDefaultProvider> LocalHostDefaultProvider = CompositionLocalKt.compositionLocalOf$default(null, new ms(3), 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final HostDefaultProvider LocalHostDefaultProvider$lambda$0() {
        throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
    }

    public static final ProvidableCompositionLocal<HostDefaultProvider> getLocalHostDefaultProvider() {
        return LocalHostDefaultProvider;
    }
}
