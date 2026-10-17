package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.TargetedFlingBehaviorKt;
import androidx.compose.foundation.text.TextFieldKeyInput;
import androidx.compose.foundation.text.TextFieldKeyInputKt;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler;
import androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.SheetDefaultsKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.material3.TabIndicatorOffsetNode;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class fo0 implements ky {
    public final /* synthetic */ int d;

    public /* synthetic */ fo0(int i) {
        this.d = i;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        boolean rememberSheetState_AGcomas$lambda$3$lambda$2;
        boolean _init_$lambda$0;
        boolean _init_$lambda$7;
        w01 emptyLambda$lambda$0;
        w01 animateDecay$lambda$1;
        w01 animate$lambda$2;
        w01 animateTo$lambda$0;
        boolean rememberSwipeToDismissBoxState$lambda$3$lambda$2;
        w01 SwipeToDismissBox$lambda$15$lambda$14;
        w01 SwipeToDismissBox$lambda$7$lambda$6;
        boolean _init_$lambda$02;
        w01 measure_3p2s80s$lambda$0;
        w01 NoOnReport$lambda$0;
        w01 processKeyDownEvent_q0GpTC0$lambda$0$0;
        w01 processKeyDownEvent_q0GpTC0$lambda$0$1;
        w01 process_ZmokQxo$lambda$1$0;
        w01 process_ZmokQxo$lambda$1$1;
        EditCommand process_ZmokQxo$lambda$1$2;
        EditCommand process_ZmokQxo$lambda$1$3;
        EditCommand process_ZmokQxo$lambda$1$4;
        EditCommand process_ZmokQxo$lambda$1$5;
        EditCommand process_ZmokQxo$lambda$1$6;
        EditCommand process_ZmokQxo$lambda$1$7;
        w01 _init_$lambda$03;
        w01 textFieldKeyInput_2WJ9YEU$lambda$0;
        TextFieldScrollerPosition Saver$lambda$1;
        w01 onValueChange$lambda$0;
        boolean observeTextToolbarVisibility$lambda$1$0;
        TextFieldValue Saver$lambda$12;
        switch (this.d) {
            case 0:
                return obj;
            case 1:
                rememberSheetState_AGcomas$lambda$3$lambda$2 = SheetDefaultsKt.rememberSheetState_AGcomas$lambda$3$lambda$2((SheetValue) obj);
                return Boolean.valueOf(rememberSheetState_AGcomas$lambda$3$lambda$2);
            case 2:
                _init_$lambda$0 = SheetState._init_$lambda$0((SheetValue) obj);
                return Boolean.valueOf(_init_$lambda$0);
            case 3:
                _init_$lambda$7 = SheetState._init_$lambda$7((SheetValue) obj);
                return Boolean.valueOf(_init_$lambda$7);
            case 4:
                emptyLambda$lambda$0 = SnapshotKt.emptyLambda$lambda$0((SnapshotIdSet) obj);
                return emptyLambda$lambda$0;
            case 5:
                animateDecay$lambda$1 = SuspendAnimationKt.animateDecay$lambda$1((AnimationScope) obj);
                return animateDecay$lambda$1;
            case 6:
                animate$lambda$2 = SuspendAnimationKt.animate$lambda$2((AnimationScope) obj);
                return animate$lambda$2;
            case 7:
                animateTo$lambda$0 = SuspendAnimationKt.animateTo$lambda$0((AnimationScope) obj);
                return animateTo$lambda$0;
            case 8:
                rememberSwipeToDismissBoxState$lambda$3$lambda$2 = SwipeToDismissBoxKt.rememberSwipeToDismissBoxState$lambda$3$lambda$2((SwipeToDismissBoxValue) obj);
                return Boolean.valueOf(rememberSwipeToDismissBoxState$lambda$3$lambda$2);
            case 9:
                SwipeToDismissBox$lambda$15$lambda$14 = SwipeToDismissBoxKt.SwipeToDismissBox$lambda$15$lambda$14((SwipeToDismissBoxValue) obj);
                return SwipeToDismissBox$lambda$15$lambda$14;
            case 10:
                SwipeToDismissBox$lambda$7$lambda$6 = SwipeToDismissBoxKt.SwipeToDismissBox$lambda$7$lambda$6((SwipeToDismissBoxValue) obj);
                return SwipeToDismissBox$lambda$7$lambda$6;
            case 11:
                _init_$lambda$02 = SwipeToDismissBoxState._init_$lambda$0((SwipeToDismissBoxValue) obj);
                return Boolean.valueOf(_init_$lambda$02);
            case Matrix.TranslateX /* 12 */:
                measure_3p2s80s$lambda$0 = TabIndicatorOffsetNode.measure_3p2s80s$lambda$0((Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$0;
            case Matrix.TranslateY /* 13 */:
                NoOnReport$lambda$0 = TargetedFlingBehaviorKt.NoOnReport$lambda$0(((Float) obj).floatValue());
                return NoOnReport$lambda$0;
            case Matrix.TranslateZ /* 14 */:
                processKeyDownEvent_q0GpTC0$lambda$0$0 = TextFieldKeyEventHandler.processKeyDownEvent_q0GpTC0$lambda$0$0((SelectionMovementDeletionContext) obj);
                return processKeyDownEvent_q0GpTC0$lambda$0$0;
            case 15:
                processKeyDownEvent_q0GpTC0$lambda$0$1 = TextFieldKeyEventHandler.processKeyDownEvent_q0GpTC0$lambda$0$1((SelectionMovementDeletionContext) obj);
                return processKeyDownEvent_q0GpTC0$lambda$0$1;
            case 16:
                process_ZmokQxo$lambda$1$0 = TextFieldKeyInput.process_ZmokQxo$lambda$1$0((TextFieldPreparedSelection) obj);
                return process_ZmokQxo$lambda$1$0;
            case 17:
                process_ZmokQxo$lambda$1$1 = TextFieldKeyInput.process_ZmokQxo$lambda$1$1((TextFieldPreparedSelection) obj);
                return process_ZmokQxo$lambda$1$1;
            case 18:
                process_ZmokQxo$lambda$1$2 = TextFieldKeyInput.process_ZmokQxo$lambda$1$2((TextFieldPreparedSelection) obj);
                return process_ZmokQxo$lambda$1$2;
            case 19:
                process_ZmokQxo$lambda$1$3 = TextFieldKeyInput.process_ZmokQxo$lambda$1$3((TextFieldPreparedSelection) obj);
                return process_ZmokQxo$lambda$1$3;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                process_ZmokQxo$lambda$1$4 = TextFieldKeyInput.process_ZmokQxo$lambda$1$4((TextFieldPreparedSelection) obj);
                return process_ZmokQxo$lambda$1$4;
            case 21:
                process_ZmokQxo$lambda$1$5 = TextFieldKeyInput.process_ZmokQxo$lambda$1$5((TextFieldPreparedSelection) obj);
                return process_ZmokQxo$lambda$1$5;
            case 22:
                process_ZmokQxo$lambda$1$6 = TextFieldKeyInput.process_ZmokQxo$lambda$1$6((TextFieldPreparedSelection) obj);
                return process_ZmokQxo$lambda$1$6;
            case 23:
                process_ZmokQxo$lambda$1$7 = TextFieldKeyInput.process_ZmokQxo$lambda$1$7((TextFieldPreparedSelection) obj);
                return process_ZmokQxo$lambda$1$7;
            case 24:
                _init_$lambda$03 = TextFieldKeyInput._init_$lambda$0((TextFieldValue) obj);
                return _init_$lambda$03;
            case RectListKt.BitOffsetForParentId /* 25 */:
                textFieldKeyInput_2WJ9YEU$lambda$0 = TextFieldKeyInputKt.textFieldKeyInput_2WJ9YEU$lambda$0((TextFieldValue) obj);
                return textFieldKeyInput_2WJ9YEU$lambda$0;
            case 26:
                Saver$lambda$1 = TextFieldScrollerPosition.Saver$lambda$1((List) obj);
                return Saver$lambda$1;
            case 27:
                onValueChange$lambda$0 = TextFieldSelectionManager.onValueChange$lambda$0((TextFieldValue) obj);
                return onValueChange$lambda$0;
            case 28:
                observeTextToolbarVisibility$lambda$1$0 = TextFieldSelectionState.observeTextToolbarVisibility$lambda$1$0((Rect) obj);
                return Boolean.valueOf(observeTextToolbarVisibility$lambda$1$0);
            default:
                Saver$lambda$12 = TextFieldValue.Saver$lambda$1(obj);
                return Saver$lambda$12;
        }
    }
}
