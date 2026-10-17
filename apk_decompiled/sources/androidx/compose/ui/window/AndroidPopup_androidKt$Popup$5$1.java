package androidx.compose.ui.window;

import androidx.compose.ui.platform.InfiniteAnimationPolicyKt;
import defpackage.bq;
import defpackage.f30;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", l = {496}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class AndroidPopup_androidKt$Popup$5$1 extends us0 implements my {
    final /* synthetic */ PopupLayout $popupLayout;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$5$1(PopupLayout popupLayout, hm hmVar) {
        super(2, hmVar);
        this.$popupLayout = popupLayout;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        AndroidPopup_androidKt$Popup$5$1 androidPopup_androidKt$Popup$5$1 = new AndroidPopup_androidKt$Popup$5$1(this.$popupLayout, hmVar);
        androidPopup_androidKt$Popup$5$1.L$0 = obj;
        return androidPopup_androidKt$Popup$5$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((AndroidPopup_androidKt$Popup$5$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0030 -> B:5:0x0033). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        un unVar;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            unVar = (un) this.L$0;
            if (p10.x(unVar)) {
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            unVar = (un) this.L$0;
            p10.Q(obj);
            this.$popupLayout.pollForLocationOnScreenChange();
            if (p10.x(unVar)) {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
                this.L$0 = unVar;
                this.label = 1;
                Object withInfiniteAnimationFrameNanos = InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(anonymousClass1, this);
                vn vnVar = vn.d;
                if (withInfiniteAnimationFrameNanos == vnVar) {
                    return vnVar;
                }
                this.$popupLayout.pollForLocationOnScreenChange();
                if (p10.x(unVar)) {
                    return w01.a;
                }
            }
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f30 implements ky {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.ky
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return w01.a;
        }

        public final void invoke(long j) {
        }
    }
}
