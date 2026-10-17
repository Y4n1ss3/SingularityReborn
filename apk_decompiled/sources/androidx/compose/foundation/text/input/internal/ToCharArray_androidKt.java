package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldCharSequence;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ToCharArray_androidKt {
    public static final void toCharArray(CharSequence charSequence, char[] cArr, int i, int i2, int i3) {
        if (charSequence instanceof TextFieldCharSequence) {
            ((TextFieldCharSequence) charSequence).toCharArray(cArr, i, i2, i3);
            return;
        }
        while (i2 < i3) {
            cArr[i] = charSequence.charAt(i2);
            i2++;
            i++;
        }
    }
}
