package defpackage;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.gestures.TransformableKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerStateImpl;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class qu0 implements ky {
    public final /* synthetic */ int d;

    public /* synthetic */ qu0(int i) {
        this.d = i;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 Text_Z58ophY$lambda$4$lambda$3;
        w01 Text_fLXpl1I$lambda$14$lambda$13;
        w01 Text_IbK3jfQ$lambda$11$lambda$10;
        w01 Text__4IGK_g$lambda$17$lambda$16;
        List _init_$lambda$0;
        w01 LinksComposables$lambda$0$1$0;
        w01 DisplaySeparator$lambda$52$lambda$51;
        w01 VerticalTimePicker$lambda$9$lambda$8;
        w01 HorizontalTimePicker$lambda$13$lambda$12;
        w01 TimePickerTextField_1vLObsk$lambda$92$lambda$91$lambda$90;
        TimePickerStateImpl Saver$lambda$1;
        TopAppBarState Saver$lambda$12;
        boolean transformable$lambda$0;
        w01 SeekableTransitionStateTotalDurationChanged$lambda$0;
        w01 SeekableStateObserver_delegate$lambda$0$0;
        AnimationVector1D FloatToVector$lambda$0;
        AnimationVector1D IntToVector$lambda$0;
        int IntToVector$lambda$1;
        AnimationVector1D DpToVector$lambda$0;
        Dp DpToVector$lambda$1;
        AnimationVector2D DpOffsetToVector$lambda$0;
        DpOffset DpOffsetToVector$lambda$1;
        AnimationVector2D SizeToVector$lambda$0;
        Size SizeToVector$lambda$1;
        AnimationVector2D OffsetToVector$lambda$0;
        Offset OffsetToVector$lambda$1;
        AnimationVector2D IntOffsetToVector$lambda$0;
        IntOffset IntOffsetToVector$lambda$1;
        AnimationVector2D IntSizeToVector$lambda$0;
        switch (this.d) {
            case 0:
                Text_Z58ophY$lambda$4$lambda$3 = TextKt.Text_Z58ophY$lambda$4$lambda$3((TextLayoutResult) obj);
                return Text_Z58ophY$lambda$4$lambda$3;
            case 1:
                Text_fLXpl1I$lambda$14$lambda$13 = TextKt.Text_fLXpl1I$lambda$14$lambda$13((TextLayoutResult) obj);
                return Text_fLXpl1I$lambda$14$lambda$13;
            case 2:
                Text_IbK3jfQ$lambda$11$lambda$10 = TextKt.Text_IbK3jfQ$lambda$11$lambda$10((TextLayoutResult) obj);
                return Text_IbK3jfQ$lambda$11$lambda$10;
            case 3:
                Text__4IGK_g$lambda$17$lambda$16 = TextKt.Text__4IGK_g$lambda$17$lambda$16((TextLayoutResult) obj);
                return Text__4IGK_g$lambda$17$lambda$16;
            case 4:
                _init_$lambda$0 = TextLinkScope._init_$lambda$0((AnnotatedString.Range) obj);
                return _init_$lambda$0;
            case 5:
                LinksComposables$lambda$0$1$0 = TextLinkScope.LinksComposables$lambda$0$1$0((SemanticsPropertyReceiver) obj);
                return LinksComposables$lambda$0$1$0;
            case 6:
                DisplaySeparator$lambda$52$lambda$51 = TimePickerKt.DisplaySeparator$lambda$52$lambda$51((SemanticsPropertyReceiver) obj);
                return DisplaySeparator$lambda$52$lambda$51;
            case 7:
                VerticalTimePicker$lambda$9$lambda$8 = TimePickerKt.VerticalTimePicker$lambda$9$lambda$8((SemanticsPropertyReceiver) obj);
                return VerticalTimePicker$lambda$9$lambda$8;
            case 8:
                HorizontalTimePicker$lambda$13$lambda$12 = TimePickerKt.HorizontalTimePicker$lambda$13$lambda$12((SemanticsPropertyReceiver) obj);
                return HorizontalTimePicker$lambda$13$lambda$12;
            case 9:
                TimePickerTextField_1vLObsk$lambda$92$lambda$91$lambda$90 = TimePickerKt.TimePickerTextField_1vLObsk$lambda$92$lambda$91$lambda$90((SemanticsPropertyReceiver) obj);
                return TimePickerTextField_1vLObsk$lambda$92$lambda$91$lambda$90;
            case 10:
                Saver$lambda$1 = TimePickerStateImpl.Companion.Saver$lambda$1((List) obj);
                return Saver$lambda$1;
            case 11:
                Saver$lambda$12 = TopAppBarState.Saver$lambda$1((List) obj);
                return Saver$lambda$12;
            case Matrix.TranslateX /* 12 */:
                transformable$lambda$0 = TransformableKt.transformable$lambda$0((Offset) obj);
                return Boolean.valueOf(transformable$lambda$0);
            case Matrix.TranslateY /* 13 */:
                SeekableTransitionStateTotalDurationChanged$lambda$0 = TransitionKt.SeekableTransitionStateTotalDurationChanged$lambda$0((SeekableTransitionState) obj);
                return SeekableTransitionStateTotalDurationChanged$lambda$0;
            case Matrix.TranslateZ /* 14 */:
                SeekableStateObserver_delegate$lambda$0$0 = TransitionKt.SeekableStateObserver_delegate$lambda$0$0((iy) obj);
                return SeekableStateObserver_delegate$lambda$0$0;
            case 15:
                xe0 xe0Var = (xe0) obj;
                xe0Var.getClass();
                String str = (String) xe0Var.d;
                List list = (List) xe0Var.e;
                Integer num = (Integer) yi.y0(list);
                int intValue = num != null ? num.intValue() : 0;
                Integer num2 = (Integer) yi.x0(list);
                return str + ": " + intValue + "-" + (num2 != null ? num2.intValue() : 0) + " MHz";
            case 16:
                FloatToVector$lambda$0 = VectorConvertersKt.FloatToVector$lambda$0(((Float) obj).floatValue());
                return FloatToVector$lambda$0;
            case 17:
                IntToVector$lambda$0 = VectorConvertersKt.IntToVector$lambda$0(((Integer) obj).intValue());
                return IntToVector$lambda$0;
            case 18:
                IntToVector$lambda$1 = VectorConvertersKt.IntToVector$lambda$1((AnimationVector1D) obj);
                return Integer.valueOf(IntToVector$lambda$1);
            case 19:
                DpToVector$lambda$0 = VectorConvertersKt.DpToVector$lambda$0((Dp) obj);
                return DpToVector$lambda$0;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                DpToVector$lambda$1 = VectorConvertersKt.DpToVector$lambda$1((AnimationVector1D) obj);
                return DpToVector$lambda$1;
            case 21:
                DpOffsetToVector$lambda$0 = VectorConvertersKt.DpOffsetToVector$lambda$0((DpOffset) obj);
                return DpOffsetToVector$lambda$0;
            case 22:
                DpOffsetToVector$lambda$1 = VectorConvertersKt.DpOffsetToVector$lambda$1((AnimationVector2D) obj);
                return DpOffsetToVector$lambda$1;
            case 23:
                SizeToVector$lambda$0 = VectorConvertersKt.SizeToVector$lambda$0((Size) obj);
                return SizeToVector$lambda$0;
            case 24:
                SizeToVector$lambda$1 = VectorConvertersKt.SizeToVector$lambda$1((AnimationVector2D) obj);
                return SizeToVector$lambda$1;
            case RectListKt.BitOffsetForParentId /* 25 */:
                OffsetToVector$lambda$0 = VectorConvertersKt.OffsetToVector$lambda$0((Offset) obj);
                return OffsetToVector$lambda$0;
            case 26:
                OffsetToVector$lambda$1 = VectorConvertersKt.OffsetToVector$lambda$1((AnimationVector2D) obj);
                return OffsetToVector$lambda$1;
            case 27:
                IntOffsetToVector$lambda$0 = VectorConvertersKt.IntOffsetToVector$lambda$0((IntOffset) obj);
                return IntOffsetToVector$lambda$0;
            case 28:
                IntOffsetToVector$lambda$1 = VectorConvertersKt.IntOffsetToVector$lambda$1((AnimationVector2D) obj);
                return IntOffsetToVector$lambda$1;
            default:
                IntSizeToVector$lambda$0 = VectorConvertersKt.IntSizeToVector$lambda$0((IntSize) obj);
                return IntSizeToVector$lambda$0;
        }
    }
}
