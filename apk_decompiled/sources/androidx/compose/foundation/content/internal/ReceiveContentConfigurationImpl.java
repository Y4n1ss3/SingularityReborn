package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ReceiveContentConfigurationImpl extends ReceiveContentConfiguration {
    private final ReceiveContentListener receiveContentListener;

    public ReceiveContentConfigurationImpl(ReceiveContentListener receiveContentListener) {
        this.receiveContentListener = receiveContentListener;
    }

    public static /* synthetic */ ReceiveContentConfigurationImpl copy$default(ReceiveContentConfigurationImpl receiveContentConfigurationImpl, ReceiveContentListener receiveContentListener, int i, Object obj) {
        if ((i & 1) != 0) {
            receiveContentListener = receiveContentConfigurationImpl.receiveContentListener;
        }
        return receiveContentConfigurationImpl.copy(receiveContentListener);
    }

    public final ReceiveContentListener component1() {
        return this.receiveContentListener;
    }

    public final ReceiveContentConfigurationImpl copy(ReceiveContentListener receiveContentListener) {
        return new ReceiveContentConfigurationImpl(receiveContentListener);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReceiveContentConfigurationImpl) && q10.b(this.receiveContentListener, ((ReceiveContentConfigurationImpl) obj).receiveContentListener);
    }

    @Override // androidx.compose.foundation.content.internal.ReceiveContentConfiguration
    public ReceiveContentListener getReceiveContentListener() {
        return this.receiveContentListener;
    }

    public int hashCode() {
        return this.receiveContentListener.hashCode();
    }

    public String toString() {
        return "ReceiveContentConfigurationImpl(receiveContentListener=" + this.receiveContentListener + ')';
    }
}
