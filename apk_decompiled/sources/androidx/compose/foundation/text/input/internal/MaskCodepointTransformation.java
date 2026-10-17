package androidx.compose.foundation.text.input.internal;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class MaskCodepointTransformation implements CodepointTransformation {
    private final char character;

    public MaskCodepointTransformation(char c) {
        this.character = c;
    }

    public static /* synthetic */ MaskCodepointTransformation copy$default(MaskCodepointTransformation maskCodepointTransformation, char c, int i, Object obj) {
        if ((i & 1) != 0) {
            c = maskCodepointTransformation.character;
        }
        return maskCodepointTransformation.copy(c);
    }

    public final char component1() {
        return this.character;
    }

    public final MaskCodepointTransformation copy(char c) {
        return new MaskCodepointTransformation(c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MaskCodepointTransformation) && this.character == ((MaskCodepointTransformation) obj).character;
    }

    public final char getCharacter() {
        return this.character;
    }

    public int hashCode() {
        return Character.hashCode(this.character);
    }

    public String toString() {
        return "MaskCodepointTransformation(character=" + this.character + ')';
    }

    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public int transform(int i, int i2) {
        return this.character;
    }
}
