package defpackage;

import androidx.compose.material3.SearchBarDefaults;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class cm0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;

    public /* synthetic */ cm0(String str, boolean z, String str2, int i) {
        this.d = i;
        this.e = str;
        this.f = z;
        this.g = str2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 InputField$lambda$40$lambda$39;
        w01 InputField$lambda$27$lambda$26;
        switch (this.d) {
            case 0:
                InputField$lambda$40$lambda$39 = SearchBarDefaults.InputField$lambda$40$lambda$39(this.e, this.f, this.g, (SemanticsPropertyReceiver) obj);
                return InputField$lambda$40$lambda$39;
            default:
                InputField$lambda$27$lambda$26 = SearchBarDefaults.InputField$lambda$27$lambda$26(this.e, this.f, this.g, (SemanticsPropertyReceiver) obj);
                return InputField$lambda$27$lambda$26;
        }
    }
}
