package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt;
import defpackage.at;
import defpackage.cq;
import defpackage.jg0;
import defpackage.o;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextInputServiceAndroid_androidKt {
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    public static final Executor asExecutor(final Choreographer choreographer) {
        return new Executor() { // from class: mu0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                TextInputServiceAndroid_androidKt.asExecutor$lambda$0(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asExecutor$lambda$0(Choreographer choreographer, Runnable runnable) {
        choreographer.postFrameCallback(new jg0(runnable));
    }

    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final void update(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        String privateImeOptions;
        int m7257getImeActioneUduSuo = imeOptions.m7257getImeActioneUduSuo();
        ImeAction.Companion companion = ImeAction.Companion;
        int i = 6;
        if (ImeAction.m7228equalsimpl0(m7257getImeActioneUduSuo, companion.m7241getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i = 0;
            }
        } else if (ImeAction.m7228equalsimpl0(m7257getImeActioneUduSuo, companion.m7245getNoneeUduSuo())) {
            i = 1;
        } else if (ImeAction.m7228equalsimpl0(m7257getImeActioneUduSuo, companion.m7243getGoeUduSuo())) {
            i = 2;
        } else if (ImeAction.m7228equalsimpl0(m7257getImeActioneUduSuo, companion.m7244getNexteUduSuo())) {
            i = 5;
        } else if (ImeAction.m7228equalsimpl0(m7257getImeActioneUduSuo, companion.m7246getPreviouseUduSuo())) {
            i = 7;
        } else if (ImeAction.m7228equalsimpl0(m7257getImeActioneUduSuo, companion.m7247getSearcheUduSuo())) {
            i = 3;
        } else if (ImeAction.m7228equalsimpl0(m7257getImeActioneUduSuo, companion.m7248getSendeUduSuo())) {
            i = 4;
        } else if (!ImeAction.m7228equalsimpl0(m7257getImeActioneUduSuo, companion.m7242getDoneeUduSuo())) {
            o.f("invalid ImeAction");
            return;
        }
        editorInfo.imeOptions = i;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int m7258getKeyboardTypePjHm6EE = imeOptions.m7258getKeyboardTypePjHm6EE();
        KeyboardType.Companion companion2 = KeyboardType.Companion;
        if (KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion2.m7302getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion2.m7295getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion2.m7298getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion2.m7301getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion2.m7304getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion2.m7297getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion2.m7300getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion2.m7299getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else {
            if (!KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion2.m7296getDecimalPjHm6EE())) {
                o.f("Invalid Keyboard Type");
                return;
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= Fields.RenderEffect;
            if (ImeAction.m7228equalsimpl0(imeOptions.m7257getImeActioneUduSuo(), companion.m7241getDefaulteUduSuo())) {
                editorInfo.imeOptions |= GroupFlagsKt.IsSubcompositionContextFlag;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int m7256getCapitalizationIUNYP9k = imeOptions.m7256getCapitalizationIUNYP9k();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.Companion;
            if (KeyboardCapitalization.m7264equalsimpl0(m7256getCapitalizationIUNYP9k, companion3.m7273getCharactersIUNYP9k())) {
                editorInfo.inputType |= Fields.TransformOrigin;
            } else if (KeyboardCapitalization.m7264equalsimpl0(m7256getCapitalizationIUNYP9k, companion3.m7277getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m7264equalsimpl0(m7256getCapitalizationIUNYP9k, companion3.m7275getSentencesIUNYP9k())) {
                editorInfo.inputType |= Fields.Clip;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= Fields.CompositingStrategy;
            }
        }
        editorInfo.initialSelStart = TextRange.m7060getStartimpl(textFieldValue.m7310getSelectiond9O1mEE());
        editorInfo.initialSelEnd = TextRange.m7055getEndimpl(textFieldValue.m7310getSelectiond9O1mEE());
        cq.E(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= GroupFlagsKt.HasAuxSlotFlag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (at.d()) {
            at.a().i(editorInfo);
        }
    }
}
