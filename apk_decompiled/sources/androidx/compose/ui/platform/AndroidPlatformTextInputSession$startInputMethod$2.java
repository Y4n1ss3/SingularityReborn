package androidx.compose.ui.platform;

import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.p10;
import defpackage.un;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidPlatformTextInputSession$startInputMethod$2 extends f30 implements ky {
    final /* synthetic */ PlatformTextInputMethodRequest $request;
    final /* synthetic */ AndroidPlatformTextInputSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$2(PlatformTextInputMethodRequest platformTextInputMethodRequest, AndroidPlatformTextInputSession androidPlatformTextInputSession) {
        super(1);
        this.$request = platformTextInputMethodRequest;
        this.this$0 = androidPlatformTextInputSession;
    }

    @Override // defpackage.ky
    public final InputMethodSession invoke(un unVar) {
        return new InputMethodSession(this.$request, new AnonymousClass1(this.this$0));
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f30 implements iy {
        final /* synthetic */ AndroidPlatformTextInputSession this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidPlatformTextInputSession androidPlatformTextInputSession) {
            super(0);
            this.this$0 = androidPlatformTextInputSession;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m6709invoke() {
            un unVar;
            unVar = this.this$0.coroutineScope;
            p10.h(unVar, null);
        }

        @Override // defpackage.iy
        public /* bridge */ /* synthetic */ Object invoke() {
            m6709invoke();
            return w01.a;
        }
    }
}
