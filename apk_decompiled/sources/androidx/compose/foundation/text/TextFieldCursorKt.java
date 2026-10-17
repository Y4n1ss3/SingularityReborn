package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import defpackage.ky;
import defpackage.my;
import defpackage.pm;
import defpackage.w01;
import defpackage.y4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldCursorKt {
    public static final Modifier cursor(Modifier modifier, LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping, Brush brush, boolean z) {
        return z ? ComposedModifierKt.composed$default(modifier, null, new pm(brush, legacyTextFieldState, textFieldValue, offsetMapping, 4), 1, null) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier cursor$lambda$0(Brush brush, LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        composer.startReplaceGroup(-84507373);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-84507373, i, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:46)");
        }
        boolean booleanValue = ((Boolean) composer.consume(CompositionLocalsKt.getLocalCursorBlinkEnabled())).booleanValue();
        boolean changed = composer.changed(booleanValue);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new CursorAnimationState(booleanValue);
            composer.updateRememberedValue(rememberedValue);
        }
        CursorAnimationState cursorAnimationState = (CursorAnimationState) rememberedValue;
        boolean z = ((brush instanceof SolidColor) && ((SolidColor) brush).m5117getValue0d7_KjU() == 16) ? false : true;
        if (((WindowInfo) composer.consume(CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused() && legacyTextFieldState.getHasFocus() && TextRange.m7054getCollapsedimpl(textFieldValue.m7310getSelectiond9O1mEE()) && z) {
            composer.startReplaceGroup(-707487962);
            AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
            TextRange m7048boximpl = TextRange.m7048boximpl(textFieldValue.m7310getSelectiond9O1mEE());
            boolean changedInstance = composer.changedInstance(cursorAnimationState);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new TextFieldCursorKt$cursor$1$1$1(cursorAnimationState, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            EffectsKt.LaunchedEffect(annotatedString, m7048boximpl, (my) rememberedValue2, composer, 0);
            boolean changedInstance2 = composer.changedInstance(cursorAnimationState) | composer.changedInstance(offsetMapping) | composer.changed(textFieldValue) | composer.changedInstance(legacyTextFieldState) | composer.changed(brush);
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                Object y4Var = new y4(cursorAnimationState, offsetMapping, textFieldValue, legacyTextFieldState, brush, 5);
                composer.updateRememberedValue(y4Var);
                rememberedValue3 = y4Var;
            }
            modifier2 = DrawModifierKt.drawWithContent(modifier, (ky) rememberedValue3);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-705473241);
            composer.endReplaceGroup();
            modifier2 = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifier2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 cursor$lambda$0$2$0(CursorAnimationState cursorAnimationState, OffsetMapping offsetMapping, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, Brush brush, ContentDrawScope contentDrawScope) {
        Rect rect;
        TextLayoutResult value;
        contentDrawScope.drawContent();
        float cursorAlpha = cursorAnimationState.getCursorAlpha();
        if (cursorAlpha != 0.0f) {
            int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m7060getStartimpl(textFieldValue.m7310getSelectiond9O1mEE()));
            TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
            if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(originalToTransformed)) == null) {
                rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
            }
            float floor = (float) Math.floor(contentDrawScope.mo367toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness()));
            float f = floor < 1.0f ? 1.0f : floor;
            float f2 = f / 2.0f;
            float left = rect.getLeft() + f2;
            float intBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() >> 32)) - f2;
            if (left > intBitsToFloat) {
                left = intBitsToFloat;
            }
            if (left >= f2) {
                f2 = left;
            }
            float floor2 = ((int) f) % 2 == 1 ? ((float) Math.floor(f2)) + 0.5f : (float) Math.rint(f2);
            DrawScope.m5320drawLine1RTmtNc$default(contentDrawScope, brush, Offset.m4508constructorimpl((Float.floatToRawIntBits(floor2) << 32) | (Float.floatToRawIntBits(rect.getTop()) & 4294967295L)), Offset.m4508constructorimpl((Float.floatToRawIntBits(rect.getBottom()) & 4294967295L) | (Float.floatToRawIntBits(floor2) << 32)), f, 0, null, cursorAlpha, null, 0, 432, null);
        }
        return w01.a;
    }
}
