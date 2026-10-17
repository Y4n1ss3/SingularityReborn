package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class n30 implements my {
    public final /* synthetic */ int d;

    public /* synthetic */ n30(int i) {
        this.d = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        GridItemSpan DefaultSpan$lambda$0;
        List Saver$lambda$0;
        List saver$lambda$2;
        List saver$lambda$0;
        List Saver$lambda$02;
        List saver$lambda$02;
        List saver$lambda$22;
        List Saver$lambda$03;
        Float Saver$lambda$04;
        List Saver$lambda$05;
        Object AutoSaver$lambda$0;
        Object AnnotatedStringSaver$lambda$0;
        Object TextDecorationSaver$lambda$0;
        Object TextGeometricTransformSaver$lambda$0;
        Object TextIndentSaver$lambda$0;
        Object FontWeightSaver$lambda$0;
        Object LinkSaver$lambda$0;
        Object BaselineShiftSaver$lambda$0;
        Object AnnotationRangeListSaver$lambda$0;
        Object TextRangeSaver$lambda$0;
        Object ShadowSaver$lambda$0;
        Object TextAlignSaver$lambda$0;
        Object TextDirectionSaver$lambda$0;
        Object HyphensSaver$lambda$0;
        Object FontStyleSaver$lambda$0;
        Object FontSynthesisSaver$lambda$0;
        Object TextUnitSaver$lambda$0;
        Object ClickableSaver$lambda$0;
        Object TextUnitTypeSaver$lambda$0;
        switch (this.d) {
            case 0:
                DefaultSpan$lambda$0 = LazyGridIntervalContent.DefaultSpan$lambda$0((LazyGridItemSpanScope) obj, ((Integer) obj2).intValue());
                return DefaultSpan$lambda$0;
            case 1:
                Saver$lambda$0 = LazyGridState.Saver$lambda$0((SaverScope) obj, (LazyGridState) obj2);
                return Saver$lambda$0;
            case 2:
                saver$lambda$2 = LazyGridState.Companion.saver$lambda$2((SaverScope) obj, (LazyGridState) obj2);
                return saver$lambda$2;
            case 3:
                saver$lambda$0 = LazyGridState.Companion.saver$lambda$0((SaverScope) obj, (LazyGridState) obj2);
                return saver$lambda$0;
            case 4:
                Saver$lambda$02 = LazyListState.Saver$lambda$0((SaverScope) obj, (LazyListState) obj2);
                return Saver$lambda$02;
            case 5:
                saver$lambda$02 = LazyListState.Companion.saver$lambda$0((SaverScope) obj, (LazyListState) obj2);
                return saver$lambda$02;
            case 6:
                saver$lambda$22 = LazyListState.Companion.saver$lambda$2((SaverScope) obj, (LazyListState) obj2);
                return saver$lambda$22;
            case 7:
                Saver$lambda$03 = LazyStaggeredGridState.Saver$lambda$0((SaverScope) obj, (LazyStaggeredGridState) obj2);
                return Saver$lambda$03;
            case 8:
                Saver$lambda$04 = PullToRefreshStateImpl.Saver$lambda$0((SaverScope) obj, (PullToRefreshStateImpl) obj2);
                return Saver$lambda$04;
            case 9:
                Saver$lambda$05 = RangeSliderState.Companion.Saver$lambda$0((SaverScope) obj, (RangeSliderState) obj2);
                return Saver$lambda$05;
            case 10:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 11:
                AutoSaver$lambda$0 = SaverKt.AutoSaver$lambda$0((SaverScope) obj, obj2);
                return AutoSaver$lambda$0;
            case Matrix.TranslateX /* 12 */:
                AnnotatedStringSaver$lambda$0 = SaversKt.AnnotatedStringSaver$lambda$0((SaverScope) obj, (AnnotatedString) obj2);
                return AnnotatedStringSaver$lambda$0;
            case Matrix.TranslateY /* 13 */:
                TextDecorationSaver$lambda$0 = SaversKt.TextDecorationSaver$lambda$0((SaverScope) obj, (TextDecoration) obj2);
                return TextDecorationSaver$lambda$0;
            case Matrix.TranslateZ /* 14 */:
                TextGeometricTransformSaver$lambda$0 = SaversKt.TextGeometricTransformSaver$lambda$0((SaverScope) obj, (TextGeometricTransform) obj2);
                return TextGeometricTransformSaver$lambda$0;
            case 15:
                TextIndentSaver$lambda$0 = SaversKt.TextIndentSaver$lambda$0((SaverScope) obj, (TextIndent) obj2);
                return TextIndentSaver$lambda$0;
            case 16:
                FontWeightSaver$lambda$0 = SaversKt.FontWeightSaver$lambda$0((SaverScope) obj, (FontWeight) obj2);
                return FontWeightSaver$lambda$0;
            case 17:
                LinkSaver$lambda$0 = SaversKt.LinkSaver$lambda$0((SaverScope) obj, (LinkAnnotation.Url) obj2);
                return LinkSaver$lambda$0;
            case 18:
                BaselineShiftSaver$lambda$0 = SaversKt.BaselineShiftSaver$lambda$0((SaverScope) obj, (BaselineShift) obj2);
                return BaselineShiftSaver$lambda$0;
            case 19:
                AnnotationRangeListSaver$lambda$0 = SaversKt.AnnotationRangeListSaver$lambda$0((SaverScope) obj, (List) obj2);
                return AnnotationRangeListSaver$lambda$0;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                TextRangeSaver$lambda$0 = SaversKt.TextRangeSaver$lambda$0((SaverScope) obj, (TextRange) obj2);
                return TextRangeSaver$lambda$0;
            case 21:
                ShadowSaver$lambda$0 = SaversKt.ShadowSaver$lambda$0((SaverScope) obj, (Shadow) obj2);
                return ShadowSaver$lambda$0;
            case 22:
                TextAlignSaver$lambda$0 = SaversKt.TextAlignSaver$lambda$0((SaverScope) obj, (TextAlign) obj2);
                return TextAlignSaver$lambda$0;
            case 23:
                TextDirectionSaver$lambda$0 = SaversKt.TextDirectionSaver$lambda$0((SaverScope) obj, (TextDirection) obj2);
                return TextDirectionSaver$lambda$0;
            case 24:
                HyphensSaver$lambda$0 = SaversKt.HyphensSaver$lambda$0((SaverScope) obj, (Hyphens) obj2);
                return HyphensSaver$lambda$0;
            case RectListKt.BitOffsetForParentId /* 25 */:
                FontStyleSaver$lambda$0 = SaversKt.FontStyleSaver$lambda$0((SaverScope) obj, (FontStyle) obj2);
                return FontStyleSaver$lambda$0;
            case 26:
                FontSynthesisSaver$lambda$0 = SaversKt.FontSynthesisSaver$lambda$0((SaverScope) obj, (FontSynthesis) obj2);
                return FontSynthesisSaver$lambda$0;
            case 27:
                TextUnitSaver$lambda$0 = SaversKt.TextUnitSaver$lambda$0((SaverScope) obj, (TextUnit) obj2);
                return TextUnitSaver$lambda$0;
            case 28:
                ClickableSaver$lambda$0 = SaversKt.ClickableSaver$lambda$0((SaverScope) obj, (LinkAnnotation.Clickable) obj2);
                return ClickableSaver$lambda$0;
            default:
                TextUnitTypeSaver$lambda$0 = SaversKt.TextUnitTypeSaver$lambda$0((SaverScope) obj, (TextUnitType) obj2);
                return TextUnitTypeSaver$lambda$0;
        }
    }
}
