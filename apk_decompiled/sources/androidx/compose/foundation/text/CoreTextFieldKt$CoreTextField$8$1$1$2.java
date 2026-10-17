package androidx.compose.foundation.text;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import defpackage.ed;
import defpackage.kw0;
import defpackage.ky;
import defpackage.p80;
import defpackage.q10;
import defpackage.w01;
import defpackage.xe0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$8$1$1$2 implements MeasurePolicy {
    final /* synthetic */ Density $density;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ ky $onTextLayout;
    final /* synthetic */ LegacyTextFieldState $state;
    final /* synthetic */ TextFieldValue $value;

    public CoreTextFieldKt$CoreTextField$8$1$1$2(LegacyTextFieldState legacyTextFieldState, ky kyVar, TextFieldValue textFieldValue, OffsetMapping offsetMapping, Density density, int i) {
        this.$state = legacyTextFieldState;
        this.$onTextLayout = kyVar;
        this.$value = textFieldValue;
        this.$offsetMapping = offsetMapping;
        this.$density = density;
        this.$maxLines = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$2(Placeable.PlacementScope placementScope) {
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        this.$state.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
        return this.$state.getTextDelegate().getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Snapshot.Companion companion = Snapshot.Companion;
        LegacyTextFieldState legacyTextFieldState = this.$state;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
            TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
            kw0 m1180layout_EkL_Y$foundation = TextFieldDelegate.Companion.m1180layout_EkL_Y$foundation(this.$state.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
            int intValue = ((Number) m1180layout_EkL_Y$foundation.d).intValue();
            int intValue2 = ((Number) m1180layout_EkL_Y$foundation.e).intValue();
            TextLayoutResult textLayoutResult = (TextLayoutResult) m1180layout_EkL_Y$foundation.f;
            if (!q10.b(value, textLayoutResult)) {
                this.$state.setLayoutResult(new TextLayoutResultProxy(textLayoutResult, null, layoutResult != null ? layoutResult.getDecorationBoxCoordinates() : null, 2, null));
                this.$onTextLayout.invoke(textLayoutResult);
                CoreTextFieldKt.notifyFocusedRect(this.$state, this.$value, this.$offsetMapping);
            }
            this.$state.m1139setMinHeightForSingleLineField0680j_4(this.$density.mo364toDpu2uoSUM(this.$maxLines == 1 ? TextDelegateKt.ceilToIntPx(textLayoutResult.getLineBottom(0)) : 0));
            return measureScope.layout(intValue, intValue2, p80.M(new xe0(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(textLayoutResult.getFirstBaseline()))), new xe0(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(textLayoutResult.getLastBaseline())))), new ed(23));
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }
}
