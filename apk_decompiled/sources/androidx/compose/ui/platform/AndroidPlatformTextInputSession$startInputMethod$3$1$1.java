package androidx.compose.ui.platform;

import androidx.compose.ui.text.input.TextInputService;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidPlatformTextInputSession$startInputMethod$3$1$1 extends f30 implements ky {
    final /* synthetic */ InputMethodSession $methodSession;
    final /* synthetic */ AndroidPlatformTextInputSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3$1$1(InputMethodSession inputMethodSession, AndroidPlatformTextInputSession androidPlatformTextInputSession) {
        super(1);
        this.$methodSession = inputMethodSession;
        this.this$0 = androidPlatformTextInputSession;
    }

    public final void invoke(Throwable th) {
        TextInputService textInputService;
        this.$methodSession.dispose();
        textInputService = this.this$0.textInputService;
        textInputService.stopInput();
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return w01.a;
    }
}
