package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.g11;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WindowInsetsPadding_androidKt {
    public static final Modifier captionBarPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$captionBarPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), new g11(14));
    }

    public static final Modifier displayCutoutPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), new g11(7));
    }

    public static final Modifier imePadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$imePadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), new g11(10));
    }

    public static final Modifier mandatorySystemGesturesPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$mandatorySystemGesturesPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), new g11(9));
    }

    public static final Modifier navigationBarsPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), new g11(12));
    }

    public static final Modifier safeContentPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$safeContentPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), new g11(8));
    }

    public static final Modifier safeDrawingPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), new g11(13));
    }

    public static final Modifier safeGesturesPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$safeGesturesPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), new g11(5));
    }

    public static final Modifier statusBarsPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), new g11(16));
    }

    public static final Modifier systemBarsPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), new g11(11));
    }

    public static final Modifier systemGesturesPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$systemGesturesPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), new g11(6));
    }

    public static final Modifier waterfallPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$waterfallPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), new g11(15));
    }

    private static final Modifier windowInsetsPadding(Modifier modifier, ky kyVar, ky kyVar2) {
        return modifier.then(new SystemInsetsPaddingModifierElement(kyVar, kyVar2));
    }
}
