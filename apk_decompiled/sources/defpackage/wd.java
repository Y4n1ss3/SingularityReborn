package defpackage;

import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.material3.BottomSheetDefaults;
import androidx.compose.material3.DatePickerDefaults;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.RectListKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class wd implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ wd(String str, int i) {
        this.d = i;
        this.e = str;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 TooltipPopup$lambda$1$0$0;
        w01 DragHandle_lgZ2HuY$lambda$1$lambda$0;
        w01 Canvas$lambda$1$0;
        w01 DatePickerHeadline_ISIPfiY$lambda$3$lambda$2;
        w01 Day$lambda$61$lambda$60;
        w01 Year$lambda$66$lambda$65;
        w01 Icon_ww6aTOc$lambda$5$lambda$4;
        w01 Image$lambda$0$0;
        w01 ModalBottomSheetContent_7___e2Q$lambda$21$lambda$20;
        w01 PermanentDrawerSheet_afqeVBk$lambda$48$lambda$47;
        w01 RangeSliderImpl$lambda$44$lambda$36$lambda$35;
        w01 RangeSliderImpl$lambda$44$lambda$41$lambda$40;
        w01 defaultErrorSemantics$lambda$22;
        w01 ClockText$lambda$83$lambda$82$lambda$81;
        w01 PeriodToggleImpl$lambda$41$lambda$40;
        w01 TimePickerTextField_1vLObsk$lambda$92$lambda$89$lambda$88$lambda$87;
        w01 TimeSelector_SAnMeKU$lambda$56$lambda$55;
        w01 ModalWideNavigationRailContent_pU6N4AM$lambda$18$lambda$17;
        int i = this.d;
        String str = this.e;
        switch (i) {
            case 0:
                TooltipPopup$lambda$1$0$0 = BasicTooltipKt.TooltipPopup$lambda$1$0$0(str, (SemanticsPropertyReceiver) obj);
                return TooltipPopup$lambda$1$0$0;
            case 1:
                DragHandle_lgZ2HuY$lambda$1$lambda$0 = BottomSheetDefaults.DragHandle_lgZ2HuY$lambda$1$lambda$0(str, (SemanticsPropertyReceiver) obj);
                return DragHandle_lgZ2HuY$lambda$1$lambda$0;
            case 2:
                Canvas$lambda$1$0 = CanvasKt.Canvas$lambda$1$0(str, (SemanticsPropertyReceiver) obj);
                return Canvas$lambda$1$0;
            case 3:
                return "echo \"" + str + "\" > " + ((String) obj);
            case 4:
                return "echo \"" + str + "\" > " + ((String) obj);
            case 5:
                return "echo \"" + str + "\" > " + ((String) obj);
            case 6:
                return "echo \"" + str + "\" > " + ((String) obj);
            case 7:
                return "echo \"" + str + "\" > " + ((String) obj);
            case 8:
                return "echo \"" + str + "\" > " + ((String) obj);
            case 9:
                return "echo \"" + str + "\" > " + ((zn) obj).a();
            case 10:
                DatePickerHeadline_ISIPfiY$lambda$3$lambda$2 = DatePickerDefaults.DatePickerHeadline_ISIPfiY$lambda$3$lambda$2(str, (SemanticsPropertyReceiver) obj);
                return DatePickerHeadline_ISIPfiY$lambda$3$lambda$2;
            case 11:
                Day$lambda$61$lambda$60 = DatePickerKt.Day$lambda$61$lambda$60(str, (SemanticsPropertyReceiver) obj);
                return Day$lambda$61$lambda$60;
            case Matrix.TranslateX /* 12 */:
                Year$lambda$66$lambda$65 = DatePickerKt.Year$lambda$66$lambda$65(str, (SemanticsPropertyReceiver) obj);
                return Year$lambda$66$lambda$65;
            case Matrix.TranslateY /* 13 */:
                return "echo $rpm > " + ((fv) obj).b + "/" + str + " 2>/dev/null";
            case Matrix.TranslateZ /* 14 */:
                return "echo " + str + " > /sys/class/thermal/thermal_zone" + ((Integer) obj).intValue() + "/mode 2>/dev/null";
            case 15:
                Icon_ww6aTOc$lambda$5$lambda$4 = IconKt.Icon_ww6aTOc$lambda$5$lambda$4(str, (SemanticsPropertyReceiver) obj);
                return Icon_ww6aTOc$lambda$5$lambda$4;
            case 16:
                Image$lambda$0$0 = ImageKt.Image$lambda$0$0(str, (SemanticsPropertyReceiver) obj);
                return Image$lambda$0$0;
            case 17:
                ModalBottomSheetContent_7___e2Q$lambda$21$lambda$20 = ModalBottomSheetKt.ModalBottomSheetContent_7___e2Q$lambda$21$lambda$20(str, (SemanticsPropertyReceiver) obj);
                return ModalBottomSheetContent_7___e2Q$lambda$21$lambda$20;
            case 18:
                PermanentDrawerSheet_afqeVBk$lambda$48$lambda$47 = NavigationDrawerKt.PermanentDrawerSheet_afqeVBk$lambda$48$lambda$47(str, (SemanticsPropertyReceiver) obj);
                return PermanentDrawerSheet_afqeVBk$lambda$48$lambda$47;
            case 19:
                RangeSliderImpl$lambda$44$lambda$36$lambda$35 = SliderKt.RangeSliderImpl$lambda$44$lambda$36$lambda$35(str, (SemanticsPropertyReceiver) obj);
                return RangeSliderImpl$lambda$44$lambda$36$lambda$35;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                RangeSliderImpl$lambda$44$lambda$41$lambda$40 = SliderKt.RangeSliderImpl$lambda$44$lambda$41$lambda$40(str, (SemanticsPropertyReceiver) obj);
                return RangeSliderImpl$lambda$44$lambda$41$lambda$40;
            case 21:
                defaultErrorSemantics$lambda$22 = TextFieldImplKt.defaultErrorSemantics$lambda$22(str, (SemanticsPropertyReceiver) obj);
                return defaultErrorSemantics$lambda$22;
            case 22:
                ClockText$lambda$83$lambda$82$lambda$81 = TimePickerKt.ClockText$lambda$83$lambda$82$lambda$81(str, (SemanticsPropertyReceiver) obj);
                return ClockText$lambda$83$lambda$82$lambda$81;
            case 23:
                PeriodToggleImpl$lambda$41$lambda$40 = TimePickerKt.PeriodToggleImpl$lambda$41$lambda$40(str, (SemanticsPropertyReceiver) obj);
                return PeriodToggleImpl$lambda$41$lambda$40;
            case 24:
                TimePickerTextField_1vLObsk$lambda$92$lambda$89$lambda$88$lambda$87 = TimePickerKt.TimePickerTextField_1vLObsk$lambda$92$lambda$89$lambda$88$lambda$87(str, (SemanticsPropertyReceiver) obj);
                return TimePickerTextField_1vLObsk$lambda$92$lambda$89$lambda$88$lambda$87;
            case RectListKt.BitOffsetForParentId /* 25 */:
                TimeSelector_SAnMeKU$lambda$56$lambda$55 = TimePickerKt.TimeSelector_SAnMeKU$lambda$56$lambda$55(str, (SemanticsPropertyReceiver) obj);
                return TimeSelector_SAnMeKU$lambda$56$lambda$55;
            default:
                ModalWideNavigationRailContent_pU6N4AM$lambda$18$lambda$17 = WideNavigationRailKt.ModalWideNavigationRailContent_pU6N4AM$lambda$18$lambda$17(str, (SemanticsPropertyReceiver) obj);
                return ModalWideNavigationRailContent_pU6N4AM$lambda$18$lambda$17;
        }
    }
}
