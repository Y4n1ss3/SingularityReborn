package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Dp;
import defpackage.vt;
import defpackage.w01;
import defpackage.x00;
import defpackage.y80;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MinimumInteractiveModifierNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutModifierNode {
    public static final int $stable = 8;
    private Map<AlignmentLine, Integer> alignmentLinesCache;

    private final Map<AlignmentLine, Integer> getAlignmentLinesCache() {
        Map<AlignmentLine, Integer> map = this.alignmentLinesCache;
        if (map != null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        this.alignmentLinesCache = linkedHashMap;
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(int i, Placeable placeable, int i2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, y80.P((i - placeable.getWidth()) / 2.0f), y80.P((i2 - placeable.getHeight()) / 2.0f), 0.0f, 4, null);
        return w01.a;
    }

    private final void updateAlignmentLines(int i, Placeable placeable) {
        Map<AlignmentLine, Integer> alignmentLinesCache = getAlignmentLinesCache();
        VerticalAlignmentLine minimumInteractiveLeftAlignmentLine = InteractiveComponentSizeKt.getMinimumInteractiveLeftAlignmentLine();
        int round = Math.round((i - placeable.getWidth()) / 2.0f);
        if (round < 0) {
            round = 0;
        }
        alignmentLinesCache.put(minimumInteractiveLeftAlignmentLine, Integer.valueOf(round));
        HorizontalAlignmentLine minimumInteractiveTopAlignmentLine = InteractiveComponentSizeKt.getMinimumInteractiveTopAlignmentLine();
        int round2 = Math.round((i - placeable.getHeight()) / 2.0f);
        alignmentLinesCache.put(minimumInteractiveTopAlignmentLine, Integer.valueOf(round2 >= 0 ? round2 : 0));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        float m7625unboximpl = ((Dp) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m7625unboximpl();
        float m7611constructorimpl = Dp.m7611constructorimpl(0.0f);
        if (m7625unboximpl < m7611constructorimpl) {
            m7625unboximpl = m7611constructorimpl;
        }
        float m7611constructorimpl2 = Dp.m7611constructorimpl(m7625unboximpl);
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
        boolean z = isAttached() && !Float.isNaN(m7611constructorimpl2) && Dp.m7610compareTo0680j_4(m7611constructorimpl2, Dp.m7611constructorimpl(0.0f)) > 0;
        int mo361roundToPx0680j_4 = Float.isNaN(m7611constructorimpl2) ? 0 : measureScope.mo361roundToPx0680j_4(m7611constructorimpl2);
        int max = z ? Math.max(mo6234measureBRTryo0.getWidth(), mo361roundToPx0680j_4) : mo6234measureBRTryo0.getWidth();
        int max2 = z ? Math.max(mo6234measureBRTryo0.getHeight(), mo361roundToPx0680j_4) : mo6234measureBRTryo0.getHeight();
        if (z) {
            updateAlignmentLines(mo361roundToPx0680j_4, mo6234measureBRTryo0);
        }
        Map<AlignmentLine, Integer> map = this.alignmentLinesCache;
        if (map == null) {
            map = vt.d;
        }
        return measureScope.layout(max, max2, map, new x00(max, max2, mo6234measureBRTryo0));
    }
}
