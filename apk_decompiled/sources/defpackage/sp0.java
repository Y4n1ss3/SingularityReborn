package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class sp0 {
    public static SidecarInterface a(Context context) {
        context.getClass();
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }

    public static j11 b() {
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (TextUtils.isEmpty(apiVersion)) {
                return null;
            }
            j11 j11Var = j11.i;
            return cq.B(apiVersion);
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }
}
