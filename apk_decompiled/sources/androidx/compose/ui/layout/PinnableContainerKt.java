package androidx.compose.ui.layout;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PinnableContainerKt {
    private static final ProvidableCompositionLocal<PinnableContainer> LocalPinnableContainer = CompositionLocalKt.compositionLocalOf$default(null, PinnableContainerKt$LocalPinnableContainer$1.INSTANCE, 1, null);

    public static final ProvidableCompositionLocal<PinnableContainer> getLocalPinnableContainer() {
        return LocalPinnableContainer;
    }
}
