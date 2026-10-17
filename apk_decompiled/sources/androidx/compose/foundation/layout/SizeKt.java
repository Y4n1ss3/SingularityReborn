package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SizeKt {
    private static final FillElement FillWholeMaxHeight;
    private static final FillElement FillWholeMaxSize;
    private static final FillElement FillWholeMaxWidth;
    private static final WrapContentElement WrapContentHeightCenter;
    private static final WrapContentElement WrapContentHeightTop;
    private static final WrapContentElement WrapContentSizeCenter;
    private static final WrapContentElement WrapContentSizeTopStart;
    private static final WrapContentElement WrapContentWidthCenter;
    private static final WrapContentElement WrapContentWidthStart;

    static {
        FillElement.Companion companion = FillElement.Companion;
        FillWholeMaxWidth = companion.width(1.0f);
        FillWholeMaxHeight = companion.height(1.0f);
        FillWholeMaxSize = companion.size(1.0f);
        WrapContentElement.Companion companion2 = WrapContentElement.Companion;
        Alignment.Companion companion3 = Alignment.Companion;
        WrapContentWidthCenter = companion2.width(companion3.getCenterHorizontally(), false);
        WrapContentWidthStart = companion2.width(companion3.getStart(), false);
        WrapContentHeightCenter = companion2.height(companion3.getCenterVertically(), false);
        WrapContentHeightTop = companion2.height(companion3.getTop(), false);
        WrapContentSizeCenter = companion2.size(companion3.getCenter(), false);
        WrapContentSizeTopStart = companion2.size(companion3.getTopStart(), false);
    }

    /* renamed from: defaultMinSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m791defaultMinSizeVpY3zN4(Modifier modifier, float f, float f2) {
        return modifier.then(new UnspecifiedConstraintsElement(f, f2, null));
    }

    /* renamed from: defaultMinSize-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m792defaultMinSizeVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        return m791defaultMinSizeVpY3zN4(modifier, f, f2);
    }

    public static final Modifier fillMaxHeight(Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? FillWholeMaxHeight : FillElement.Companion.height(f));
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxHeight(modifier, f);
    }

    public static final Modifier fillMaxSize(Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? FillWholeMaxSize : FillElement.Companion.size(f));
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxSize(modifier, f);
    }

    public static final Modifier fillMaxWidth(Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? FillWholeMaxWidth : FillElement.Companion.width(f));
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxWidth(modifier, f);
    }

    /* renamed from: height-3ABfNKs, reason: not valid java name */
    public static final Modifier m793height3ABfNKs(Modifier modifier, float f) {
        return modifier.then(new SizeElement(0.0f, f, 0.0f, f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$height3ABfNKs$$inlined$debugInspectorInfo$1(f) : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: heightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m794heightInVpY3zN4(Modifier modifier, float f, float f2) {
        return modifier.then(new SizeElement(0.0f, f, 0.0f, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$heightInVpY3zN4$$inlined$debugInspectorInfo$1(f, f2) : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: heightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m795heightInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        return m794heightInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: requiredHeight-3ABfNKs, reason: not valid java name */
    public static final Modifier m796requiredHeight3ABfNKs(Modifier modifier, float f) {
        return modifier.then(new SizeElement(0.0f, f, 0.0f, f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredHeight3ABfNKs$$inlined$debugInspectorInfo$1(f) : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m797requiredHeightInVpY3zN4(Modifier modifier, float f, float f2) {
        return modifier.then(new SizeElement(0.0f, f, 0.0f, f2, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredHeightInVpY3zN4$$inlined$debugInspectorInfo$1(f, f2) : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m798requiredHeightInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        return m797requiredHeightInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: requiredSize-3ABfNKs, reason: not valid java name */
    public static final Modifier m799requiredSize3ABfNKs(Modifier modifier, float f) {
        return modifier.then(new SizeElement(f, f, f, f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredSize3ABfNKs$$inlined$debugInspectorInfo$1(f) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSize-6HolHcs, reason: not valid java name */
    public static final Modifier m800requiredSize6HolHcs(Modifier modifier, long j) {
        return m801requiredSizeVpY3zN4(modifier, DpSize.m7709getWidthD9Ej5fM(j), DpSize.m7707getHeightD9Ej5fM(j));
    }

    /* renamed from: requiredSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m801requiredSizeVpY3zN4(Modifier modifier, float f, float f2) {
        return modifier.then(new SizeElement(f, f2, f, f2, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1(f, f2) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m802requiredSizeInqDBjuR0(Modifier modifier, float f, float f2, float f3, float f4) {
        return modifier.then(new SizeElement(f, f2, f3, f4, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredSizeInqDBjuR0$$inlined$debugInspectorInfo$1(f, f2, f3, f4) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m803requiredSizeInqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        return m802requiredSizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* renamed from: requiredWidth-3ABfNKs, reason: not valid java name */
    public static final Modifier m804requiredWidth3ABfNKs(Modifier modifier, float f) {
        return modifier.then(new SizeElement(f, 0.0f, f, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredWidth3ABfNKs$$inlined$debugInspectorInfo$1(f) : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: requiredWidthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m805requiredWidthInVpY3zN4(Modifier modifier, float f, float f2) {
        return modifier.then(new SizeElement(f, 0.0f, f2, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredWidthInVpY3zN4$$inlined$debugInspectorInfo$1(f, f2) : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: requiredWidthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m806requiredWidthInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        return m805requiredWidthInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: size-3ABfNKs, reason: not valid java name */
    public static final Modifier m807size3ABfNKs(Modifier modifier, float f) {
        return modifier.then(new SizeElement(f, f, f, f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$size3ABfNKs$$inlined$debugInspectorInfo$1(f) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: size-6HolHcs, reason: not valid java name */
    public static final Modifier m808size6HolHcs(Modifier modifier, long j) {
        return m809sizeVpY3zN4(modifier, DpSize.m7709getWidthD9Ej5fM(j), DpSize.m7707getHeightD9Ej5fM(j));
    }

    /* renamed from: size-VpY3zN4, reason: not valid java name */
    public static final Modifier m809sizeVpY3zN4(Modifier modifier, float f, float f2) {
        return modifier.then(new SizeElement(f, f2, f, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$sizeVpY3zN4$$inlined$debugInspectorInfo$1(f, f2) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: sizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m810sizeInqDBjuR0(Modifier modifier, float f, float f2, float f3, float f4) {
        return modifier.then(new SizeElement(f, f2, f3, f4, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$sizeInqDBjuR0$$inlined$debugInspectorInfo$1(f, f2, f3, f4) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: sizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m811sizeInqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        return m810sizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* renamed from: width-3ABfNKs, reason: not valid java name */
    public static final Modifier m812width3ABfNKs(Modifier modifier, float f) {
        return modifier.then(new SizeElement(f, 0.0f, f, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$width3ABfNKs$$inlined$debugInspectorInfo$1(f) : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: widthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m813widthInVpY3zN4(Modifier modifier, float f, float f2) {
        return modifier.then(new SizeElement(f, 0.0f, f2, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$widthInVpY3zN4$$inlined$debugInspectorInfo$1(f, f2) : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: widthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m814widthInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        return m813widthInVpY3zN4(modifier, f, f2);
    }

    public static final Modifier wrapContentHeight(Modifier modifier, Alignment.Vertical vertical, boolean z) {
        Alignment.Companion companion = Alignment.Companion;
        return modifier.then((!q10.b(vertical, companion.getCenterVertically()) || z) ? (!q10.b(vertical, companion.getTop()) || z) ? WrapContentElement.Companion.height(vertical, z) : WrapContentHeightTop : WrapContentHeightCenter);
    }

    public static /* synthetic */ Modifier wrapContentHeight$default(Modifier modifier, Alignment.Vertical vertical, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            vertical = Alignment.Companion.getCenterVertically();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentHeight(modifier, vertical, z);
    }

    public static final Modifier wrapContentSize(Modifier modifier, Alignment alignment, boolean z) {
        Alignment.Companion companion = Alignment.Companion;
        return modifier.then((!q10.b(alignment, companion.getCenter()) || z) ? (!q10.b(alignment, companion.getTopStart()) || z) ? WrapContentElement.Companion.size(alignment, z) : WrapContentSizeTopStart : WrapContentSizeCenter);
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier modifier, Alignment alignment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentSize(modifier, alignment, z);
    }

    public static final Modifier wrapContentWidth(Modifier modifier, Alignment.Horizontal horizontal, boolean z) {
        Alignment.Companion companion = Alignment.Companion;
        return modifier.then((!q10.b(horizontal, companion.getCenterHorizontally()) || z) ? (!q10.b(horizontal, companion.getStart()) || z) ? WrapContentElement.Companion.width(horizontal, z) : WrapContentWidthStart : WrapContentWidthCenter);
    }

    public static /* synthetic */ Modifier wrapContentWidth$default(Modifier modifier, Alignment.Horizontal horizontal, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            horizontal = Alignment.Companion.getCenterHorizontally();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentWidth(modifier, horizontal, z);
    }
}
