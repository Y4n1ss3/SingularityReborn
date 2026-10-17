package androidx.compose.foundation.text.input.internal;

import java.util.function.IntConsumer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ IntConsumer e;
    public final /* synthetic */ int f;

    public /* synthetic */ e(IntConsumer intConsumer, int i, int i2) {
        this.d = i2;
        this.e = intConsumer;
        this.f = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        int i2 = this.f;
        IntConsumer intConsumer = this.e;
        switch (i) {
            case 0:
                intConsumer.accept(i2);
                break;
            default:
                intConsumer.accept(i2);
                break;
        }
    }
}
