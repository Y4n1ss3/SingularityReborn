package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursor_androidKt;
import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGesturesModifierKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerModifierKt;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequesterImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.dn;
import defpackage.dq;
import defpackage.fo0;
import defpackage.hm;
import defpackage.iy;
import defpackage.ky;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.q10;
import defpackage.un;
import defpackage.vn;
import defpackage.w01;
import defpackage.xe0;
import defpackage.xn;
import defpackage.y80;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldSelectionManager {
    public static final int $stable = 8;
    private Clipboard clipboard;
    private un coroutineScope;
    private final MutableState currentDragPosition$delegate;
    private long dragBeginPosition;
    private TextRange dragBeginSelection;
    private long dragTotalDistance;
    private final MutableState draggingHandle$delegate;
    private final MutableState editable$delegate;
    private final MutableState enabled$delegate;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;
    private final MutableState hasAvailableTextToPaste$delegate;
    private TextRange latestSelection;
    private final MouseSelectionObserver mouseSelectionObserver;
    private OffsetMapping offsetMapping;
    private TextFieldValue oldValue;
    private ky onValueChange;
    private PlatformSelectionBehaviors platformSelectionBehaviors;
    private int previousRawDragOffset;
    private SelectionLayout previousSelectionLayout;
    private iy requestAutofillAction;
    private LegacyTextFieldState state;
    private TextToolbar textToolbar;
    private boolean textToolbarShownViaProvider;
    private ToolbarRequester toolbarRequester;
    private final TextDragObserver touchSelectionObserver;
    private final UndoManager undoManager;
    private final MutableState<TextFieldValue> valueState;
    private VisualTransformation visualTransformation;

    public TextFieldSelectionManager(UndoManager undoManager) {
        this.undoManager = undoManager;
        this.offsetMapping = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = new fo0(27);
        this.valueState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (dq) null), null, 2, null);
        this.visualTransformation = VisualTransformation.Companion.getNone();
        Boolean bool = Boolean.TRUE;
        this.editable$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.enabled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        Offset.Companion companion = Offset.Companion;
        this.dragBeginPosition = companion.m4532getZeroF1C5BW0();
        this.dragTotalDistance = companion.m4532getZeroF1C5BW0();
        this.draggingHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.previousRawDragOffset = -1;
        this.oldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (dq) null);
        this.hasAvailableTextToPaste$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.toolbarRequester = new ToolbarRequesterImpl();
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            private TextRange runningSelection;
            private boolean isLongPressSelectionOnly = true;
            private SelectionAdjustment selectionAdjustmentMode = SelectionAdjustment.Companion.getNone();

            private final void onEnd() {
                TextRange textRange;
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1555setCurrentDragPosition_kEHs6E(null);
                this.selectionAdjustmentMode = SelectionAdjustment.Companion.getNone();
                TextFieldSelectionManager.this.updateFloatingToolbar(true);
                TextRange textRange2 = this.runningSelection;
                boolean m7054getCollapsedimpl = TextRange.m7054getCollapsedimpl(textRange2 != null ? textRange2.m7064unboximpl() : TextFieldSelectionManager.this.getValue$foundation().m7310getSelectiond9O1mEE());
                TextFieldSelectionManager.this.setHandleState(m7054getCollapsedimpl ? HandleState.Cursor : HandleState.Selection);
                LegacyTextFieldState state$foundation = TextFieldSelectionManager.this.getState$foundation();
                if (state$foundation != null) {
                    state$foundation.setShowSelectionHandleStart(!m7054getCollapsedimpl && TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(TextFieldSelectionManager.this, true));
                }
                LegacyTextFieldState state$foundation2 = TextFieldSelectionManager.this.getState$foundation();
                if (state$foundation2 != null) {
                    state$foundation2.setShowSelectionHandleEnd(!m7054getCollapsedimpl && TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(TextFieldSelectionManager.this, false));
                }
                LegacyTextFieldState state$foundation3 = TextFieldSelectionManager.this.getState$foundation();
                if (state$foundation3 != null) {
                    state$foundation3.setShowCursorHandle(m7054getCollapsedimpl && TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(TextFieldSelectionManager.this, true));
                }
                if (this.isLongPressSelectionOnly) {
                    TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                    textRange = textFieldSelectionManager.dragBeginSelection;
                    textFieldSelectionManager.m1554maybeSuggestSelectionOEnZFl4(textRange);
                }
                TextFieldSelectionManager.this.dragBeginSelection = null;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                onEnd();
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x010c  */
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void mo1171onDragk4lQ0M(long j) {
                long j2;
                TextLayoutResultProxy layoutResult;
                long j3;
                long j4;
                TextRange textRange;
                TextFieldSelectionManager textFieldSelectionManager;
                TextRange textRange2;
                long j5;
                int m1202getOffsetForPosition3MmeM6k;
                TextRange textRange3;
                long m1556updateSelection8UEBfa8;
                TextRange textRange4;
                long j6;
                if (!TextFieldSelectionManager.this.getEnabled() || TextFieldSelectionManager.this.getValue$foundation().getText().length() == 0) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager2.dragTotalDistance;
                textFieldSelectionManager2.dragTotalDistance = Offset.m4521plusMKHz9U(j2, j);
                LegacyTextFieldState state$foundation = TextFieldSelectionManager.this.getState$foundation();
                if (state$foundation != null && (layoutResult = state$foundation.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
                    j3 = textFieldSelectionManager3.dragBeginPosition;
                    j4 = textFieldSelectionManager3.dragTotalDistance;
                    textFieldSelectionManager3.m1555setCurrentDragPosition_kEHs6E(Offset.m4505boximpl(Offset.m4521plusMKHz9U(j3, j4)));
                    textRange = textFieldSelectionManager3.dragBeginSelection;
                    if (textRange == null) {
                        Offset m1558getCurrentDragPosition_m7T9E = textFieldSelectionManager3.m1558getCurrentDragPosition_m7T9E();
                        m1558getCurrentDragPosition_m7T9E.getClass();
                        if (!layoutResult.m1203isPositionOnTextk4lQ0M(m1558getCurrentDragPosition_m7T9E.m4526unboximpl())) {
                            OffsetMapping offsetMapping$foundation = textFieldSelectionManager3.getOffsetMapping$foundation();
                            j6 = textFieldSelectionManager3.dragBeginPosition;
                            int transformedToOriginal = offsetMapping$foundation.transformedToOriginal(TextLayoutResultProxy.m1201getOffsetForPosition3MmeM6k$default(layoutResult, j6, false, 2, null));
                            OffsetMapping offsetMapping$foundation2 = textFieldSelectionManager3.getOffsetMapping$foundation();
                            Offset m1558getCurrentDragPosition_m7T9E2 = textFieldSelectionManager3.m1558getCurrentDragPosition_m7T9E();
                            m1558getCurrentDragPosition_m7T9E2.getClass();
                            SelectionAdjustment none = transformedToOriginal == offsetMapping$foundation2.transformedToOriginal(TextLayoutResultProxy.m1201getOffsetForPosition3MmeM6k$default(layoutResult, m1558getCurrentDragPosition_m7T9E2.m4526unboximpl(), false, 2, null)) ? SelectionAdjustment.Companion.getNone() : SelectionAdjustment.Companion.getWord();
                            TextFieldValue value$foundation = textFieldSelectionManager3.getValue$foundation();
                            Offset m1558getCurrentDragPosition_m7T9E3 = textFieldSelectionManager3.m1558getCurrentDragPosition_m7T9E();
                            m1558getCurrentDragPosition_m7T9E3.getClass();
                            textFieldSelectionManager = textFieldSelectionManager3;
                            m1556updateSelection8UEBfa8 = textFieldSelectionManager.m1556updateSelection8UEBfa8(value$foundation, m1558getCurrentDragPosition_m7T9E3.m4526unboximpl(), false, false, none, true);
                            this.runningSelection = TextRange.m7048boximpl(m1556updateSelection8UEBfa8);
                            textRange4 = textFieldSelectionManager.dragBeginSelection;
                            if (!TextRange.m7052equalsimpl(m1556updateSelection8UEBfa8, textRange4)) {
                                this.isLongPressSelectionOnly = false;
                            }
                        }
                    }
                    textFieldSelectionManager = textFieldSelectionManager3;
                    textRange2 = textFieldSelectionManager.dragBeginSelection;
                    if (textRange2 != null) {
                        m1202getOffsetForPosition3MmeM6k = TextRange.m7060getStartimpl(textRange2.m7064unboximpl());
                    } else {
                        j5 = textFieldSelectionManager.dragBeginPosition;
                        m1202getOffsetForPosition3MmeM6k = layoutResult.m1202getOffsetForPosition3MmeM6k(j5, false);
                    }
                    Offset m1558getCurrentDragPosition_m7T9E4 = textFieldSelectionManager.m1558getCurrentDragPosition_m7T9E();
                    m1558getCurrentDragPosition_m7T9E4.getClass();
                    int m1202getOffsetForPosition3MmeM6k2 = layoutResult.m1202getOffsetForPosition3MmeM6k(m1558getCurrentDragPosition_m7T9E4.m4526unboximpl(), false);
                    textRange3 = textFieldSelectionManager.dragBeginSelection;
                    if (textRange3 == null && m1202getOffsetForPosition3MmeM6k == m1202getOffsetForPosition3MmeM6k2) {
                        return;
                    }
                    TextFieldValue value$foundation2 = textFieldSelectionManager.getValue$foundation();
                    Offset m1558getCurrentDragPosition_m7T9E5 = textFieldSelectionManager.m1558getCurrentDragPosition_m7T9E();
                    m1558getCurrentDragPosition_m7T9E5.getClass();
                    m1556updateSelection8UEBfa8 = textFieldSelectionManager.m1556updateSelection8UEBfa8(value$foundation2, m1558getCurrentDragPosition_m7T9E5.m4526unboximpl(), false, false, this.selectionAdjustmentMode, true);
                    this.runningSelection = TextRange.m7048boximpl(m1556updateSelection8UEBfa8);
                    textRange4 = textFieldSelectionManager.dragBeginSelection;
                    if (!TextRange.m7052equalsimpl(m1556updateSelection8UEBfa8, textRange4)) {
                    }
                }
                TextFieldSelectionManager.this.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-3MmeM6k */
            public void mo1172onStart3MmeM6k(long j, SelectionAdjustment selectionAdjustment) {
                long j2;
                TextLayoutResultProxy layoutResult;
                TextFieldValue m1552createTextFieldValueFDrldGo;
                long j3;
                TextLayoutResultProxy layoutResult2;
                long m1556updateSelection8UEBfa8;
                if (TextFieldSelectionManager.this.getEnabled() && TextFieldSelectionManager.this.getDraggingHandle() == null) {
                    TextFieldSelectionManager.this.setDraggingHandle(Handle.SelectionEnd);
                    TextFieldSelectionManager.this.previousRawDragOffset = -1;
                    this.isLongPressSelectionOnly = true;
                    this.selectionAdjustmentMode = selectionAdjustment;
                    TextFieldSelectionManager.this.hideSelectionToolbar$foundation();
                    LegacyTextFieldState state$foundation = TextFieldSelectionManager.this.getState$foundation();
                    if (state$foundation == null || (layoutResult2 = state$foundation.getLayoutResult()) == null || !layoutResult2.m1203isPositionOnTextk4lQ0M(j)) {
                        j2 = j;
                        LegacyTextFieldState state$foundation2 = TextFieldSelectionManager.this.getState$foundation();
                        if (state$foundation2 != null && (layoutResult = state$foundation2.getLayoutResult()) != null) {
                            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                            int transformedToOriginal = textFieldSelectionManager.getOffsetMapping$foundation().transformedToOriginal(TextLayoutResultProxy.m1201getOffsetForPosition3MmeM6k$default(layoutResult, j2, false, 2, null));
                            m1552createTextFieldValueFDrldGo = textFieldSelectionManager.m1552createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation().getAnnotatedString(), TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal));
                            textFieldSelectionManager.enterSelectionMode$foundation(false);
                            HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                            if (hapticFeedBack != null) {
                                hapticFeedBack.mo5532performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m5549getTextHandleMove5zf0vsI());
                            }
                            textFieldSelectionManager.getOnValueChange$foundation().invoke(m1552createTextFieldValueFDrldGo);
                            textFieldSelectionManager.m1564setLatestSelectionOEnZFl4$foundation(TextRange.m7048boximpl(m1552createTextFieldValueFDrldGo.m7310getSelectiond9O1mEE()));
                        }
                        this.isLongPressSelectionOnly = false;
                    } else {
                        if (TextFieldSelectionManager.this.getValue$foundation().getText().length() == 0) {
                            return;
                        }
                        TextFieldSelectionManager.this.enterSelectionMode$foundation(false);
                        TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                        m1556updateSelection8UEBfa8 = textFieldSelectionManager2.m1556updateSelection8UEBfa8(TextFieldValue.m7305copy3r_uNRQ$default(textFieldSelectionManager2.getValue$foundation(), (AnnotatedString) null, TextRange.Companion.m7065getZerod9O1mEE(), (TextRange) null, 5, (Object) null), j, true, false, this.selectionAdjustmentMode, true);
                        j2 = j;
                        TextFieldSelectionManager.this.dragBeginSelection = TextRange.m7048boximpl(m1556updateSelection8UEBfa8);
                        this.runningSelection = TextRange.m7048boximpl(m1556updateSelection8UEBfa8);
                    }
                    TextFieldSelectionManager.this.setHandleState(HandleState.None);
                    TextFieldSelectionManager.this.dragBeginPosition = j2;
                    TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
                    j3 = textFieldSelectionManager3.dragBeginPosition;
                    textFieldSelectionManager3.m1555setCurrentDragPosition_kEHs6E(Offset.m4505boximpl(j3));
                    TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m4532getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                onEnd();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1170onDownk4lQ0M(long j) {
            }
        };
        this.mouseSelectionObserver = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            private TextRange initialSelection;
            private boolean isDoubleOrTripleClickSelectionOnly = true;

            public final TextRange getInitialSelection() {
                return this.initialSelection;
            }

            public final boolean isDoubleOrTripleClickSelectionOnly() {
                return this.isDoubleOrTripleClickSelectionOnly;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo1412onDrag3MmeM6k(long j, SelectionAdjustment selectionAdjustment) {
                LegacyTextFieldState state$foundation;
                if (!TextFieldSelectionManager.this.getEnabled() || TextFieldSelectionManager.this.getValue$foundation().getText().length() == 0 || (state$foundation = TextFieldSelectionManager.this.getState$foundation()) == null || state$foundation.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(TextFieldSelectionManager.this.getValue$foundation(), j, false, selectionAdjustment);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
                if (this.isDoubleOrTripleClickSelectionOnly) {
                    TextFieldSelectionManager.this.m1554maybeSuggestSelectionOEnZFl4(this.initialSelection);
                }
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo1413onExtendk4lQ0M(long j) {
                LegacyTextFieldState state$foundation = TextFieldSelectionManager.this.getState$foundation();
                if (state$foundation == null || state$foundation.getLayoutResult() == null || !TextFieldSelectionManager.this.getEnabled()) {
                    return false;
                }
                TextFieldSelectionManager.this.previousRawDragOffset = -1;
                FocusRequester focusRequester = TextFieldSelectionManager.this.getFocusRequester();
                if (focusRequester != null) {
                    FocusRequester.m4419requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                }
                updateMouseSelection(TextFieldSelectionManager.this.getValue$foundation(), j, false, SelectionAdjustment.Companion.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo1414onExtendDragk4lQ0M(long j) {
                LegacyTextFieldState state$foundation;
                if (!TextFieldSelectionManager.this.getEnabled() || TextFieldSelectionManager.this.getValue$foundation().getText().length() == 0 || (state$foundation = TextFieldSelectionManager.this.getState$foundation()) == null || state$foundation.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(TextFieldSelectionManager.this.getValue$foundation(), j, false, SelectionAdjustment.Companion.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-9KIMszo */
            public boolean mo1415onStart9KIMszo(long j, SelectionAdjustment selectionAdjustment, int i) {
                LegacyTextFieldState state$foundation;
                long j2;
                if (!TextFieldSelectionManager.this.getEnabled() || TextFieldSelectionManager.this.getValue$foundation().getText().length() == 0 || (state$foundation = TextFieldSelectionManager.this.getState$foundation()) == null || state$foundation.getLayoutResult() == null) {
                    return false;
                }
                FocusRequester focusRequester = TextFieldSelectionManager.this.getFocusRequester();
                if (focusRequester != null) {
                    FocusRequester.m4419requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                }
                TextFieldSelectionManager.this.dragBeginPosition = j;
                TextFieldSelectionManager.this.previousRawDragOffset = -1;
                TextFieldSelectionManager.enterSelectionMode$foundation$default(TextFieldSelectionManager.this, false, 1, null);
                TextFieldValue value$foundation = TextFieldSelectionManager.this.getValue$foundation();
                j2 = TextFieldSelectionManager.this.dragBeginPosition;
                long updateMouseSelection = updateMouseSelection(value$foundation, j2, true, selectionAdjustment);
                if (i >= 2) {
                    this.isDoubleOrTripleClickSelectionOnly = true;
                    this.initialSelection = TextRange.m7048boximpl(updateMouseSelection);
                }
                return true;
            }

            public final void setDoubleOrTripleClickSelectionOnly(boolean z) {
                this.isDoubleOrTripleClickSelectionOnly = z;
            }

            public final void setInitialSelection(TextRange textRange) {
                this.initialSelection = textRange;
            }

            public final long updateMouseSelection(TextFieldValue textFieldValue, long j, boolean z, SelectionAdjustment selectionAdjustment) {
                long m1556updateSelection8UEBfa8;
                m1556updateSelection8UEBfa8 = TextFieldSelectionManager.this.m1556updateSelection8UEBfa8(textFieldValue, j, z, false, selectionAdjustment, false);
                if (!TextRange.m7052equalsimpl(m1556updateSelection8UEBfa8, this.initialSelection)) {
                    this.isDoubleOrTripleClickSelectionOnly = false;
                }
                TextFieldSelectionManager.this.setHandleState(TextRange.m7054getCollapsedimpl(m1556updateSelection8UEBfa8) ? HandleState.Cursor : HandleState.Selection);
                return m1556updateSelection8UEBfa8;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect _get_contextMenuAreaModifier_$lambda$0(TextFieldSelectionManager textFieldSelectionManager, LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        Rect contentRect = textFieldSelectionManager.getContentRect();
        LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.state;
        if (legacyTextFieldState == null || (layoutCoordinates2 = legacyTextFieldState.getLayoutCoordinates()) == null) {
            return null;
        }
        return TextContextMenuToolbarHandlerModifierKt.translateRootToDestination(contentRect, layoutCoordinates2, layoutCoordinates);
    }

    public static /* synthetic */ z10 copy$foundation$default(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return textFieldSelectionManager.copy$foundation(z);
    }

    public static /* synthetic */ AnnotatedString copyWithResult$foundation$default(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return textFieldSelectionManager.copyWithResult$foundation(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createTextFieldValue-FDrldGo, reason: not valid java name */
    public final TextFieldValue m1552createTextFieldValueFDrldGo(AnnotatedString annotatedString, long j) {
        return new TextFieldValue(annotatedString, j, (TextRange) null, 4, (dq) null);
    }

    /* renamed from: deselect-_kEHs6E$foundation$default, reason: not valid java name */
    public static /* synthetic */ void m1553deselect_kEHs6E$foundation$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i, Object obj) {
        if ((i & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m1557deselect_kEHs6E$foundation(offset);
    }

    public static /* synthetic */ void enterSelectionMode$foundation$default(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.enterSelectionMode$foundation(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getContentRect() {
        char c;
        long j;
        float f;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResult value;
        Rect cursorRect;
        LayoutCoordinates layoutCoordinates2;
        TextLayoutResult value2;
        Rect cursorRect2;
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates4;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.isLayoutResultStale()) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                int originalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m7060getStartimpl(getValue$foundation().m7310getSelectiond9O1mEE()));
                int originalToTransformed2 = this.offsetMapping.originalToTransformed(TextRange.m7055getEndimpl(getValue$foundation().m7310getSelectiond9O1mEE()));
                LegacyTextFieldState legacyTextFieldState2 = this.state;
                long m4532getZeroF1C5BW0 = (legacyTextFieldState2 == null || (layoutCoordinates4 = legacyTextFieldState2.getLayoutCoordinates()) == null) ? Offset.Companion.m4532getZeroF1C5BW0() : layoutCoordinates4.mo6245localToRootMKHz9U(m1560getHandlePositiontuRUvjQ$foundation(true));
                LegacyTextFieldState legacyTextFieldState3 = this.state;
                long m4532getZeroF1C5BW02 = (legacyTextFieldState3 == null || (layoutCoordinates3 = legacyTextFieldState3.getLayoutCoordinates()) == null) ? Offset.Companion.m4532getZeroF1C5BW0() : layoutCoordinates3.mo6245localToRootMKHz9U(m1560getHandlePositiontuRUvjQ$foundation(false));
                LegacyTextFieldState legacyTextFieldState4 = this.state;
                float f2 = 0.0f;
                if (legacyTextFieldState4 == null || (layoutCoordinates2 = legacyTextFieldState4.getLayoutCoordinates()) == null) {
                    c = ' ';
                    j = 4294967295L;
                    f = 0.0f;
                } else {
                    TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                    c = ' ';
                    j = 4294967295L;
                    f = Float.intBitsToFloat((int) (layoutCoordinates2.mo6245localToRootMKHz9U(Offset.m4508constructorimpl((Float.floatToRawIntBits((layoutResult == null || (value2 = layoutResult.getValue()) == null || (cursorRect2 = value2.getCursorRect(originalToTransformed)) == null) ? 0.0f : cursorRect2.getTop()) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))) & 4294967295L));
                }
                LegacyTextFieldState legacyTextFieldState5 = this.state;
                if (legacyTextFieldState5 != null && (layoutCoordinates = legacyTextFieldState5.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult2 = legacyTextFieldState.getLayoutResult();
                    f2 = Float.intBitsToFloat((int) (layoutCoordinates.mo6245localToRootMKHz9U(Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << c) | (Float.floatToRawIntBits((layoutResult2 == null || (value = layoutResult2.getValue()) == null || (cursorRect = value.getCursorRect(originalToTransformed2)) == null) ? 0.0f : cursorRect.getTop()) & j))) & j));
                }
                int i = (int) (m4532getZeroF1C5BW0 >> c);
                int i2 = (int) (m4532getZeroF1C5BW02 >> c);
                return new Rect(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.min(f, f2), Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), (legacyTextFieldState.getTextDelegate().getDensity().getDensity() * Dp.m7611constructorimpl(25.0f)) + Math.max(Float.intBitsToFloat((int) (m4532getZeroF1C5BW0 & j)), Float.intBitsToFloat((int) (m4532getZeroF1C5BW02 & j))));
            }
        }
        return Rect.Companion.getZero();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xe0 getContextTextAndSelection() {
        String text;
        TextRange textRange;
        AnnotatedString transformedText$foundation = getTransformedText$foundation();
        if (transformedText$foundation == null || (text = transformedText$foundation.getText()) == null || (textRange = this.latestSelection) == null) {
            return null;
        }
        long m7064unboximpl = textRange.m7064unboximpl();
        return new xe0(text, TextRange.m7048boximpl(TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m7060getStartimpl(m7064unboximpl)), this.offsetMapping.originalToTransformed(TextRange.m7055getEndimpl(m7064unboximpl)))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getHasAvailableTextToPaste() {
        return ((Boolean) this.hasAvailableTextToPaste$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasSelection() {
        return !TextRange.m7054getCollapsedimpl(getValue$foundation().m7310getSelectiond9O1mEE());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPassword() {
        return this.visualTransformation instanceof PasswordVisualTransformation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: maybeSuggestSelection-OEnZFl4, reason: not valid java name */
    public final void m1554maybeSuggestSelectionOEnZFl4(TextRange textRange) {
        PlatformSelectionBehaviors platformSelectionBehaviors;
        AnnotatedString transformedText$foundation;
        String text;
        un unVar;
        if (textRange == null || (platformSelectionBehaviors = this.platformSelectionBehaviors) == null || (transformedText$foundation = getTransformedText$foundation()) == null || (text = transformedText$foundation.getText()) == null) {
            return;
        }
        OffsetMapping offsetMapping = this.offsetMapping;
        long TextRange = TextRangeKt.TextRange(offsetMapping.originalToTransformed(TextRange.m7060getStartimpl(textRange.m7064unboximpl())), offsetMapping.originalToTransformed(TextRange.m7055getEndimpl(textRange.m7064unboximpl())));
        if (text.length() <= 0 || TextRange.m7054getCollapsedimpl(TextRange) || (unVar = this.coroutineScope) == null) {
            return;
        }
        p01.t(unVar, null, null, new TextFieldSelectionManager$maybeSuggestSelection$1(platformSelectionBehaviors, text, TextRange, textRange, this, offsetMapping, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 onValueChange$lambda$0(TextFieldValue textFieldValue) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m1555setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHandleState(HandleState handleState) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.getHandleState() == handleState) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                legacyTextFieldState.setHandleState(handleState);
            }
        }
    }

    private final void setHasAvailableTextToPaste(boolean z) {
        this.hasAvailableTextToPaste$delegate.setValue(Boolean.valueOf(z));
    }

    private final z10 showSelectionToolbarViaTextToolbar() {
        un unVar = this.coroutineScope;
        if (unVar == null) {
            return null;
        }
        return p01.t(unVar, null, xn.g, new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1(this, null), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFloatingToolbar(boolean z) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.setShowFloatingToolbar(z);
        }
        if (z) {
            showSelectionToolbar$foundation();
        } else {
            hideSelectionToolbar$foundation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSelection-8UEBfa8, reason: not valid java name */
    public final long m1556updateSelection8UEBfa8(TextFieldValue textFieldValue, long j, boolean z, boolean z2, SelectionAdjustment selectionAdjustment, boolean z3) {
        TextLayoutResultProxy layoutResult;
        int i;
        HapticFeedback hapticFeedback;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null) {
            return TextRange.Companion.m7065getZerod9O1mEE();
        }
        long TextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m7060getStartimpl(textFieldValue.m7310getSelectiond9O1mEE())), this.offsetMapping.originalToTransformed(TextRange.m7055getEndimpl(textFieldValue.m7310getSelectiond9O1mEE())));
        boolean z4 = false;
        int m1202getOffsetForPosition3MmeM6k = layoutResult.m1202getOffsetForPosition3MmeM6k(j, false);
        int m7060getStartimpl = (z2 || z) ? m1202getOffsetForPosition3MmeM6k : TextRange.m7060getStartimpl(TextRange);
        int m7055getEndimpl = (!z2 || z) ? m1202getOffsetForPosition3MmeM6k : TextRange.m7055getEndimpl(TextRange);
        SelectionLayout selectionLayout = this.previousSelectionLayout;
        if (z || selectionLayout == null || (i = this.previousRawDragOffset) == -1) {
            i = -1;
        }
        SelectionLayout m1509getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m1509getTextFieldSelectionLayoutRcvTLA(layoutResult.getValue(), m7060getStartimpl, m7055getEndimpl, i, TextRange, z, z2);
        if (!m1509getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(selectionLayout)) {
            return textFieldValue.m7310getSelectiond9O1mEE();
        }
        this.previousSelectionLayout = m1509getTextFieldSelectionLayoutRcvTLA;
        this.previousRawDragOffset = m1202getOffsetForPosition3MmeM6k;
        Selection adjust = selectionAdjustment.adjust(m1509getTextFieldSelectionLayoutRcvTLA);
        long TextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(adjust.getStart().getOffset()), this.offsetMapping.transformedToOriginal(adjust.getEnd().getOffset()));
        if (TextRange.m7053equalsimpl0(TextRange2, textFieldValue.m7310getSelectiond9O1mEE())) {
            return textFieldValue.m7310getSelectiond9O1mEE();
        }
        boolean z5 = TextRange.m7059getReversedimpl(TextRange2) != TextRange.m7059getReversedimpl(textFieldValue.m7310getSelectiond9O1mEE()) && TextRange.m7053equalsimpl0(TextRangeKt.TextRange(TextRange.m7055getEndimpl(TextRange2), TextRange.m7060getStartimpl(TextRange2)), textFieldValue.m7310getSelectiond9O1mEE());
        boolean z6 = TextRange.m7054getCollapsedimpl(TextRange2) && TextRange.m7054getCollapsedimpl(textFieldValue.m7310getSelectiond9O1mEE());
        if (z3 && textFieldValue.getText().length() > 0 && !z5 && !z6 && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo5532performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m5549getTextHandleMove5zf0vsI());
        }
        this.onValueChange.invoke(m1552createTextFieldValueFDrldGo(textFieldValue.getAnnotatedString(), TextRange2));
        this.latestSelection = TextRange.m7048boximpl(TextRange2);
        if (!z3) {
            updateFloatingToolbar(!TextRange.m7054getCollapsedimpl(TextRange2));
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.setInTouchMode(z3);
        }
        LegacyTextFieldState legacyTextFieldState3 = this.state;
        if (legacyTextFieldState3 != null) {
            legacyTextFieldState3.setShowSelectionHandleStart(!TextRange.m7054getCollapsedimpl(TextRange2) && TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(this, true));
        }
        LegacyTextFieldState legacyTextFieldState4 = this.state;
        if (legacyTextFieldState4 != null) {
            legacyTextFieldState4.setShowSelectionHandleEnd(!TextRange.m7054getCollapsedimpl(TextRange2) && TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(this, false));
        }
        LegacyTextFieldState legacyTextFieldState5 = this.state;
        if (legacyTextFieldState5 != null) {
            if (TextRange.m7054getCollapsedimpl(TextRange2) && TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(this, true)) {
                z4 = true;
            }
            legacyTextFieldState5.setShowCursorHandle(z4);
        }
        return TextRange2;
    }

    public final void autofill$foundation() {
        iy iyVar = this.requestAutofillAction;
        if (iyVar != null) {
            iyVar.invoke();
        }
    }

    public final boolean canShowAutofillMenuItem$foundation() {
        return getEditable() && TextRange.m7054getCollapsedimpl(getValue$foundation().m7310getSelectiond9O1mEE());
    }

    public final boolean canShowCopyMenuItem$foundation() {
        Clipboard clipboard;
        return getHasSelection() && !isPassword() && (clipboard = this.clipboard) != null && ClipboardUtils_androidKt.isWriteSupported(clipboard);
    }

    public final boolean canShowCutMenuItem$foundation() {
        Clipboard clipboard;
        return getHasSelection() && getEditable() && !isPassword() && (clipboard = this.clipboard) != null && ClipboardUtils_androidKt.isWriteSupported(clipboard);
    }

    public final boolean canShowPasteMenuItem$foundation() {
        Clipboard clipboard;
        return getEditable() && getHasAvailableTextToPaste() && (clipboard = this.clipboard) != null && ClipboardUtils_androidKt.isReadSupported(clipboard);
    }

    public final boolean canShowSelectAllMenuItem$foundation() {
        return TextRange.m7056getLengthimpl(getValue$foundation().m7310getSelectiond9O1mEE()) != getValue$foundation().getText().length();
    }

    public final void clearPreviewHighlight$foundation() {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m1138setDeletionPreviewHighlightRange5zctL8(TextRange.Companion.m7065getZerod9O1mEE());
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m1141setSelectionPreviewHighlightRange5zctL8(TextRange.Companion.m7065getZerod9O1mEE());
        }
    }

    public final z10 copy$foundation(boolean z) {
        un unVar = this.coroutineScope;
        if (unVar == null) {
            return null;
        }
        return p01.t(unVar, null, xn.g, new TextFieldSelectionManager$copy$1(this, z, null), 1);
    }

    public final AnnotatedString copyWithResult$foundation(boolean z) {
        if (!getHasSelection() || isPassword()) {
            return null;
        }
        AnnotatedString selectedText = TextFieldValueKt.getSelectedText(getValue$foundation());
        if (!z) {
            return selectedText;
        }
        int m7057getMaximpl = TextRange.m7057getMaximpl(getValue$foundation().m7310getSelectiond9O1mEE());
        this.onValueChange.invoke(m1552createTextFieldValueFDrldGo(getValue$foundation().getAnnotatedString(), TextRangeKt.TextRange(m7057getMaximpl, m7057getMaximpl)));
        setHandleState(HandleState.None);
        return selectedText;
    }

    public final TextDragObserver cursorDragObserver$foundation() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1171onDragk4lQ0M(long j) {
                long j2;
                TextLayoutResultProxy layoutResult;
                long j3;
                long j4;
                HapticFeedback hapticFeedBack;
                TextFieldValue m1552createTextFieldValueFDrldGo;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m4521plusMKHz9U(j2, j);
                LegacyTextFieldState state$foundation = TextFieldSelectionManager.this.getState$foundation();
                if (state$foundation == null || (layoutResult = state$foundation.getLayoutResult()) == null) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j3 = textFieldSelectionManager2.dragBeginPosition;
                j4 = textFieldSelectionManager2.dragTotalDistance;
                textFieldSelectionManager2.m1555setCurrentDragPosition_kEHs6E(Offset.m4505boximpl(Offset.m4521plusMKHz9U(j3, j4)));
                OffsetMapping offsetMapping$foundation = textFieldSelectionManager2.getOffsetMapping$foundation();
                Offset m1558getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m1558getCurrentDragPosition_m7T9E();
                m1558getCurrentDragPosition_m7T9E.getClass();
                int transformedToOriginal = offsetMapping$foundation.transformedToOriginal(TextLayoutResultProxy.m1201getOffsetForPosition3MmeM6k$default(layoutResult, m1558getCurrentDragPosition_m7T9E.m4526unboximpl(), false, 2, null));
                long TextRange = TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal);
                if (TextRange.m7053equalsimpl0(TextRange, textFieldSelectionManager2.getValue$foundation().m7310getSelectiond9O1mEE())) {
                    return;
                }
                LegacyTextFieldState state$foundation2 = textFieldSelectionManager2.getState$foundation();
                if ((state$foundation2 == null || state$foundation2.isInTouchMode()) && (hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack()) != null) {
                    hapticFeedBack.mo5532performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m5549getTextHandleMove5zf0vsI());
                }
                ky onValueChange$foundation = textFieldSelectionManager2.getOnValueChange$foundation();
                m1552createTextFieldValueFDrldGo = textFieldSelectionManager2.m1552createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation().getAnnotatedString(), TextRange);
                onValueChange$foundation.invoke(m1552createTextFieldValueFDrldGo);
                textFieldSelectionManager2.m1564setLatestSelectionOEnZFl4$foundation(TextRange.m7048boximpl(TextRange));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-3MmeM6k */
            public void mo1172onStart3MmeM6k(long j, SelectionAdjustment selectionAdjustment) {
                TextLayoutResultProxy layoutResult;
                long m1506getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1506getAdjustedCoordinatesk4lQ0M(TextFieldSelectionManager.this.m1560getHandlePositiontuRUvjQ$foundation(true));
                LegacyTextFieldState state$foundation = TextFieldSelectionManager.this.getState$foundation();
                if (state$foundation == null || (layoutResult = state$foundation.getLayoutResult()) == null) {
                    return;
                }
                long m1205translateInnerToDecorationCoordinatesMKHz9U$foundation = layoutResult.m1205translateInnerToDecorationCoordinatesMKHz9U$foundation(m1506getAdjustedCoordinatesk4lQ0M);
                TextFieldSelectionManager.this.dragBeginPosition = m1205translateInnerToDecorationCoordinatesMKHz9U$foundation;
                TextFieldSelectionManager.this.m1555setCurrentDragPosition_kEHs6E(Offset.m4505boximpl(m1205translateInnerToDecorationCoordinatesMKHz9U$foundation));
                TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m4532getZeroF1C5BW0();
                TextFieldSelectionManager.this.setDraggingHandle(Handle.Cursor);
                TextFieldSelectionManager.this.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1555setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1555setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1170onDownk4lQ0M(long j) {
            }
        };
    }

    public final z10 cut$foundation() {
        un unVar = this.coroutineScope;
        if (unVar == null) {
            return null;
        }
        return p01.t(unVar, null, xn.g, new TextFieldSelectionManager$cut$1(this, null), 1);
    }

    public final AnnotatedString cutWithResult$foundation() {
        if (!getHasSelection() || !getEditable() || isPassword()) {
            return null;
        }
        AnnotatedString selectedText = TextFieldValueKt.getSelectedText(getValue$foundation());
        AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation(), getValue$foundation().getText().length()).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation(), getValue$foundation().getText().length()));
        int m7058getMinimpl = TextRange.m7058getMinimpl(getValue$foundation().m7310getSelectiond9O1mEE());
        this.onValueChange.invoke(m1552createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(m7058getMinimpl, m7058getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
        return selectedText;
    }

    /* renamed from: deselect-_kEHs6E$foundation, reason: not valid java name */
    public final void m1557deselect_kEHs6E$foundation(Offset offset) {
        if (!TextRange.m7054getCollapsedimpl(getValue$foundation().m7310getSelectiond9O1mEE())) {
            LegacyTextFieldState legacyTextFieldState = this.state;
            TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
            TextFieldValue m7305copy3r_uNRQ$default = TextFieldValue.m7305copy3r_uNRQ$default(getValue$foundation(), (AnnotatedString) null, TextRangeKt.TextRange((offset == null || layoutResult == null) ? TextRange.m7057getMaximpl(getValue$foundation().m7310getSelectiond9O1mEE()) : this.offsetMapping.transformedToOriginal(TextLayoutResultProxy.m1201getOffsetForPosition3MmeM6k$default(layoutResult, offset.m4526unboximpl(), false, 2, null))), (TextRange) null, 5, (Object) null);
            this.onValueChange.invoke(m7305copy3r_uNRQ$default);
            this.latestSelection = TextRange.m7048boximpl(m7305copy3r_uNRQ$default.m7310getSelectiond9O1mEE());
        }
        setHandleState((offset == null || getValue$foundation().getText().length() <= 0) ? HandleState.None : HandleState.Cursor);
        updateFloatingToolbar(false);
    }

    public final void enterSelectionMode$foundation(boolean z) {
        FocusRequester focusRequester;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null && !legacyTextFieldState.getHasFocus() && (focusRequester = this.focusRequester) != null) {
            FocusRequester.m4419requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        }
        this.oldValue = getValue$foundation();
        updateFloatingToolbar(z);
        setHandleState(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation() {
        updateFloatingToolbar(false);
        setHandleState(HandleState.None);
    }

    public final Clipboard getClipboard$foundation() {
        return this.clipboard;
    }

    public final Modifier getContextMenuAreaModifier() {
        return !getEnabled() ? Modifier.Companion : TextContextMenuToolbarHandlerModifierKt.textContextMenuToolbarHandler(TextContextMenuGesturesModifierKt.showTextContextMenuOnSecondaryClick(Modifier.Companion, new TextFieldSelectionManager$contextMenuAreaModifier$1(this, null)), this.toolbarRequester, new TextFieldSelectionManager$contextMenuAreaModifier$2(this, null), new TextFieldSelectionManager$contextMenuAreaModifier$3(this, null), new dn(this, 1));
    }

    public final un getCoroutineScope$foundation() {
        return this.coroutineScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m1558getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    /* renamed from: getCursorPosition-tuRUvjQ$foundation, reason: not valid java name */
    public final long m1559getCursorPositiontuRUvjQ$foundation(Density density) {
        int originalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m7060getStartimpl(getValue$foundation().m7310getSelectiond9O1mEE()));
        LegacyTextFieldState legacyTextFieldState = this.state;
        TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
        layoutResult.getClass();
        TextLayoutResult value = layoutResult.getValue();
        float mo367toPx0680j_4 = (density.mo367toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness()) / 2.0f) + value.getCursorRect(y80.h(originalToTransformed, 0, value.getLayoutInput().getText().length())).getLeft();
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(r4.getBottom()) & 4294967295L) | (Float.floatToRawIntBits(mo367toPx0680j_4) << 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEditable() {
        return ((Boolean) this.editable$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnabled() {
        return ((Boolean) this.enabled$delegate.getValue()).booleanValue();
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final float getHandleLineHeight$foundation(boolean z) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        int m7060getStartimpl = z ? TextRange.m7060getStartimpl(getValue$foundation().m7310getSelectiond9O1mEE()) : TextRange.m7055getEndimpl(getValue$foundation().m7310getSelectiond9O1mEE());
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return 0.0f;
        }
        return TextLayoutHelperKt.getLineHeight(value, m7060getStartimpl);
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation, reason: not valid java name */
    public final long m1560getHandlePositiontuRUvjQ$foundation(boolean z) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        AnnotatedString transformedText$foundation = getTransformedText$foundation();
        if (transformedText$foundation == null) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        if (!q10.b(transformedText$foundation.getText(), value.getLayoutInput().getText().getText())) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        long m7310getSelectiond9O1mEE = getValue$foundation().m7310getSelectiond9O1mEE();
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(value, this.offsetMapping.originalToTransformed(z ? TextRange.m7060getStartimpl(m7310getSelectiond9O1mEE) : TextRange.m7055getEndimpl(m7310getSelectiond9O1mEE)), z, TextRange.m7059getReversedimpl(getValue$foundation().m7310getSelectiond9O1mEE()));
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* renamed from: getLatestSelection-MzsxiRA$foundation, reason: not valid java name */
    public final TextRange m1561getLatestSelectionMzsxiRA$foundation() {
        return this.latestSelection;
    }

    public final MouseSelectionObserver getMouseSelectionObserver$foundation() {
        return this.mouseSelectionObserver;
    }

    public final OffsetMapping getOffsetMapping$foundation() {
        return this.offsetMapping;
    }

    public final ky getOnValueChange$foundation() {
        return this.onValueChange;
    }

    public final PlatformSelectionBehaviors getPlatformSelectionBehaviors$foundation() {
        return this.platformSelectionBehaviors;
    }

    public final iy getRequestAutofillAction$foundation() {
        return this.requestAutofillAction;
    }

    public final LegacyTextFieldState getState$foundation() {
        return this.state;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final boolean getTextToolbarShown$foundation() {
        if (ComposeFoundationFlags.isNewContextMenuEnabled) {
            return this.textToolbarShownViaProvider;
        }
        TextToolbar textToolbar = this.textToolbar;
        return (textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Shown;
    }

    public final boolean getTextToolbarShownViaProvider$foundation() {
        return this.textToolbarShownViaProvider;
    }

    public final ToolbarRequester getToolbarRequester$foundation() {
        return this.toolbarRequester;
    }

    public final TextDragObserver getTouchSelectionObserver$foundation() {
        return this.touchSelectionObserver;
    }

    public final AnnotatedString getTransformedText$foundation() {
        TextDelegate textDelegate;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (textDelegate = legacyTextFieldState.getTextDelegate()) == null) {
            return null;
        }
        return textDelegate.getText();
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    public final TextFieldValue getValue$foundation() {
        return this.valueState.getValue();
    }

    public final VisualTransformation getVisualTransformation$foundation() {
        return this.visualTransformation;
    }

    public final TextDragObserver handleDragObserver$foundation(final boolean z) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1170onDownk4lQ0M(long j) {
                TextLayoutResultProxy layoutResult;
                TextFieldSelectionManager.this.setDraggingHandle(z ? Handle.SelectionStart : Handle.SelectionEnd);
                long m1506getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1506getAdjustedCoordinatesk4lQ0M(TextFieldSelectionManager.this.m1560getHandlePositiontuRUvjQ$foundation(z));
                LegacyTextFieldState state$foundation = TextFieldSelectionManager.this.getState$foundation();
                if (state$foundation == null || (layoutResult = state$foundation.getLayoutResult()) == null) {
                    return;
                }
                long m1205translateInnerToDecorationCoordinatesMKHz9U$foundation = layoutResult.m1205translateInnerToDecorationCoordinatesMKHz9U$foundation(m1506getAdjustedCoordinatesk4lQ0M);
                TextFieldSelectionManager.this.dragBeginPosition = m1205translateInnerToDecorationCoordinatesMKHz9U$foundation;
                TextFieldSelectionManager.this.m1555setCurrentDragPosition_kEHs6E(Offset.m4505boximpl(m1205translateInnerToDecorationCoordinatesMKHz9U$foundation));
                TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m4532getZeroF1C5BW0();
                TextFieldSelectionManager.this.previousRawDragOffset = -1;
                LegacyTextFieldState state$foundation2 = TextFieldSelectionManager.this.getState$foundation();
                if (state$foundation2 != null) {
                    state$foundation2.setInTouchMode(true);
                }
                TextFieldSelectionManager.this.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1171onDragk4lQ0M(long j) {
                long j2;
                long j3;
                long j4;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m4521plusMKHz9U(j2, j);
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j3 = textFieldSelectionManager2.dragBeginPosition;
                j4 = TextFieldSelectionManager.this.dragTotalDistance;
                textFieldSelectionManager2.m1555setCurrentDragPosition_kEHs6E(Offset.m4505boximpl(Offset.m4521plusMKHz9U(j3, j4)));
                TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
                TextFieldValue value$foundation = textFieldSelectionManager3.getValue$foundation();
                Offset m1558getCurrentDragPosition_m7T9E = TextFieldSelectionManager.this.m1558getCurrentDragPosition_m7T9E();
                m1558getCurrentDragPosition_m7T9E.getClass();
                textFieldSelectionManager3.m1556updateSelection8UEBfa8(value$foundation, m1558getCurrentDragPosition_m7T9E.m4526unboximpl(), false, z, SelectionAdjustment.Companion.getCharacterWithWordAccelerate(), true);
                TextFieldSelectionManager.this.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1555setCurrentDragPosition_kEHs6E(null);
                TextFieldSelectionManager.this.updateFloatingToolbar(true);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1555setCurrentDragPosition_kEHs6E(null);
                TextFieldSelectionManager.this.updateFloatingToolbar(true);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-3MmeM6k */
            public void mo1172onStart3MmeM6k(long j, SelectionAdjustment selectionAdjustment) {
            }
        };
    }

    public final void hideSelectionToolbar$foundation() {
        TextToolbar textToolbar;
        if (ComposeFoundationFlags.isNewContextMenuEnabled) {
            this.toolbarRequester.hide();
            return;
        }
        TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    public final boolean isCopyAllowed$foundation() {
        return getHasSelection() && !isPassword();
    }

    public final boolean isCutAllowed$foundation() {
        return getHasSelection() && getEditable() && !isPassword();
    }

    public final boolean isPasteAllowed$foundation() {
        return getEditable();
    }

    public final boolean isTextChanged$foundation() {
        return !q10.b(this.oldValue.getText(), getValue$foundation().getText());
    }

    public final void paste$foundation(AnnotatedString annotatedString) {
        if (getEditable()) {
            AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation(), getValue$foundation().getText().length()).plus(annotatedString).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation(), getValue$foundation().getText().length()));
            int length = annotatedString.length() + TextRange.m7058getMinimpl(getValue$foundation().m7310getSelectiond9O1mEE());
            this.onValueChange.invoke(m1552createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(length, length)));
            setHandleState(HandleState.None);
            UndoManager undoManager = this.undoManager;
            if (undoManager != null) {
                undoManager.forceNextSnapshot();
            }
        }
    }

    public final void selectAll$foundation() {
        TextFieldValue m1552createTextFieldValueFDrldGo = m1552createTextFieldValueFDrldGo(getValue$foundation().getAnnotatedString(), TextRangeKt.TextRange(0, getValue$foundation().getText().length()));
        this.onValueChange.invoke(m1552createTextFieldValueFDrldGo);
        this.latestSelection = TextRange.m7048boximpl(m1552createTextFieldValueFDrldGo.m7310getSelectiond9O1mEE());
        this.oldValue = TextFieldValue.m7305copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, m1552createTextFieldValueFDrldGo.m7310getSelectiond9O1mEE(), (TextRange) null, 5, (Object) null);
        enterSelectionMode$foundation(true);
    }

    /* renamed from: selectWordAtPositionIfNotAlreadySelected-k-4lQ0M, reason: not valid java name */
    public final void m1562selectWordAtPositionIfNotAlreadySelectedk4lQ0M(long j) {
        TextLayoutResultProxy layoutResult;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || TextLayoutHelperKt.m1199isPositionInsideSelectionuaM50fQ(layoutResult.getValue(), layoutResult.m1204translateDecorationToInnerCoordinatesMKHz9U$foundation(j), TextRange.m7048boximpl(getValue$foundation().m7310getSelectiond9O1mEE()))) {
            return;
        }
        m1556updateSelection8UEBfa8(getValue$foundation(), j, true, false, SelectionAdjustment.Companion.getWord(), false);
    }

    public final void setClipboard$foundation(Clipboard clipboard) {
        this.clipboard = clipboard;
    }

    public final void setCoroutineScope$foundation(un unVar) {
        this.coroutineScope = unVar;
    }

    /* renamed from: setDeletionPreviewHighlight-5zc-tL8$foundation, reason: not valid java name */
    public final void m1563setDeletionPreviewHighlight5zctL8$foundation(long j) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m1138setDeletionPreviewHighlightRange5zctL8(j);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m1141setSelectionPreviewHighlightRange5zctL8(TextRange.Companion.m7065getZerod9O1mEE());
        }
        if (TextRange.m7054getCollapsedimpl(j)) {
            return;
        }
        exitSelectionMode$foundation();
    }

    public final void setEditable(boolean z) {
        this.editable$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setEnabled(boolean z) {
        this.enabled$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    /* renamed from: setLatestSelection-OEnZFl4$foundation, reason: not valid java name */
    public final void m1564setLatestSelectionOEnZFl4$foundation(TextRange textRange) {
        this.latestSelection = textRange;
    }

    public final void setOffsetMapping$foundation(OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    public final void setOnValueChange$foundation(ky kyVar) {
        this.onValueChange = kyVar;
    }

    public final void setPlatformSelectionBehaviors$foundation(PlatformSelectionBehaviors platformSelectionBehaviors) {
        this.platformSelectionBehaviors = platformSelectionBehaviors;
    }

    public final void setRequestAutofillAction$foundation(iy iyVar) {
        this.requestAutofillAction = iyVar;
    }

    /* renamed from: setSelectionPreviewHighlight-5zc-tL8$foundation, reason: not valid java name */
    public final void m1565setSelectionPreviewHighlight5zctL8$foundation(long j) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m1141setSelectionPreviewHighlightRange5zctL8(j);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m1138setDeletionPreviewHighlightRange5zctL8(TextRange.Companion.m7065getZerod9O1mEE());
        }
        if (TextRange.m7054getCollapsedimpl(j)) {
            return;
        }
        exitSelectionMode$foundation();
    }

    public final void setState$foundation(LegacyTextFieldState legacyTextFieldState) {
        this.state = legacyTextFieldState;
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setTextToolbarShownViaProvider$foundation(boolean z) {
        this.textToolbarShownViaProvider = z;
    }

    public final void setToolbarRequester$foundation(ToolbarRequester toolbarRequester) {
        this.toolbarRequester = toolbarRequester;
    }

    public final void setValue$foundation(TextFieldValue textFieldValue) {
        this.valueState.setValue(textFieldValue);
        this.latestSelection = TextRange.m7048boximpl(textFieldValue.m7310getSelectiond9O1mEE());
    }

    public final void setVisualTransformation$foundation(VisualTransformation visualTransformation) {
        this.visualTransformation = visualTransformation;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r4.isInTouchMode() == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void showSelectionToolbar$foundation() {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (getEnabled()) {
                LegacyTextFieldState legacyTextFieldState = this.state;
                if (legacyTextFieldState != null) {
                }
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                if (ComposeFoundationFlags.isNewContextMenuEnabled) {
                    this.toolbarRequester.show();
                } else {
                    showSelectionToolbarViaTextToolbar();
                }
            }
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateClipboardEntry$foundation(hm hmVar) {
        TextFieldSelectionManager$updateClipboardEntry$1 textFieldSelectionManager$updateClipboardEntry$1;
        int i;
        if (hmVar instanceof TextFieldSelectionManager$updateClipboardEntry$1) {
            textFieldSelectionManager$updateClipboardEntry$1 = (TextFieldSelectionManager$updateClipboardEntry$1) hmVar;
            int i2 = textFieldSelectionManager$updateClipboardEntry$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                textFieldSelectionManager$updateClipboardEntry$1.label = i2 - Integer.MIN_VALUE;
                Object obj = textFieldSelectionManager$updateClipboardEntry$1.result;
                i = textFieldSelectionManager$updateClipboardEntry$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    Clipboard clipboard = this.clipboard;
                    if (clipboard != null && ClipboardUtils_androidKt.isReadSupported(clipboard)) {
                        textFieldSelectionManager$updateClipboardEntry$1.L$0 = this;
                        textFieldSelectionManager$updateClipboardEntry$1.label = 1;
                        obj = TextFieldSelectionManager_androidKt.hasAvailableTextToPaste(this, textFieldSelectionManager$updateClipboardEntry$1);
                        vn vnVar = vn.d;
                        if (obj == vnVar) {
                            return vnVar;
                        }
                    }
                    return w01.a;
                }
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = (TextFieldSelectionManager) textFieldSelectionManager$updateClipboardEntry$1.L$0;
                p10.Q(obj);
                this.setHasAvailableTextToPaste(((Boolean) obj).booleanValue());
                return w01.a;
            }
        }
        textFieldSelectionManager$updateClipboardEntry$1 = new TextFieldSelectionManager$updateClipboardEntry$1(this, hmVar);
        Object obj2 = textFieldSelectionManager$updateClipboardEntry$1.result;
        i = textFieldSelectionManager$updateClipboardEntry$1.label;
        if (i != 0) {
        }
        this.setHasAvailableTextToPaste(((Boolean) obj2).booleanValue());
        return w01.a;
    }

    public static /* synthetic */ void getTextToolbarShown$foundation$annotations() {
    }

    public static /* synthetic */ void getToolbarRequester$foundation$annotations() {
    }

    public final z10 paste$foundation() {
        un unVar = this.coroutineScope;
        if (unVar == null) {
            return null;
        }
        return p01.t(unVar, null, xn.g, new TextFieldSelectionManager$paste$1(this, null), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldSelectionManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager, int i, dq dqVar) {
        this((i & 1) != 0 ? null : undoManager);
    }
}
