package androidx.compose.ui.viewinterop;

import android.os.Handler;
import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 extends f30 implements ky {
    public static final AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 INSTANCE = new AndroidViewHolder$Companion$OnCommitAffectingUpdate$1();

    public AndroidViewHolder$Companion$OnCommitAffectingUpdate$1() {
        super(1);
    }

    public final void invoke(AndroidViewHolder androidViewHolder) {
        final iy iyVar;
        Handler handler = androidViewHolder.getHandler();
        iyVar = androidViewHolder.runUpdate;
        handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.a
            @Override // java.lang.Runnable
            public final void run() {
                iy.this.invoke();
            }
        });
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AndroidViewHolder) obj);
        return w01.a;
    }
}
