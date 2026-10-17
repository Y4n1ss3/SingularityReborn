package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TestTagKt {
    public static final Modifier testTag(Modifier modifier, String str) {
        return modifier.then(new TestTagElement(str));
    }
}
