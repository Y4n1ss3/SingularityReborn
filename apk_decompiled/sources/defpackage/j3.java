package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DragHandleKt;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.spatial.RectListKt;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class j3 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;

    public /* synthetic */ j3(MutableState mutableState, int i) {
        this.d = i;
        this.e = mutableState;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        LayoutCoordinates ProvidePlatformTextContextMenuToolbar$lambda$4$0;
        LayoutCoordinates ProvideBasicTextContextMenu$lambda$4$1$0$0;
        List LayoutWithLinksAndInlineContent_11Od_4g$lambda$9$0;
        w01 DatePickerContent$lambda$36$lambda$33$lambda$32;
        w01 VerticalDragHandle$lambda$6$lambda$5;
        w01 VerticalDragHandle$lambda$8$lambda$7;
        w01 ExposedDropdownMenu_vNxi1II$lambda$2$lambda$1;
        LayoutCoordinates ProvideBothDefaultProviders$lambda$3$0;
        LayoutCoordinates TooltipBox$lambda$4$lambda$3;
        boolean Scrim_3J_VO9M$lambda$33$lambda$32$lambda$31;
        int i = this.d;
        w01 w01Var = w01.a;
        MutableState mutableState = this.e;
        switch (i) {
            case 0:
                mutableState.setValue(Boolean.FALSE);
                return w01Var;
            case 1:
                ProvidePlatformTextContextMenuToolbar$lambda$4$0 = AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar$lambda$4$0(mutableState);
                return ProvidePlatformTextContextMenuToolbar$lambda$4$0;
            case 2:
                mutableState.setValue(Boolean.FALSE);
                return w01Var;
            case 3:
                mutableState.setValue(Boolean.FALSE);
                return w01Var;
            case 4:
                mutableState.setValue(Boolean.FALSE);
                return w01Var;
            case 5:
                ProvideBasicTextContextMenu$lambda$4$1$0$0 = BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu$lambda$4$1$0$0(mutableState);
                return ProvideBasicTextContextMenu$lambda$4$1$0$0;
            case 6:
                LayoutWithLinksAndInlineContent_11Od_4g$lambda$9$0 = BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$9$0(mutableState);
                return LayoutWithLinksAndInlineContent_11Od_4g$lambda$9$0;
            case 7:
                DatePickerContent$lambda$36$lambda$33$lambda$32 = DatePickerKt.DatePickerContent$lambda$36$lambda$33$lambda$32(mutableState);
                return DatePickerContent$lambda$36$lambda$33$lambda$32;
            case 8:
                VerticalDragHandle$lambda$6$lambda$5 = DragHandleKt.VerticalDragHandle$lambda$6$lambda$5(mutableState);
                return VerticalDragHandle$lambda$6$lambda$5;
            case 9:
                VerticalDragHandle$lambda$8$lambda$7 = DragHandleKt.VerticalDragHandle$lambda$8$lambda$7(mutableState);
                return VerticalDragHandle$lambda$8$lambda$7;
            case 10:
                ExposedDropdownMenu_vNxi1II$lambda$2$lambda$1 = ExposedDropdownMenuBoxScope.ExposedDropdownMenu_vNxi1II$lambda$2$lambda$1(mutableState);
                return ExposedDropdownMenu_vNxi1II$lambda$2$lambda$1;
            case 11:
                mutableState.setValue(Boolean.FALSE);
                return w01Var;
            case Matrix.TranslateX /* 12 */:
                mutableState.setValue(Boolean.FALSE);
                return w01Var;
            case Matrix.TranslateY /* 13 */:
                mutableState.setValue(Boolean.FALSE);
                return w01Var;
            case Matrix.TranslateZ /* 14 */:
                mutableState.setValue(Boolean.TRUE);
                return w01Var;
            case 15:
                mutableState.setValue(Boolean.TRUE);
                return w01Var;
            case 16:
                mutableState.setValue(Boolean.TRUE);
                return w01Var;
            case 17:
                ProvideBothDefaultProviders$lambda$3$0 = PlatformDefaultTextContextMenuProviders_androidKt.ProvideBothDefaultProviders$lambda$3$0(mutableState);
                return ProvideBothDefaultProviders$lambda$3$0;
            case 18:
                TooltipBox$lambda$4$lambda$3 = TooltipKt.TooltipBox$lambda$4$lambda$3(mutableState);
                return TooltipBox$lambda$4$lambda$3;
            case 19:
                mutableState.setValue(Boolean.TRUE);
                return w01Var;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                mutableState.setValue(Boolean.FALSE);
                return w01Var;
            case 21:
                mutableState.setValue(null);
                return w01Var;
            case 22:
                mutableState.setValue(Boolean.TRUE);
                return w01Var;
            case 23:
                mutableState.setValue(Boolean.FALSE);
                return w01Var;
            case 24:
                mutableState.setValue(Boolean.TRUE);
                return w01Var;
            case RectListKt.BitOffsetForParentId /* 25 */:
                mutableState.setValue(Boolean.FALSE);
                return w01Var;
            default:
                Scrim_3J_VO9M$lambda$33$lambda$32$lambda$31 = WideNavigationRailKt.Scrim_3J_VO9M$lambda$33$lambda$32$lambda$31(mutableState);
                return Boolean.valueOf(Scrim_3J_VO9M$lambda$33$lambda$32$lambda$31);
        }
    }
}
