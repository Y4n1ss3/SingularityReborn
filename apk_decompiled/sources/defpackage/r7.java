package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class r7 implements Runnable {
    public final /* synthetic */ int d = 0;
    public final int e;
    public final Object f;
    public final Object g;

    public r7(List list, int i, Throwable th) {
        d41.e(list, "initCallbacks cannot be null");
        this.f = new ArrayList(list);
        this.e = i;
        this.g = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        int i2 = 0;
        Object obj = this.g;
        int i3 = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ((TextView) obj2).setTypeface((Typeface) obj, i3);
                break;
            case 1:
                ((yj) obj).a(i3, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj2));
                break;
            default:
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                if (i3 == 1) {
                    while (i2 < size) {
                        ((ys) arrayList.get(i2)).onInitialized();
                        i2++;
                    }
                    break;
                } else {
                    while (i2 < size) {
                        ((ys) arrayList.get(i2)).onFailed((Throwable) obj);
                        i2++;
                    }
                    break;
                }
        }
    }

    public r7(TextView textView, Typeface typeface, int i) {
        this.f = textView;
        this.g = typeface;
        this.e = i;
    }

    public r7(yj yjVar, int i, IntentSender.SendIntentException sendIntentException) {
        this.g = yjVar;
        this.e = i;
        this.f = sendIntentException;
    }
}
