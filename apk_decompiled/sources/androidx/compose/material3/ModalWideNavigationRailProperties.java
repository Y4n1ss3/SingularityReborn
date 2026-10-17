package androidx.compose.material3;

import androidx.compose.ui.window.SecureFlagPolicy;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ModalWideNavigationRailProperties {
    public static final int $stable = 0;
    private final SecureFlagPolicy securePolicy;
    private final boolean shouldDismissOnBackPress;

    public /* synthetic */ ModalWideNavigationRailProperties(SecureFlagPolicy secureFlagPolicy, boolean z, int i, dq dqVar) {
        this((i & 1) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 2) != 0 ? true : z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ModalWideNavigationRailProperties) && this.securePolicy == ((ModalWideNavigationRailProperties) obj).securePolicy;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldDismissOnBackPress) + (this.securePolicy.hashCode() * 31);
    }

    public ModalWideNavigationRailProperties(SecureFlagPolicy secureFlagPolicy, boolean z) {
        this.securePolicy = secureFlagPolicy;
        this.shouldDismissOnBackPress = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModalWideNavigationRailProperties() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ModalWideNavigationRailProperties(boolean z, int i, dq dqVar) {
        this((i & 1) != 0 ? true : z);
    }

    public ModalWideNavigationRailProperties(boolean z) {
        this(SecureFlagPolicy.Inherit, z);
    }
}
