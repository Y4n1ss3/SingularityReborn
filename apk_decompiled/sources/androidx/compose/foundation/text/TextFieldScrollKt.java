package androidx.compose.foundation.text;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.iy;
import defpackage.ky;
import defpackage.o;
import defpackage.si;
import defpackage.vt0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldScrollKt {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Modifier defaultTextFieldScroll(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, iy iyVar) {
        Modifier verticalScrollLayoutModifier;
        Orientation orientation = textFieldScrollerPosition.getOrientation();
        int m1193getOffsetToFollow5zctL8 = textFieldScrollerPosition.m1193getOffsetToFollow5zctL8(textFieldValue.m7310getSelectiond9O1mEE());
        textFieldScrollerPosition.m1195setPreviousSelection5zctL8(textFieldValue.m7310getSelectiond9O1mEE());
        TransformedText filterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation, textFieldValue.getAnnotatedString());
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(textFieldScrollerPosition, m1193getOffsetToFollow5zctL8, filterWithValidation, iyVar);
        } else {
            if (i != 2) {
                o.n();
                return null;
            }
            verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(textFieldScrollerPosition, m1193getOffsetToFollow5zctL8, filterWithValidation, iyVar);
        }
        return ClipKt.clipToBounds(modifier).then(verticalScrollLayoutModifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getCursorRectInScroller(Density density, int i, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z, int i2) {
        Rect zero;
        if (textLayoutResult == null || (zero = textLayoutResult.getCursorRect(transformedText.getOffsetMapping().originalToTransformed(i))) == null) {
            zero = Rect.Companion.getZero();
        }
        Rect rect = zero;
        int mo361roundToPx0680j_4 = density.mo361roundToPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness());
        return Rect.copy$default(rect, z ? (i2 - rect.getLeft()) - mo361roundToPx0680j_4 : rect.getLeft(), 0.0f, z ? i2 - rect.getLeft() : mo361roundToPx0680j_4 + rect.getLeft(), 0.0f, 10, null);
    }

    public static final Modifier textFieldScrollable(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, MutableInteractionSource mutableInteractionSource, boolean z, OverscrollEffect overscrollEffect) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1(textFieldScrollerPosition, mutableInteractionSource, z) : InspectableValueKt.getNoInspectorInfo(), new si(textFieldScrollerPosition, z, overscrollEffect, mutableInteractionSource, 1));
    }

    public static /* synthetic */ Modifier textFieldScrollable$default(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, MutableInteractionSource mutableInteractionSource, boolean z, OverscrollEffect overscrollEffect, int i, Object obj) {
        if ((i & 2) != 0) {
            mutableInteractionSource = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return textFieldScrollable(modifier, textFieldScrollerPosition, mutableInteractionSource, z, overscrollEffect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier textFieldScrollable$lambda$1(TextFieldScrollerPosition textFieldScrollerPosition, boolean z, OverscrollEffect overscrollEffect, MutableInteractionSource mutableInteractionSource, Modifier modifier, Composer composer, int i) {
        composer.startReplaceGroup(-2137546592);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2137546592, i, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:76)");
        }
        int i2 = 1;
        boolean z2 = textFieldScrollerPosition.getOrientation() == Orientation.Vertical || !(composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl);
        boolean changed = composer.changed(textFieldScrollerPosition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new vt0(textFieldScrollerPosition, i2);
            composer.updateRememberedValue(rememberedValue);
        }
        ScrollableState rememberScrollableState = ScrollableStateKt.rememberScrollableState((ky) rememberedValue, composer, 0);
        boolean changed2 = composer.changed(rememberScrollableState) | composer.changed(textFieldScrollerPosition);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1(rememberScrollableState, textFieldScrollerPosition);
            composer.updateRememberedValue(rememberedValue2);
        }
        Modifier scrollable$default = ScrollableKt.scrollable$default(Modifier.Companion, (TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1) rememberedValue2, textFieldScrollerPosition.getOrientation(), overscrollEffect, z && textFieldScrollerPosition.getMaximum() != 0.0f, z2, null, mutableInteractionSource, null, 160, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return scrollable$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float textFieldScrollable$lambda$1$0$0(TextFieldScrollerPosition textFieldScrollerPosition, float f) {
        float offset = textFieldScrollerPosition.getOffset() + f;
        if (offset > textFieldScrollerPosition.getMaximum()) {
            f = textFieldScrollerPosition.getMaximum() - textFieldScrollerPosition.getOffset();
        } else if (offset < 0.0f) {
            f = -textFieldScrollerPosition.getOffset();
        }
        textFieldScrollerPosition.setOffset(textFieldScrollerPosition.getOffset() + f);
        return f;
    }
}
