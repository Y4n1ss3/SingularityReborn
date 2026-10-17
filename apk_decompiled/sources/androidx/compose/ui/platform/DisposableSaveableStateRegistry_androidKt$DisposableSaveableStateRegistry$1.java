package androidx.compose.ui.platform;

import defpackage.el0;
import defpackage.f30;
import defpackage.gl0;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1 extends f30 implements iy {
    final /* synthetic */ el0 $androidxRegistry;
    final /* synthetic */ String $key;
    final /* synthetic */ boolean $registered;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(boolean z, el0 el0Var, String str) {
        super(0);
        this.$registered = z;
        this.$androidxRegistry = el0Var;
        this.$key = str;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6750invoke() {
        if (this.$registered) {
            el0 el0Var = this.$androidxRegistry;
            String str = this.$key;
            el0Var.getClass();
            str.getClass();
            gl0 gl0Var = el0Var.a;
            synchronized (gl0Var.c) {
            }
        }
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6750invoke();
        return w01.a;
    }
}
