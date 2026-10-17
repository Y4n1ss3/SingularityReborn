package androidx.compose.ui.semantics;

import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.autofill.FillableData;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import defpackage.dq;
import defpackage.er;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsProperties {
    public static final SemanticsProperties INSTANCE = new SemanticsProperties();
    private static final SemanticsPropertyKey<List<String>> ContentDescription = new SemanticsPropertyKey<>("ContentDescription", true, SemanticsProperties$ContentDescription$1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<String> StateDescription = new SemanticsPropertyKey<>("StateDescription", true);
    private static final SemanticsPropertyKey<ProgressBarRangeInfo> ProgressBarRangeInfo = new SemanticsPropertyKey<>("ProgressBarRangeInfo", true);
    private static final SemanticsPropertyKey<String> PaneTitle = new SemanticsPropertyKey<>("PaneTitle", true, SemanticsProperties$PaneTitle$1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<w01> SelectableGroup = new SemanticsPropertyKey<>("SelectableGroup", true);
    private static final SemanticsPropertyKey<CollectionInfo> CollectionInfo = new SemanticsPropertyKey<>("CollectionInfo", true);
    private static final SemanticsPropertyKey<CollectionItemInfo> CollectionItemInfo = new SemanticsPropertyKey<>("CollectionItemInfo", true);
    private static final SemanticsPropertyKey<w01> Heading = new SemanticsPropertyKey<>("Heading", true);
    private static final SemanticsPropertyKey<w01> TextEntryKey = new SemanticsPropertyKey<>("TextEntryKey", true);
    private static final SemanticsPropertyKey<w01> Disabled = new SemanticsPropertyKey<>("Disabled", true);
    private static final SemanticsPropertyKey<LiveRegionMode> LiveRegion = new SemanticsPropertyKey<>("LiveRegion", true);
    private static final SemanticsPropertyKey<Boolean> Focused = new SemanticsPropertyKey<>("Focused", true);
    private static final SemanticsPropertyKey<Boolean> IsContainer = new SemanticsPropertyKey<>("IsContainer", true);
    private static final SemanticsPropertyKey<Boolean> IsTraversalGroup = new SemanticsPropertyKey<>("IsTraversalGroup", (my) null, 2, (dq) null);
    private static final SemanticsPropertyKey<Boolean> IsSensitiveData = new SemanticsPropertyKey<>("IsSensitiveData", (my) null, 2, (dq) null);
    private static final SemanticsPropertyKey<w01> InvisibleToUser = new SemanticsPropertyKey<>("InvisibleToUser", SemanticsProperties$InvisibleToUser$1.INSTANCE);
    private static final SemanticsPropertyKey<w01> HideFromAccessibility = new SemanticsPropertyKey<>("HideFromAccessibility", SemanticsProperties$HideFromAccessibility$1.INSTANCE);
    private static final SemanticsPropertyKey<ContentType> ContentType = new SemanticsPropertyKey<>("ContentType", SemanticsProperties$ContentType$1.INSTANCE);
    private static final SemanticsPropertyKey<ContentDataType> ContentDataType = new SemanticsPropertyKey<>("ContentDataType", SemanticsProperties$ContentDataType$1.INSTANCE);
    private static final SemanticsPropertyKey<FillableData> FillableData = new SemanticsPropertyKey<>("FillableData", SemanticsProperties$FillableData$1.INSTANCE);
    private static final SemanticsPropertyKey<Float> TraversalIndex = new SemanticsPropertyKey<>("TraversalIndex", SemanticsProperties$TraversalIndex$1.INSTANCE);
    private static final SemanticsPropertyKey<ScrollAxisRange> HorizontalScrollAxisRange = new SemanticsPropertyKey<>("HorizontalScrollAxisRange", true);
    private static final SemanticsPropertyKey<ScrollAxisRange> VerticalScrollAxisRange = new SemanticsPropertyKey<>("VerticalScrollAxisRange", true);
    private static final SemanticsPropertyKey<w01> IsPopup = new SemanticsPropertyKey<>("IsPopup", true, SemanticsProperties$IsPopup$1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<w01> IsDialog = new SemanticsPropertyKey<>("IsDialog", true, SemanticsProperties$IsDialog$1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<Role> Role = new SemanticsPropertyKey<>("Role", true, SemanticsProperties$Role$1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<String> TestTag = new SemanticsPropertyKey<>("TestTag", false, SemanticsProperties$TestTag$1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<w01> LinkTestMarker = new SemanticsPropertyKey<>("LinkTestMarker", false, SemanticsProperties$LinkTestMarker$1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<List<AnnotatedString>> Text = new SemanticsPropertyKey<>("Text", true, SemanticsProperties$Text$1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AnnotatedString> TextSubstitution = new SemanticsPropertyKey<>("TextSubstitution", (my) null, 2, (dq) null);
    private static final SemanticsPropertyKey<Boolean> IsShowingTextSubstitution = new SemanticsPropertyKey<>("IsShowingTextSubstitution", (my) null, 2, (dq) null);
    private static final SemanticsPropertyKey<AnnotatedString> InputText = new SemanticsPropertyKey<>("InputText", true);
    private static final SemanticsPropertyKey<AnnotatedString> EditableText = new SemanticsPropertyKey<>("EditableText", true);
    private static final SemanticsPropertyKey<TextRange> TextSelectionRange = new SemanticsPropertyKey<>("TextSelectionRange", true);
    private static final SemanticsPropertyKey<TextRange> TextCompositionRange = new SemanticsPropertyKey<>("TextCompositionRange", true);
    private static final SemanticsPropertyKey<ImeAction> ImeAction = new SemanticsPropertyKey<>("ImeAction", true);
    private static final SemanticsPropertyKey<Boolean> Selected = new SemanticsPropertyKey<>("Selected", true);
    private static final SemanticsPropertyKey<ToggleableState> ToggleableState = new SemanticsPropertyKey<>("ToggleableState", true);
    private static final SemanticsPropertyKey<InputTextSuggestionState> InputTextSuggestionState = new SemanticsPropertyKey<>("InputTextSuggestionState", true);
    private static final SemanticsPropertyKey<w01> Password = new SemanticsPropertyKey<>("Password", true);
    private static final SemanticsPropertyKey<String> Error = new SemanticsPropertyKey<>("Error", true);
    private static final SemanticsPropertyKey<ky> IndexForKey = new SemanticsPropertyKey<>("IndexForKey", (my) null, 2, (dq) null);
    private static final SemanticsPropertyKey<Boolean> IsEditable = new SemanticsPropertyKey<>("IsEditable", (my) null, 2, (dq) null);
    private static final SemanticsPropertyKey<Integer> MaxTextLength = new SemanticsPropertyKey<>("MaxTextLength", (my) null, 2, (dq) null);
    private static final SemanticsPropertyKey<Shape> Shape = new SemanticsPropertyKey<>("Shape", false, SemanticsProperties$Shape$1.INSTANCE, null, 8, null);
    public static final int $stable = 8;

    private SemanticsProperties() {
    }

    public final SemanticsPropertyKey<CollectionInfo> getCollectionInfo() {
        return CollectionInfo;
    }

    public final SemanticsPropertyKey<CollectionItemInfo> getCollectionItemInfo() {
        return CollectionItemInfo;
    }

    public final SemanticsPropertyKey<ContentDataType> getContentDataType() {
        return ContentDataType;
    }

    public final SemanticsPropertyKey<List<String>> getContentDescription() {
        return ContentDescription;
    }

    public final SemanticsPropertyKey<ContentType> getContentType() {
        return ContentType;
    }

    public final SemanticsPropertyKey<w01> getDisabled() {
        return Disabled;
    }

    public final SemanticsPropertyKey<AnnotatedString> getEditableText() {
        return EditableText;
    }

    public final SemanticsPropertyKey<String> getError() {
        return Error;
    }

    public final SemanticsPropertyKey<FillableData> getFillableData() {
        return FillableData;
    }

    public final SemanticsPropertyKey<Boolean> getFocused() {
        return Focused;
    }

    public final SemanticsPropertyKey<w01> getHeading() {
        return Heading;
    }

    public final SemanticsPropertyKey<w01> getHideFromAccessibility() {
        return HideFromAccessibility;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> getHorizontalScrollAxisRange() {
        return HorizontalScrollAxisRange;
    }

    public final SemanticsPropertyKey<ImeAction> getImeAction() {
        return ImeAction;
    }

    public final SemanticsPropertyKey<ky> getIndexForKey() {
        return IndexForKey;
    }

    public final SemanticsPropertyKey<AnnotatedString> getInputText() {
        return InputText;
    }

    public final SemanticsPropertyKey<InputTextSuggestionState> getInputTextSuggestionState() {
        return InputTextSuggestionState;
    }

    public final SemanticsPropertyKey<w01> getInvisibleToUser() {
        return InvisibleToUser;
    }

    public final SemanticsPropertyKey<Boolean> getIsContainer() {
        return IsContainer;
    }

    public final SemanticsPropertyKey<w01> getIsDialog() {
        return IsDialog;
    }

    public final SemanticsPropertyKey<Boolean> getIsEditable() {
        return IsEditable;
    }

    public final SemanticsPropertyKey<w01> getIsPopup() {
        return IsPopup;
    }

    public final SemanticsPropertyKey<Boolean> getIsSensitiveData() {
        return IsSensitiveData;
    }

    public final SemanticsPropertyKey<Boolean> getIsShowingTextSubstitution() {
        return IsShowingTextSubstitution;
    }

    public final SemanticsPropertyKey<Boolean> getIsTraversalGroup() {
        return IsTraversalGroup;
    }

    public final SemanticsPropertyKey<w01> getLinkTestMarker() {
        return LinkTestMarker;
    }

    public final SemanticsPropertyKey<LiveRegionMode> getLiveRegion() {
        return LiveRegion;
    }

    public final SemanticsPropertyKey<Integer> getMaxTextLength() {
        return MaxTextLength;
    }

    public final SemanticsPropertyKey<String> getPaneTitle() {
        return PaneTitle;
    }

    public final SemanticsPropertyKey<w01> getPassword() {
        return Password;
    }

    public final SemanticsPropertyKey<ProgressBarRangeInfo> getProgressBarRangeInfo() {
        return ProgressBarRangeInfo;
    }

    public final SemanticsPropertyKey<Role> getRole() {
        return Role;
    }

    public final SemanticsPropertyKey<w01> getSelectableGroup() {
        return SelectableGroup;
    }

    public final SemanticsPropertyKey<Boolean> getSelected() {
        return Selected;
    }

    public final SemanticsPropertyKey<Shape> getShape() {
        return Shape;
    }

    public final SemanticsPropertyKey<String> getStateDescription() {
        return StateDescription;
    }

    public final SemanticsPropertyKey<String> getTestTag() {
        return TestTag;
    }

    public final SemanticsPropertyKey<List<AnnotatedString>> getText() {
        return Text;
    }

    public final SemanticsPropertyKey<TextRange> getTextCompositionRange() {
        return TextCompositionRange;
    }

    public final SemanticsPropertyKey<w01> getTextEntryKey() {
        return TextEntryKey;
    }

    public final SemanticsPropertyKey<TextRange> getTextSelectionRange() {
        return TextSelectionRange;
    }

    public final SemanticsPropertyKey<AnnotatedString> getTextSubstitution() {
        return TextSubstitution;
    }

    public final SemanticsPropertyKey<ToggleableState> getToggleableState() {
        return ToggleableState;
    }

    public final SemanticsPropertyKey<Float> getTraversalIndex() {
        return TraversalIndex;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> getVerticalScrollAxisRange() {
        return VerticalScrollAxisRange;
    }

    @er
    public static /* synthetic */ void getInvisibleToUser$annotations() {
    }

    @er
    public static /* synthetic */ void getIsContainer$annotations() {
    }
}
