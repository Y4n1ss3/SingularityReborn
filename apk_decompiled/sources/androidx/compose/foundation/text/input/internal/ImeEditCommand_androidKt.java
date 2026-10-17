package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.hz;
import defpackage.i00;
import defpackage.j00;
import defpackage.k00;
import defpackage.l00;
import defpackage.w01;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ImeEditCommand_androidKt {
    public static final void commitText(ImeEditCommandScope imeEditCommandScope, String str, int i) {
        imeEditCommandScope.edit(new l00(str, i, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 commitText$lambda$0(String str, int i, TextFieldBuffer textFieldBuffer) {
        TextRange m1229getCompositionMzsxiRA$foundation = textFieldBuffer.m1229getCompositionMzsxiRA$foundation();
        if (m1229getCompositionMzsxiRA$foundation != null) {
            imeReplace(textFieldBuffer, TextRange.m7060getStartimpl(m1229getCompositionMzsxiRA$foundation.m7064unboximpl()), TextRange.m7055getEndimpl(m1229getCompositionMzsxiRA$foundation.m7064unboximpl()), str);
        } else {
            imeReplace(textFieldBuffer, TextRange.m7060getStartimpl(textFieldBuffer.m1231getSelectiond9O1mEE()), TextRange.m7055getEndimpl(textFieldBuffer.m1231getSelectiond9O1mEE()), str);
        }
        textFieldBuffer.m1233setSelection5zctL8(TextRangeKt.TextRange(y80.h(i > 0 ? (r0 + i) - 1 : (TextRange.m7060getStartimpl(textFieldBuffer.m1231getSelectiond9O1mEE()) + i) - str.length(), 0, textFieldBuffer.getLength())));
        return w01.a;
    }

    public static final void deleteSurroundingText(ImeEditCommandScope imeEditCommandScope, int i, int i2) {
        imeEditCommandScope.edit(new j00(i, i2, imeEditCommandScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 deleteSurroundingText$lambda$0(int i, int i2, ImeEditCommandScope imeEditCommandScope, TextFieldBuffer textFieldBuffer) {
        if (!(i >= 0 && i2 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
        }
        long mo1268mapToTransformedGEjPoXI = imeEditCommandScope.mo1268mapToTransformedGEjPoXI(textFieldBuffer.m1231getSelectiond9O1mEE());
        int m7055getEndimpl = TextRange.m7055getEndimpl(mo1268mapToTransformedGEjPoXI);
        int i3 = m7055getEndimpl + i2;
        if (((i2 ^ i3) & (m7055getEndimpl ^ i3)) < 0) {
            i3 = textFieldBuffer.getLength();
        }
        long mo1267mapFromTransformedGEjPoXI = imeEditCommandScope.mo1267mapFromTransformedGEjPoXI(TextRangeKt.TextRange(TextRange.m7055getEndimpl(mo1268mapToTransformedGEjPoXI), Math.min(i3, textFieldBuffer.getLength())));
        imeDelete(textFieldBuffer, TextRange.m7058getMinimpl(mo1267mapFromTransformedGEjPoXI), TextRange.m7057getMaximpl(mo1267mapFromTransformedGEjPoXI));
        int m7060getStartimpl = TextRange.m7060getStartimpl(mo1268mapToTransformedGEjPoXI);
        int i4 = m7060getStartimpl - i;
        if (((i ^ m7060getStartimpl) & (m7060getStartimpl ^ i4)) < 0) {
            i4 = 0;
        }
        long mo1267mapFromTransformedGEjPoXI2 = imeEditCommandScope.mo1267mapFromTransformedGEjPoXI(TextRangeKt.TextRange(Math.max(0, i4), TextRange.m7060getStartimpl(mo1268mapToTransformedGEjPoXI)));
        imeDelete(textFieldBuffer, TextRange.m7058getMinimpl(mo1267mapFromTransformedGEjPoXI2), TextRange.m7057getMaximpl(mo1267mapFromTransformedGEjPoXI2));
        return w01.a;
    }

    public static final void deleteSurroundingTextInCodePoints(ImeEditCommandScope imeEditCommandScope, int i, int i2) {
        imeEditCommandScope.edit(new i00(i, i2, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 deleteSurroundingTextInCodePoints$lambda$0(int i, int i2, TextFieldBuffer textFieldBuffer) {
        int i3 = 0;
        if (!(i >= 0 && i2 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 < i) {
                int i6 = i5 + 1;
                if (TextRange.m7060getStartimpl(textFieldBuffer.m1231getSelectiond9O1mEE()) <= i6) {
                    i5 = TextRange.m7060getStartimpl(textFieldBuffer.m1231getSelectiond9O1mEE());
                    break;
                }
                i5 = isSurrogatePair(textFieldBuffer.asCharSequence().charAt((TextRange.m7060getStartimpl(textFieldBuffer.m1231getSelectiond9O1mEE()) - i6) - 1), textFieldBuffer.asCharSequence().charAt(TextRange.m7060getStartimpl(textFieldBuffer.m1231getSelectiond9O1mEE()) - i6)) ? i5 + 2 : i6;
                i4++;
            } else {
                break;
            }
        }
        int i7 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i8 = i7 + 1;
            if (TextRange.m7055getEndimpl(textFieldBuffer.m1231getSelectiond9O1mEE()) + i8 >= textFieldBuffer.getLength()) {
                i7 = textFieldBuffer.getLength() - TextRange.m7055getEndimpl(textFieldBuffer.m1231getSelectiond9O1mEE());
                break;
            }
            i7 = isSurrogatePair(textFieldBuffer.asCharSequence().charAt((TextRange.m7055getEndimpl(textFieldBuffer.m1231getSelectiond9O1mEE()) + i8) - 1), textFieldBuffer.asCharSequence().charAt(TextRange.m7055getEndimpl(textFieldBuffer.m1231getSelectiond9O1mEE()) + i8)) ? i7 + 2 : i8;
            i3++;
        }
        imeDelete(textFieldBuffer, TextRange.m7055getEndimpl(textFieldBuffer.m1231getSelectiond9O1mEE()), TextRange.m7055getEndimpl(textFieldBuffer.m1231getSelectiond9O1mEE()) + i7);
        imeDelete(textFieldBuffer, TextRange.m7060getStartimpl(textFieldBuffer.m1231getSelectiond9O1mEE()) - i5, TextRange.m7060getStartimpl(textFieldBuffer.m1231getSelectiond9O1mEE()));
        return w01.a;
    }

    public static final void finishComposingText(ImeEditCommandScope imeEditCommandScope) {
        imeEditCommandScope.edit(new hz(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 finishComposingText$lambda$0(TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.commitComposition$foundation();
        return w01.a;
    }

    public static final void imeDelete(TextFieldBuffer textFieldBuffer, int i, int i2) {
        TextRange m1229getCompositionMzsxiRA$foundation = textFieldBuffer.m1229getCompositionMzsxiRA$foundation();
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        TextFieldBufferKt.delete(textFieldBuffer, min, max);
        if (m1229getCompositionMzsxiRA$foundation != null) {
            m1229getCompositionMzsxiRA$foundation.m7064unboximpl();
            long m1237adjustTextRangevJH6DeI = TextFieldBufferKt.m1237adjustTextRangevJH6DeI(m1229getCompositionMzsxiRA$foundation.m7064unboximpl(), min, max, 0);
            if (TextRange.m7054getCollapsedimpl(m1237adjustTextRangevJH6DeI)) {
                textFieldBuffer.commitComposition$foundation();
            } else {
                TextFieldBuffer.setComposition$foundation$default(textFieldBuffer, TextRange.m7058getMinimpl(m1237adjustTextRangevJH6DeI), TextRange.m7057getMaximpl(m1237adjustTextRangevJH6DeI), null, 4, null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r8 == r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        r6.commitComposition$foundation();
        r6.clearHighlight$foundation();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void imeReplace(TextFieldBuffer textFieldBuffer, int i, int i2, CharSequence charSequence) {
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        int i3 = 0;
        int i4 = min;
        while (i4 < max && i3 < charSequence.length() && charSequence.charAt(i3) == textFieldBuffer.asCharSequence().charAt(i4)) {
            i3++;
            i4++;
        }
        int length = charSequence.length();
        while (max > i4 && length > i3 && charSequence.charAt(length - 1) == textFieldBuffer.asCharSequence().charAt(max - 1)) {
            length--;
            max--;
        }
        textFieldBuffer.replace(i4, max, charSequence.subSequence(i3, length));
        textFieldBuffer.m1233setSelection5zctL8(TextRangeKt.TextRange(charSequence.length() + min));
    }

    private static final boolean isSurrogatePair(char c, char c2) {
        return Character.isHighSurrogate(c) && Character.isLowSurrogate(c2);
    }

    public static final void setComposingRegion(ImeEditCommandScope imeEditCommandScope, int i, int i2) {
        imeEditCommandScope.edit(new i00(i, i2, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 setComposingRegion$lambda$0(int i, int i2, TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.hasComposition$foundation()) {
            textFieldBuffer.commitComposition$foundation();
        }
        int h = y80.h(i, 0, textFieldBuffer.getLength());
        int h2 = y80.h(i2, 0, textFieldBuffer.getLength());
        if (h != h2) {
            if (h < h2) {
                TextFieldBuffer.setComposition$foundation$default(textFieldBuffer, h, h2, null, 4, null);
            } else {
                TextFieldBuffer.setComposition$foundation$default(textFieldBuffer, h2, h, null, 4, null);
            }
        }
        return w01.a;
    }

    public static final void setComposingText(ImeEditCommandScope imeEditCommandScope, String str, int i, List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        imeEditCommandScope.edit(new k00(str, list, i));
    }

    public static /* synthetic */ void setComposingText$default(ImeEditCommandScope imeEditCommandScope, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list = null;
        }
        setComposingText(imeEditCommandScope, str, i, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 setComposingText$lambda$0(String str, List list, int i, TextFieldBuffer textFieldBuffer) {
        TextRange m1229getCompositionMzsxiRA$foundation = textFieldBuffer.m1229getCompositionMzsxiRA$foundation();
        if (m1229getCompositionMzsxiRA$foundation != null) {
            imeReplace(textFieldBuffer, TextRange.m7060getStartimpl(m1229getCompositionMzsxiRA$foundation.m7064unboximpl()), TextRange.m7055getEndimpl(m1229getCompositionMzsxiRA$foundation.m7064unboximpl()), str);
            if (str.length() > 0) {
                textFieldBuffer.setComposition$foundation(TextRange.m7060getStartimpl(m1229getCompositionMzsxiRA$foundation.m7064unboximpl()), str.length() + TextRange.m7060getStartimpl(m1229getCompositionMzsxiRA$foundation.m7064unboximpl()), list);
            }
        } else {
            int m7060getStartimpl = TextRange.m7060getStartimpl(textFieldBuffer.m1231getSelectiond9O1mEE());
            imeReplace(textFieldBuffer, m7060getStartimpl, TextRange.m7055getEndimpl(textFieldBuffer.m1231getSelectiond9O1mEE()), str);
            if (str.length() > 0) {
                textFieldBuffer.setComposition$foundation(m7060getStartimpl, str.length() + m7060getStartimpl, list);
            }
        }
        textFieldBuffer.m1233setSelection5zctL8(TextRangeKt.TextRange(y80.h(i > 0 ? (r5 + i) - 1 : (TextRange.m7060getStartimpl(textFieldBuffer.m1231getSelectiond9O1mEE()) + i) - str.length(), 0, textFieldBuffer.getLength())));
        return w01.a;
    }

    public static final void setSelection(ImeEditCommandScope imeEditCommandScope, int i, int i2) {
        imeEditCommandScope.edit(new j00(imeEditCommandScope, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 setSelection$lambda$0(ImeEditCommandScope imeEditCommandScope, int i, int i2, TextFieldBuffer textFieldBuffer) {
        long mo1268mapToTransformedGEjPoXI = imeEditCommandScope.mo1268mapToTransformedGEjPoXI(TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
        int m7058getMinimpl = TextRange.m7058getMinimpl(mo1268mapToTransformedGEjPoXI);
        int m7057getMaximpl = TextRange.m7057getMaximpl(mo1268mapToTransformedGEjPoXI);
        if (i < m7058getMinimpl) {
            i = m7058getMinimpl;
        }
        if (i <= m7057getMaximpl) {
            m7057getMaximpl = i;
        }
        int m7058getMinimpl2 = TextRange.m7058getMinimpl(mo1268mapToTransformedGEjPoXI);
        int m7057getMaximpl2 = TextRange.m7057getMaximpl(mo1268mapToTransformedGEjPoXI);
        if (i2 < m7058getMinimpl2) {
            i2 = m7058getMinimpl2;
        }
        if (i2 <= m7057getMaximpl2) {
            m7057getMaximpl2 = i2;
        }
        textFieldBuffer.m1233setSelection5zctL8(imeEditCommandScope.mo1267mapFromTransformedGEjPoXI(TextRangeKt.TextRange(m7057getMaximpl, m7057getMaximpl2)));
        return w01.a;
    }
}
