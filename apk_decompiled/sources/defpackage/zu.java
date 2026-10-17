package defpackage;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class zu {
    public static final String a = ki0.a(zu.class).b();

    public static int a() {
        i11 i11Var = i11.d;
        i11 i11Var2 = p10.a;
        String str = a;
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (i11Var2 != i11Var) {
                return 0;
            }
            Log.d(str, "Embedding extension version not found");
            return 0;
        } catch (NullPointerException unused2) {
            if (i11Var2 != i11Var) {
                return 0;
            }
            Log.d(str, "Error with Extension implementation");
            return 0;
        } catch (UnsupportedOperationException unused3) {
            if (i11Var2 != i11Var) {
                return 0;
            }
            Log.d(str, "Stub Extension");
            return 0;
        }
    }
}
