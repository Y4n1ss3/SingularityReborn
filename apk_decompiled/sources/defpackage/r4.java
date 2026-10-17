package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.gestures.AnchoredDragScope;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridSlots;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.GapComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.saveable.serialization.SerializableSaverKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class r4 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r4(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 animateTo$lambda$0$1;
        w01 TooltipPopup$lambda$1;
        MeasureResult BoxWithConstraints$lambda$0$0;
        w01 OpenContextMenu$lambda$2;
        w01 deactivateCurrentGroup$lambda$0;
        LazyGridSlots rememberColumnWidthSums$lambda$0$0;
        LazyGridSlots rememberRowHeightSums$lambda$0$0;
        MeasureResult LazyLayout$lambda$1$3$0;
        w01 SelectionContainer$lambda$9$0$0;
        Bundle serializableSaver$lambda$0;
        w01 addBasicTextFieldTextContextMenuComponents$lambda$0;
        w01 addBasicTextFieldTextContextMenuComponents$lambda$02;
        int i = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                animateTo$lambda$0$1 = AnchoredDraggableKt.animateTo$lambda$0$1((AnchoredDragScope) obj4, (gi0) obj3, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                return animateTo$lambda$0$1;
            case 1:
                MutableState mutableState = (MutableState) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(423953005, intValue, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous> (AppsActivity.kt:649)");
                    }
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new v4(4, mutableState, mutableState2);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    ButtonKt.Button((iy) rememberedValue, null, false, RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, wk.a, composer, 805306374, 502);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return w01.a;
            case 2:
                TooltipPopup$lambda$1 = BasicTooltipKt.TooltipPopup$lambda$1((String) obj4, (my) obj3, (Composer) obj, ((Integer) obj2).intValue());
                return TooltipPopup$lambda$1;
            case 3:
                BoxWithConstraints$lambda$0$0 = BoxWithConstraintsKt.BoxWithConstraints$lambda$0$0((MeasurePolicy) obj4, (ny) obj3, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                return BoxWithConstraints$lambda$0$0;
            case 4:
                OpenContextMenu$lambda$2 = DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu$lambda$2((TextContextMenuDataProvider) obj4, (TextContextMenuSession) obj3, (Composer) obj, ((Integer) obj2).intValue());
                return OpenContextMenu$lambda$2;
            case 5:
                deactivateCurrentGroup$lambda$0 = GapComposerKt.deactivateCurrentGroup$lambda$0((RememberManager) obj4, (SlotWriter) obj3, ((Integer) obj).intValue(), obj2);
                return deactivateCurrentGroup$lambda$0;
            case 6:
                rememberColumnWidthSums$lambda$0$0 = LazyGridDslKt.rememberColumnWidthSums$lambda$0$0((GridCells) obj4, (Arrangement.Horizontal) obj3, (Density) obj, (Constraints) obj2);
                return rememberColumnWidthSums$lambda$0$0;
            case 7:
                rememberRowHeightSums$lambda$0$0 = LazyGridDslKt.rememberRowHeightSums$lambda$0$0((GridCells) obj4, (Arrangement.Vertical) obj3, (Density) obj, (Constraints) obj2);
                return rememberRowHeightSums$lambda$0$0;
            case 8:
                LazyLayout$lambda$1$3$0 = LazyLayoutKt.LazyLayout$lambda$1$3$0((LazyLayoutItemContentFactory) obj4, (LazyLayoutMeasurePolicy) obj3, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                return LazyLayout$lambda$1$3$0;
            case 9:
                SelectionContainer$lambda$9$0$0 = SelectionContainerKt.SelectionContainer$lambda$9$0$0((my) obj4, (SelectionManager) obj3, (Composer) obj, ((Integer) obj2).intValue());
                return SelectionContainer$lambda$9$0$0;
            case 10:
                serializableSaver$lambda$0 = SerializableSaverKt.serializableSaver$lambda$0((a30) obj4, (rk0) obj3, (SaverScope) obj, obj2);
                return serializableSaver$lambda$0;
            case 11:
                addBasicTextFieldTextContextMenuComponents$lambda$0 = TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0((TextFieldSelectionManager) obj4, (un) obj3, (TextContextMenuBuilderScope) obj, (Context) obj2);
                return addBasicTextFieldTextContextMenuComponents$lambda$0;
            default:
                addBasicTextFieldTextContextMenuComponents$lambda$02 = TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0((TextFieldSelectionState) obj4, (un) obj3, (TextContextMenuBuilderScope) obj, (Context) obj2);
                return addBasicTextFieldTextContextMenuComponents$lambda$02;
        }
    }
}
