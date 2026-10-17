package androidx.compose.ui.platform;

import androidx.compose.ui.node.RootForTest;
import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeView$snapshotObserver$1$command$1 extends f30 implements iy {
    final /* synthetic */ iy $command;
    final /* synthetic */ RootForTest.UncaughtExceptionHandler $exceptionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$snapshotObserver$1$command$1(iy iyVar, RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler) {
        super(0);
        this.$command = iyVar;
        this.$exceptionHandler = uncaughtExceptionHandler;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6697invoke() {
        try {
            this.$command.invoke();
        } catch (Exception e) {
            this.$exceptionHandler.onUncaughtException(e);
        }
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6697invoke();
        return w01.a;
    }
}
