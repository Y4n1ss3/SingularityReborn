package androidx.compose.material3;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.ji0;
import defpackage.ky;
import defpackage.w01;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invoke$lambda$0;
        w01 invoke$lambda$1$lambda$0;
        w01 measure_3p2s80s$lambda$5;
        w01 invoke$lambda$02;
        DisposableEffectResult ModalBottomSheetDialog_sW7UJKQ$lambda$8$lambda$7;
        w01 measure_3p2s80s$lambda$6$lambda$5;
        w01 invoke$lambda$03;
        boolean invoke$lambda$2$lambda$1$lambda$0;
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                invoke$lambda$0 = ClockDialNode$pointerInputTapNode$1.invoke$lambda$0((ClockDialNode) obj2, (Offset) obj);
                return invoke$lambda$0;
            case 1:
                invoke$lambda$1$lambda$0 = DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1.invoke$lambda$1$lambda$0((List) obj2, (SemanticsPropertyReceiver) obj);
                return invoke$lambda$1$lambda$0;
            case 2:
                measure_3p2s80s$lambda$5 = EqualWeightContentMeasurePolicy.measure_3p2s80s$lambda$5((ArrayList) obj2, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$5;
            case 3:
                invoke$lambda$02 = LabelKt$Label$wrappedContent$1.invoke$lambda$0((ji0) obj2, (LayoutCoordinates) obj);
                return invoke$lambda$02;
            case 4:
                ModalBottomSheetDialog_sW7UJKQ$lambda$8$lambda$7 = ModalBottomSheet_androidKt.ModalBottomSheetDialog_sW7UJKQ$lambda$8$lambda$7((ModalBottomSheetDialogWrapper) obj2, (DisposableEffectScope) obj);
                return ModalBottomSheetDialog_sW7UJKQ$lambda$8$lambda$7;
            case 5:
                measure_3p2s80s$lambda$6$lambda$5 = SearchBarKt$FullScreenSearchBarLayout$2$1.measure_3p2s80s$lambda$6$lambda$5((SearchBarState) obj2, (GraphicsLayerScope) obj);
                return measure_3p2s80s$lambda$6$lambda$5;
            case 6:
                invoke$lambda$03 = SliderKt$sliderTapModifier$1.invoke$lambda$0((SliderState) obj2, (Offset) obj);
                return invoke$lambda$03;
            default:
                invoke$lambda$2$lambda$1$lambda$0 = SnackbarHostKt$FadeInFadeOutWithScale$1$1.invoke$lambda$2$lambda$1$lambda$0((SnackbarData) obj2, (FadeInFadeOutAnimationItem) obj);
                return Boolean.valueOf(invoke$lambda$2$lambda$1$lambda$0);
        }
    }
}
