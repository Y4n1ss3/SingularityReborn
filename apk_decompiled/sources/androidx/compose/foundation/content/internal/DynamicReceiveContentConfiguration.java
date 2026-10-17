package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.ReceiveContentNode;
import androidx.compose.foundation.content.TransferableContent;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DynamicReceiveContentConfiguration extends ReceiveContentConfiguration {
    public static final int $stable = 8;
    private final ReceiveContentListener receiveContentListener = new ReceiveContentListener() { // from class: androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration$receiveContentListener$1
        private int nodeEnterCount;

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public void onDragEnd() {
            DynamicReceiveContentConfiguration.this.getReceiveContentNode().getReceiveContentListener().onDragEnd();
            this.nodeEnterCount = 0;
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public void onDragEnter() {
            ReceiveContentListener parentReceiveContentListener;
            int i = this.nodeEnterCount + 1;
            this.nodeEnterCount = i;
            if (i == 1) {
                DynamicReceiveContentConfiguration.this.getReceiveContentNode().getReceiveContentListener().onDragEnter();
            }
            parentReceiveContentListener = DynamicReceiveContentConfiguration.this.getParentReceiveContentListener();
            if (parentReceiveContentListener != null) {
                parentReceiveContentListener.onDragEnter();
            }
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public void onDragExit() {
            ReceiveContentListener parentReceiveContentListener;
            int i = this.nodeEnterCount;
            int i2 = i - 1;
            if (i2 < 0) {
                i2 = 0;
            }
            this.nodeEnterCount = i2;
            if (i2 == 0 && i > 0) {
                DynamicReceiveContentConfiguration.this.getReceiveContentNode().getReceiveContentListener().onDragExit();
            }
            parentReceiveContentListener = DynamicReceiveContentConfiguration.this.getParentReceiveContentListener();
            if (parentReceiveContentListener != null) {
                parentReceiveContentListener.onDragExit();
            }
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public void onDragStart() {
            this.nodeEnterCount = 0;
            DynamicReceiveContentConfiguration.this.getReceiveContentNode().getReceiveContentListener().onDragStart();
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public TransferableContent onReceive(TransferableContent transferableContent) {
            ReceiveContentListener parentReceiveContentListener;
            TransferableContent onReceive = DynamicReceiveContentConfiguration.this.getReceiveContentNode().getReceiveContentListener().onReceive(transferableContent);
            if (onReceive == null) {
                return null;
            }
            parentReceiveContentListener = DynamicReceiveContentConfiguration.this.getParentReceiveContentListener();
            return parentReceiveContentListener == null ? onReceive : parentReceiveContentListener.onReceive(onReceive);
        }
    };
    private final ReceiveContentNode receiveContentNode;

    public DynamicReceiveContentConfiguration(ReceiveContentNode receiveContentNode) {
        this.receiveContentNode = receiveContentNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReceiveContentListener getParentReceiveContentListener() {
        ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.receiveContentNode);
        if (receiveContentConfiguration != null) {
            return receiveContentConfiguration.getReceiveContentListener();
        }
        return null;
    }

    @Override // androidx.compose.foundation.content.internal.ReceiveContentConfiguration
    public ReceiveContentListener getReceiveContentListener() {
        return this.receiveContentListener;
    }

    public final ReceiveContentNode getReceiveContentNode() {
        return this.receiveContentNode;
    }
}
