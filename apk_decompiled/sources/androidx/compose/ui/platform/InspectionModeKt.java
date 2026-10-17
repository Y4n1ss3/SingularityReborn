package androidx.compose.ui.platform;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class InspectionModeKt {
    private static final ProvidableCompositionLocal<Boolean> LocalInspectionMode = CompositionLocalKt.staticCompositionLocalOf(InspectionModeKt$LocalInspectionMode$1.INSTANCE);

    public static final ProvidableCompositionLocal<Boolean> getLocalInspectionMode() {
        return LocalInspectionMode;
    }
}
