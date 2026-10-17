package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.TextFieldKeyInput;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BottomAppBarState;
import androidx.compose.material3.DragHandleColors;
import androidx.compose.material3.DragHandleKt;
import androidx.compose.material3.DragHandleShapes;
import androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.SearchBarDefaults;
import androidx.compose.material3.SearchBarState;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ f1(ky kyVar, MutableState mutableState, MutableState mutableState2) {
        this.d = 3;
        this.f = kyVar;
        this.e = mutableState;
        this.g = mutableState2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        DisposableEffectResult ObserveState$lambda$12$lambda$11;
        w01 w01Var;
        w01 w01Var2;
        w01 BasicTextField$lambda$24$0;
        w01 anchorSemantics$lambda$12;
        w01 anchorSemantics$lambda$0;
        w01 CoreTextField$lambda$19$0;
        w01 DefaultTextContextMenuDropdown$lambda$0$0;
        w01 VerticalDragHandle$lambda$10$lambda$9;
        w01 VerticalDragHandle$lambda$15$lambda$14;
        EnterAlwaysSearchBarScrollBehavior Saver$lambda$1;
        w01 measure$lambda$0$37$0;
        w01 measure$lambda$0$37;
        w01 ModalBottomSheet_YbuCTN8$lambda$7$lambda$6;
        w01 outlineCutout$lambda$22;
        w01 InputField$lambda$11$lambda$10;
        w01 mouseSelection$lambda$2;
        SwipeToDismissBoxState Saver$lambda$12;
        w01 restartInput$lambda$0;
        w01 CommonDecorationBox$lambda$18$lambda$17$lambda$16;
        w01 process_ZmokQxo$lambda$1;
        w01 contextMenuBuilder$lambda$0;
        w01 addBasicTextFieldTextContextMenuComponents$lambda$0$3;
        w01 detectCursorHandleDragGestures$lambda$0;
        w01 defaultDetectTextFieldTapGestures$lambda$0;
        w01 addBasicTextFieldTextContextMenuComponents$lambda$0$2;
        w01 ClockText$lambda$77$lambda$76;
        int i = this.d;
        w01 w01Var3 = w01.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ObserveState$lambda$12$lambda$11 = AccessibilityServiceStateProvider_androidKt.ObserveState$lambda$12$lambda$11((y40) obj4, (ky) obj3, (iy) obj2, (DisposableEffectScope) obj);
                return ObserveState$lambda$12$lambda$11;
            case 1:
                w01Var = AppBarKt.settleAppBar$lambda$54((gi0) obj4, (TopAppBarState) obj3, (gi0) obj2, (AnimationScope) obj);
                return w01Var;
            case 2:
                w01Var2 = AppBarKt.settleAppBarBottom$lambda$29((gi0) obj4, (BottomAppBarState) obj3, (gi0) obj2, (AnimationScope) obj);
                return w01Var2;
            case 3:
                BasicTextField$lambda$24$0 = BasicTextFieldKt.BasicTextField$lambda$24$0((ky) obj3, (MutableState) obj4, (MutableState) obj2, (TextFieldValue) obj);
                return BasicTextField$lambda$24$0;
            case 4:
                anchorSemantics$lambda$12 = BasicTooltipKt.anchorSemantics$lambda$12((String) obj4, (un) obj3, (TooltipState) obj2, (SemanticsPropertyReceiver) obj);
                return anchorSemantics$lambda$12;
            case 5:
                anchorSemantics$lambda$0 = androidx.compose.foundation.BasicTooltipKt.anchorSemantics$lambda$0((String) obj4, (un) obj3, (BasicTooltipState) obj2, (SemanticsPropertyReceiver) obj);
                return anchorSemantics$lambda$0;
            case 6:
                CoreTextField$lambda$19$0 = CoreTextFieldKt.CoreTextField$lambda$19$0((LegacyTextFieldState) obj4, (TextFieldValue) obj3, (OffsetMapping) obj2, (DrawScope) obj);
                return CoreTextField$lambda$19$0;
            case 7:
                DefaultTextContextMenuDropdown$lambda$0$0 = DefaultTextContextMenuDropdownProvider_androidKt.DefaultTextContextMenuDropdown$lambda$0$0((TextContextMenuData) obj4, (Context) obj3, (TextContextMenuSession) obj2, (ContextMenuScope) obj);
                return DefaultTextContextMenuDropdown$lambda$0$0;
            case 8:
                VerticalDragHandle$lambda$10$lambda$9 = DragHandleKt.VerticalDragHandle$lambda$10$lambda$9((DragHandleShapes) obj4, (State) obj3, (MutableState) obj2, (GraphicsLayerScope) obj);
                return VerticalDragHandle$lambda$10$lambda$9;
            case 9:
                VerticalDragHandle$lambda$15$lambda$14 = DragHandleKt.VerticalDragHandle$lambda$15$lambda$14((DragHandleColors) obj4, (State) obj3, (MutableState) obj2, (DrawScope) obj);
                return VerticalDragHandle$lambda$15$lambda$14;
            case 10:
                Saver$lambda$1 = EnterAlwaysSearchBarScrollBehavior.Companion.Saver$lambda$1((iy) obj2, (AnimationSpec) obj4, (DecayAnimationSpec) obj3, (List) obj);
                return Saver$lambda$1;
            case 11:
                measure$lambda$0$37$0 = LazyStaggeredGridMeasureKt.measure$lambda$0$37$0((List) obj4, (LazyStaggeredGridMeasureContext) obj3, (LazyLayoutMeasureScope) obj2, (Placeable.PlacementScope) obj);
                return measure$lambda$0$37$0;
            case Matrix.TranslateX /* 12 */:
                measure$lambda$0$37 = LazyStaggeredGridMeasureKt.measure$lambda$0$37((LazyStaggeredGridMeasureContext) obj4, (ArrayList) obj3, (LazyLayoutMeasureScope) obj2, (Placeable.PlacementScope) obj);
                return measure$lambda$0$37;
            case Matrix.TranslateY /* 13 */:
                Uri uri = (Uri) obj;
                uri.getClass();
                ((MutableState) obj3).setValue(ie.h);
                ((MutableState) obj2).setValue(uri.toString());
                ((SharedPreferences) obj4).edit().putString("payload_bootanimation_choice", "CUSTOM").putString("payload_bootanimation_custom_uri", uri.toString()).apply();
                return w01Var3;
            case Matrix.TranslateZ /* 14 */:
                Context context = (Context) obj4;
                ky kyVar = (ky) obj3;
                ky kyVar2 = (ky) obj2;
                Uri uri2 = (Uri) obj;
                if (uri2 != null) {
                    String A = e80.A(context, uri2);
                    if (A == null && (A = uri2.getLastPathSegment()) == null) {
                        A = "";
                    }
                    if (ks0.Z(A, ".zip", true) || ks0.Z(A, ".glb", true)) {
                        try {
                            File file = new File(context.getCacheDir(), "bootpack_validate");
                            uv.K(file);
                            p10.K(context, uri2, file);
                            uv.K(file);
                            try {
                                context.getContentResolver().takePersistableUriPermission(uri2, 1);
                            } catch (SecurityException e) {
                                Log.w("PayloadSelectorDialog", "Could not persist URI permission: " + e.getMessage());
                            }
                            kyVar2.invoke(uri2);
                        } catch (ke e2) {
                            String message = e2.getMessage();
                            if (message == null) {
                                message = "Invalid boot animation pack";
                            }
                            kyVar.invoke(message);
                        } catch (Exception e3) {
                            Log.w("PayloadSelectorDialog", "Could not read zip file: " + e3.getMessage());
                            kyVar.invoke("Could not read zip file");
                        }
                    } else {
                        kyVar.invoke("Please select a .glb file or a .zip boot animation pack");
                    }
                }
                return w01Var3;
            case 15:
                ModalBottomSheet_YbuCTN8$lambda$7$lambda$6 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$7$lambda$6((un) obj4, (SheetState) obj3, (iy) obj2, ((Float) obj).floatValue());
                return ModalBottomSheet_YbuCTN8$lambda$7$lambda$6;
            case 16:
                outlineCutout$lambda$22 = OutlinedTextFieldKt.outlineCutout$lambda$22((iy) obj2, (PaddingValues) obj4, (Alignment.Horizontal) obj3, (ContentDrawScope) obj);
                return outlineCutout$lambda$22;
            case 17:
                InputField$lambda$11$lambda$10 = SearchBarDefaults.InputField$lambda$11$lambda$10((String) obj4, (SearchBarState) obj3, (String) obj2, (SemanticsPropertyReceiver) obj);
                return InputField$lambda$11$lambda$10;
            case 18:
                mouseSelection$lambda$2 = SelectionGesturesKt.mouseSelection$lambda$2((MouseSelectionObserver) obj4, (SelectionAdjustment) obj3, (fi0) obj2, (PointerInputChange) obj);
                return mouseSelection$lambda$2;
            case 19:
                Saver$lambda$12 = SwipeToDismissBoxState.Companion.Saver$lambda$1((Density) obj4, (ky) obj3, (ky) obj2, (SwipeToDismissBoxValue) obj);
                return Saver$lambda$12;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                restartInput$lambda$0 = TextFieldDelegate.Companion.restartInput$lambda$0((EditProcessor) obj4, (ky) obj3, (ji0) obj2, (List) obj);
                return restartInput$lambda$0;
            case 21:
                CommonDecorationBox$lambda$18$lambda$17$lambda$16 = TextFieldImplKt.CommonDecorationBox$lambda$18$lambda$17$lambda$16((TextFieldLabelPosition) obj4, (State) obj3, (MutableState) obj2, (Size) obj);
                return CommonDecorationBox$lambda$18$lambda$17$lambda$16;
            case 22:
                process_ZmokQxo$lambda$1 = TextFieldKeyInput.process_ZmokQxo$lambda$1((KeyCommand) obj4, (TextFieldKeyInput) obj3, (fi0) obj2, (TextFieldPreparedSelection) obj);
                return process_ZmokQxo$lambda$1;
            case 23:
                contextMenuBuilder$lambda$0 = TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0((State) obj4, (TextFieldSelectionManager) obj3, (ContextMenuState) obj2, (ContextMenuScope) obj);
                return contextMenuBuilder$lambda$0;
            case 24:
                addBasicTextFieldTextContextMenuComponents$lambda$0$3 = TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$3((TextFieldSelectionManager) obj4, (un) obj3, (Context) obj2, (TextContextMenuBuilderScope) obj);
                return addBasicTextFieldTextContextMenuComponents$lambda$0$3;
            case RectListKt.BitOffsetForParentId /* 25 */:
                detectCursorHandleDragGestures$lambda$0 = TextFieldSelectionState.detectCursorHandleDragGestures$lambda$0((ii0) obj4, (TextFieldSelectionState) obj3, (ii0) obj2, (Offset) obj);
                return detectCursorHandleDragGestures$lambda$0;
            case 26:
                defaultDetectTextFieldTapGestures$lambda$0 = TextFieldSelectionStateKt.defaultDetectTextFieldTapGestures$lambda$0((iy) obj2, (TextFieldSelectionState) obj4, (iy) obj3, (Offset) obj);
                return defaultDetectTextFieldTapGestures$lambda$0;
            case 27:
                addBasicTextFieldTextContextMenuComponents$lambda$0$2 = TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$2((TextFieldSelectionState) obj4, (un) obj3, (Context) obj2, (TextContextMenuBuilderScope) obj);
                return addBasicTextFieldTextContextMenuComponents$lambda$0$2;
            default:
                ClockText$lambda$77$lambda$76 = TimePickerKt.ClockText$lambda$77$lambda$76((MutableState) obj4, (MutableState) obj3, (MutableState) obj2, (LayoutCoordinates) obj);
                return ClockText$lambda$77$lambda$76;
        }
    }

    public /* synthetic */ f1(iy iyVar, Object obj, Object obj2, int i) {
        this.d = i;
        this.g = iyVar;
        this.e = obj;
        this.f = obj2;
    }

    public /* synthetic */ f1(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }
}
