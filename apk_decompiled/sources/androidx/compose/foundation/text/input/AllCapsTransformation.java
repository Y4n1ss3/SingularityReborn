package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.ui.text.StringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AllCapsTransformation implements InputTransformation {
    private final KeyboardOptions keyboardOptions = new KeyboardOptions(KeyboardCapitalization.Companion.m7273getCharactersIUNYP9k(), (Boolean) null, 0, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 126, (dq) null);
    private final Locale locale;

    public AllCapsTransformation(Locale locale) {
        this.locale = locale;
    }

    private final Locale component1() {
        return this.locale;
    }

    public static /* synthetic */ AllCapsTransformation copy$default(AllCapsTransformation allCapsTransformation, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = allCapsTransformation.locale;
        }
        return allCapsTransformation.copy(locale);
    }

    public final AllCapsTransformation copy(Locale locale) {
        return new AllCapsTransformation(locale);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AllCapsTransformation) && q10.b(this.locale, ((AllCapsTransformation) obj).locale);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    public int hashCode() {
        return this.locale.hashCode();
    }

    public String toString() {
        return "InputTransformation.allCaps(locale=" + this.locale + ')';
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(TextFieldBuffer textFieldBuffer) {
        TextFieldBuffer.ChangeList changes = textFieldBuffer.getChanges();
        for (int i = 0; i < changes.getChangeCount(); i++) {
            long mo1236getRangejx7JFs = changes.mo1236getRangejx7JFs(i);
            changes.mo1235getOriginalRangejx7JFs(i);
            if (!TextRange.m7054getCollapsedimpl(mo1236getRangejx7JFs)) {
                textFieldBuffer.replace(TextRange.m7058getMinimpl(mo1236getRangejx7JFs), TextRange.m7057getMaximpl(mo1236getRangejx7JFs), StringKt.toUpperCase(TextRangeKt.m7067substringFDrldGo(textFieldBuffer.asCharSequence(), mo1236getRangejx7JFs), this.locale));
            }
        }
    }
}
