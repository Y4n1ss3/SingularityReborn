package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import defpackage.dq;
import defpackage.ks0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PasswordVisualTransformation implements VisualTransformation {
    public static final int $stable = 0;
    private final char mask;

    public /* synthetic */ PasswordVisualTransformation(char c, int i, dq dqVar) {
        this((i & 1) != 0 ? (char) 8226 : c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PasswordVisualTransformation) && this.mask == ((PasswordVisualTransformation) obj).mask;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString annotatedString) {
        return new TransformedText(new AnnotatedString(ks0.a0(annotatedString.getText().length(), String.valueOf(this.mask)), null, 2, null), OffsetMapping.Companion.getIdentity());
    }

    public final char getMask() {
        return this.mask;
    }

    public int hashCode() {
        return Character.hashCode(this.mask);
    }

    public PasswordVisualTransformation(char c) {
        this.mask = c;
    }

    public PasswordVisualTransformation() {
        this((char) 0, 1, null);
    }
}
