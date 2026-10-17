package androidx.compose.ui.platform;

import androidx.compose.ui.text.input.TextInputService;
import defpackage.bq;
import defpackage.d41;
import defpackage.gg;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {184}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class AndroidPlatformTextInputSession$startInputMethod$3 extends us0 implements my {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AndroidPlatformTextInputSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3(AndroidPlatformTextInputSession androidPlatformTextInputSession, hm hmVar) {
        super(2, hmVar);
        this.this$0 = androidPlatformTextInputSession;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this.this$0, hmVar);
        androidPlatformTextInputSession$startInputMethod$3.L$0 = obj;
        return androidPlatformTextInputSession$startInputMethod$3;
    }

    @Override // defpackage.my
    public final Object invoke(InputMethodSession inputMethodSession, hm hmVar) {
        return ((AndroidPlatformTextInputSession$startInputMethod$3) create(inputMethodSession, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        TextInputService textInputService;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            InputMethodSession inputMethodSession = (InputMethodSession) this.L$0;
            AndroidPlatformTextInputSession androidPlatformTextInputSession = this.this$0;
            this.L$0 = inputMethodSession;
            this.L$1 = androidPlatformTextInputSession;
            this.label = 1;
            gg ggVar = new gg(1, d41.C(this));
            ggVar.u();
            textInputService = androidPlatformTextInputSession.textInputService;
            textInputService.startInput();
            ggVar.d(new AndroidPlatformTextInputSession$startInputMethod$3$1$1(inputMethodSession, androidPlatformTextInputSession));
            Object s = ggVar.s();
            vn vnVar = vn.d;
            if (s == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        o.j();
        return null;
    }
}
