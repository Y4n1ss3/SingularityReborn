package defpackage;

import android.util.Log;
import androidx.compose.foundation.lazy.LazyListMeasureKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt;
import androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest;
import androidx.compose.material3.DrawerValue;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ListItemKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ModalWideNavigationRailState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.SheetValue;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.MultiParagraphKt;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class hz implements ky {
    public final /* synthetic */ int d;

    public /* synthetic */ hz(int i) {
        this.d = i;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 SurfaceIconToggleButton$lambda$26$lambda$25;
        w01 OutlinedIconToggleButton$lambda$20$lambda$19;
        w01 FilledIconToggleButton$lambda$12$lambda$11;
        w01 FilledTonalIconToggleButton$lambda$16$lambda$15;
        w01 SurfaceIconButton$lambda$23$lambda$22;
        w01 Icon$lambda$12$lambda$11$lambda$9$lambda$7;
        w01 finishComposingText$lambda$0;
        GridItemSpan stickyHeader$lambda$1;
        w01 measureLazyGrid_t1x4au0$lambda$2;
        LazyGridState Saver$lambda$1;
        List EmptyLazyGridLayoutInfo$lambda$0;
        int EmptyLazyGridLayoutInfo$lambda$1;
        w01 measureLazyList__s_dbAc$lambda$2;
        Object items$lambda$0;
        LazyListState Saver$lambda$12;
        w01 measure$lambda$0$0;
        LazyStaggeredGridState Saver$lambda$13;
        w01 onValueChangeOriginal$lambda$0;
        w01 onEditCommand$lambda$0;
        w01 onImeActionPerformed$lambda$0;
        w01 ListItem_HXNGIdc$lambda$5$lambda$4;
        boolean rememberModalBottomSheetState$lambda$26$lambda$25;
        float anchoredDraggableState$lambda$0;
        CharSequence findParagraphByIndex$lambda$2$0;
        w01 NavigationDrawerItem$lambda$64$lambda$63;
        boolean rememberDrawerState$lambda$1$lambda$0;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                return "printf 'zone" + intValue + ":'; cat /sys/class/thermal/thermal_zone" + intValue + "/type 2>/dev/null || true";
            case 1:
                SurfaceIconToggleButton$lambda$26$lambda$25 = IconButtonKt.SurfaceIconToggleButton$lambda$26$lambda$25((SemanticsPropertyReceiver) obj);
                return SurfaceIconToggleButton$lambda$26$lambda$25;
            case 2:
                OutlinedIconToggleButton$lambda$20$lambda$19 = IconButtonKt.OutlinedIconToggleButton$lambda$20$lambda$19((SemanticsPropertyReceiver) obj);
                return OutlinedIconToggleButton$lambda$20$lambda$19;
            case 3:
                FilledIconToggleButton$lambda$12$lambda$11 = IconButtonKt.FilledIconToggleButton$lambda$12$lambda$11((SemanticsPropertyReceiver) obj);
                return FilledIconToggleButton$lambda$12$lambda$11;
            case 4:
                FilledTonalIconToggleButton$lambda$16$lambda$15 = IconButtonKt.FilledTonalIconToggleButton$lambda$16$lambda$15((SemanticsPropertyReceiver) obj);
                return FilledTonalIconToggleButton$lambda$16$lambda$15;
            case 5:
                SurfaceIconButton$lambda$23$lambda$22 = IconButtonKt.SurfaceIconButton$lambda$23$lambda$22((SemanticsPropertyReceiver) obj);
                return SurfaceIconButton$lambda$23$lambda$22;
            case 6:
                Icon$lambda$12$lambda$11$lambda$9$lambda$7 = IconKt.Icon$lambda$12$lambda$11$lambda$9$lambda$7((ContentDrawScope) obj);
                return Icon$lambda$12$lambda$11$lambda$9$lambda$7;
            case 7:
                finishComposingText$lambda$0 = ImeEditCommand_androidKt.finishComposingText$lambda$0((TextFieldBuffer) obj);
                return finishComposingText$lambda$0;
            case 8:
                stickyHeader$lambda$1 = LazyGridIntervalContent.stickyHeader$lambda$1((LazyGridItemSpanScope) obj);
                return stickyHeader$lambda$1;
            case 9:
                measureLazyGrid_t1x4au0$lambda$2 = LazyGridMeasureKt.measureLazyGrid_t1x4au0$lambda$2((Placeable.PlacementScope) obj);
                return measureLazyGrid_t1x4au0$lambda$2;
            case 10:
                Saver$lambda$1 = LazyGridState.Saver$lambda$1((List) obj);
                return Saver$lambda$1;
            case 11:
                EmptyLazyGridLayoutInfo$lambda$0 = LazyGridStateKt.EmptyLazyGridLayoutInfo$lambda$0(((Integer) obj).intValue());
                return EmptyLazyGridLayoutInfo$lambda$0;
            case Matrix.TranslateX /* 12 */:
                EmptyLazyGridLayoutInfo$lambda$1 = LazyGridStateKt.EmptyLazyGridLayoutInfo$lambda$1(((Integer) obj).intValue());
                return Integer.valueOf(EmptyLazyGridLayoutInfo$lambda$1);
            case Matrix.TranslateY /* 13 */:
                measureLazyList__s_dbAc$lambda$2 = LazyListMeasureKt.measureLazyList__s_dbAc$lambda$2((Placeable.PlacementScope) obj);
                return measureLazyList__s_dbAc$lambda$2;
            case Matrix.TranslateZ /* 14 */:
                items$lambda$0 = LazyListScope.items$lambda$0(((Integer) obj).intValue());
                return items$lambda$0;
            case 15:
                Saver$lambda$12 = LazyListState.Saver$lambda$1((List) obj);
                return Saver$lambda$12;
            case 16:
                measure$lambda$0$0 = LazyStaggeredGridMeasureKt.measure$lambda$0$0((Placeable.PlacementScope) obj);
                return measure$lambda$0$0;
            case 17:
                Saver$lambda$13 = LazyStaggeredGridState.Saver$lambda$1((List) obj);
                return Saver$lambda$13;
            case 18:
                onValueChangeOriginal$lambda$0 = LegacyTextFieldState.onValueChangeOriginal$lambda$0((TextFieldValue) obj);
                return onValueChangeOriginal$lambda$0;
            case 19:
                onEditCommand$lambda$0 = LegacyTextInputMethodRequest.onEditCommand$lambda$0((List) obj);
                return onEditCommand$lambda$0;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                onImeActionPerformed$lambda$0 = LegacyTextInputMethodRequest.onImeActionPerformed$lambda$0((ImeAction) obj);
                return onImeActionPerformed$lambda$0;
            case 21:
                ListItem_HXNGIdc$lambda$5$lambda$4 = ListItemKt.ListItem_HXNGIdc$lambda$5$lambda$4((SemanticsPropertyReceiver) obj);
                return ListItem_HXNGIdc$lambda$5$lambda$4;
            case 22:
                Log.d("Fugu", (String) obj);
                return w01.a;
            case 23:
                rememberModalBottomSheetState$lambda$26$lambda$25 = ModalBottomSheetKt.rememberModalBottomSheetState$lambda$26$lambda$25((SheetValue) obj);
                return Boolean.valueOf(rememberModalBottomSheetState$lambda$26$lambda$25);
            case 24:
                anchoredDraggableState$lambda$0 = ModalWideNavigationRailState.anchoredDraggableState$lambda$0(((Float) obj).floatValue());
                return Float.valueOf(anchoredDraggableState$lambda$0);
            case RectListKt.BitOffsetForParentId /* 25 */:
                return ds0.E0((String) obj).toString();
            case 26:
                return Boolean.valueOf(((String) obj).length() > 0);
            case 27:
                findParagraphByIndex$lambda$2$0 = MultiParagraphKt.findParagraphByIndex$lambda$2$0((ParagraphInfo) obj);
                return findParagraphByIndex$lambda$2$0;
            case 28:
                NavigationDrawerItem$lambda$64$lambda$63 = NavigationDrawerKt.NavigationDrawerItem$lambda$64$lambda$63((SemanticsPropertyReceiver) obj);
                return NavigationDrawerItem$lambda$64$lambda$63;
            default:
                rememberDrawerState$lambda$1$lambda$0 = NavigationDrawerKt.rememberDrawerState$lambda$1$lambda$0((DrawerValue) obj);
                return Boolean.valueOf(rememberDrawerState$lambda$1$lambda$0);
        }
    }
}
