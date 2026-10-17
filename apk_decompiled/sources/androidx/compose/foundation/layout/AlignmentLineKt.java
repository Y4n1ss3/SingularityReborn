package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import defpackage.ky;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AlignmentLineKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: alignmentLineOffsetMeasure-tjqqzMA, reason: not valid java name */
    public static final MeasureResult m616alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, final AlignmentLine alignmentLine, final float f, float f2, Measurable measurable, long j) {
        final Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(getHorizontal(alignmentLine) ? Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null) : Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null));
        int i = mo6234measureBRTryo0.get(alignmentLine);
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        int height = getHorizontal(alignmentLine) ? mo6234measureBRTryo0.getHeight() : mo6234measureBRTryo0.getWidth();
        int m7563getMaxHeightimpl = (getHorizontal(alignmentLine) ? Constraints.m7563getMaxHeightimpl(j) : Constraints.m7564getMaxWidthimpl(j)) - height;
        final int h = y80.h((!Float.isNaN(f) ? measureScope.mo361roundToPx0680j_4(f) : 0) - i, 0, m7563getMaxHeightimpl);
        final int h2 = y80.h(((!Float.isNaN(f2) ? measureScope.mo361roundToPx0680j_4(f2) : 0) - height) + i, 0, m7563getMaxHeightimpl - h);
        final int width = getHorizontal(alignmentLine) ? mo6234measureBRTryo0.getWidth() : Math.max(mo6234measureBRTryo0.getWidth() + h + h2, Constraints.m7566getMinWidthimpl(j));
        final int max = getHorizontal(alignmentLine) ? Math.max(mo6234measureBRTryo0.getHeight() + h + h2, Constraints.m7565getMinHeightimpl(j)) : mo6234measureBRTryo0.getHeight();
        return MeasureScope.layout$default(measureScope, width, max, null, new ky() { // from class: q4
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 alignmentLineOffsetMeasure_tjqqzMA$lambda$1;
                alignmentLineOffsetMeasure_tjqqzMA$lambda$1 = AlignmentLineKt.alignmentLineOffsetMeasure_tjqqzMA$lambda$1(AlignmentLine.this, f, h, width, h2, mo6234measureBRTryo0, max, (Placeable.PlacementScope) obj);
                return alignmentLineOffsetMeasure_tjqqzMA$lambda$1;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 alignmentLineOffsetMeasure_tjqqzMA$lambda$1(AlignmentLine alignmentLine, float f, int i, int i2, int i3, Placeable placeable, int i4, Placeable.PlacementScope placementScope) {
        int i5;
        int width = getHorizontal(alignmentLine) ? 0 : !Dp.m7616equalsimpl0(f, Dp.Companion.m7631getUnspecifiedD9Ej5fM()) ? i : (i2 - i3) - placeable.getWidth();
        if (getHorizontal(alignmentLine)) {
            if (Dp.m7616equalsimpl0(f, Dp.Companion.m7631getUnspecifiedD9Ej5fM())) {
                i = (i4 - i3) - placeable.getHeight();
            }
            i5 = i;
        } else {
            i5 = 0;
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, i5, 0.0f, 4, null);
        return w01.a;
    }

    private static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    /* renamed from: paddingFrom-4j6BHR0, reason: not valid java name */
    public static final Modifier m617paddingFrom4j6BHR0(Modifier modifier, AlignmentLine alignmentLine, float f, float f2) {
        return modifier.then(new AlignmentLineOffsetDpElement(alignmentLine, f, f2, InspectableValueKt.isDebugInspectorInfoEnabled() ? new AlignmentLineKt$paddingFrom4j6BHR0$$inlined$debugInspectorInfo$1(alignmentLine, f, f2) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFrom-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m618paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f2 = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        return m617paddingFrom4j6BHR0(modifier, alignmentLine, f, f2);
    }

    /* renamed from: paddingFrom-Y_r0B1c, reason: not valid java name */
    public static final Modifier m619paddingFromY_r0B1c(Modifier modifier, AlignmentLine alignmentLine, long j, long j2) {
        AlignmentLine alignmentLine2;
        long j3;
        long j4;
        ky noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            j3 = j;
            j4 = j2;
            noInspectorInfo = new AlignmentLineKt$paddingFromY_r0B1c$$inlined$debugInspectorInfo$1(alignmentLine, j3, j4);
            alignmentLine2 = alignmentLine;
        } else {
            alignmentLine2 = alignmentLine;
            j3 = j;
            j4 = j2;
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new AlignmentLineOffsetTextUnitElement(alignmentLine2, j3, j4, noInspectorInfo, null));
    }

    /* renamed from: paddingFrom-Y_r0B1c$default, reason: not valid java name */
    public static /* synthetic */ Modifier m620paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = TextUnit.Companion.m7816getUnspecifiedXSAIIZE();
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = TextUnit.Companion.m7816getUnspecifiedXSAIIZE();
        }
        return m619paddingFromY_r0B1c(modifier, alignmentLine, j3, j2);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4, reason: not valid java name */
    public static final Modifier m621paddingFromBaselineVpY3zN4(Modifier modifier, float f, float f2) {
        Modifier modifier2;
        Modifier modifier3;
        if (Float.isNaN(f)) {
            modifier2 = Modifier.Companion;
            modifier3 = modifier2;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            modifier2 = m618paddingFrom4j6BHR0$default(companion, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), f, 0.0f, 4, null);
            modifier3 = companion;
        }
        Modifier then = modifier.then(modifier2);
        if (!Float.isNaN(f2)) {
            modifier3 = m618paddingFrom4j6BHR0$default(modifier3, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f2, 2, null);
        }
        return then.then(modifier3);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m622paddingFromBaselineVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        return m621paddingFromBaselineVpY3zN4(modifier, f, f2);
    }

    /* renamed from: paddingFromBaseline-wCyjxdI, reason: not valid java name */
    public static final Modifier m623paddingFromBaselinewCyjxdI(Modifier modifier, long j, long j2) {
        Modifier modifier2;
        Modifier m620paddingFromY_r0B1c$default;
        if (TextUnit.m7803getRawTypeimpl(j) == 0) {
            m620paddingFromY_r0B1c$default = Modifier.Companion;
            modifier2 = m620paddingFromY_r0B1c$default;
        } else {
            modifier2 = Modifier.Companion;
            m620paddingFromY_r0B1c$default = m620paddingFromY_r0B1c$default(modifier2, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), j, 0L, 4, null);
        }
        Modifier then = modifier.then(m620paddingFromY_r0B1c$default);
        if (TextUnit.m7803getRawTypeimpl(j2) != 0) {
            modifier2 = m620paddingFromY_r0B1c$default(modifier2, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j2, 2, null);
        }
        return then.then(modifier2);
    }

    /* renamed from: paddingFromBaseline-wCyjxdI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m624paddingFromBaselinewCyjxdI$default(Modifier modifier, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = TextUnit.Companion.m7816getUnspecifiedXSAIIZE();
        }
        if ((i & 2) != 0) {
            j2 = TextUnit.Companion.m7816getUnspecifiedXSAIIZE();
        }
        return m623paddingFromBaselinewCyjxdI(modifier, j, j2);
    }
}
