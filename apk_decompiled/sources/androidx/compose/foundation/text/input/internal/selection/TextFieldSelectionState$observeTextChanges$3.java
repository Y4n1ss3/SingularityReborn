package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import defpackage.my;
import defpackage.xy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class TextFieldSelectionState$observeTextChanges$3 extends xy implements my {
    public static final TextFieldSelectionState$observeTextChanges$3 INSTANCE = new TextFieldSelectionState$observeTextChanges$3();

    public TextFieldSelectionState$observeTextChanges$3() {
        super(2, TextFieldCharSequence.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
    }

    @Override // defpackage.my
    public final Boolean invoke(TextFieldCharSequence textFieldCharSequence, CharSequence charSequence) {
        return Boolean.valueOf(textFieldCharSequence.contentEquals(charSequence));
    }
}
