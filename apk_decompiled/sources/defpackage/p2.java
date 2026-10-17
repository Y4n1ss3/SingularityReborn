package defpackage;

import android.content.SharedPreferences;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class p2 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ p2(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.d = i2;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.f = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 ProvideBasicTextContextMenu$lambda$5;
        w01 invoke$lambda$2;
        int i = this.d;
        w01 w01Var = w01.a;
        int i2 = this.f;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                b3.a((String) obj6, (SharedPreferences) obj5, (ky) obj4, (iy) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return w01Var;
            case 1:
                ((Integer) obj2).getClass();
                kb.b((String) obj6, (String) obj5, (String) obj4, (my) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return w01Var;
            case 2:
                int intValue = ((Integer) obj2).intValue();
                ProvideBasicTextContextMenu$lambda$5 = BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu$lambda$5((Modifier) obj6, (ProvidableCompositionLocal) obj5, (py) obj4, (my) obj3, this.f, (Composer) obj, intValue);
                return ProvideBasicTextContextMenu$lambda$5;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                invoke$lambda$2 = ComposableLambdaImpl.invoke$lambda$2((ComposableLambdaImpl) obj6, this.g, this.h, this.i, this.f, (Composer) obj, intValue2);
                return invoke$lambda$2;
        }
    }
}
