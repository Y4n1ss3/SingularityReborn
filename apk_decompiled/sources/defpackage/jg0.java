package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.autofill.AutofillUtils_androidKt;
import java.util.Random;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class jg0 implements Choreographer.FrameCallback {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new kg0((Context) obj, 0), new Random().nextInt(Math.max(1000, 1)) + AutofillUtils_androidKt.MAX_AUTOFILL_TEXT_LENGTH);
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }

    public /* synthetic */ jg0(Runnable runnable) {
        this.e = runnable;
    }
}
