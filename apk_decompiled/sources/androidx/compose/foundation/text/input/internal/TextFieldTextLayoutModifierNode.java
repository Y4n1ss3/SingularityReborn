package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.relocation.BringIntoViewRequesterNode;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import defpackage.h7;
import defpackage.my;
import defpackage.q10;
import defpackage.w01;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldTextLayoutModifierNode extends DelegatingNode implements LayoutModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private Map<AlignmentLine, Integer> baselineCache;
    private final BringIntoViewRequesterNode bringIntoViewRequesterNode;
    private boolean singleLine;
    private TextLayoutState textLayoutState;

    public TextFieldTextLayoutModifierNode(TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z, my myVar, KeyboardOptions keyboardOptions) {
        this.textLayoutState = textLayoutState;
        this.singleLine = z;
        this.bringIntoViewRequesterNode = (BringIntoViewRequesterNode) delegate(new BringIntoViewRequesterNode(textLayoutState.getBringIntoViewRequester()));
        this.textLayoutState.setOnTextLayout(myVar);
        TextLayoutState textLayoutState2 = this.textLayoutState;
        boolean z2 = this.singleLine;
        textLayoutState2.updateNonMeasureInputs(transformedTextFieldState, textStyle, z2, !z2, keyboardOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        TextLayoutResult m1351layoutWithNewMeasureInputshBUhpc = this.textLayoutState.m1351layoutWithNewMeasureInputshBUhpc(measureScope, measureScope.getLayoutDirection(), (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFontFamilyResolver()), j);
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.Companion.m7573fitPrioritizingWidthZbe2FdA((int) (m1351layoutWithNewMeasureInputshBUhpc.m7031getSizeYbymL2g() >> 32), (int) (m1351layoutWithNewMeasureInputshBUhpc.m7031getSizeYbymL2g() >> 32), (int) (m1351layoutWithNewMeasureInputshBUhpc.m7031getSizeYbymL2g() & 4294967295L), (int) (m1351layoutWithNewMeasureInputshBUhpc.m7031getSizeYbymL2g() & 4294967295L)));
        this.textLayoutState.m1352setMinHeightForSingleLineField0680j_4(this.singleLine ? measureScope.mo364toDpu2uoSUM(TextDelegateKt.ceilToIntPx(m1351layoutWithNewMeasureInputshBUhpc.getLineBottom(0))) : Dp.m7611constructorimpl(0.0f));
        Map<AlignmentLine, Integer> map = this.baselineCache;
        if (map == null) {
            map = new LinkedHashMap<>(2);
        }
        map.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(m1351layoutWithNewMeasureInputshBUhpc.getFirstBaseline())));
        map.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(m1351layoutWithNewMeasureInputshBUhpc.getLastBaseline())));
        this.baselineCache = map;
        int m7031getSizeYbymL2g = (int) (m1351layoutWithNewMeasureInputshBUhpc.m7031getSizeYbymL2g() >> 32);
        int m7031getSizeYbymL2g2 = (int) (m1351layoutWithNewMeasureInputshBUhpc.m7031getSizeYbymL2g() & 4294967295L);
        Map<AlignmentLine, Integer> map2 = this.baselineCache;
        map2.getClass();
        return measureScope.layout(m7031getSizeYbymL2g, m7031getSizeYbymL2g2, map2, new h7(11, mo6234measureBRTryo0));
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.textLayoutState.setTextLayoutNodeCoordinates(layoutCoordinates);
    }

    public final void updateNode(TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z, my myVar, KeyboardOptions keyboardOptions) {
        TextLayoutState textLayoutState2 = this.textLayoutState;
        this.textLayoutState = textLayoutState;
        textLayoutState.setOnTextLayout(myVar);
        this.singleLine = z;
        this.textLayoutState.updateNonMeasureInputs(transformedTextFieldState, textStyle, z, !z, keyboardOptions);
        if (q10.b(textLayoutState2, textLayoutState)) {
            return;
        }
        this.bringIntoViewRequesterNode.updateRequester(textLayoutState.getBringIntoViewRequester());
    }

    private static /* synthetic */ void getBaselineCache$annotations() {
    }
}
