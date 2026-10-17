package defpackage;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SheetState;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class g7 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ iy e;

    public /* synthetic */ g7(int i, iy iyVar) {
        this.d = i;
        this.e = iyVar;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 TopAppBarLayout_lyUyIHI$lambda$51$lambda$43$lambda$42;
        w01 TopAppBarLayout_lyUyIHI$lambda$51$lambda$48$lambda$47;
        w01 TwoRowsTopAppBar$lambda$18$lambda$17;
        w01 detectDragGestures$lambda$4;
        w01 ModalBottomSheet_YbuCTN8$lambda$11$lambda$10$lambda$9;
        w01 Indicator_3J_VO9M$lambda$44$lambda$43;
        w01 LinearProgressIndicator_GJbTh5U$lambda$7$lambda$6;
        w01 CircularProgressIndicator_IyT6zlY$lambda$26$lambda$25;
        Offset selectionMagnifier$lambda$0$4$0$0;
        float anchoredDraggableState$lambda$5;
        boolean textFieldDragAndDropNode$lambda$0;
        Offset textFieldMagnifier$lambda$0$4$0$0;
        int i = this.d;
        iy iyVar = this.e;
        switch (i) {
            case 0:
                TopAppBarLayout_lyUyIHI$lambda$51$lambda$43$lambda$42 = AppBarKt.TopAppBarLayout_lyUyIHI$lambda$51$lambda$43$lambda$42(iyVar, (GraphicsLayerScope) obj);
                return TopAppBarLayout_lyUyIHI$lambda$51$lambda$43$lambda$42;
            case 1:
                TopAppBarLayout_lyUyIHI$lambda$51$lambda$48$lambda$47 = AppBarKt.TopAppBarLayout_lyUyIHI$lambda$51$lambda$48$lambda$47(iyVar, (GraphicsLayerScope) obj);
                return TopAppBarLayout_lyUyIHI$lambda$51$lambda$48$lambda$47;
            case 2:
                TwoRowsTopAppBar$lambda$18$lambda$17 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$18$lambda$17(iyVar, (DrawScope) obj);
                return TwoRowsTopAppBar$lambda$18$lambda$17;
            case 3:
                detectDragGestures$lambda$4 = DragGestureDetectorKt.detectDragGestures$lambda$4(iyVar, (PointerInputChange) obj);
                return detectDragGestures$lambda$4;
            case 4:
                ModalBottomSheet_YbuCTN8$lambda$11$lambda$10$lambda$9 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$11$lambda$10$lambda$9(iyVar, (Throwable) obj);
                return ModalBottomSheet_YbuCTN8$lambda$11$lambda$10$lambda$9;
            case 5:
                Indicator_3J_VO9M$lambda$44$lambda$43 = NavigationItemKt.Indicator_3J_VO9M$lambda$44$lambda$43(iyVar, (GraphicsLayerScope) obj);
                return Indicator_3J_VO9M$lambda$44$lambda$43;
            case 6:
                LinearProgressIndicator_GJbTh5U$lambda$7$lambda$6 = ProgressIndicatorKt.LinearProgressIndicator_GJbTh5U$lambda$7$lambda$6(iyVar, (SemanticsPropertyReceiver) obj);
                return LinearProgressIndicator_GJbTh5U$lambda$7$lambda$6;
            case 7:
                CircularProgressIndicator_IyT6zlY$lambda$26$lambda$25 = ProgressIndicatorKt.CircularProgressIndicator_IyT6zlY$lambda$26$lambda$25(iyVar, (SemanticsPropertyReceiver) obj);
                return CircularProgressIndicator_IyT6zlY$lambda$26$lambda$25;
            case 8:
                selectionMagnifier$lambda$0$4$0$0 = SelectionManager_androidKt.selectionMagnifier$lambda$0$4$0$0(iyVar, (Density) obj);
                return selectionMagnifier$lambda$0$4$0$0;
            case 9:
                anchoredDraggableState$lambda$5 = SheetState.anchoredDraggableState$lambda$5(iyVar, ((Float) obj).floatValue());
                return Float.valueOf(anchoredDraggableState$lambda$5);
            case 10:
                ((KeyboardActionScope) obj).getClass();
                iyVar.invoke();
                return w01.a;
            case 11:
                textFieldDragAndDropNode$lambda$0 = TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode$lambda$0(iyVar, (DragAndDropEvent) obj);
                return Boolean.valueOf(textFieldDragAndDropNode$lambda$0);
            default:
                textFieldMagnifier$lambda$0$4$0$0 = TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0$4$0$0(iyVar, (Density) obj);
                return textFieldMagnifier$lambda$0$4$0$0;
        }
    }
}
