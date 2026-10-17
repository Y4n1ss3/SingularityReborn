package androidx.compose.ui.semantics;

import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.autofill.FillableData;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import defpackage.db0;
import defpackage.er;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.ty;
import defpackage.w01;
import defpackage.y80;
import defpackage.z20;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsPropertiesKt {
    static final /* synthetic */ z20[] $$delegatedProperties = {new db0(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"), new db0(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;"), new db0(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"), new db0(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new db0(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new db0(SemanticsPropertiesKt.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new db0(SemanticsPropertiesKt.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new db0(SemanticsPropertiesKt.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new db0(SemanticsPropertiesKt.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;"), new db0(SemanticsPropertiesKt.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;"), new db0(SemanticsPropertiesKt.class, "fillableData", "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;"), new db0(SemanticsPropertiesKt.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F"), new db0(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"), new db0(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"), new db0(SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new db0(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"), new db0(SemanticsPropertiesKt.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new db0(SemanticsPropertiesKt.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new db0(SemanticsPropertiesKt.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new db0(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new db0(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J"), new db0(SemanticsPropertiesKt.class, "textCompositionRange", "getTextCompositionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/TextRange;"), new db0(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new db0(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new db0(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;"), new db0(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;"), new db0(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;"), new db0(SemanticsPropertiesKt.class, "inputTextSuggestionState", "getInputTextSuggestionState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/InputTextSuggestionState;"), new db0(SemanticsPropertiesKt.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new db0(SemanticsPropertiesKt.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new db0(SemanticsPropertiesKt.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;"), new db0(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;")};

    static {
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        semanticsProperties.getStateDescription();
        semanticsProperties.getProgressBarRangeInfo();
        semanticsProperties.getPaneTitle();
        semanticsProperties.getLiveRegion();
        semanticsProperties.getFocused();
        semanticsProperties.getIsContainer();
        semanticsProperties.getIsTraversalGroup();
        semanticsProperties.getIsSensitiveData();
        semanticsProperties.getContentType();
        semanticsProperties.getContentDataType();
        semanticsProperties.getFillableData();
        semanticsProperties.getTraversalIndex();
        semanticsProperties.getHorizontalScrollAxisRange();
        semanticsProperties.getVerticalScrollAxisRange();
        semanticsProperties.getRole();
        semanticsProperties.getTestTag();
        semanticsProperties.getTextSubstitution();
        semanticsProperties.getIsShowingTextSubstitution();
        semanticsProperties.getInputText();
        semanticsProperties.getEditableText();
        semanticsProperties.getTextSelectionRange();
        semanticsProperties.getTextCompositionRange();
        semanticsProperties.getImeAction();
        semanticsProperties.getSelected();
        semanticsProperties.getCollectionInfo();
        semanticsProperties.getCollectionItemInfo();
        semanticsProperties.getToggleableState();
        semanticsProperties.getInputTextSuggestionState();
        semanticsProperties.getIsEditable();
        semanticsProperties.getMaxTextLength();
        semanticsProperties.getShape();
        SemanticsActions.INSTANCE.getCustomActions();
    }

    public static final <T> SemanticsPropertyKey<T> AccessibilityKey(String str, my myVar) {
        return new SemanticsPropertyKey<>(str, true, myVar, null, 8, null);
    }

    private static final <T extends ty> SemanticsPropertyKey<AccessibilityAction<T>> ActionPropertyKey(String str) {
        return new SemanticsPropertyKey<>(str, true, SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE, null, 8, null);
    }

    public static final void clearTextSubstitution(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getClearTextSubstitution(), new AccessibilityAction(str, iyVar));
    }

    public static /* synthetic */ void clearTextSubstitution$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        clearTextSubstitution(semanticsPropertyReceiver, str, iyVar);
    }

    public static final void collapse(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCollapse(), new AccessibilityAction(str, iyVar));
    }

    public static /* synthetic */ void collapse$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        collapse(semanticsPropertyReceiver, str, iyVar);
    }

    public static final void copyText(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCopyText(), new AccessibilityAction(str, iyVar));
    }

    public static /* synthetic */ void copyText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        copyText(semanticsPropertyReceiver, str, iyVar);
    }

    public static final void cutText(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCutText(), new AccessibilityAction(str, iyVar));
    }

    public static /* synthetic */ void cutText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        cutText(semanticsPropertyReceiver, str, iyVar);
    }

    public static final void dialog(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIsDialog(), w01.a);
    }

    public static final void disabled(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getDisabled(), w01.a);
    }

    public static final void dismiss(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getDismiss(), new AccessibilityAction(str, iyVar));
    }

    public static /* synthetic */ void dismiss$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        dismiss(semanticsPropertyReceiver, str, iyVar);
    }

    public static final void error(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getError(), str);
    }

    public static final void expand(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getExpand(), new AccessibilityAction(str, iyVar));
    }

    public static /* synthetic */ void expand$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        expand(semanticsPropertyReceiver, str, iyVar);
    }

    public static final CollectionInfo getCollectionInfo(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getCollectionInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[24]);
    }

    public static final CollectionItemInfo getCollectionItemInfo(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getCollectionItemInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[25]);
    }

    public static final ContentDataType getContentDataType(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getContentDataType().getValue(semanticsPropertyReceiver, $$delegatedProperties[9]);
    }

    public static final String getContentDescription(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return (String) throwSemanticsGetNotSupported();
    }

    public static final ContentType getContentType(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getContentType().getValue(semanticsPropertyReceiver, $$delegatedProperties[8]);
    }

    public static final List<CustomAccessibilityAction> getCustomActions(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsActions.INSTANCE.getCustomActions().getValue(semanticsPropertyReceiver, $$delegatedProperties[31]);
    }

    public static final AnnotatedString getEditableText(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getEditableText().getValue(semanticsPropertyReceiver, $$delegatedProperties[19]);
    }

    public static final FillableData getFillableData(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getFillableData().getValue(semanticsPropertyReceiver, $$delegatedProperties[10]);
    }

    public static final boolean getFocused(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getFocused().getValue(semanticsPropertyReceiver, $$delegatedProperties[4]).booleanValue();
    }

    public static final ScrollAxisRange getHorizontalScrollAxisRange(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[12]);
    }

    @er
    public static final int getImeAction(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getImeAction().getValue(semanticsPropertyReceiver, $$delegatedProperties[22]).m7231unboximpl();
    }

    public static final AnnotatedString getInputText(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getInputText().getValue(semanticsPropertyReceiver, $$delegatedProperties[18]);
    }

    public static final InputTextSuggestionState getInputTextSuggestionState(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getInputTextSuggestionState().getValue(semanticsPropertyReceiver, $$delegatedProperties[27]);
    }

    public static final int getLiveRegion(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getLiveRegion().getValue(semanticsPropertyReceiver, $$delegatedProperties[3]).m6818unboximpl();
    }

    public static final int getMaxTextLength(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getMaxTextLength().getValue(semanticsPropertyReceiver, $$delegatedProperties[29]).intValue();
    }

    public static final String getPaneTitle(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getPaneTitle().getValue(semanticsPropertyReceiver, $$delegatedProperties[2]);
    }

    public static final ProgressBarRangeInfo getProgressBarRangeInfo(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getProgressBarRangeInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[1]);
    }

    public static final int getRole(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getRole().getValue(semanticsPropertyReceiver, $$delegatedProperties[14]).m6827unboximpl();
    }

    public static final void getScrollViewportLength(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getGetScrollViewportLength(), new AccessibilityAction(str, new SemanticsPropertiesKt$getScrollViewportLength$1(iyVar)));
    }

    public static /* synthetic */ void getScrollViewportLength$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        getScrollViewportLength(semanticsPropertyReceiver, str, iyVar);
    }

    public static final boolean getSelected(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getSelected().getValue(semanticsPropertyReceiver, $$delegatedProperties[23]).booleanValue();
    }

    public static final Shape getShape(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getShape().getValue(semanticsPropertyReceiver, $$delegatedProperties[30]);
    }

    public static final String getStateDescription(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getStateDescription().getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    public static final String getTestTag(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTestTag().getValue(semanticsPropertyReceiver, $$delegatedProperties[15]);
    }

    public static final AnnotatedString getText(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return (AnnotatedString) throwSemanticsGetNotSupported();
    }

    public static final TextRange getTextCompositionRange(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTextCompositionRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[21]);
    }

    public static final void getTextLayoutResult(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, ky kyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getGetTextLayoutResult(), new AccessibilityAction(str, kyVar));
    }

    public static /* synthetic */ void getTextLayoutResult$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        getTextLayoutResult(semanticsPropertyReceiver, str, kyVar);
    }

    public static final long getTextSelectionRange(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTextSelectionRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[20]).m7064unboximpl();
    }

    public static final AnnotatedString getTextSubstitution(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTextSubstitution().getValue(semanticsPropertyReceiver, $$delegatedProperties[16]);
    }

    public static final ToggleableState getToggleableState(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getToggleableState().getValue(semanticsPropertyReceiver, $$delegatedProperties[26]);
    }

    public static final float getTraversalIndex(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTraversalIndex().getValue(semanticsPropertyReceiver, $$delegatedProperties[11]).floatValue();
    }

    public static final ScrollAxisRange getVerticalScrollAxisRange(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[13]);
    }

    public static final void heading(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getHeading(), w01.a);
    }

    public static final void hideFromAccessibility(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getHideFromAccessibility(), w01.a);
    }

    public static final void indexForKey(SemanticsPropertyReceiver semanticsPropertyReceiver, ky kyVar) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIndexForKey(), kyVar);
    }

    public static final void insertTextAtCursor(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, ky kyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getInsertTextAtCursor(), new AccessibilityAction(str, kyVar));
    }

    public static /* synthetic */ void insertTextAtCursor$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        insertTextAtCursor(semanticsPropertyReceiver, str, kyVar);
    }

    @er
    public static final void invisibleToUser(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getInvisibleToUser(), w01.a);
    }

    public static final boolean isContainer(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getIsContainer().getValue(semanticsPropertyReceiver, $$delegatedProperties[5]).booleanValue();
    }

    public static final boolean isEditable(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getIsEditable().getValue(semanticsPropertyReceiver, $$delegatedProperties[28]).booleanValue();
    }

    public static final boolean isSensitiveData(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getIsSensitiveData().getValue(semanticsPropertyReceiver, $$delegatedProperties[7]).booleanValue();
    }

    public static final boolean isShowingTextSubstitution(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getIsShowingTextSubstitution().getValue(semanticsPropertyReceiver, $$delegatedProperties[17]).booleanValue();
    }

    public static final boolean isTraversalGroup(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getIsTraversalGroup().getValue(semanticsPropertyReceiver, $$delegatedProperties[6]).booleanValue();
    }

    @er
    public static final void onAutofillText(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, ky kyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnAutofillText(), new AccessibilityAction(str, kyVar));
    }

    public static /* synthetic */ void onAutofillText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        onAutofillText(semanticsPropertyReceiver, str, kyVar);
    }

    public static final void onClick(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnClick(), new AccessibilityAction(str, iyVar));
    }

    public static /* synthetic */ void onClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        onClick(semanticsPropertyReceiver, str, iyVar);
    }

    public static final void onFillData(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, ky kyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnFillData(), new AccessibilityAction(str, kyVar));
    }

    public static /* synthetic */ void onFillData$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        onFillData(semanticsPropertyReceiver, str, kyVar);
    }

    /* renamed from: onImeAction-9UiTYpY, reason: not valid java name */
    public static final void m6843onImeAction9UiTYpY(SemanticsPropertyReceiver semanticsPropertyReceiver, int i, String str, iy iyVar) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getImeAction(), ImeAction.m7225boximpl(i));
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnImeAction(), new AccessibilityAction(str, iyVar));
    }

    /* renamed from: onImeAction-9UiTYpY$default, reason: not valid java name */
    public static /* synthetic */ void m6844onImeAction9UiTYpY$default(SemanticsPropertyReceiver semanticsPropertyReceiver, int i, String str, iy iyVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        m6843onImeAction9UiTYpY(semanticsPropertyReceiver, i, str, iyVar);
    }

    public static final void onLongClick(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnLongClick(), new AccessibilityAction(str, iyVar));
    }

    public static /* synthetic */ void onLongClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        onLongClick(semanticsPropertyReceiver, str, iyVar);
    }

    public static final void pageDown(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageDown(), new AccessibilityAction(str, iyVar));
    }

    public static /* synthetic */ void pageDown$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pageDown(semanticsPropertyReceiver, str, iyVar);
    }

    public static final void pageLeft(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageLeft(), new AccessibilityAction(str, iyVar));
    }

    public static /* synthetic */ void pageLeft$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pageLeft(semanticsPropertyReceiver, str, iyVar);
    }

    public static final void pageRight(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageRight(), new AccessibilityAction(str, iyVar));
    }

    public static /* synthetic */ void pageRight$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pageRight(semanticsPropertyReceiver, str, iyVar);
    }

    public static final void pageUp(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageUp(), new AccessibilityAction(str, iyVar));
    }

    public static /* synthetic */ void pageUp$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pageUp(semanticsPropertyReceiver, str, iyVar);
    }

    public static final void password(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getPassword(), w01.a);
    }

    public static final void pasteText(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPasteText(), new AccessibilityAction(str, iyVar));
    }

    public static /* synthetic */ void pasteText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pasteText(semanticsPropertyReceiver, str, iyVar);
    }

    @er
    public static final void performImeAction(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnImeAction(), new AccessibilityAction(str, iyVar));
    }

    public static /* synthetic */ void performImeAction$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        performImeAction(semanticsPropertyReceiver, str, iyVar);
    }

    public static final void popup(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIsPopup(), w01.a);
    }

    public static final void requestFocus(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getRequestFocus(), new AccessibilityAction(str, iyVar));
    }

    public static /* synthetic */ void requestFocus$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        requestFocus(semanticsPropertyReceiver, str, iyVar);
    }

    public static final void scrollBy(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, my myVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollBy(), new AccessibilityAction(str, myVar));
    }

    public static /* synthetic */ void scrollBy$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, my myVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        scrollBy(semanticsPropertyReceiver, str, myVar);
    }

    public static final void scrollByOffset(SemanticsPropertyReceiver semanticsPropertyReceiver, my myVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollByOffset(), myVar);
    }

    public static final void scrollToIndex(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, ky kyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollToIndex(), new AccessibilityAction(str, kyVar));
    }

    public static /* synthetic */ void scrollToIndex$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        scrollToIndex(semanticsPropertyReceiver, str, kyVar);
    }

    public static final void selectableGroup(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getSelectableGroup(), w01.a);
    }

    public static final void setCollectionInfo(SemanticsPropertyReceiver semanticsPropertyReceiver, CollectionInfo collectionInfo) {
        SemanticsProperties.INSTANCE.getCollectionInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[24], collectionInfo);
    }

    public static final void setCollectionItemInfo(SemanticsPropertyReceiver semanticsPropertyReceiver, CollectionItemInfo collectionItemInfo) {
        SemanticsProperties.INSTANCE.getCollectionItemInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[25], collectionItemInfo);
    }

    public static final void setContainer(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        SemanticsProperties.INSTANCE.getIsContainer().setValue(semanticsPropertyReceiver, $$delegatedProperties[5], Boolean.valueOf(z));
    }

    public static final void setContentDataType(SemanticsPropertyReceiver semanticsPropertyReceiver, ContentDataType contentDataType) {
        SemanticsProperties.INSTANCE.getContentDataType().setValue(semanticsPropertyReceiver, $$delegatedProperties[9], contentDataType);
    }

    public static final void setContentDescription(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getContentDescription(), y80.D(str));
    }

    public static final void setContentType(SemanticsPropertyReceiver semanticsPropertyReceiver, ContentType contentType) {
        SemanticsProperties.INSTANCE.getContentType().setValue(semanticsPropertyReceiver, $$delegatedProperties[8], contentType);
    }

    public static final void setCustomActions(SemanticsPropertyReceiver semanticsPropertyReceiver, List<CustomAccessibilityAction> list) {
        SemanticsActions.INSTANCE.getCustomActions().setValue(semanticsPropertyReceiver, $$delegatedProperties[31], list);
    }

    public static final void setEditable(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        SemanticsProperties.INSTANCE.getIsEditable().setValue(semanticsPropertyReceiver, $$delegatedProperties[28], Boolean.valueOf(z));
    }

    public static final void setEditableText(SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString annotatedString) {
        SemanticsProperties.INSTANCE.getEditableText().setValue(semanticsPropertyReceiver, $$delegatedProperties[19], annotatedString);
    }

    public static final void setFillableData(SemanticsPropertyReceiver semanticsPropertyReceiver, FillableData fillableData) {
        SemanticsProperties.INSTANCE.getFillableData().setValue(semanticsPropertyReceiver, $$delegatedProperties[10], fillableData);
    }

    public static final void setFocused(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        SemanticsProperties.INSTANCE.getFocused().setValue(semanticsPropertyReceiver, $$delegatedProperties[4], Boolean.valueOf(z));
    }

    public static final void setHorizontalScrollAxisRange(SemanticsPropertyReceiver semanticsPropertyReceiver, ScrollAxisRange scrollAxisRange) {
        SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[12], scrollAxisRange);
    }

    @er
    /* renamed from: setImeAction-4L7nppU, reason: not valid java name */
    public static final void m6845setImeAction4L7nppU(SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        SemanticsProperties.INSTANCE.getImeAction().setValue(semanticsPropertyReceiver, $$delegatedProperties[22], ImeAction.m7225boximpl(i));
    }

    public static final void setInputText(SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString annotatedString) {
        SemanticsProperties.INSTANCE.getInputText().setValue(semanticsPropertyReceiver, $$delegatedProperties[18], annotatedString);
    }

    public static final void setInputTextSuggestionState(SemanticsPropertyReceiver semanticsPropertyReceiver, InputTextSuggestionState inputTextSuggestionState) {
        SemanticsProperties.INSTANCE.getInputTextSuggestionState().setValue(semanticsPropertyReceiver, $$delegatedProperties[27], inputTextSuggestionState);
    }

    /* renamed from: setLiveRegion-hR3wRGc, reason: not valid java name */
    public static final void m6846setLiveRegionhR3wRGc(SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        SemanticsProperties.INSTANCE.getLiveRegion().setValue(semanticsPropertyReceiver, $$delegatedProperties[3], LiveRegionMode.m6812boximpl(i));
    }

    public static final void setMaxTextLength(SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        SemanticsProperties.INSTANCE.getMaxTextLength().setValue(semanticsPropertyReceiver, $$delegatedProperties[29], Integer.valueOf(i));
    }

    public static final void setPaneTitle(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsProperties.INSTANCE.getPaneTitle().setValue(semanticsPropertyReceiver, $$delegatedProperties[2], str);
    }

    public static final void setProgress(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, ky kyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetProgress(), new AccessibilityAction(str, kyVar));
    }

    public static /* synthetic */ void setProgress$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        setProgress(semanticsPropertyReceiver, str, kyVar);
    }

    public static final void setProgressBarRangeInfo(SemanticsPropertyReceiver semanticsPropertyReceiver, ProgressBarRangeInfo progressBarRangeInfo) {
        SemanticsProperties.INSTANCE.getProgressBarRangeInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[1], progressBarRangeInfo);
    }

    /* renamed from: setRole-kuIjeqM, reason: not valid java name */
    public static final void m6847setRolekuIjeqM(SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        SemanticsProperties.INSTANCE.getRole().setValue(semanticsPropertyReceiver, $$delegatedProperties[14], Role.m6821boximpl(i));
    }

    public static final void setSelected(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        SemanticsProperties.INSTANCE.getSelected().setValue(semanticsPropertyReceiver, $$delegatedProperties[23], Boolean.valueOf(z));
    }

    public static final void setSelection(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, ny nyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetSelection(), new AccessibilityAction(str, nyVar));
    }

    public static /* synthetic */ void setSelection$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, ny nyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        setSelection(semanticsPropertyReceiver, str, nyVar);
    }

    public static final void setSensitiveData(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        SemanticsProperties.INSTANCE.getIsSensitiveData().setValue(semanticsPropertyReceiver, $$delegatedProperties[7], Boolean.valueOf(z));
    }

    public static final void setShape(SemanticsPropertyReceiver semanticsPropertyReceiver, Shape shape) {
        SemanticsProperties.INSTANCE.getShape().setValue(semanticsPropertyReceiver, $$delegatedProperties[30], shape);
    }

    public static final void setShowingTextSubstitution(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        SemanticsProperties.INSTANCE.getIsShowingTextSubstitution().setValue(semanticsPropertyReceiver, $$delegatedProperties[17], Boolean.valueOf(z));
    }

    public static final void setStateDescription(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsProperties.INSTANCE.getStateDescription().setValue(semanticsPropertyReceiver, $$delegatedProperties[0], str);
    }

    public static final void setTestTag(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsProperties.INSTANCE.getTestTag().setValue(semanticsPropertyReceiver, $$delegatedProperties[15], str);
    }

    public static final void setText(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, ky kyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetText(), new AccessibilityAction(str, kyVar));
    }

    public static /* synthetic */ void setText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        setText(semanticsPropertyReceiver, str, kyVar);
    }

    /* renamed from: setTextCompositionRange-psREZIo, reason: not valid java name */
    public static final void m6848setTextCompositionRangepsREZIo(SemanticsPropertyReceiver semanticsPropertyReceiver, TextRange textRange) {
        SemanticsProperties.INSTANCE.getTextCompositionRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[21], textRange);
    }

    /* renamed from: setTextSelectionRange-FDrldGo, reason: not valid java name */
    public static final void m6849setTextSelectionRangeFDrldGo(SemanticsPropertyReceiver semanticsPropertyReceiver, long j) {
        SemanticsProperties.INSTANCE.getTextSelectionRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[20], TextRange.m7048boximpl(j));
    }

    public static final void setTextSubstitution(SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString annotatedString) {
        SemanticsProperties.INSTANCE.getTextSubstitution().setValue(semanticsPropertyReceiver, $$delegatedProperties[16], annotatedString);
    }

    public static /* synthetic */ void setTextSubstitution$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        setTextSubstitution(semanticsPropertyReceiver, str, kyVar);
    }

    public static final void setToggleableState(SemanticsPropertyReceiver semanticsPropertyReceiver, ToggleableState toggleableState) {
        SemanticsProperties.INSTANCE.getToggleableState().setValue(semanticsPropertyReceiver, $$delegatedProperties[26], toggleableState);
    }

    public static final void setTraversalGroup(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        SemanticsProperties.INSTANCE.getIsTraversalGroup().setValue(semanticsPropertyReceiver, $$delegatedProperties[6], Boolean.valueOf(z));
    }

    public static final void setTraversalIndex(SemanticsPropertyReceiver semanticsPropertyReceiver, float f) {
        SemanticsProperties.INSTANCE.getTraversalIndex().setValue(semanticsPropertyReceiver, $$delegatedProperties[11], Float.valueOf(f));
    }

    public static final void setVerticalScrollAxisRange(SemanticsPropertyReceiver semanticsPropertyReceiver, ScrollAxisRange scrollAxisRange) {
        SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[13], scrollAxisRange);
    }

    public static final void showTextSubstitution(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, ky kyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getShowTextSubstitution(), new AccessibilityAction(str, kyVar));
    }

    public static /* synthetic */ void showTextSubstitution$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        showTextSubstitution(semanticsPropertyReceiver, str, kyVar);
    }

    public static final void textEntryKey(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getTextEntryKey(), w01.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T throwSemanticsGetNotSupported() {
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    public static final <T> SemanticsPropertyKey<T> AccessibilityKey(String str) {
        return new SemanticsPropertyKey<>(str, true);
    }

    public static final void setText(SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString annotatedString) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getText(), y80.D(annotatedString));
    }

    public static final void setTextSubstitution(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, ky kyVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetTextSubstitution(), new AccessibilityAction(str, kyVar));
    }

    @er
    public static /* synthetic */ void getImeAction$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    @er
    public static /* synthetic */ void isContainer$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }
}
