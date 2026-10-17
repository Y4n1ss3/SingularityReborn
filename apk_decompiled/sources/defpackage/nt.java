package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class nt extends ys implements Runnable {
    public final WeakReference d;

    public nt(l7 l7Var) {
        this.d = new WeakReference(l7Var);
    }

    @Override // defpackage.ys
    public final void onInitialized() {
        Handler handler;
        EditText editText = (EditText) this.d.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ot.a((EditText) this.d.get(), 1);
    }
}
