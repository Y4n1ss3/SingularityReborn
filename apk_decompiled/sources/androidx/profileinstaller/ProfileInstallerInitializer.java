package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.jg0;
import defpackage.r00;
import defpackage.ts;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class ProfileInstallerInitializer implements r00 {
    @Override // defpackage.r00
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.r00
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new jg0(this, context.getApplicationContext()));
        return new ts(25);
    }
}
