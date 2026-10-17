package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import defpackage.dq;
import defpackage.iy;
import defpackage.n6;
import defpackage.ut;
import defpackage.y80;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldStateKt {
    public static final void clearText(TextFieldState textFieldState) {
        TextFieldBuffer startEdit = textFieldState.startEdit();
        try {
            TextFieldBufferKt.delete(startEdit, 0, startEdit.getLength());
            TextFieldBufferKt.placeCursorAtEnd(startEdit);
            textFieldState.commitEdit(startEdit);
        } finally {
            textFieldState.finishEditing();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: finalizeComposingAnnotations-itr0ztk, reason: not valid java name */
    public static final List<AnnotatedString.Range<AnnotatedString.Annotation>> m1243finalizeComposingAnnotationsitr0ztk(TextRange textRange, MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector) {
        if (mutableVector != null && mutableVector.getSize() != 0) {
            return yi.I0(mutableVector.asMutableList());
        }
        if (textRange == null || TextRange.m7054getCollapsedimpl(textRange.m7064unboximpl())) {
            return ut.d;
        }
        return y80.D(new AnnotatedString.Range(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (dq) null), TextRange.m7058getMinimpl(textRange.m7064unboximpl()), TextRange.m7057getMaximpl(textRange.m7064unboximpl())));
    }

    /* renamed from: rememberTextFieldState-Le-punE, reason: not valid java name */
    public static final TextFieldState m1244rememberTextFieldStateLepunE(String str, long j, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        int i3 = 2;
        if ((i2 & 2) != 0) {
            j = TextRangeKt.TextRange(str.length());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1125389485, i, -1, "androidx.compose.foundation.text.input.rememberTextFieldState (TextFieldState.kt:660)");
        }
        Object[] objArr = new Object[0];
        TextFieldState.Saver saver = TextFieldState.Saver.INSTANCE;
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(str)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(j)) || (i & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new n6(i3, j, str);
            composer.updateRememberedValue(rememberedValue);
        }
        TextFieldState textFieldState = (TextFieldState) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) saver, (iy) rememberedValue, composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldState rememberTextFieldState_Le_punE$lambda$0$0(String str, long j) {
        return new TextFieldState(str, j, (dq) null);
    }

    public static final void setTextAndPlaceCursorAtEnd(TextFieldState textFieldState, String str) {
        TextFieldBuffer startEdit = textFieldState.startEdit();
        try {
            startEdit.replace(0, startEdit.getLength(), str);
            TextFieldBufferKt.placeCursorAtEnd(startEdit);
            textFieldState.commitEdit(startEdit);
        } finally {
            textFieldState.finishEditing();
        }
    }

    public static final void setTextAndSelectAll(TextFieldState textFieldState, String str) {
        TextFieldBuffer startEdit = textFieldState.startEdit();
        try {
            startEdit.replace(0, startEdit.getLength(), str);
            TextFieldBufferKt.selectAll(startEdit);
            textFieldState.commitEdit(startEdit);
        } finally {
            textFieldState.finishEditing();
        }
    }

    public static final TextFieldBuffer toTextFieldBuffer(TextFieldState textFieldState) {
        TextFieldBuffer textFieldBuffer = new TextFieldBuffer(textFieldState.getValue$foundation(), null, null, null, 14, null);
        textFieldBuffer.setCanCallAddStyle$foundation(true);
        return textFieldBuffer;
    }
}
