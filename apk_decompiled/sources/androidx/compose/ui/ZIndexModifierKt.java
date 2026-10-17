package androidx.compose.ui;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ZIndexModifierKt {
    public static final Modifier zIndex(Modifier modifier, float f) {
        return modifier.then(new ZIndexElement(f));
    }
}
