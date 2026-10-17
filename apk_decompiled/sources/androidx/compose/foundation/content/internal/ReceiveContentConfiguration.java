package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.TransferableContent;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class ReceiveContentConfiguration {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public abstract ReceiveContentListener getReceiveContentListener();

    public final boolean onCommitContent(TransferableContent transferableContent) {
        return !q10.b(getReceiveContentListener().onReceive(transferableContent), transferableContent);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final ReceiveContentConfiguration invoke(ReceiveContentListener receiveContentListener) {
            return new ReceiveContentConfigurationImpl(receiveContentListener);
        }

        private Companion() {
        }
    }
}
