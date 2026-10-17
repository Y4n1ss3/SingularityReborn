package defpackage;

import android.graphics.Typeface;
import com.topjohnwu.superuser.CallbackList;
import com.topjohnwu.superuser.Shell;
import com.topjohnwu.superuser.internal.MainShell;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class zf implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zf(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ((CallbackList) obj2).lambda$add$0(obj);
                break;
            case 1:
                ((Shell.GetShellCallback) obj2).onShell((Shell) obj);
                break;
            case 2:
                MainShell.lambda$get$1((Executor) obj2, (Shell.GetShellCallback) obj);
                break;
            default:
                ((ej0) obj2).onFontRetrieved((Typeface) obj);
                break;
        }
    }
}
