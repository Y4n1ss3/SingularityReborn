package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import defpackage.cq;
import defpackage.o;
import defpackage.us;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class EditorInfo_androidKt {
    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e5  */
    /* renamed from: update-pLxbY9I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1279updatepLxbY9I(EditorInfo editorInfo, CharSequence charSequence, long j, ImeOptions imeOptions, String[] strArr) {
        Bundle bundle;
        String privateImeOptions;
        int m7257getImeActioneUduSuo = imeOptions.m7257getImeActioneUduSuo();
        ImeAction.Companion companion = ImeAction.Companion;
        int i = 3;
        int i2 = 6;
        if (ImeAction.m7228equalsimpl0(m7257getImeActioneUduSuo, companion.m7241getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i2 = 0;
            }
        } else if (ImeAction.m7228equalsimpl0(m7257getImeActioneUduSuo, companion.m7245getNoneeUduSuo())) {
            i2 = 1;
        } else if (ImeAction.m7228equalsimpl0(m7257getImeActioneUduSuo, companion.m7243getGoeUduSuo())) {
            i2 = 2;
        } else if (ImeAction.m7228equalsimpl0(m7257getImeActioneUduSuo, companion.m7244getNexteUduSuo())) {
            i2 = 5;
        } else if (ImeAction.m7228equalsimpl0(m7257getImeActioneUduSuo, companion.m7246getPreviouseUduSuo())) {
            i2 = 7;
        } else if (ImeAction.m7228equalsimpl0(m7257getImeActioneUduSuo, companion.m7247getSearcheUduSuo())) {
            i2 = 3;
        } else if (ImeAction.m7228equalsimpl0(m7257getImeActioneUduSuo, companion.m7248getSendeUduSuo())) {
            i2 = 4;
        } else if (!ImeAction.m7228equalsimpl0(m7257getImeActioneUduSuo, companion.m7242getDoneeUduSuo())) {
            o.f("invalid ImeAction");
            return;
        }
        editorInfo.imeOptions = i2;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        LocaleListHelper.INSTANCE.setHintLocales(editorInfo, imeOptions.getHintLocales());
        int m7258getKeyboardTypePjHm6EE = imeOptions.m7258getKeyboardTypePjHm6EE();
        KeyboardType.Companion companion2 = KeyboardType.Companion;
        if (!KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion2.m7302getTextPjHm6EE())) {
            if (!KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion2.m7295getAsciiPjHm6EE())) {
                if (KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion2.m7298getNumberPjHm6EE())) {
                    i = 2;
                } else if (!KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion2.m7301getPhonePjHm6EE())) {
                    if (KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion2.m7304getUriPjHm6EE())) {
                        i = 17;
                    } else if (KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion2.m7297getEmailPjHm6EE())) {
                        i = 33;
                    } else if (KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion2.m7300getPasswordPjHm6EE())) {
                        i = 129;
                    } else if (KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion2.m7299getNumberPasswordPjHm6EE())) {
                        i = 18;
                    } else {
                        if (!KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion2.m7296getDecimalPjHm6EE())) {
                            o.f("Invalid Keyboard Type");
                            return;
                        }
                        i = 8194;
                    }
                }
                editorInfo.inputType = i;
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
                editorInfo.initialSelStart = TextRange.m7060getStartimpl(j);
                editorInfo.initialSelEnd = TextRange.m7055getEndimpl(j);
                cq.E(editorInfo, charSequence);
                if (strArr != null) {
                    editorInfo.contentMimeTypes = strArr;
                }
                editorInfo.imeOptions |= GroupFlagsKt.HasAuxSlotFlag;
                if (StylusHandwriting_androidKt.isStylusHandwritingSupported() || KeyboardType.m7281equalsimpl0(imeOptions.m7258getKeyboardTypePjHm6EE(), companion2.m7300getPasswordPjHm6EE()) || KeyboardType.m7281equalsimpl0(imeOptions.m7258getKeyboardTypePjHm6EE(), companion2.m7299getNumberPasswordPjHm6EE())) {
                    if (Build.VERSION.SDK_INT >= 35) {
                        us.a(editorInfo, false);
                    }
                    bundle = editorInfo.extras;
                    if (bundle == null) {
                        bundle = new Bundle();
                        editorInfo.extras = bundle;
                    }
                    bundle.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    us.a(editorInfo, true);
                }
                Bundle bundle2 = editorInfo.extras;
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                    editorInfo.extras = bundle2;
                }
                bundle2.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
                EditorInfoApi34.INSTANCE.setHandwritingGestures(editorInfo);
                return;
            }
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        }
        i = 1;
        editorInfo.inputType = i;
        if (!imeOptions.getSingleLine()) {
            editorInfo.inputType |= Fields.RenderEffect;
            if (ImeAction.m7228equalsimpl0(imeOptions.m7257getImeActioneUduSuo(), companion.m7241getDefaulteUduSuo())) {
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
        }
        editorInfo.initialSelStart = TextRange.m7060getStartimpl(j);
        editorInfo.initialSelEnd = TextRange.m7055getEndimpl(j);
        cq.E(editorInfo, charSequence);
        if (strArr != null) {
        }
        editorInfo.imeOptions |= GroupFlagsKt.HasAuxSlotFlag;
        if (StylusHandwriting_androidKt.isStylusHandwritingSupported()) {
        }
        if (Build.VERSION.SDK_INT >= 35) {
        }
        bundle = editorInfo.extras;
        if (bundle == null) {
        }
        bundle.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
    }

    /* renamed from: update-pLxbY9I$default, reason: not valid java name */
    public static /* synthetic */ void m1280updatepLxbY9I$default(EditorInfo editorInfo, CharSequence charSequence, long j, ImeOptions imeOptions, String[] strArr, int i, Object obj) {
        if ((i & 8) != 0) {
            strArr = null;
        }
        m1279updatepLxbY9I(editorInfo, charSequence, j, imeOptions, strArr);
    }
}
