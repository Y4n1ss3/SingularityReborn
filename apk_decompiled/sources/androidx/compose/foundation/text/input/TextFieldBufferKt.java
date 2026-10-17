package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.my;
import defpackage.oy;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldBufferKt {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r0 == r1) goto L16;
     */
    /* renamed from: adjustTextRange-vJH6DeI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m1237adjustTextRangevJH6DeI(long j, int i, int i2, int i3) {
        int i4;
        int m7058getMinimpl = TextRange.m7058getMinimpl(j);
        int m7057getMaximpl = TextRange.m7057getMaximpl(j);
        if (m7057getMaximpl < i) {
            return j;
        }
        if (m7058getMinimpl > i || i2 > m7057getMaximpl) {
            if (m7058getMinimpl > i && m7057getMaximpl < i2) {
                i += i3;
                m7058getMinimpl = i;
            } else if (m7058getMinimpl >= i2) {
                i4 = i3 - (i2 - i);
            } else if (i < m7058getMinimpl) {
                m7058getMinimpl = i + i3;
                i = (i3 - (i2 - i)) + m7057getMaximpl;
            }
            return TextRangeKt.TextRange(m7058getMinimpl, i);
        }
        i4 = i3 - (i2 - i);
        m7058getMinimpl += i4;
        i = m7057getMaximpl + i4;
        return TextRangeKt.TextRange(m7058getMinimpl, i);
    }

    public static final void delete(TextFieldBuffer textFieldBuffer, int i, int i2) {
        textFieldBuffer.replace(i, i2, "");
    }

    public static final void findCommonPrefixAndSuffix(CharSequence charSequence, CharSequence charSequence2, oy oyVar) {
        int i;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i2 = 0;
        if (charSequence.length() <= 0 || charSequence2.length() <= 0) {
            i = 0;
        } else {
            int i3 = 0;
            i = 0;
            boolean z = false;
            while (true) {
                if (i2 == 0) {
                    if (charSequence.charAt(i3) == charSequence2.charAt(i)) {
                        i3++;
                        i++;
                    } else {
                        i2 = 1;
                    }
                }
                if (!z) {
                    if (charSequence.charAt(length - 1) == charSequence2.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z = true;
                    }
                }
                if (i3 >= length || i >= length2 || (i2 != 0 && z)) {
                    break;
                }
            }
            i2 = i3;
        }
        if (i2 < length || i < length2) {
            oyVar.invoke(Integer.valueOf(i2), Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(length2));
        }
    }

    public static final void forEachChange(TextFieldBuffer.ChangeList changeList, my myVar) {
        for (int i = 0; i < changeList.getChangeCount(); i++) {
            myVar.invoke(TextRange.m7048boximpl(changeList.mo1236getRangejx7JFs(i)), TextRange.m7048boximpl(changeList.mo1235getOriginalRangejx7JFs(i)));
        }
    }

    public static final void forEachChangeReversed(TextFieldBuffer.ChangeList changeList, my myVar) {
        for (int changeCount = changeList.getChangeCount() - 1; changeCount >= 0; changeCount--) {
            myVar.invoke(TextRange.m7048boximpl(changeList.mo1236getRangejx7JFs(changeCount)), TextRange.m7048boximpl(changeList.mo1235getOriginalRangejx7JFs(changeCount)));
        }
    }

    public static final void insert(TextFieldBuffer textFieldBuffer, int i, String str) {
        textFieldBuffer.replace(i, i, str);
    }

    public static final void placeCursorAtEnd(TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.placeCursorBeforeCharAt(textFieldBuffer.getLength());
    }

    public static final void selectAll(TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.m1233setSelection5zctL8(TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
    }

    public static final void setSelectionCoerced(TextFieldBuffer textFieldBuffer, int i, int i2) {
        textFieldBuffer.m1233setSelection5zctL8(TextRangeKt.TextRange(y80.h(i, 0, textFieldBuffer.getLength()), y80.h(i2, 0, textFieldBuffer.getLength())));
    }

    public static /* synthetic */ void setSelectionCoerced$default(TextFieldBuffer textFieldBuffer, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = i;
        }
        setSelectionCoerced(textFieldBuffer, i, i2);
    }
}
