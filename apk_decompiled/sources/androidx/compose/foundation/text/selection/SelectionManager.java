package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGesturesModifierKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerModifierKt;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequesterImpl;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.bq;
import defpackage.ca0;
import defpackage.dq;
import defpackage.hm;
import defpackage.ii0;
import defpackage.ij0;
import defpackage.iy;
import defpackage.ji0;
import defpackage.k60;
import defpackage.kn0;
import defpackage.ky;
import defpackage.l60;
import defpackage.m60;
import defpackage.mn0;
import defpackage.my;
import defpackage.o;
import defpackage.on0;
import defpackage.oy;
import defpackage.p01;
import defpackage.p10;
import defpackage.pa0;
import defpackage.q10;
import defpackage.ra0;
import defpackage.te0;
import defpackage.un;
import defpackage.vn;
import defpackage.w01;
import defpackage.x5;
import defpackage.xe0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectionManager {
    public static final int $stable = 8;
    private LayoutCoordinates containerLayoutCoordinates;
    private un coroutineScope;
    private final MutableState currentDragPosition$delegate;
    private final MutableState dragBeginPosition$delegate;
    private final MutableState dragTotalDistance$delegate;
    private final MutableState draggingHandle$delegate;
    private final MutableState endHandlePosition$delegate;
    private HapticFeedback hapticFeedBack;
    private boolean isLongPressOrClickSelection;
    private ky onCopyHandler;
    private PlatformSelectionBehaviors platformSelectionBehaviors;
    private Offset previousPosition;
    private SelectionLayout previousSelectionLayout;
    private final SelectionRegistrarImpl selectionRegistrar;
    private boolean showToolbar;
    private final MutableState startHandlePosition$delegate;
    private TextToolbar textToolbar;
    private final MutableState<Selection> _selection = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState<Boolean> _isInTouchMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    private ky onSelectionChange = new mn0(this, 7);
    private ToolbarRequester toolbarRequester = new ToolbarRequesterImpl();
    private FocusRequester focusRequester = new FocusRequester();
    private final MutableState hasFocus$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    private final State derivedContentRect$delegate = SnapshotStateKt.derivedStateOf(new kn0(this, 4));
    private final MutableState positionChangeState$delegate = SnapshotStateKt.mutableStateOf(w01.a, SnapshotStateKt.neverEqualPolicy());

    public SelectionManager(SelectionRegistrarImpl selectionRegistrarImpl) {
        this.selectionRegistrar = selectionRegistrarImpl;
        int i = 2;
        Offset.Companion companion = Offset.Companion;
        this.dragBeginPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4505boximpl(companion.m4532getZeroF1C5BW0()), null, 2, null);
        this.dragTotalDistance$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4505boximpl(companion.m4532getZeroF1C5BW0()), null, 2, null);
        this.startHandlePosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.endHandlePosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggingHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        selectionRegistrarImpl.setOnPositionChangeCallback$foundation(new mn0(this, 8));
        int i2 = 1;
        selectionRegistrarImpl.setOnSelectionUpdateStartCallback$foundation(new x5(this, i2));
        selectionRegistrarImpl.setOnSelectionUpdateSelectAll$foundation(new on0(this, 0));
        selectionRegistrarImpl.setOnSelectionUpdateCallback$foundation(new ca0(this, i));
        selectionRegistrarImpl.setOnSelectionUpdateEndCallback$foundation(new kn0(this, 3));
        selectionRegistrarImpl.setOnSelectableChangeCallback$foundation(new mn0(this, i2));
        selectionRegistrarImpl.setAfterSelectableUnsubscribe$foundation(new mn0(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect _get_contextMenuAreaModifier_$lambda$0(SelectionManager selectionManager, LayoutCoordinates layoutCoordinates) {
        Rect derivedContentRect = selectionManager.getDerivedContentRect();
        if (derivedContentRect == null) {
            return null;
        }
        LayoutCoordinates layoutCoordinates2 = selectionManager.containerLayoutCoordinates;
        if (layoutCoordinates2 != null) {
            return TextContextMenuToolbarHandlerModifierKt.translateRootToDestination(derivedContentRect, layoutCoordinates2, layoutCoordinates);
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
        o.j();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _get_modifier_$lambda$0(SelectionManager selectionManager) {
        selectionManager.onRelease();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _get_modifier_$lambda$1(SelectionManager selectionManager, LayoutCoordinates layoutCoordinates) {
        selectionManager.setContainerLayoutCoordinates(layoutCoordinates);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _get_modifier_$lambda$2(SelectionManager selectionManager, FocusState focusState) {
        if (!focusState.getHasFocus() && selectionManager.getHasFocus()) {
            selectionManager.onRelease();
        }
        selectionManager.setHasFocus(focusState.getHasFocus());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _get_modifier_$lambda$3(SelectionManager selectionManager, boolean z) {
        selectionManager.setInTouchMode(z);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _init_$lambda$0(SelectionManager selectionManager, long j) {
        boolean a = selectionManager.selectionRegistrar.getSubselections().a(j);
        w01 w01Var = w01.a;
        if (a) {
            selectionManager.setPositionChangeState(w01Var);
            selectionManager.updateHandleOffsets();
            selectionManager.updateSelectionToolbar();
        }
        return w01Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _init_$lambda$1(SelectionManager selectionManager, boolean z, LayoutCoordinates layoutCoordinates, Offset offset, SelectionAdjustment selectionAdjustment) {
        long mo6242getSizeYbymL2g = layoutCoordinates.mo6242getSizeYbymL2g();
        Rect rect = new Rect(0.0f, 0.0f, (int) (mo6242getSizeYbymL2g >> 32), (int) (mo6242getSizeYbymL2g & 4294967295L));
        long m1514convertToContainerCoordinatesR5De75A = selectionManager.m1514convertToContainerCoordinatesR5De75A(layoutCoordinates, SelectionManagerKt.m1535containsInclusiveUv8p0NA(rect, offset.m4526unboximpl()) ? offset.m4526unboximpl() : TextLayoutStateKt.m1353coerceIn3MmeM6k(offset.m4526unboximpl(), rect));
        if ((androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask & m1514convertToContainerCoordinatesR5De75A) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            selectionManager.setInTouchMode(z);
            selectionManager.m1521startSelection9KIMszo(m1514convertToContainerCoordinatesR5De75A, false, selectionAdjustment);
            FocusRequester.m4419requestFocus3ESFkO8$default(selectionManager.focusRequester, 0, 1, null);
            selectionManager.setShowToolbar$foundation(false);
            selectionManager.isLongPressOrClickSelection = true;
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _init_$lambda$2(SelectionManager selectionManager, boolean z, long j) {
        xe0 selectAllInSelectable$foundation = selectionManager.selectAllInSelectable$foundation(j, selectionManager.getSelection());
        Selection selection = (Selection) selectAllInSelectable$foundation.d;
        l60 l60Var = (l60) selectAllInSelectable$foundation.e;
        if (!q10.b(selection, selectionManager.getSelection())) {
            selectionManager.selectionRegistrar.setSubselections(l60Var);
            selectionManager.onSelectionChange.invoke(selection);
        }
        selectionManager.setInTouchMode(z);
        FocusRequester.m4419requestFocus3ESFkO8$default(selectionManager.focusRequester, 0, 1, null);
        selectionManager.setShowToolbar$foundation(false);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$3(SelectionManager selectionManager, boolean z, LayoutCoordinates layoutCoordinates, Offset offset, Offset offset2, boolean z2, SelectionAdjustment selectionAdjustment) {
        long m1514convertToContainerCoordinatesR5De75A = selectionManager.m1514convertToContainerCoordinatesR5De75A(layoutCoordinates, offset.m4526unboximpl());
        long m1514convertToContainerCoordinatesR5De75A2 = selectionManager.m1514convertToContainerCoordinatesR5De75A(layoutCoordinates, offset2.m4526unboximpl());
        selectionManager.setInTouchMode(z);
        return selectionManager.m1529updateSelectionqNKwrvQ$foundation(Offset.m4505boximpl(m1514convertToContainerCoordinatesR5De75A), m1514convertToContainerCoordinatesR5De75A2, z2, selectionAdjustment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _init_$lambda$4(SelectionManager selectionManager) {
        selectionManager.setShowToolbar$foundation(true);
        selectionManager.setDraggingHandle(null);
        selectionManager.m1516setCurrentDragPosition_kEHs6E(null);
        if (selectionManager.isLongPressOrClickSelection && selectionManager.isNonEmptySelection$foundation()) {
            selectionManager.suggestSelectionForLongPressOrDoubleClick();
        }
        selectionManager.isLongPressOrClickSelection = false;
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _init_$lambda$5(SelectionManager selectionManager, long j) {
        if (selectionManager.selectionRegistrar.getSubselections().a(j)) {
            selectionManager.onRelease();
            selectionManager.setSelection(null);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _init_$lambda$6(SelectionManager selectionManager, long j) {
        Selection.AnchorInfo end;
        Selection.AnchorInfo start;
        Selection selection = selectionManager.getSelection();
        if (selection != null && (start = selection.getStart()) != null && j == start.getSelectableId()) {
            selectionManager.m1520setStartHandlePosition_kEHs6E(null);
        }
        Selection selection2 = selectionManager.getSelection();
        if (selection2 != null && (end = selection2.getEnd()) != null && j == end.getSelectableId()) {
            selectionManager.m1519setEndHandlePosition_kEHs6E(null);
        }
        if (selectionManager.selectionRegistrar.getSubselections().a(j)) {
            selectionManager.updateSelectionToolbar();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _set_onSelectionChange_$lambda$0(SelectionManager selectionManager, ky kyVar, Selection selection) {
        selectionManager.setSelection(selection);
        kyVar.invoke(selection);
        return w01.a;
    }

    private final Modifier addContextMenuComponents(Modifier modifier) {
        return ComposeFoundationFlags.isNewContextMenuEnabled ? SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents(modifier, this) : modifier;
    }

    /* renamed from: convertToContainerCoordinates-R5De75A, reason: not valid java name */
    private final long m1514convertToContainerCoordinatesR5De75A(LayoutCoordinates layoutCoordinates, long j) {
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        return (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) ? Offset.Companion.m4531getUnspecifiedF1C5BW0() : requireContainerCoordinates$foundation().mo6243localPositionOfR5De75A(layoutCoordinates, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getContentRect() {
        LayoutCoordinates layoutCoordinates;
        List firstAndLast;
        Rect rect;
        getPositionChangeState();
        if (getSelection() == null || (layoutCoordinates = this.containerLayoutCoordinates) == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        ArrayList arrayList = new ArrayList(sort.size());
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            Selectable selectable = sort.get(i);
            Selection selection = (Selection) this.selectionRegistrar.getSubselections().b(selectable.getSelectableId());
            xe0 xe0Var = selection != null ? new xe0(selectable, selection) : null;
            if (xe0Var != null) {
                arrayList.add(xe0Var);
            }
        }
        firstAndLast = SelectionManagerKt.firstAndLast(arrayList);
        if (firstAndLast.isEmpty()) {
            return null;
        }
        Rect selectedRegionRect = SelectionManagerKt.getSelectedRegionRect(firstAndLast, layoutCoordinates);
        rect = SelectionManagerKt.invertedInfiniteRect;
        if (q10.b(selectedRegionRect, rect)) {
            return null;
        }
        Rect intersect = SelectionManagerKt.visibleBounds(layoutCoordinates).intersect(selectedRegionRect);
        if (intersect.getRight() - intersect.getLeft() < 0.0f || intersect.getBottom() - intersect.getTop() < 0.0f) {
            return null;
        }
        Rect m4553translatek4lQ0M = intersect.m4553translatek4lQ0M(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
        return Rect.copy$default(m4553translatek4lQ0M, 0.0f, 0.0f, 0.0f, (SelectionHandlesKt.getHandleHeight() * 4.0f) + m4553translatek4lQ0M.getBottom(), 7, null);
    }

    private final Rect getDerivedContentRect() {
        return (Rect) this.derivedContentRect$delegate.getValue();
    }

    private final w01 getPositionChangeState() {
        this.positionChangeState$delegate.getValue();
        return w01.a;
    }

    /* renamed from: getSelectionLayout-Wko1d7g, reason: not valid java name */
    private final SelectionLayout m1515getSelectionLayoutWko1d7g(long j, long j2, boolean z) {
        LayoutCoordinates requireContainerCoordinates$foundation = requireContainerCoordinates$foundation();
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation);
        int i = k60.a;
        final pa0 pa0Var = new pa0(6);
        int size = sort.size();
        for (int i2 = 0; i2 < size; i2++) {
            pa0Var.e(sort.get(i2).getSelectableId(), i2);
        }
        SelectionLayoutBuilder selectionLayoutBuilder = new SelectionLayoutBuilder(j, j2, requireContainerCoordinates$foundation, z, (androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask & j2) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? null : getSelection(), new Comparator() { // from class: androidx.compose.foundation.text.selection.SelectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return p01.i(Integer.valueOf(pa0.this.b(((Number) t).longValue())), Integer.valueOf(pa0.this.b(((Number) t2).longValue())));
            }
        }, null);
        int size2 = sort.size();
        for (int i3 = 0; i3 < size2; i3++) {
            sort.get(i3).appendSelectableInfoToBuilder(selectionLayoutBuilder);
        }
        return selectionLayoutBuilder.build();
    }

    private final boolean getShouldShowMagnifier() {
        return isDraggingInProgress() && isInTouchMode() && !isTriviallyCollapsedSelection$foundation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDraggingInProgress() {
        return getDraggingHandle() != null;
    }

    private final Modifier onClearSelectionRequested(Modifier modifier, final iy iyVar) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, w01.a, new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1

            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            @bq(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1", f = "SelectionManager.kt", l = {994, 1000}, m = "invokeSuspend", v = 1)
            /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends ij0 implements my {
                final /* synthetic */ iy $block;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SelectionManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(SelectionManager selectionManager, iy iyVar, hm hmVar) {
                    super(hmVar);
                    this.this$0 = selectionManager;
                    this.$block = iyVar;
                }

                @Override // defpackage.mc
                public final hm create(Object obj, hm hmVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, hmVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // defpackage.my
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
                
                    if (r12 == r4) goto L16;
                 */
                @Override // defpackage.mc
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    AnonymousClass1 anonymousClass1;
                    AwaitPointerEventScope awaitPointerEventScope;
                    boolean isDraggingInProgress;
                    int i = this.label;
                    vn vnVar = vn.d;
                    if (i == 0) {
                        p10.Q(obj);
                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                        this.L$0 = awaitPointerEventScope2;
                        this.label = 1;
                        anonymousClass1 = this;
                        obj = TapGestureDetectorKt.awaitPrimaryFirstDown$default(awaitPointerEventScope2, false, null, anonymousClass1, 2, null);
                        if (obj != vnVar) {
                            awaitPointerEventScope = awaitPointerEventScope2;
                        }
                        return vnVar;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        anonymousClass1 = this;
                        if (!((Boolean) obj).booleanValue()) {
                            isDraggingInProgress = anonymousClass1.this$0.isDraggingInProgress();
                            if (!isDraggingInProgress) {
                                anonymousClass1.$block.invoke();
                            }
                        }
                        return w01.a;
                    }
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    p10.Q(obj);
                    anonymousClass1 = this;
                    PointerEventPass pointerEventPass = PointerEventPass.Initial;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                    obj = DragGestureDetectorKt.awaitAllPointersUpWithSlopDetection(awaitPointerEventScope, (PointerInputChange) obj, pointerEventPass, anonymousClass1);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(SelectionManager.this, iyVar, null), hmVar);
                return awaitEachGesture == vn.d ? awaitEachGesture : w01.a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 onSelectionChange$lambda$0(SelectionManager selectionManager, Selection selection) {
        selectionManager.setSelection(selection);
        return w01.a;
    }

    private final void selectionChanged(SelectionLayout selectionLayout, Selection selection) {
        HapticFeedback hapticFeedback;
        if (shouldPerformHaptics$foundation() && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo5532performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m5549getTextHandleMove5zf0vsI());
        }
        this.selectionRegistrar.setSubselections(selectionLayout.createSubSelections(selection));
        this.onSelectionChange.invoke(selection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m1516setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragBeginPosition-k-4lQ0M, reason: not valid java name */
    public final void m1517setDragBeginPositionk4lQ0M(long j) {
        this.dragBeginPosition$delegate.setValue(Offset.m4505boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragTotalDistance-k-4lQ0M, reason: not valid java name */
    public final void m1518setDragTotalDistancek4lQ0M(long j) {
        this.dragTotalDistance$delegate.setValue(Offset.m4505boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    /* renamed from: setEndHandlePosition-_kEHs6E, reason: not valid java name */
    private final void m1519setEndHandlePosition_kEHs6E(Offset offset) {
        this.endHandlePosition$delegate.setValue(offset);
    }

    private final void setPositionChangeState(w01 w01Var) {
        this.positionChangeState$delegate.setValue(w01Var);
    }

    /* renamed from: setStartHandlePosition-_kEHs6E, reason: not valid java name */
    private final void m1520setStartHandlePosition_kEHs6E(Offset offset) {
        this.startHandlePosition$delegate.setValue(offset);
    }

    /* renamed from: startSelection-9KIMszo, reason: not valid java name */
    private final void m1521startSelection9KIMszo(long j, boolean z, SelectionAdjustment selectionAdjustment) {
        this.previousSelectionLayout = null;
        m1528updateSelectionjyLRC_s$foundation(j, Offset.Companion.m4531getUnspecifiedF1C5BW0(), z, selectionAdjustment);
    }

    private final void suggestSelectionForLongPressOrDoubleClick() {
        int i;
        un unVar;
        ji0 ji0Var = new ji0();
        ji0 ji0Var2 = new ji0();
        ii0 ii0Var = new ii0();
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        ListIterator<Selectable> listIterator = sort.listIterator(sort.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            Selection selection = (Selection) this.selectionRegistrar.getSubselections().b(listIterator.previous().getSelectableId());
            if (selection != null && selection.getStart().getOffset() != selection.getEnd().getOffset()) {
                i = listIterator.nextIndex();
                break;
            }
        }
        if (i != -1) {
            int size = sort.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Selectable selectable = sort.get(i2);
                Selection selection2 = (Selection) this.selectionRegistrar.getSubselections().b(selectable.getSelectableId());
                if (selection2 != null) {
                    AnnotatedString text = selectable.getText();
                    long TextRange = TextRangeKt.TextRange(selection2.getStart().getOffset(), selection2.getEnd().getOffset());
                    boolean z = i2 >= i;
                    long selectableId = selectable.getSelectableId();
                    if (z) {
                        ji0Var.d = text;
                        ji0Var2.d = TextRange.m7048boximpl(TextRange);
                        ii0Var.d = selectableId;
                    }
                } else {
                    i2++;
                }
            }
        }
        Object obj = ji0Var.d;
        if (obj == null || ji0Var2.d == null || ii0Var.d == 0 || ((CharSequence) obj).length() <= 0 || (unVar = this.coroutineScope) == null) {
            return;
        }
        p01.t(unVar, null, null, new SelectionManager$suggestSelectionForLongPressOrDoubleClick$2(this, ji0Var, ji0Var2, ii0Var, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toolbarCopy() {
        copy$foundation();
        onRelease();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (androidx.compose.foundation.text.selection.SelectionManagerKt.m1535containsInclusiveUv8p0NA(r8, r13) == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateHandleOffsets() {
        Offset offset;
        Selection.AnchorInfo end;
        Selection.AnchorInfo start;
        Selection selection = getSelection();
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        Offset offset2 = null;
        Selectable anchorSelectable$foundation = (selection == null || (start = selection.getStart()) == null) ? null : getAnchorSelectable$foundation(start);
        Selectable anchorSelectable$foundation2 = (selection == null || (end = selection.getEnd()) == null) ? null : getAnchorSelectable$foundation(end);
        LayoutCoordinates layoutCoordinates2 = anchorSelectable$foundation != null ? anchorSelectable$foundation.getLayoutCoordinates() : null;
        LayoutCoordinates layoutCoordinates3 = anchorSelectable$foundation2 != null ? anchorSelectable$foundation2.getLayoutCoordinates() : null;
        if (selection == null || layoutCoordinates == null || !layoutCoordinates.isAttached() || (layoutCoordinates2 == null && layoutCoordinates3 == null)) {
            m1520setStartHandlePosition_kEHs6E(null);
            m1519setEndHandlePosition_kEHs6E(null);
            return;
        }
        Rect visibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates);
        if (layoutCoordinates2 != null) {
            long mo1483getHandlePositiondBAh8RU = anchorSelectable$foundation.mo1483getHandlePositiondBAh8RU(selection, true);
            if ((mo1483getHandlePositiondBAh8RU & androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                offset = Offset.m4505boximpl(layoutCoordinates.mo6243localPositionOfR5De75A(layoutCoordinates2, mo1483getHandlePositiondBAh8RU));
                long m4526unboximpl = offset.m4526unboximpl();
                if (getDraggingHandle() != Handle.SelectionStart) {
                }
                m1520setStartHandlePosition_kEHs6E(offset);
                if (layoutCoordinates3 != null) {
                    long mo1483getHandlePositiondBAh8RU2 = anchorSelectable$foundation2.mo1483getHandlePositiondBAh8RU(selection, false);
                    if ((androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask & mo1483getHandlePositiondBAh8RU2) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                        Offset m4505boximpl = Offset.m4505boximpl(layoutCoordinates.mo6243localPositionOfR5De75A(layoutCoordinates3, mo1483getHandlePositiondBAh8RU2));
                        long m4526unboximpl2 = m4505boximpl.m4526unboximpl();
                        if (getDraggingHandle() == Handle.SelectionEnd || SelectionManagerKt.m1535containsInclusiveUv8p0NA(visibleBounds, m4526unboximpl2)) {
                            offset2 = m4505boximpl;
                        }
                    }
                }
                m1519setEndHandlePosition_kEHs6E(offset2);
            }
        }
        offset = null;
        m1520setStartHandlePosition_kEHs6E(offset);
        if (layoutCoordinates3 != null) {
        }
        m1519setEndHandlePosition_kEHs6E(offset2);
    }

    private final void updateSelectionTextToolbar() {
        TextToolbar textToolbar = this.textToolbar;
        if (textToolbar == null) {
            return;
        }
        if (!this.showToolbar || !isInTouchMode()) {
            if (textToolbar.getStatus() == TextToolbarStatus.Shown) {
                textToolbar.hide();
            }
        } else {
            Rect contentRect = getContentRect();
            if (contentRect == null) {
                return;
            }
            TextToolbar.showMenu$default(textToolbar, contentRect, canCopy$foundation() ? new SelectionManager$updateSelectionTextToolbar$1(this) : null, null, null, isEntireContainerSelected$foundation() ? null : new SelectionManager$updateSelectionTextToolbar$2(this), null, 12, null);
        }
    }

    private final void updateSelectionToolbar() {
        if (getHasFocus()) {
            if (!ComposeFoundationFlags.isNewContextMenuEnabled) {
                updateSelectionTextToolbar();
                return;
            }
            if (!this.showToolbar || !isInTouchMode()) {
                this.toolbarRequester.hide();
            } else {
                if (getDerivedContentRect() == null) {
                    return;
                }
                this.toolbarRequester.show();
            }
        }
    }

    public final boolean canCopy$foundation() {
        return this.onCopyHandler != null && isNonEmptySelection$foundation();
    }

    public final void copy$foundation() {
        ky kyVar;
        AnnotatedString selectedText$foundation = getSelectedText$foundation();
        if (selectedText$foundation != null) {
            if (selectedText$foundation.length() <= 0) {
                selectedText$foundation = null;
            }
            if (selectedText$foundation == null || (kyVar = this.onCopyHandler) == null) {
                return;
            }
            kyVar.invoke(selectedText$foundation);
        }
    }

    public final void forEachSelectableWithSelection$foundation(oy oyVar) {
        int i;
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        ListIterator<Selectable> listIterator = sort.listIterator(sort.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            Selection selection = (Selection) this.selectionRegistrar.getSubselections().b(listIterator.previous().getSelectableId());
            if (selection != null && selection.getStart().getOffset() != selection.getEnd().getOffset()) {
                i = listIterator.nextIndex();
                break;
            }
        }
        if (i == -1) {
            return;
        }
        int size = sort.size();
        int i2 = 0;
        while (i2 < size) {
            Selectable selectable = sort.get(i2);
            Selection selection2 = (Selection) this.selectionRegistrar.getSubselections().b(selectable.getSelectableId());
            if (selection2 != null) {
                if (!((Boolean) oyVar.invoke(Long.valueOf(selectable.getSelectableId()), selectable.getText(), TextRange.m7048boximpl(TextRangeKt.TextRange(selection2.getStart().getOffset(), selection2.getEnd().getOffset())), Boolean.valueOf(i2 >= i))).booleanValue()) {
                    return;
                }
            }
            i2++;
        }
    }

    public final Selectable getAnchorSelectable$foundation(Selection.AnchorInfo anchorInfo) {
        return (Selectable) this.selectionRegistrar.getSelectableMap$foundation().b(anchorInfo.getSelectableId());
    }

    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    public final Modifier getContextMenuAreaModifier() {
        return TextContextMenuToolbarHandlerModifierKt.textContextMenuToolbarHandler$default(TextContextMenuGesturesModifierKt.showTextContextMenuOnSecondaryClick(Modifier.Companion, new SelectionManager$contextMenuAreaModifier$1(this, null)), this.toolbarRequester, new SelectionManager$contextMenuAreaModifier$2(this, null), null, new mn0(this, 6), 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final xe0 getContextTextAndSelection$foundation() {
        int i;
        int i2;
        int i3;
        dq dqVar;
        dq dqVar2 = null;
        if (getSelection() == null || this.selectionRegistrar.getSelectables$foundation().isEmpty()) {
            return null;
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, dqVar2);
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        ListIterator<Selectable> listIterator = sort.listIterator(sort.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            Selection selection = (Selection) this.selectionRegistrar.getSubselections().b(listIterator.previous().getSelectableId());
            if (selection != null && selection.getStart().getOffset() != selection.getEnd().getOffset()) {
                i = listIterator.nextIndex();
                break;
            }
        }
        if (i != -1) {
            int size = sort.size();
            int i4 = 0;
            i2 = -1;
            i3 = -1;
            while (i4 < size) {
                Selectable selectable = sort.get(i4);
                Selection selection2 = (Selection) this.selectionRegistrar.getSubselections().b(selectable.getSelectableId());
                if (selection2 != null) {
                    AnnotatedString text = selectable.getText();
                    long TextRange = TextRangeKt.TextRange(selection2.getStart().getOffset(), selection2.getEnd().getOffset());
                    boolean z = i4 >= i;
                    selectable.getSelectableId();
                    if (i2 == -1) {
                        i2 = TextRange.m7058getMinimpl(TextRange);
                        builder.append(text, 0, TextRange.m7058getMinimpl(TextRange));
                    }
                    dqVar = dqVar2;
                    builder.append(text, TextRange.m7058getMinimpl(TextRange), TextRange.m7057getMaximpl(TextRange));
                    if (z) {
                        i3 = builder.getLength();
                        builder.append(text, TextRange.m7057getMaximpl(TextRange), text.length());
                    } else {
                        builder.append('\n');
                    }
                } else {
                    dqVar = dqVar2;
                }
                i4++;
                dqVar2 = dqVar;
            }
        } else {
            i2 = -1;
            i3 = -1;
        }
        xe0 xe0Var = dqVar2;
        return (i2 == -1 || i3 == -1) ? xe0Var : new xe0(builder.toAnnotatedString(), TextRange.m7048boximpl(TextRangeKt.TextRange(i2, i3)));
    }

    public final un getCoroutineScope$foundation() {
        return this.coroutineScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m1522getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragBeginPosition-F1C5BW0$foundation, reason: not valid java name */
    public final long m1523getDragBeginPositionF1C5BW0$foundation() {
        return ((Offset) this.dragBeginPosition$delegate.getValue()).m4526unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragTotalDistance-F1C5BW0$foundation, reason: not valid java name */
    public final long m1524getDragTotalDistanceF1C5BW0$foundation() {
        return ((Offset) this.dragTotalDistance$delegate.getValue()).m4526unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    public final float getEndHandleLineHeight() {
        Selectable anchorSelectable$foundation;
        Selection selection = getSelection();
        if (selection == null || (anchorSelectable$foundation = getAnchorSelectable$foundation(selection.getEnd())) == null) {
            return 0.0f;
        }
        return anchorSelectable$foundation.getLineHeight(selection.getEnd().getOffset());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getEndHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m1525getEndHandlePosition_m7T9E() {
        return (Offset) this.endHandlePosition$delegate.getValue();
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    public final Modifier getModifier() {
        Modifier modifier = Modifier.Companion;
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(SelectionGesturesKt.updateSelectionTouchMode(FocusableKt.focusable$default(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(onClearSelectionRequested(modifier, new kn0(this, 2)), new mn0(this, 3)), this.focusRequester), new mn0(this, 4)), false, null, 3, null), new mn0(this, 5)), new ky() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$5
            @Override // defpackage.ky
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m1531invokeZmokQxo(((KeyEvent) obj).m5921unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m1531invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z;
                if (SelectionManager_androidKt.m1537isCopyKeyEventZmokQxo(keyEvent)) {
                    SelectionManager.this.copy$foundation();
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
        if (getShouldShowMagnifier()) {
            modifier = SelectionManager_androidKt.selectionMagnifier(modifier, this);
        }
        return addContextMenuComponents(onKeyEvent.then(modifier));
    }

    public final ky getOnCopyHandler() {
        return this.onCopyHandler;
    }

    public final ky getOnSelectionChange() {
        return this.onSelectionChange;
    }

    public final PlatformSelectionBehaviors getPlatformSelectionBehaviors$foundation() {
        return this.platformSelectionBehaviors;
    }

    public final SelectionLayout getPreviousSelectionLayout$foundation() {
        return this.previousSelectionLayout;
    }

    public final AnnotatedString getSelectedText$foundation() {
        int i;
        dq dqVar = null;
        if (getSelection() == null || this.selectionRegistrar.getSubselections().e == 0) {
            return null;
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, dqVar);
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        ListIterator<Selectable> listIterator = sort.listIterator(sort.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            Selection selection = (Selection) this.selectionRegistrar.getSubselections().b(listIterator.previous().getSelectableId());
            if (selection != null && selection.getStart().getOffset() != selection.getEnd().getOffset()) {
                i = listIterator.nextIndex();
                break;
            }
        }
        if (i != -1) {
            int size = sort.size();
            int i2 = 0;
            while (i2 < size) {
                Selectable selectable = sort.get(i2);
                Selection selection2 = (Selection) this.selectionRegistrar.getSubselections().b(selectable.getSelectableId());
                if (selection2 != null) {
                    AnnotatedString text = selectable.getText();
                    long TextRange = TextRangeKt.TextRange(selection2.getStart().getOffset(), selection2.getEnd().getOffset());
                    boolean z = i2 >= i;
                    selectable.getSelectableId();
                    builder.append(text, TextRange.m7058getMinimpl(TextRange), TextRange.m7057getMaximpl(TextRange));
                    if (!z) {
                        builder.append('\n');
                    }
                }
                i2++;
            }
        }
        return builder.toAnnotatedString();
    }

    public final Selection getSelection() {
        return this._selection.getValue();
    }

    public final boolean getShowToolbar$foundation() {
        return this.showToolbar;
    }

    public final float getStartHandleLineHeight() {
        Selectable anchorSelectable$foundation;
        Selection selection = getSelection();
        if (selection == null || (anchorSelectable$foundation = getAnchorSelectable$foundation(selection.getStart())) == null) {
            return 0.0f;
        }
        return anchorSelectable$foundation.getLineHeight(selection.getStart().getOffset());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getStartHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m1526getStartHandlePosition_m7T9E() {
        return (Offset) this.startHandlePosition$delegate.getValue();
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final ToolbarRequester getToolbarRequester$foundation() {
        return this.toolbarRequester;
    }

    public final TextDragObserver handleDragObserver(final boolean z) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager$handleDragObserver$1
            private final void done() {
                this.setShowToolbar$foundation(true);
                this.setDraggingHandle(null);
                this.m1516setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                done();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1170onDownk4lQ0M(long j) {
                LayoutCoordinates layoutCoordinates;
                boolean z2 = z;
                SelectionManager selectionManager = this;
                Offset m1526getStartHandlePosition_m7T9E = z2 ? selectionManager.m1526getStartHandlePosition_m7T9E() : selectionManager.m1525getEndHandlePosition_m7T9E();
                if (m1526getStartHandlePosition_m7T9E != null) {
                    m1526getStartHandlePosition_m7T9E.m4526unboximpl();
                    Selection selection = this.getSelection();
                    if (selection == null) {
                        return;
                    }
                    Selectable anchorSelectable$foundation = this.getAnchorSelectable$foundation(z ? selection.getStart() : selection.getEnd());
                    if (anchorSelectable$foundation == null || (layoutCoordinates = anchorSelectable$foundation.getLayoutCoordinates()) == null) {
                        return;
                    }
                    long mo1483getHandlePositiondBAh8RU = anchorSelectable$foundation.mo1483getHandlePositiondBAh8RU(selection, z);
                    if ((androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask & mo1483getHandlePositiondBAh8RU) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                        return;
                    }
                    long m1506getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1506getAdjustedCoordinatesk4lQ0M(mo1483getHandlePositiondBAh8RU);
                    SelectionManager selectionManager2 = this;
                    selectionManager2.m1516setCurrentDragPosition_kEHs6E(Offset.m4505boximpl(selectionManager2.requireContainerCoordinates$foundation().mo6243localPositionOfR5De75A(layoutCoordinates, m1506getAdjustedCoordinatesk4lQ0M)));
                    this.setDraggingHandle(z ? Handle.SelectionStart : Handle.SelectionEnd);
                    this.setShowToolbar$foundation(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1171onDragk4lQ0M(long j) {
                if (this.getDraggingHandle() == null) {
                    return;
                }
                SelectionManager selectionManager = this;
                selectionManager.m1518setDragTotalDistancek4lQ0M(Offset.m4521plusMKHz9U(selectionManager.m1524getDragTotalDistanceF1C5BW0$foundation(), j));
                long m4521plusMKHz9U = Offset.m4521plusMKHz9U(this.m1523getDragBeginPositionF1C5BW0$foundation(), this.m1524getDragTotalDistanceF1C5BW0$foundation());
                if (this.m1529updateSelectionqNKwrvQ$foundation(Offset.m4505boximpl(m4521plusMKHz9U), this.m1523getDragBeginPositionF1C5BW0$foundation(), z, SelectionAdjustment.Companion.getCharacterWithWordAccelerate())) {
                    this.m1517setDragBeginPositionk4lQ0M(m4521plusMKHz9U);
                    this.m1518setDragTotalDistancek4lQ0M(Offset.Companion.m4532getZeroF1C5BW0());
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-3MmeM6k */
            public void mo1172onStart3MmeM6k(long j, SelectionAdjustment selectionAdjustment) {
                if (this.getDraggingHandle() == null) {
                    return;
                }
                Selection selection = this.getSelection();
                selection.getClass();
                Object b = this.selectionRegistrar.getSelectableMap$foundation().b((z ? selection.getStart() : selection.getEnd()).getSelectableId());
                if (b == null) {
                    InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("SelectionRegistrar should contain the current selection's selectableIds");
                    o.j();
                    return;
                }
                Selectable selectable = (Selectable) b;
                LayoutCoordinates layoutCoordinates = selectable.getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Current selectable should have layout coordinates.");
                    o.j();
                    return;
                }
                long mo1483getHandlePositiondBAh8RU = selectable.mo1483getHandlePositiondBAh8RU(selection, z);
                if ((androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask & mo1483getHandlePositiondBAh8RU) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                    return;
                }
                long m1506getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1506getAdjustedCoordinatesk4lQ0M(mo1483getHandlePositiondBAh8RU);
                SelectionManager selectionManager = this;
                selectionManager.m1517setDragBeginPositionk4lQ0M(selectionManager.requireContainerCoordinates$foundation().mo6243localPositionOfR5De75A(layoutCoordinates, m1506getAdjustedCoordinatesk4lQ0M));
                this.m1518setDragTotalDistancek4lQ0M(Offset.Companion.m4532getZeroF1C5BW0());
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                done();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                done();
            }
        };
    }

    public final boolean isEntireContainerSelected$foundation() {
        Selection selection;
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        if (sort.isEmpty()) {
            return true;
        }
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            Selectable selectable = sort.get(i);
            AnnotatedString text = selectable.getText();
            if (text.length() != 0 && ((selection = (Selection) this.selectionRegistrar.getSubselections().b(selectable.getSelectableId())) == null || Math.abs(selection.getStart().getOffset() - selection.getEnd().getOffset()) != text.length())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInTouchMode() {
        return this._isInTouchMode.getValue().booleanValue();
    }

    public final boolean isNonEmptySelection$foundation() {
        Selection selection = getSelection();
        if (selection == null || q10.b(selection.getStart(), selection.getEnd())) {
            return false;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return true;
        }
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            Selection selection2 = (Selection) this.selectionRegistrar.getSubselections().b(sort.get(i).getSelectableId());
            if (selection2 != null && selection2.getStart().getOffset() != selection2.getEnd().getOffset()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isTriviallyCollapsedSelection$foundation() {
        Selection selection = getSelection();
        if (selection == null) {
            return true;
        }
        return q10.b(selection.getStart(), selection.getEnd());
    }

    public final void onRelease() {
        HapticFeedback hapticFeedback;
        SelectionRegistrarImpl selectionRegistrarImpl = this.selectionRegistrar;
        ra0 ra0Var = m60.a;
        ra0Var.getClass();
        selectionRegistrarImpl.setSubselections(ra0Var);
        setShowToolbar$foundation(false);
        if (getSelection() != null) {
            this.onSelectionChange.invoke(null);
            if (!isInTouchMode() || (hapticFeedback = this.hapticFeedBack) == null) {
                return;
            }
            hapticFeedback.mo5532performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m5549getTextHandleMove5zf0vsI());
        }
    }

    public final LayoutCoordinates requireContainerCoordinates$foundation() {
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                InlineClassHelperKt.throwIllegalArgumentException("unattached coordinates");
            }
            return layoutCoordinates;
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null coordinates");
        o.j();
        return null;
    }

    public final void selectAll$foundation() {
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        if (sort.isEmpty()) {
            return;
        }
        ra0 ra0Var = m60.a;
        ra0 ra0Var2 = new ra0();
        int size = sort.size();
        Selection selection = null;
        Selection selection2 = null;
        for (int i = 0; i < size; i++) {
            Selectable selectable = sort.get(i);
            Selection selectAllSelection = selectable.getSelectAllSelection();
            if (selectAllSelection != null) {
                if (selection == null) {
                    selection = selectAllSelection;
                }
                long selectableId = selectable.getSelectableId();
                int d = ra0Var2.d(selectableId);
                Object[] objArr = ra0Var2.c;
                Object obj = objArr[d];
                ra0Var2.b[d] = selectableId;
                objArr[d] = selectAllSelection;
                selection2 = selectAllSelection;
            }
        }
        if (ra0Var2.e == 0) {
            return;
        }
        if (selection != selection2) {
            selection.getClass();
            Selection.AnchorInfo start = selection.getStart();
            selection2.getClass();
            selection = new Selection(start, selection2.getEnd(), false);
        }
        this.selectionRegistrar.setSubselections(ra0Var2);
        this.onSelectionChange.invoke(selection);
        this.previousSelectionLayout = null;
    }

    public final xe0 selectAllInSelectable$foundation(long j, Selection selection) {
        HapticFeedback hapticFeedback;
        ra0 ra0Var = m60.a;
        ra0 ra0Var2 = new ra0();
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        int size = sort.size();
        Selection selection2 = null;
        for (int i = 0; i < size; i++) {
            Selectable selectable = sort.get(i);
            Selection selectAllSelection = selectable.getSelectableId() == j ? selectable.getSelectAllSelection() : null;
            if (selectAllSelection != null) {
                ra0Var2.h(selectable.getSelectableId(), selectAllSelection);
            }
            selection2 = SelectionManagerKt.merge(selection2, selectAllSelection);
        }
        if (isInTouchMode() && !q10.b(selection2, selection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo5532performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m5549getTextHandleMove5zf0vsI());
        }
        return new xe0(selection2, ra0Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[LOOP:0: B:8:0x0018->B:13:0x0055, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[SYNTHETIC] */
    /* renamed from: selectWordAtPositionIfNotAlreadySelected-k-4lQ0M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1527selectWordAtPositionIfNotAlreadySelectedk4lQ0M(long j) {
        LayoutCoordinates layoutCoordinates;
        boolean m1199isPositionInsideSelectionuaM50fQ;
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        if (layoutCoordinates2 != null && layoutCoordinates2.isAttached()) {
            List<Selectable> selectables$foundation = this.selectionRegistrar.getSelectables$foundation();
            int size = selectables$foundation.size();
            for (int i = 0; i < size; i++) {
                Selectable selectable = selectables$foundation.get(i);
                Selection selection = (Selection) this.selectionRegistrar.getSubselections().b(selectable.getSelectableId());
                if (selection != null && (layoutCoordinates = selectable.getLayoutCoordinates()) != null) {
                    long mo6243localPositionOfR5De75A = layoutCoordinates.mo6243localPositionOfR5De75A(layoutCoordinates2, j);
                    TextLayoutResult textLayoutResult = selectable.textLayoutResult();
                    if (textLayoutResult != null) {
                        m1199isPositionInsideSelectionuaM50fQ = TextLayoutHelperKt.m1199isPositionInsideSelectionuaM50fQ(textLayoutResult, mo6243localPositionOfR5De75A, TextRange.m7048boximpl(selection.m1501toTextRanged9O1mEE()));
                        if (!m1199isPositionInsideSelectionuaM50fQ) {
                            return;
                        }
                    }
                }
                m1199isPositionInsideSelectionuaM50fQ = false;
                if (!m1199isPositionInsideSelectionuaM50fQ) {
                }
            }
            m1521startSelection9KIMszo(j, true, SelectionAdjustment.Companion.getWord());
        }
    }

    public final void setContainerLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.containerLayoutCoordinates = layoutCoordinates;
        if (!getHasFocus() || getSelection() == null) {
            return;
        }
        Offset m4505boximpl = layoutCoordinates != null ? Offset.m4505boximpl(LayoutCoordinatesKt.positionInWindow(layoutCoordinates)) : null;
        if (q10.b(this.previousPosition, m4505boximpl)) {
            return;
        }
        this.previousPosition = m4505boximpl;
        updateHandleOffsets();
        updateSelectionToolbar();
    }

    public final void setCoroutineScope$foundation(un unVar) {
        this.coroutineScope = unVar;
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setInTouchMode(boolean z) {
        if (this._isInTouchMode.getValue().booleanValue() != z) {
            this._isInTouchMode.setValue(Boolean.valueOf(z));
            updateSelectionToolbar();
        }
    }

    public final void setOnCopyHandler(ky kyVar) {
        this.onCopyHandler = kyVar;
    }

    public final void setOnSelectionChange(ky kyVar) {
        this.onSelectionChange = new te0(7, this, kyVar);
    }

    public final void setPlatformSelectionBehaviors$foundation(PlatformSelectionBehaviors platformSelectionBehaviors) {
        this.platformSelectionBehaviors = platformSelectionBehaviors;
    }

    public final void setPreviousSelectionLayout$foundation(SelectionLayout selectionLayout) {
        this.previousSelectionLayout = selectionLayout;
    }

    public final void setSelection(Selection selection) {
        this._selection.setValue(selection);
        if (selection != null) {
            updateHandleOffsets();
        }
    }

    public final void setShowToolbar$foundation(boolean z) {
        this.showToolbar = z;
        updateSelectionToolbar();
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setToolbarRequester$foundation(ToolbarRequester toolbarRequester) {
        this.toolbarRequester = toolbarRequester;
    }

    public final boolean shouldPerformHaptics$foundation() {
        if (isInTouchMode()) {
            List<Selectable> selectables$foundation = this.selectionRegistrar.getSelectables$foundation();
            int size = selectables$foundation.size();
            for (int i = 0; i < size; i++) {
                if (selectables$foundation.get(i).getText().length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: updateSelection-jyLRC_s$foundation, reason: not valid java name */
    public final boolean m1528updateSelectionjyLRC_s$foundation(long j, long j2, boolean z, SelectionAdjustment selectionAdjustment) {
        setDraggingHandle(z ? Handle.SelectionStart : Handle.SelectionEnd);
        m1516setCurrentDragPosition_kEHs6E(Offset.m4505boximpl(j));
        SelectionLayout m1515getSelectionLayoutWko1d7g = m1515getSelectionLayoutWko1d7g(j, j2, z);
        if (m1515getSelectionLayoutWko1d7g == null || !m1515getSelectionLayoutWko1d7g.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return false;
        }
        Selection adjust = selectionAdjustment.adjust(m1515getSelectionLayoutWko1d7g);
        if (!q10.b(adjust, getSelection())) {
            selectionChanged(m1515getSelectionLayoutWko1d7g, adjust);
            this.isLongPressOrClickSelection = false;
        }
        this.previousSelectionLayout = m1515getSelectionLayoutWko1d7g;
        return true;
    }

    /* renamed from: updateSelection-qNKwrvQ$foundation, reason: not valid java name */
    public final boolean m1529updateSelectionqNKwrvQ$foundation(Offset offset, long j, boolean z, SelectionAdjustment selectionAdjustment) {
        if (offset == null) {
            return false;
        }
        return m1528updateSelectionjyLRC_s$foundation(offset.m4526unboximpl(), j, z, selectionAdjustment);
    }

    public static /* synthetic */ void getPreviousSelectionLayout$foundation$annotations() {
    }

    public static /* synthetic */ void getToolbarRequester$foundation$annotations() {
    }
}
