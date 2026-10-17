package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public /* synthetic */ p(int i, String str, String str2) {
        this.d = i;
        this.e = str;
        this.f = str2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invoke$lambda$1$lambda$0;
        w01 invoke$lambda$1$lambda$02;
        w01 invoke$lambda$1$lambda$03;
        switch (this.d) {
            case 0:
                invoke$lambda$1$lambda$0 = DateInputKt$DateInputContent$2.invoke$lambda$1$lambda$0(this.e, this.f, (SemanticsPropertyReceiver) obj);
                return invoke$lambda$1$lambda$0;
            case 1:
                invoke$lambda$1$lambda$02 = DateRangeInputKt$DateRangeInputContent$2$2.invoke$lambda$1$lambda$0(this.e, this.f, (SemanticsPropertyReceiver) obj);
                return invoke$lambda$1$lambda$02;
            default:
                invoke$lambda$1$lambda$03 = DateRangeInputKt$DateRangeInputContent$2$5.invoke$lambda$1$lambda$0(this.e, this.f, (SemanticsPropertyReceiver) obj);
                return invoke$lambda$1$lambda$03;
        }
    }
}
