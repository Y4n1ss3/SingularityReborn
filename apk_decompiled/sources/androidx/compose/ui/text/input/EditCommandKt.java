package androidx.compose.ui.text.input;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class EditCommandKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSurrogatePair(char c, char c2) {
        return Character.isHighSurrogate(c) && Character.isLowSurrogate(c2);
    }
}
