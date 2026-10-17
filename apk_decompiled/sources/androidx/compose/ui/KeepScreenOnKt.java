package androidx.compose.ui;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeepScreenOnKt {
    public static final Modifier keepScreenOn(Modifier modifier) {
        return modifier.then(KeepScreenOnElement.INSTANCE);
    }
}
