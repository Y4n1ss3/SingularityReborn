package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ew0;
import defpackage.kq0;
import defpackage.my;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WindowInsetsSizeKt {
    private static final ny startCalc = new kq0(2);
    private static final ny endCalc = new kq0(3);
    private static final my topCalc = new ew0(2);
    private static final my bottomCalc = new ew0(3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int endCalc$lambda$0(WindowInsets windowInsets, LayoutDirection layoutDirection, Density density) {
        return layoutDirection == LayoutDirection.Rtl ? windowInsets.getLeft(density, layoutDirection) : windowInsets.getRight(density, layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int startCalc$lambda$0(WindowInsets windowInsets, LayoutDirection layoutDirection, Density density) {
        return layoutDirection == LayoutDirection.Ltr ? windowInsets.getLeft(density, layoutDirection) : windowInsets.getRight(density, layoutDirection);
    }

    public static final Modifier windowInsetsBottomHeight(Modifier modifier, WindowInsets windowInsets) {
        return modifier.then(new DerivedHeightModifierElement(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsSizeKt$windowInsetsBottomHeight$$inlined$debugInspectorInfo$1(windowInsets) : InspectableValueKt.getNoInspectorInfo(), bottomCalc));
    }

    public static final Modifier windowInsetsEndWidth(Modifier modifier, WindowInsets windowInsets) {
        return modifier.then(new DerivedWidthModifierElement(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsSizeKt$windowInsetsEndWidth$$inlined$debugInspectorInfo$1(windowInsets) : InspectableValueKt.getNoInspectorInfo(), endCalc));
    }

    public static final Modifier windowInsetsStartWidth(Modifier modifier, WindowInsets windowInsets) {
        return modifier.then(new DerivedWidthModifierElement(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsSizeKt$windowInsetsStartWidth$$inlined$debugInspectorInfo$1(windowInsets) : InspectableValueKt.getNoInspectorInfo(), startCalc));
    }

    public static final Modifier windowInsetsTopHeight(Modifier modifier, WindowInsets windowInsets) {
        return modifier.then(new DerivedHeightModifierElement(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsSizeKt$windowInsetsTopHeight$$inlined$debugInspectorInfo$1(windowInsets) : InspectableValueKt.getNoInspectorInfo(), topCalc));
    }
}
