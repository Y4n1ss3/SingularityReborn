package defpackage;

import android.content.SharedPreferences;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.material3.AppBarMenuState;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.material3.ToggleableAppBarItem;
import androidx.compose.material3.WideNavigationRailState;
import androidx.compose.material3.WideNavigationRailStateKt;
import androidx.compose.material3.WideNavigationRailValue;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class rn0 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rn0(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        Offset selectionMagnifier$lambda$0$3$0;
        SwipeToDismissBoxState rememberSwipeToDismissBoxState$lambda$1$lambda$0;
        Offset textFieldMagnifier$lambda$0$3$0;
        String detectSelectionHandleDragGestures$lambda$4;
        w01 MenuContent$lambda$2$lambda$1;
        TransformedTextFieldState.TransformedText outputTransformedText$lambda$0$0;
        TransformedTextFieldState.TransformedText codepointTransformedText$lambda$0$0;
        WideNavigationRailState rememberWideNavigationRailState$lambda$1$lambda$0;
        int i = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                selectionMagnifier$lambda$0$3$0 = SelectionManager_androidKt.selectionMagnifier$lambda$0$3$0((SelectionManager) obj2, (MutableState) obj);
                return selectionMagnifier$lambda$0$3$0;
            case 1:
                rememberSwipeToDismissBoxState$lambda$1$lambda$0 = SwipeToDismissBoxKt.rememberSwipeToDismissBoxState$lambda$1$lambda$0((SwipeToDismissBoxValue) obj2, (ky) obj);
                return rememberSwipeToDismissBoxState$lambda$1$lambda$0;
            case 2:
                textFieldMagnifier$lambda$0$3$0 = TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0$3$0((TextFieldSelectionManager) obj2, (MutableState) obj);
                return textFieldMagnifier$lambda$0$3$0;
            case 3:
                detectSelectionHandleDragGestures$lambda$4 = TextFieldSelectionState.detectSelectionHandleDragGestures$lambda$4((TextFieldSelectionState) obj2, (Handle) obj);
                return detectSelectionHandleDragGestures$lambda$4;
            case 4:
                MenuContent$lambda$2$lambda$1 = ToggleableAppBarItem.MenuContent$lambda$2$lambda$1((ToggleableAppBarItem) obj2, (AppBarMenuState) obj);
                return MenuContent$lambda$2$lambda$1;
            case 5:
                outputTransformedText$lambda$0$0 = TransformedTextFieldState.outputTransformedText$lambda$0$0((TransformedTextFieldState) obj2, (OutputTransformation) obj);
                return outputTransformedText$lambda$0$0;
            case 6:
                codepointTransformedText$lambda$0$0 = TransformedTextFieldState.codepointTransformedText$lambda$0$0((TransformedTextFieldState) obj2, (CodepointTransformation) obj);
                return codepointTransformedText$lambda$0$0;
            case 7:
                String str = (String) obj;
                String string = ((SharedPreferences) obj2).getString("gpu_max_freq_selection", str);
                if (string != null) {
                    str = string;
                }
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
            case 8:
                rememberWideNavigationRailState$lambda$1$lambda$0 = WideNavigationRailStateKt.rememberWideNavigationRailState$lambda$1$lambda$0((WideNavigationRailValue) obj2, (FiniteAnimationSpec) obj);
                return rememberWideNavigationRailState$lambda$1$lambda$0;
            default:
                ((m21) ((p7) obj2).d).b((p21) obj);
                return w01.a;
        }
    }
}
