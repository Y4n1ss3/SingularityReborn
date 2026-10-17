package androidx.compose.ui.semantics;

import defpackage.dq;
import defpackage.er;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsActions {
    public static final int $stable;
    private static final SemanticsPropertyKey<AccessibilityAction<iy>> ClearTextSubstitution;
    private static final SemanticsPropertyKey<AccessibilityAction<iy>> Collapse;
    private static final SemanticsPropertyKey<AccessibilityAction<iy>> CopyText;
    private static final SemanticsPropertyKey<List<CustomAccessibilityAction>> CustomActions;
    private static final SemanticsPropertyKey<AccessibilityAction<iy>> CutText;
    private static final SemanticsPropertyKey<AccessibilityAction<iy>> Dismiss;
    private static final SemanticsPropertyKey<AccessibilityAction<iy>> Expand;
    private static final SemanticsPropertyKey<AccessibilityAction<ky>> GetScrollViewportLength;
    private static final SemanticsPropertyKey<AccessibilityAction<ky>> GetTextLayoutResult;
    public static final SemanticsActions INSTANCE = new SemanticsActions();
    private static final SemanticsPropertyKey<AccessibilityAction<ky>> InsertTextAtCursor;
    private static final SemanticsPropertyKey<AccessibilityAction<ky>> OnAutofillText;
    private static final SemanticsPropertyKey<AccessibilityAction<iy>> OnClick;
    private static final SemanticsPropertyKey<AccessibilityAction<ky>> OnFillData;
    private static final SemanticsPropertyKey<AccessibilityAction<iy>> OnImeAction;
    private static final SemanticsPropertyKey<AccessibilityAction<iy>> OnLongClick;
    private static final SemanticsPropertyKey<AccessibilityAction<iy>> PageDown;
    private static final SemanticsPropertyKey<AccessibilityAction<iy>> PageLeft;
    private static final SemanticsPropertyKey<AccessibilityAction<iy>> PageRight;
    private static final SemanticsPropertyKey<AccessibilityAction<iy>> PageUp;
    private static final SemanticsPropertyKey<AccessibilityAction<iy>> PasteText;
    private static final SemanticsPropertyKey<AccessibilityAction<iy>> PerformImeAction;
    private static final SemanticsPropertyKey<AccessibilityAction<iy>> RequestFocus;
    private static final SemanticsPropertyKey<AccessibilityAction<my>> ScrollBy;
    private static final SemanticsPropertyKey<my> ScrollByOffset;
    private static final SemanticsPropertyKey<AccessibilityAction<ky>> ScrollToIndex;
    private static final SemanticsPropertyKey<AccessibilityAction<ky>> SetProgress;
    private static final SemanticsPropertyKey<AccessibilityAction<ny>> SetSelection;
    private static final SemanticsPropertyKey<AccessibilityAction<ky>> SetText;
    private static final SemanticsPropertyKey<AccessibilityAction<ky>> SetTextSubstitution;
    private static final SemanticsPropertyKey<AccessibilityAction<ky>> ShowTextSubstitution;

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE;
        GetTextLayoutResult = new SemanticsPropertyKey<>("GetTextLayoutResult", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        OnClick = new SemanticsPropertyKey<>("OnClick", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        OnLongClick = new SemanticsPropertyKey<>("OnLongClick", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        ScrollBy = new SemanticsPropertyKey<>("ScrollBy", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        ScrollByOffset = new SemanticsPropertyKey<>("ScrollByOffset", (my) null, 2, (dq) null);
        ScrollToIndex = new SemanticsPropertyKey<>("ScrollToIndex", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        OnAutofillText = new SemanticsPropertyKey<>("OnAutofillText", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        OnFillData = new SemanticsPropertyKey<>("OnFillData", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        SetProgress = new SemanticsPropertyKey<>("SetProgress", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        SetSelection = new SemanticsPropertyKey<>("SetSelection", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        SetText = new SemanticsPropertyKey<>("SetText", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        SetTextSubstitution = new SemanticsPropertyKey<>("SetTextSubstitution", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        ShowTextSubstitution = new SemanticsPropertyKey<>("ShowTextSubstitution", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        ClearTextSubstitution = new SemanticsPropertyKey<>("ClearTextSubstitution", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        InsertTextAtCursor = new SemanticsPropertyKey<>("InsertTextAtCursor", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        OnImeAction = new SemanticsPropertyKey<>("PerformImeAction", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        PerformImeAction = new SemanticsPropertyKey<>("PerformImeAction", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        CopyText = new SemanticsPropertyKey<>("CopyText", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        CutText = new SemanticsPropertyKey<>("CutText", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        PasteText = new SemanticsPropertyKey<>("PasteText", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        Expand = new SemanticsPropertyKey<>("Expand", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        Collapse = new SemanticsPropertyKey<>("Collapse", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        Dismiss = new SemanticsPropertyKey<>("Dismiss", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        RequestFocus = new SemanticsPropertyKey<>("RequestFocus", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        CustomActions = new SemanticsPropertyKey<>("CustomActions", true, SemanticsActions$CustomActions$1.INSTANCE, null, 8, null);
        PageUp = new SemanticsPropertyKey<>("PageUp", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        PageLeft = new SemanticsPropertyKey<>("PageLeft", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        PageDown = new SemanticsPropertyKey<>("PageDown", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        PageRight = new SemanticsPropertyKey<>("PageRight", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        GetScrollViewportLength = new SemanticsPropertyKey<>("GetScrollViewportLength", true, semanticsPropertiesKt$ActionPropertyKey$1, null, 8, null);
        $stable = 8;
    }

    private SemanticsActions() {
    }

    public final SemanticsPropertyKey<AccessibilityAction<iy>> getClearTextSubstitution() {
        return ClearTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<iy>> getCollapse() {
        return Collapse;
    }

    public final SemanticsPropertyKey<AccessibilityAction<iy>> getCopyText() {
        return CopyText;
    }

    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> getCustomActions() {
        return CustomActions;
    }

    public final SemanticsPropertyKey<AccessibilityAction<iy>> getCutText() {
        return CutText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<iy>> getDismiss() {
        return Dismiss;
    }

    public final SemanticsPropertyKey<AccessibilityAction<iy>> getExpand() {
        return Expand;
    }

    public final SemanticsPropertyKey<AccessibilityAction<ky>> getGetScrollViewportLength() {
        return GetScrollViewportLength;
    }

    public final SemanticsPropertyKey<AccessibilityAction<ky>> getGetTextLayoutResult() {
        return GetTextLayoutResult;
    }

    public final SemanticsPropertyKey<AccessibilityAction<ky>> getInsertTextAtCursor() {
        return InsertTextAtCursor;
    }

    public final SemanticsPropertyKey<AccessibilityAction<ky>> getOnAutofillText() {
        return OnAutofillText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<iy>> getOnClick() {
        return OnClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<ky>> getOnFillData() {
        return OnFillData;
    }

    public final SemanticsPropertyKey<AccessibilityAction<iy>> getOnImeAction() {
        return OnImeAction;
    }

    public final SemanticsPropertyKey<AccessibilityAction<iy>> getOnLongClick() {
        return OnLongClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<iy>> getPageDown() {
        return PageDown;
    }

    public final SemanticsPropertyKey<AccessibilityAction<iy>> getPageLeft() {
        return PageLeft;
    }

    public final SemanticsPropertyKey<AccessibilityAction<iy>> getPageRight() {
        return PageRight;
    }

    public final SemanticsPropertyKey<AccessibilityAction<iy>> getPageUp() {
        return PageUp;
    }

    public final SemanticsPropertyKey<AccessibilityAction<iy>> getPasteText() {
        return PasteText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<iy>> getPerformImeAction() {
        return PerformImeAction;
    }

    public final SemanticsPropertyKey<AccessibilityAction<iy>> getRequestFocus() {
        return RequestFocus;
    }

    public final SemanticsPropertyKey<AccessibilityAction<my>> getScrollBy() {
        return ScrollBy;
    }

    public final SemanticsPropertyKey<my> getScrollByOffset() {
        return ScrollByOffset;
    }

    public final SemanticsPropertyKey<AccessibilityAction<ky>> getScrollToIndex() {
        return ScrollToIndex;
    }

    public final SemanticsPropertyKey<AccessibilityAction<ky>> getSetProgress() {
        return SetProgress;
    }

    public final SemanticsPropertyKey<AccessibilityAction<ny>> getSetSelection() {
        return SetSelection;
    }

    public final SemanticsPropertyKey<AccessibilityAction<ky>> getSetText() {
        return SetText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<ky>> getSetTextSubstitution() {
        return SetTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<ky>> getShowTextSubstitution() {
        return ShowTextSubstitution;
    }

    @er
    public static /* synthetic */ void getOnAutofillText$annotations() {
    }

    @er
    public static /* synthetic */ void getPerformImeAction$annotations() {
    }
}
