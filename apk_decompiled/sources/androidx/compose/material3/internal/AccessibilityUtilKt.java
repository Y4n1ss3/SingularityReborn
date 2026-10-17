package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import defpackage.d1;
import defpackage.h1;
import defpackage.i1;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AccessibilityUtilKt {
    private static final float HorizontalSemanticsBoundsPadding;
    private static final Modifier IncreaseHorizontalSemanticsBounds;
    private static final Modifier IncreaseVerticalSemanticsBounds;
    private static final float VerticalSemanticsBoundsPadding;

    static {
        float m7611constructorimpl = Dp.m7611constructorimpl(10.0f);
        HorizontalSemanticsBoundsPadding = m7611constructorimpl;
        float m7611constructorimpl2 = Dp.m7611constructorimpl(10.0f);
        VerticalSemanticsBoundsPadding = m7611constructorimpl2;
        Modifier.Companion companion = Modifier.Companion;
        IncreaseHorizontalSemanticsBounds = PaddingKt.m764paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(companion, new i1(0)), true, new d1(1)), m7611constructorimpl, 0.0f, 2, null);
        IncreaseVerticalSemanticsBounds = PaddingKt.m764paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(companion, new i1(1)), true, new d1(2)), 0.0f, m7611constructorimpl2, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult IncreaseHorizontalSemanticsBounds$lambda$1(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        int mo361roundToPx0680j_4 = measureScope.mo361roundToPx0680j_4(HorizontalSemanticsBoundsPadding);
        long m7570unboximpl = constraints.m7570unboximpl();
        int i = mo361roundToPx0680j_4 * 2;
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(ConstraintsKt.m7583offsetNN6EwU(m7570unboximpl, i, 0));
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth() - i, mo6234measureBRTryo0.getHeight(), null, new h1(mo361roundToPx0680j_4, 1, mo6234measureBRTryo0), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IncreaseHorizontalSemanticsBounds$lambda$1$lambda$0(Placeable placeable, int i, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, -i, 0, 0.0f, 4, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IncreaseHorizontalSemanticsBounds$lambda$2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult IncreaseVerticalSemanticsBounds$lambda$4(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        int mo361roundToPx0680j_4 = measureScope.mo361roundToPx0680j_4(VerticalSemanticsBoundsPadding);
        long m7570unboximpl = constraints.m7570unboximpl();
        int i = mo361roundToPx0680j_4 * 2;
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(ConstraintsKt.m7583offsetNN6EwU(m7570unboximpl, 0, i));
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight() - i, null, new h1(mo361roundToPx0680j_4, 0, mo6234measureBRTryo0), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IncreaseVerticalSemanticsBounds$lambda$4$lambda$3(Placeable placeable, int i, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, -i, 0.0f, 4, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IncreaseVerticalSemanticsBounds$lambda$5(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return w01.a;
    }

    public static final float getHorizontalSemanticsBoundsPadding() {
        return HorizontalSemanticsBoundsPadding;
    }

    public static final Modifier getIncreaseHorizontalSemanticsBounds() {
        return IncreaseHorizontalSemanticsBounds;
    }

    public static final Modifier getIncreaseVerticalSemanticsBounds() {
        return IncreaseVerticalSemanticsBounds;
    }

    public static final float getVerticalSemanticsBoundsPadding() {
        return VerticalSemanticsBoundsPadding;
    }

    public static /* synthetic */ void getHorizontalSemanticsBoundsPadding$annotations() {
    }

    public static /* synthetic */ void getVerticalSemanticsBoundsPadding$annotations() {
    }
}
