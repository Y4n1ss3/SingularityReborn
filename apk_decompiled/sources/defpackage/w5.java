package defpackage;

import android.graphics.RectF;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.draganddrop.DragAndDropSourceNode;
import androidx.compose.foundation.gestures.Scrollable2DNode;
import androidx.compose.foundation.gestures.ScrollableNode;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SliderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.draganddrop.DragAndDropStartTransferScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class w5 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w5(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x017a, code lost:
    
        if (r2 == null) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017a  */
    @Override // defpackage.my
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean rangeForRect_8_6BmAI$lambda$0;
        Long selectionIdSaver$lambda$0;
        w01 removeCurrentGroup$lambda$0;
        FiniteAnimationSpec SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$19;
        String DefaultTextContextMenuDropdown$lambda$0$0$0$0;
        w01 dragAndDropModifierNode$lambda$0;
        w01 detectDragGesturesWithObserver$lambda$3;
        xe0 ModalBottomSheetContent_7___e2Q$lambda$18$lambda$17;
        w01 movableContentOf$lambda$0;
        MutableState mutableStateSaver$lambda$0$0;
        boolean scrollSemanticsActions$lambda$0;
        boolean scrollSemanticsActions$lambda$02;
        int sort$lambda$0;
        w01 awaitSlop_8vUncbI$lambda$49;
        w01 applyObserver$lambda$0;
        Object obj3;
        xe0 xe0Var;
        Object obj4;
        boolean dragAndDropNode$lambda$1;
        IntOffset size$lambda$0;
        int i = this.d;
        z10 z10Var = null;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                rangeForRect_8_6BmAI$lambda$0 = AndroidParagraph.getRangeForRect_8_6BmAI$lambda$0((TextInclusionStrategy) obj5, (RectF) obj, (RectF) obj2);
                return Boolean.valueOf(rangeForRect_8_6BmAI$lambda$0);
            case 1:
                selectionIdSaver$lambda$0 = BasicTextKt.selectionIdSaver$lambda$0((SelectionRegistrar) obj5, (SaverScope) obj, ((Long) obj2).longValue());
                return selectionIdSaver$lambda$0;
            case 2:
                removeCurrentGroup$lambda$0 = ComposerKt.removeCurrentGroup$lambda$0((RememberManager) obj5, ((Integer) obj).intValue(), obj2);
                return removeCurrentGroup$lambda$0;
            case 3:
                SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$19 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$19((FiniteAnimationSpec) obj5, (IntSize) obj, (IntSize) obj2);
                return SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$19;
            case 4:
                DefaultTextContextMenuDropdown$lambda$0$0$0$0 = DefaultTextContextMenuDropdownProvider_androidKt.DefaultTextContextMenuDropdown$lambda$0$0$0$0((TextContextMenuItem) obj5, (Composer) obj, ((Integer) obj2).intValue());
                return DefaultTextContextMenuDropdown$lambda$0$0$0$0;
            case 5:
                dragAndDropModifierNode$lambda$0 = DragAndDropSourceNode.dragAndDropModifierNode$lambda$0((DragAndDropSourceNode) obj5, (DragAndDropStartTransferScope) obj, (Offset) obj2);
                return dragAndDropModifierNode$lambda$0;
            case 6:
                detectDragGesturesWithObserver$lambda$3 = LongPressTextDragObserverKt.detectDragGesturesWithObserver$lambda$3((TextDragObserver) obj5, (PointerInputChange) obj, (Offset) obj2);
                return detectDragGesturesWithObserver$lambda$3;
            case 7:
                ModalBottomSheetContent_7___e2Q$lambda$18$lambda$17 = ModalBottomSheetKt.ModalBottomSheetContent_7___e2Q$lambda$18$lambda$17((SheetState) obj5, (IntSize) obj, (Constraints) obj2);
                return ModalBottomSheetContent_7___e2Q$lambda$18$lambda$17;
            case 8:
                movableContentOf$lambda$0 = MovableContentKt.movableContentOf$lambda$0((MovableContent) obj5, (Composer) obj, ((Integer) obj2).intValue());
                return movableContentOf$lambda$0;
            case 9:
                mutableStateSaver$lambda$0$0 = RememberSaveableKt.mutableStateSaver$lambda$0$0((Saver) obj5, (SaverScope) obj, (MutableState) obj2);
                return mutableStateSaver$lambda$0$0;
            case 10:
                int intValue = ((Integer) obj).intValue();
                in inVar = (in) obj2;
                jn key = inVar.getKey();
                in inVar2 = ((ek0) obj5).e.get(key);
                if (key != ts.l) {
                    if (inVar != inVar2) {
                        intValue = Integer.MIN_VALUE;
                    }
                    intValue++;
                } else {
                    z10 z10Var2 = (z10) inVar2;
                    z10 z10Var3 = (z10) inVar;
                    while (z10Var3 != null) {
                        if (z10Var3 != z10Var2 && (z10Var3 instanceof tl0)) {
                            yh yhVar = (yh) dc.a.getObjectVolatile((tl0) z10Var3, i20.d);
                            z10Var3 = yhVar != null ? yhVar.getParent() : null;
                        } else {
                            z10Var = z10Var3;
                            if (z10Var == z10Var2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + z10Var + ", expected child of " + z10Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        }
                    }
                    if (z10Var == z10Var2) {
                    }
                }
                return Integer.valueOf(intValue);
            case 11:
                scrollSemanticsActions$lambda$0 = Scrollable2DNode.setScrollSemanticsActions$lambda$0((Scrollable2DNode) obj5, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                return Boolean.valueOf(scrollSemanticsActions$lambda$0);
            case Matrix.TranslateX /* 12 */:
                scrollSemanticsActions$lambda$02 = ScrollableNode.setScrollSemanticsActions$lambda$0((ScrollableNode) obj5, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                return Boolean.valueOf(scrollSemanticsActions$lambda$02);
            case Matrix.TranslateY /* 13 */:
                sort$lambda$0 = SelectionRegistrarImpl.sort$lambda$0((LayoutCoordinates) obj5, (Selectable) obj, (Selectable) obj2);
                return Integer.valueOf(sort$lambda$0);
            case Matrix.TranslateZ /* 14 */:
                awaitSlop_8vUncbI$lambda$49 = SliderKt.awaitSlop_8vUncbI$lambda$49((gi0) obj5, (PointerInputChange) obj, ((Float) obj2).floatValue());
                return awaitSlop_8vUncbI$lambda$49;
            case 15:
                applyObserver$lambda$0 = SnapshotStateObserver.applyObserver$lambda$0((SnapshotStateObserver) obj5, (Set) obj, (Snapshot) obj2);
                return applyObserver$lambda$0;
            case 16:
                List list = (List) obj5;
                CharSequence charSequence = (CharSequence) obj;
                int intValue2 = ((Integer) obj2).intValue();
                charSequence.getClass();
                if (list.size() == 1) {
                    String str = (String) yi.D0(list);
                    int m0 = ds0.m0(charSequence, str, intValue2, false, 4);
                    if (m0 >= 0) {
                        xe0Var = new xe0(Integer.valueOf(m0), str);
                        if (xe0Var == null) {
                            return new xe0(xe0Var.d, Integer.valueOf(((String) xe0Var.e).length()));
                        }
                        return null;
                    }
                    xe0Var = null;
                    if (xe0Var == null) {
                    }
                } else {
                    if (intValue2 < 0) {
                        intValue2 = 0;
                    }
                    k10 k10Var = new k10(intValue2, charSequence.length(), 1);
                    boolean z = charSequence instanceof String;
                    int i2 = k10Var.f;
                    int i3 = k10Var.e;
                    if (z) {
                        if ((i2 > 0 && intValue2 <= i3) || (i2 < 0 && i3 <= intValue2)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str2 = (String) obj4;
                                        if (str2.regionMatches(0, (String) charSequence, intValue2, str2.length())) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    xe0Var = new xe0(Integer.valueOf(intValue2), str3);
                                } else if (intValue2 != i3) {
                                    intValue2 += i2;
                                }
                            }
                        }
                        xe0Var = null;
                        if (xe0Var == null) {
                        }
                    } else {
                        if ((i2 > 0 && intValue2 <= i3) || (i2 < 0 && i3 <= intValue2)) {
                            int i4 = intValue2;
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        String str4 = (String) obj3;
                                        if (ds0.s0(str4, 0, charSequence, i4, str4.length(), false)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                String str5 = (String) obj3;
                                if (str5 != null) {
                                    xe0Var = new xe0(Integer.valueOf(i4), str5);
                                } else if (i4 != i3) {
                                    i4 += i2;
                                }
                            }
                        }
                        xe0Var = null;
                        if (xe0Var == null) {
                        }
                    }
                }
            case 17:
                dragAndDropNode$lambda$1 = TextFieldDecoratorModifierNode.dragAndDropNode$lambda$1((TextFieldDecoratorModifierNode) obj5, (ClipEntry) obj, (ClipMetadata) obj2);
                return Boolean.valueOf(dragAndDropNode$lambda$1);
            default:
                size$lambda$0 = WrapContentElement.Companion.size$lambda$0((Alignment) obj5, (IntSize) obj, (LayoutDirection) obj2);
                return size$lambda$0;
        }
    }
}
