package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WindowInsetsPaddingKt {
    public static final Modifier consumeWindowInsets(Modifier modifier, WindowInsets windowInsets) {
        return modifier.then(new UnionInsetsConsumingModifierElement(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$1(windowInsets) : InspectableValueKt.getNoInspectorInfo()));
    }

    public static final Modifier onConsumedWindowInsetsChanged(Modifier modifier, ky kyVar) {
        return modifier.then(new ConsumedInsetsModifierElement(kyVar, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$$inlined$debugInspectorInfo$1(kyVar) : InspectableValueKt.getNoInspectorInfo()));
    }

    public static final Modifier recalculateWindowInsets(Modifier modifier) {
        return modifier.then(RecalculateWindowInsetsModifierElement.INSTANCE);
    }

    public static final Modifier windowInsetsPadding(Modifier modifier, WindowInsets windowInsets) {
        return modifier.then(new InsetsPaddingModifierElement(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPaddingKt$windowInsetsPadding$$inlined$debugInspectorInfo$1(windowInsets) : InspectableValueKt.getNoInspectorInfo()));
    }

    public static final Modifier consumeWindowInsets(Modifier modifier, PaddingValues paddingValues) {
        return modifier.then(new PaddingValuesConsumingModifierElement(paddingValues, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$2(paddingValues) : InspectableValueKt.getNoInspectorInfo()));
    }
}
