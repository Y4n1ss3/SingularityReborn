package androidx.compose.foundation.content;

import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ReceiveContentKt {
    public static final Modifier contentReceiver(Modifier modifier, ReceiveContentListener receiveContentListener) {
        return modifier.then(new ReceiveContentElement(receiveContentListener));
    }
}
