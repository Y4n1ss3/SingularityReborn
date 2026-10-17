package androidx.compose.ui.window;

import android.os.IBinder;
import androidx.compose.ui.graphics.Fields;
import defpackage.dq;
import defpackage.er;
import defpackage.kp0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PopupProperties {
    public static final int $stable = 0;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final boolean excludeFromSystemGesture;
    private final int flags;
    private final boolean inheritSecurePolicy;
    private final boolean usePlatformDefaultWidth;
    private final IBinder windowToken;
    private final int windowType;

    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, boolean z6, int i, IBinder iBinder, int i2, dq dqVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? true : z3, (i2 & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i2 & 16) != 0 ? true : z4, (i2 & 32) != 0 ? true : z5, (i2 & 64) != 0 ? false : z6, (i2 & Fields.SpotShadowColor) != 0 ? 1002 : i, (i2 & Fields.RotationX) != 0 ? null : iBinder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupProperties)) {
            return false;
        }
        PopupProperties popupProperties = (PopupProperties) obj;
        return this.flags == popupProperties.flags && this.inheritSecurePolicy == popupProperties.inheritSecurePolicy && this.dismissOnBackPress == popupProperties.dismissOnBackPress && this.dismissOnClickOutside == popupProperties.dismissOnClickOutside && this.excludeFromSystemGesture == popupProperties.excludeFromSystemGesture && this.usePlatformDefaultWidth == popupProperties.usePlatformDefaultWidth && this.windowType == popupProperties.windowType && q10.b(this.windowToken, popupProperties.windowToken);
    }

    public final boolean getClippingEnabled() {
        return (this.flags & Fields.RotationY) == 0;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final boolean getExcludeFromSystemGesture() {
        return this.excludeFromSystemGesture;
    }

    public final int getFlags$ui() {
        return this.flags;
    }

    public final boolean getFocusable() {
        return (this.flags & 8) == 0;
    }

    public final boolean getInheritSecurePolicy$ui() {
        return this.inheritSecurePolicy;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.inheritSecurePolicy ? SecureFlagPolicy.Inherit : (this.flags & 8192) == 0 ? SecureFlagPolicy.SecureOff : SecureFlagPolicy.SecureOn;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public final IBinder getWindowToken() {
        return this.windowToken;
    }

    public final int getWindowType() {
        return this.windowType;
    }

    public int hashCode() {
        int c = (kp0.c(kp0.c(kp0.c(kp0.c(kp0.c(this.flags * 31, 31, this.inheritSecurePolicy), 31, this.dismissOnBackPress), 31, this.dismissOnClickOutside), 31, this.excludeFromSystemGesture), 31, this.usePlatformDefaultWidth) + this.windowType) * 31;
        IBinder iBinder = this.windowToken;
        return c + (iBinder != null ? iBinder.hashCode() : 0);
    }

    public /* synthetic */ PopupProperties(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, IBinder iBinder, int i3, dq dqVar) {
        this(i, (i3 & 2) != 0 ? true : z, (i3 & 4) != 0 ? true : z2, (i3 & 8) != 0 ? true : z3, (i3 & 16) != 0 ? true : z4, (i3 & 32) != 0 ? false : z5, (i3 & 64) != 0 ? 1002 : i2, (i3 & Fields.SpotShadowColor) != 0 ? null : iBinder);
    }

    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, dq dqVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? false : z5);
    }

    public PopupProperties(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this(z, z2, z3, SecureFlagPolicy.Inherit, true, z4, z5, 1002, (IBinder) null);
    }

    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, boolean z6, int i, dq dqVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 16) != 0 ? true : z4, (i & 32) != 0 ? true : z5, (i & 64) != 0 ? false : z6);
    }

    @er
    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, boolean z6) {
        this(z, z2, z3, secureFlagPolicy, z4, z5, z6, 1002, (IBinder) null);
    }

    public /* synthetic */ PopupProperties(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, dq dqVar) {
        this(i, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? true : z3, (i2 & 16) != 0 ? true : z4, (i2 & 32) != 0 ? false : z5);
    }

    @er
    public /* synthetic */ PopupProperties(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this(i, z, z2, z3, z4, z5, 1002, (IBinder) null);
    }

    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, boolean z4, int i, dq dqVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4);
    }

    @er
    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, boolean z4) {
        this(z, z2, z3, SecureFlagPolicy.Inherit, true, z4);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ PopupProperties(boolean r2, boolean r3, boolean r4, androidx.compose.ui.window.SecureFlagPolicy r5, boolean r6, boolean r7, int r8, defpackage.dq r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 0
        L5:
            r9 = r8 & 2
            r0 = 1
            if (r9 == 0) goto Lb
            r3 = r0
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = r0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            androidx.compose.ui.window.SecureFlagPolicy r5 = androidx.compose.ui.window.SecureFlagPolicy.Inherit
        L16:
            r9 = r8 & 16
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.PopupProperties.<init>(boolean, boolean, boolean, androidx.compose.ui.window.SecureFlagPolicy, boolean, boolean, int, dq):void");
    }

    public PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5) {
        this(z, z2, z3, secureFlagPolicy, z4, z5, false, 0, null, 384, null);
    }

    public PopupProperties(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, IBinder iBinder) {
        this.flags = i;
        this.inheritSecurePolicy = z;
        this.dismissOnBackPress = z2;
        this.dismissOnClickOutside = z3;
        this.excludeFromSystemGesture = z4;
        this.usePlatformDefaultWidth = z5;
        this.windowType = i2;
        this.windowToken = iBinder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, boolean z6, int i, IBinder iBinder) {
        this(r1, secureFlagPolicy == SecureFlagPolicy.Inherit, z2, z3, z4, z6, i, iBinder);
        int createFlags;
        createFlags = AndroidPopup_androidKt.createFlags(z, secureFlagPolicy, z5);
    }
}
