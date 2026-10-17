package defpackage;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.Draggable2DElement;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DateRangePickerKt;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.DrawerValue;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.unit.Velocity;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class qo implements ky {
    public final /* synthetic */ int d;

    public /* synthetic */ qo(int i) {
        this.d = i;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$15;
        int SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$18;
        w01 SwitchableDateEntryContent_KaiTk9E$lambda$14$lambda$13;
        w01 DateEntryContainer_au3_HiA$lambda$8$lambda$7;
        w01 SwitchableDateEntryContent_eVtQiho$lambda$8$lambda$7;
        w01 SingleRowTopAppBar$lambda$9$lambda$8;
        w01 TwoRowsTopAppBar$lambda$20$lambda$19;
        w01 detectHorizontalDragGestures$lambda$0;
        w01 detectDragGesturesAfterLongPress$lambda$0;
        w01 detectDragGestures$lambda$0;
        w01 detectVerticalDragGestures$lambda$0;
        w01 detectDragGestures$lambda$7;
        boolean CanDrag$lambda$0;
        w01 NoOpOnDragStart$lambda$0;
        w01 NoOpOnDragStop$lambda$0;
        boolean CanDrag$lambda$02;
        boolean _init_$lambda$0;
        float anchoredDraggableState$lambda$1;
        w01 FloatingActionButton_lF_WlFE$lambda$3$lambda$2;
        w01 preload$lambda$1$0;
        w01 preload$lambda$1$1;
        w01 preload$lambda$3$0;
        w01 _init_$lambda$02;
        switch (this.d) {
            case 0:
                zn znVar = (zn) obj;
                return znVar.a + "=cpu" + znVar.b;
            case 1:
                SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$15 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$15(((Integer) obj).intValue());
                return Integer.valueOf(SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$15);
            case 2:
                SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$18 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$18(((Integer) obj).intValue());
                return Integer.valueOf(SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$18);
            case 3:
                SwitchableDateEntryContent_KaiTk9E$lambda$14$lambda$13 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$14$lambda$13((SemanticsPropertyReceiver) obj);
                return SwitchableDateEntryContent_KaiTk9E$lambda$14$lambda$13;
            case 4:
                DateEntryContainer_au3_HiA$lambda$8$lambda$7 = DatePickerKt.DateEntryContainer_au3_HiA$lambda$8$lambda$7((SemanticsPropertyReceiver) obj);
                return DateEntryContainer_au3_HiA$lambda$8$lambda$7;
            case 5:
                SwitchableDateEntryContent_eVtQiho$lambda$8$lambda$7 = DateRangePickerKt.SwitchableDateEntryContent_eVtQiho$lambda$8$lambda$7((SemanticsPropertyReceiver) obj);
                return SwitchableDateEntryContent_eVtQiho$lambda$8$lambda$7;
            case 6:
                SingleRowTopAppBar$lambda$9$lambda$8 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$9$lambda$8((SemanticsPropertyReceiver) obj);
                return SingleRowTopAppBar$lambda$9$lambda$8;
            case 7:
                TwoRowsTopAppBar$lambda$20$lambda$19 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$20$lambda$19((SemanticsPropertyReceiver) obj);
                return TwoRowsTopAppBar$lambda$20$lambda$19;
            case 8:
                detectHorizontalDragGestures$lambda$0 = DragGestureDetectorKt.detectHorizontalDragGestures$lambda$0((Offset) obj);
                return detectHorizontalDragGestures$lambda$0;
            case 9:
                detectDragGesturesAfterLongPress$lambda$0 = DragGestureDetectorKt.detectDragGesturesAfterLongPress$lambda$0((Offset) obj);
                return detectDragGesturesAfterLongPress$lambda$0;
            case 10:
                detectDragGestures$lambda$0 = DragGestureDetectorKt.detectDragGestures$lambda$0((Offset) obj);
                return detectDragGestures$lambda$0;
            case 11:
                detectVerticalDragGestures$lambda$0 = DragGestureDetectorKt.detectVerticalDragGestures$lambda$0((Offset) obj);
                return detectVerticalDragGestures$lambda$0;
            case Matrix.TranslateX /* 12 */:
                detectDragGestures$lambda$7 = DragGestureDetectorKt.detectDragGestures$lambda$7((PointerInputChange) obj);
                return detectDragGestures$lambda$7;
            case Matrix.TranslateY /* 13 */:
                CanDrag$lambda$0 = Draggable2DElement.CanDrag$lambda$0((PointerType) obj);
                return Boolean.valueOf(CanDrag$lambda$0);
            case Matrix.TranslateZ /* 14 */:
                NoOpOnDragStart$lambda$0 = Draggable2DKt.NoOpOnDragStart$lambda$0((Offset) obj);
                return NoOpOnDragStart$lambda$0;
            case 15:
                NoOpOnDragStop$lambda$0 = Draggable2DKt.NoOpOnDragStop$lambda$0((Velocity) obj);
                return NoOpOnDragStop$lambda$0;
            case 16:
                CanDrag$lambda$02 = DraggableElement.CanDrag$lambda$0((PointerType) obj);
                return Boolean.valueOf(CanDrag$lambda$02);
            case 17:
                _init_$lambda$0 = DrawerState._init_$lambda$0((DrawerValue) obj);
                return Boolean.valueOf(_init_$lambda$0);
            case 18:
                anchoredDraggableState$lambda$1 = DrawerState.anchoredDraggableState$lambda$1(((Float) obj).floatValue());
                return Float.valueOf(anchoredDraggableState$lambda$1);
            case 19:
                return Boolean.valueOf(ks0.c0((String) obj, "ZONE:", false));
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return ks0.e0(ds0.E0(ds0.t0((String) obj, "ZONE:")).toString());
            case 21:
                return Boolean.valueOf(ks0.c0((String) obj, "HWMON:", false));
            case 22:
                List w0 = ds0.w0(ds0.t0((String) obj, "HWMON:"), new String[]{":"});
                if (w0.size() < 2) {
                    return null;
                }
                return new fv(ks0.Z((String) w0.get(1), "@1", false) ? "fan_1" : "fan_0", (String) w0.get(0));
            case 23:
                return j50.i(((Integer) obj).intValue(), "echo disabled > /sys/class/thermal/thermal_zone", "/mode 2>/dev/null");
            case 24:
                return j50.i(((Integer) obj).intValue(), "echo enabled > /sys/class/thermal/thermal_zone", "/mode 2>/dev/null");
            case RectListKt.BitOffsetForParentId /* 25 */:
                FloatingActionButton_lF_WlFE$lambda$3$lambda$2 = FloatingActionButtonKt.FloatingActionButton_lF_WlFE$lambda$3$lambda$2((SemanticsPropertyReceiver) obj);
                return FloatingActionButton_lF_WlFE$lambda$3$lambda$2;
            case 26:
                preload$lambda$1$0 = FontFamilyResolverImpl.preload$lambda$1$0((TypefaceResult.Immutable) obj);
                return preload$lambda$1$0;
            case 27:
                preload$lambda$1$1 = FontFamilyResolverImpl.preload$lambda$1$1((TypefaceResult.Immutable) obj);
                return preload$lambda$1$1;
            case 28:
                preload$lambda$3$0 = FontListFontFamilyTypefaceAdapter.preload$lambda$3$0((TypefaceRequest) obj);
                return preload$lambda$3$0;
            default:
                _init_$lambda$02 = GlobalSnapshot._init_$lambda$0(obj);
                return _init_$lambda$02;
        }
    }
}
