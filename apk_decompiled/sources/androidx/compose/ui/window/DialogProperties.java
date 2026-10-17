package androidx.compose.ui.window;

import android.os.IBinder;
import androidx.compose.ui.graphics.Fields;
import defpackage.dq;
import defpackage.er;
import defpackage.kp0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DialogProperties {
    public static final int $stable = 0;
    private final boolean decorFitsSystemWindows;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final SecureFlagPolicy securePolicy;
    private final boolean usePlatformDefaultWidth;
    private final String windowTitle;
    private final IBinder windowToken;
    private final int windowType;

    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, String str, int i, IBinder iBinder, int i2, dq dqVar) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i2 & 8) != 0 ? true : z3, (i2 & 16) != 0 ? true : z4, (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? 2 : i, (i2 & Fields.SpotShadowColor) != 0 ? null : iBinder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogProperties)) {
            return false;
        }
        DialogProperties dialogProperties = (DialogProperties) obj;
        return this.dismissOnBackPress == dialogProperties.dismissOnBackPress && this.dismissOnClickOutside == dialogProperties.dismissOnClickOutside && this.securePolicy == dialogProperties.securePolicy && this.usePlatformDefaultWidth == dialogProperties.usePlatformDefaultWidth && this.decorFitsSystemWindows == dialogProperties.decorFitsSystemWindows && this.windowType == dialogProperties.windowType && q10.b(this.windowToken, dialogProperties.windowToken);
    }

    public final boolean getDecorFitsSystemWindows() {
        return this.decorFitsSystemWindows;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public final String getWindowTitle() {
        return this.windowTitle;
    }

    public final IBinder getWindowToken() {
        return this.windowToken;
    }

    public final int getWindowType() {
        return this.windowType;
    }

    public int hashCode() {
        int c = (kp0.c(kp0.c((this.securePolicy.hashCode() + kp0.c(Boolean.hashCode(this.dismissOnBackPress) * 31, 31, this.dismissOnClickOutside)) * 31, 31, this.usePlatformDefaultWidth), 31, this.decorFitsSystemWindows) + this.windowType) * 31;
        IBinder iBinder = this.windowToken;
        return c + (iBinder != null ? iBinder.hashCode() : 0);
    }

    public DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, String str, int i, IBinder iBinder) {
        this.dismissOnBackPress = z;
        this.dismissOnClickOutside = z2;
        this.securePolicy = secureFlagPolicy;
        this.usePlatformDefaultWidth = z3;
        this.decorFitsSystemWindows = z4;
        this.windowTitle = str;
        this.windowType = i;
        this.windowToken = iBinder;
    }

    public DialogProperties() {
        this(false, false, null, false, false, null, 0, null, 255, null);
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, boolean z3, int i, dq dqVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }

    public DialogProperties(boolean z, boolean z2, boolean z3) {
        this(z, z2, SecureFlagPolicy.Inherit, z3, true, null, 0, null, 224, null);
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, String str, int i, dq dqVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? true : z4, (i & 32) != 0 ? "" : str);
    }

    @er
    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, String str) {
        this(z, z2, secureFlagPolicy, z3, z4, str, 2, (IBinder) null);
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, int i, dq dqVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? true : z4);
    }

    @er
    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4) {
        this(z, z2, SecureFlagPolicy.Inherit, z3, true, "", 0, null, 192, null);
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, int i, dq dqVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy);
    }

    @er
    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy) {
        this(z, z2, secureFlagPolicy, true, true, null, 0, null, 224, null);
    }
}
