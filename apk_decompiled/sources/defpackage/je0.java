package defpackage;

import android.content.Context;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.foundation.AndroidOverscroll_androidKt;
import androidx.compose.foundation.OverscrollFactory;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt;
import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.foundation.text.contextmenu.ProcessTextApi23Impl;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshDefaults;
import androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.retain.RetainedValuesStoreRegistry;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class je0 implements ky {
    public final /* synthetic */ int d;

    public /* synthetic */ je0(int i) {
        this.d = i;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        OverscrollFactory defaultOverscrollFactory;
        w01 measurePager_7L1iB3k$lambda$3;
        List processTextActivitiesQuery$lambda$0;
        w01 _get_linearIndeterminateFirstLineHeadAnimationSpec_$lambda$43;
        w01 _get_linearIndeterminateFirstLineTailAnimationSpec_$lambda$44;
        w01 _get_circularIndeterminateProgressAnimationSpec_$lambda$42;
        w01 _get_circularIndeterminateRotationAnimationSpec_$lambda$41;
        w01 _get_linearIndeterminateSecondLineHeadAnimationSpec_$lambda$45;
        w01 _get_linearIndeterminateSecondLineTailAnimationSpec_$lambda$46;
        w01 progressSemantics$lambda$1;
        w01 IndicatorBox_1CPYgEU$lambda$2$lambda$1;
        PullToRefreshStateImpl Saver$lambda$1;
        boolean ReceiveContentDragAndDropNode$lambda$0;
        boolean dispose$lambda$0;
        Object AutoSaver$lambda$1;
        TextLinkStyles TextLinkStylesSaver$lambda$1;
        AnnotatedString AnnotatedStringSaver$lambda$1;
        TextDecoration TextDecorationSaver$lambda$1;
        TextGeometricTransform TextGeometricTransformSaver$lambda$1;
        TextIndent TextIndentSaver$lambda$1;
        FontWeight FontWeightSaver$lambda$1;
        BaselineShift BaselineShiftSaver$lambda$1;
        TextRange TextRangeSaver$lambda$1;
        Shadow ShadowSaver$lambda$1;
        TextAlign TextAlignSaver$lambda$1;
        LinkAnnotation.Url LinkSaver$lambda$1;
        TextDirection TextDirectionSaver$lambda$1;
        Hyphens HyphensSaver$lambda$1;
        List AnnotationRangeListSaver$lambda$1;
        switch (this.d) {
            case 0:
                defaultOverscrollFactory = AndroidOverscroll_androidKt.defaultOverscrollFactory((CompositionLocalAccessorScope) obj);
                return defaultOverscrollFactory;
            case 1:
                measurePager_7L1iB3k$lambda$3 = PagerMeasureKt.measurePager_7L1iB3k$lambda$3((Placeable.PlacementScope) obj);
                return measurePager_7L1iB3k$lambda$3;
            case 2:
                processTextActivitiesQuery$lambda$0 = ProcessTextApi23Impl.processTextActivitiesQuery$lambda$0((Context) obj);
                return processTextActivitiesQuery$lambda$0;
            case 3:
                _get_linearIndeterminateFirstLineHeadAnimationSpec_$lambda$43 = ProgressIndicatorKt._get_linearIndeterminateFirstLineHeadAnimationSpec_$lambda$43((KeyframesSpec.KeyframesSpecConfig) obj);
                return _get_linearIndeterminateFirstLineHeadAnimationSpec_$lambda$43;
            case 4:
                _get_linearIndeterminateFirstLineTailAnimationSpec_$lambda$44 = ProgressIndicatorKt._get_linearIndeterminateFirstLineTailAnimationSpec_$lambda$44((KeyframesSpec.KeyframesSpecConfig) obj);
                return _get_linearIndeterminateFirstLineTailAnimationSpec_$lambda$44;
            case 5:
                _get_circularIndeterminateProgressAnimationSpec_$lambda$42 = ProgressIndicatorKt._get_circularIndeterminateProgressAnimationSpec_$lambda$42((KeyframesSpec.KeyframesSpecConfig) obj);
                return _get_circularIndeterminateProgressAnimationSpec_$lambda$42;
            case 6:
                _get_circularIndeterminateRotationAnimationSpec_$lambda$41 = ProgressIndicatorKt._get_circularIndeterminateRotationAnimationSpec_$lambda$41((KeyframesSpec.KeyframesSpecConfig) obj);
                return _get_circularIndeterminateRotationAnimationSpec_$lambda$41;
            case 7:
                _get_linearIndeterminateSecondLineHeadAnimationSpec_$lambda$45 = ProgressIndicatorKt._get_linearIndeterminateSecondLineHeadAnimationSpec_$lambda$45((KeyframesSpec.KeyframesSpecConfig) obj);
                return _get_linearIndeterminateSecondLineHeadAnimationSpec_$lambda$45;
            case 8:
                _get_linearIndeterminateSecondLineTailAnimationSpec_$lambda$46 = ProgressIndicatorKt._get_linearIndeterminateSecondLineTailAnimationSpec_$lambda$46((KeyframesSpec.KeyframesSpecConfig) obj);
                return _get_linearIndeterminateSecondLineTailAnimationSpec_$lambda$46;
            case 9:
                progressSemantics$lambda$1 = ProgressSemanticsKt.progressSemantics$lambda$1((SemanticsPropertyReceiver) obj);
                return progressSemantics$lambda$1;
            case 10:
                IndicatorBox_1CPYgEU$lambda$2$lambda$1 = PullToRefreshDefaults.IndicatorBox_1CPYgEU$lambda$2$lambda$1((ContentDrawScope) obj);
                return IndicatorBox_1CPYgEU$lambda$2$lambda$1;
            case 11:
                Saver$lambda$1 = PullToRefreshStateImpl.Saver$lambda$1(((Float) obj).floatValue());
                return Saver$lambda$1;
            case Matrix.TranslateX /* 12 */:
                ReceiveContentDragAndDropNode$lambda$0 = ReceiveContentDragAndDropNode_androidKt.ReceiveContentDragAndDropNode$lambda$0((DragAndDropEvent) obj);
                return Boolean.valueOf(ReceiveContentDragAndDropNode$lambda$0);
            case Matrix.TranslateY /* 13 */:
                dispose$lambda$0 = RetainedValuesStoreRegistry.dispose$lambda$0(obj);
                return Boolean.valueOf(dispose$lambda$0);
            case Matrix.TranslateZ /* 14 */:
                List list = (List) obj;
                list.getClass();
                return new sf0((a30) yi.p0(list));
            case 15:
                AutoSaver$lambda$1 = SaverKt.AutoSaver$lambda$1(obj);
                return AutoSaver$lambda$1;
            case 16:
                TextLinkStylesSaver$lambda$1 = SaversKt.TextLinkStylesSaver$lambda$1(obj);
                return TextLinkStylesSaver$lambda$1;
            case 17:
                AnnotatedStringSaver$lambda$1 = SaversKt.AnnotatedStringSaver$lambda$1(obj);
                return AnnotatedStringSaver$lambda$1;
            case 18:
                TextDecorationSaver$lambda$1 = SaversKt.TextDecorationSaver$lambda$1(obj);
                return TextDecorationSaver$lambda$1;
            case 19:
                TextGeometricTransformSaver$lambda$1 = SaversKt.TextGeometricTransformSaver$lambda$1(obj);
                return TextGeometricTransformSaver$lambda$1;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                TextIndentSaver$lambda$1 = SaversKt.TextIndentSaver$lambda$1(obj);
                return TextIndentSaver$lambda$1;
            case 21:
                FontWeightSaver$lambda$1 = SaversKt.FontWeightSaver$lambda$1(obj);
                return FontWeightSaver$lambda$1;
            case 22:
                BaselineShiftSaver$lambda$1 = SaversKt.BaselineShiftSaver$lambda$1(obj);
                return BaselineShiftSaver$lambda$1;
            case 23:
                TextRangeSaver$lambda$1 = SaversKt.TextRangeSaver$lambda$1(obj);
                return TextRangeSaver$lambda$1;
            case 24:
                ShadowSaver$lambda$1 = SaversKt.ShadowSaver$lambda$1(obj);
                return ShadowSaver$lambda$1;
            case RectListKt.BitOffsetForParentId /* 25 */:
                TextAlignSaver$lambda$1 = SaversKt.TextAlignSaver$lambda$1(obj);
                return TextAlignSaver$lambda$1;
            case 26:
                LinkSaver$lambda$1 = SaversKt.LinkSaver$lambda$1(obj);
                return LinkSaver$lambda$1;
            case 27:
                TextDirectionSaver$lambda$1 = SaversKt.TextDirectionSaver$lambda$1(obj);
                return TextDirectionSaver$lambda$1;
            case 28:
                HyphensSaver$lambda$1 = SaversKt.HyphensSaver$lambda$1(obj);
                return HyphensSaver$lambda$1;
            default:
                AnnotationRangeListSaver$lambda$1 = SaversKt.AnnotationRangeListSaver$lambda$1(obj);
                return AnnotationRangeListSaver$lambda$1;
        }
    }
}
