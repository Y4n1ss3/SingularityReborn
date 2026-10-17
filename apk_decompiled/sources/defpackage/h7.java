package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsProviderModifierNode;
import androidx.compose.foundation.text.TextFieldSizeKt;
import androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifierNode;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.ClockFaceSizeModifier;
import androidx.compose.material3.DragHandleKt;
import androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.Placeable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class h7 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Placeable e;

    public /* synthetic */ h7(int i, Placeable placeable) {
        this.d = i;
        this.e = placeable;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 BottomAppBarLayout_t5fmz9U$lambda$23$lambda$22$lambda$21;
        w01 badgeBounds$lambda$7$lambda$6;
        w01 measure_3p2s80s$lambda$0;
        w01 VerticalDragHandle$lambda$13$lambda$12$lambda$11;
        w01 exposedDropdownSize$lambda$3$lambda$2;
        w01 measure_3p2s80s$lambda$02;
        w01 TrackImpl_xlyIBlM$lambda$44$lambda$43$lambda$42;
        w01 TrackImpl_VvwgllI$lambda$29$lambda$28$lambda$27;
        w01 measure_3p2s80s$lambda$0$0;
        w01 textFieldLabelMinHeight$lambda$26$lambda$25;
        w01 textFieldMinSize$lambda$0$4$0$0;
        w01 measure_3p2s80s$lambda$03;
        w01 measure_3p2s80s$lambda$0$02;
        w01 layoutCaret_J5j9r9c$lambda$22$lambda$21;
        int i = this.d;
        Placeable placeable = this.e;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                BottomAppBarLayout_t5fmz9U$lambda$23$lambda$22$lambda$21 = AppBarKt.BottomAppBarLayout_t5fmz9U$lambda$23$lambda$22$lambda$21(placeable, placementScope);
                return BottomAppBarLayout_t5fmz9U$lambda$23$lambda$22$lambda$21;
            case 1:
                badgeBounds$lambda$7$lambda$6 = BadgeKt.badgeBounds$lambda$7$lambda$6(placeable, placementScope);
                return badgeBounds$lambda$7$lambda$6;
            case 2:
                measure_3p2s80s$lambda$0 = ClockFaceSizeModifier.measure_3p2s80s$lambda$0(placeable, placementScope);
                return measure_3p2s80s$lambda$0;
            case 3:
                VerticalDragHandle$lambda$13$lambda$12$lambda$11 = DragHandleKt.VerticalDragHandle$lambda$13$lambda$12$lambda$11(placeable, placementScope);
                return VerticalDragHandle$lambda$13$lambda$12$lambda$11;
            case 4:
                exposedDropdownSize$lambda$3$lambda$2 = ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1.exposedDropdownSize$lambda$3$lambda$2(placeable, placementScope);
                return exposedDropdownSize$lambda$3$lambda$2;
            case 5:
                measure_3p2s80s$lambda$02 = LazyLayoutBeyondBoundsProviderModifierNode.measure_3p2s80s$lambda$0(placeable, placementScope);
                return measure_3p2s80s$lambda$02;
            case 6:
                TrackImpl_xlyIBlM$lambda$44$lambda$43$lambda$42 = SliderDefaults.TrackImpl_xlyIBlM$lambda$44$lambda$43$lambda$42(placeable, placementScope);
                return TrackImpl_xlyIBlM$lambda$44$lambda$43$lambda$42;
            case 7:
                TrackImpl_VvwgllI$lambda$29$lambda$28$lambda$27 = SliderDefaults.TrackImpl_VvwgllI$lambda$29$lambda$28$lambda$27(placeable, placementScope);
                return TrackImpl_VvwgllI$lambda$29$lambda$28$lambda$27;
            case 8:
                measure_3p2s80s$lambda$0$0 = TextAnnotatedStringNode.measure_3p2s80s$lambda$0$0(placeable, placementScope);
                return measure_3p2s80s$lambda$0$0;
            case 9:
                textFieldLabelMinHeight$lambda$26$lambda$25 = TextFieldImplKt.textFieldLabelMinHeight$lambda$26$lambda$25(placeable, placementScope);
                return textFieldLabelMinHeight$lambda$26$lambda$25;
            case 10:
                textFieldMinSize$lambda$0$4$0$0 = TextFieldSizeKt.textFieldMinSize$lambda$0$4$0$0(placeable, placementScope);
                return textFieldMinSize$lambda$0$4$0$0;
            case 11:
                measure_3p2s80s$lambda$03 = TextFieldTextLayoutModifierNode.measure_3p2s80s$lambda$0(placeable, placementScope);
                return measure_3p2s80s$lambda$03;
            case Matrix.TranslateX /* 12 */:
                measure_3p2s80s$lambda$0$02 = TextStringSimpleNode.measure_3p2s80s$lambda$0$0(placeable, placementScope);
                return measure_3p2s80s$lambda$0$02;
            default:
                layoutCaret_J5j9r9c$lambda$22$lambda$21 = TooltipKt.layoutCaret_J5j9r9c$lambda$22$lambda$21(placeable, placementScope);
                return layoutCaret_J5j9r9c$lambda$22$lambda$21;
        }
    }
}
