package defpackage;

import android.text.TextUtils;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class xe implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xe(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ((p7) obj).d;
                int i2 = bottomSheetBehavior.v;
                if (i2 != 2 || i2 == 0) {
                    return;
                }
                bottomSheetBehavior.v = 0;
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
        }
    }
}
