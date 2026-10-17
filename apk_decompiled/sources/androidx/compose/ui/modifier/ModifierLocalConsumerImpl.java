package androidx.compose.ui.modifier;

import androidx.compose.ui.platform.InspectorValueInfo;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class ModifierLocalConsumerImpl extends InspectorValueInfo implements ModifierLocalConsumer {
    private final ky consumer;

    public ModifierLocalConsumerImpl(ky kyVar, ky kyVar2) {
        super(kyVar2);
        this.consumer = kyVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ModifierLocalConsumerImpl) && ((ModifierLocalConsumerImpl) obj).consumer == this.consumer;
    }

    public final ky getConsumer() {
        return this.consumer;
    }

    public int hashCode() {
        return this.consumer.hashCode();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        this.consumer.invoke(modifierLocalReadScope);
    }
}
