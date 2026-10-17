package androidx.compose.foundation.text.input.internal;

import defpackage.bq;
import defpackage.hm;
import defpackage.jb0;
import defpackage.jw;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1", f = "AndroidTextInputSession.android.kt", l = {114, 115}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1 extends us0 implements my {
    final /* synthetic */ ComposeInputMethodManager $composeImm;
    final /* synthetic */ jb0 $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(jb0 jb0Var, ComposeInputMethodManager composeInputMethodManager, hm hmVar) {
        super(2, hmVar);
        this.$it = jb0Var;
        this.$composeImm = composeInputMethodManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(long j) {
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(this.$it, this.$composeImm, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r6.collect(r0, r5) == r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(r6, r5) == r4) goto L15;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        int i2 = 1;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            a aVar = new a(i2);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                o.j();
                return null;
            }
            p10.Q(obj);
        }
        jb0 jb0Var = this.$it;
        final ComposeInputMethodManager composeInputMethodManager = this.$composeImm;
        jw jwVar = new jw() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1.2
            @Override // defpackage.jw
            public final Object emit(w01 w01Var, hm hmVar) {
                ComposeInputMethodManager.this.startStylusHandwriting();
                return w01.a;
            }
        };
        this.label = 2;
    }
}
