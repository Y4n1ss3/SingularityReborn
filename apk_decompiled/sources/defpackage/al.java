package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.text.contextmenu.ProcessTextApi23Impl;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextRange;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class al implements py {
    public final /* synthetic */ int d;

    public /* synthetic */ al(int i) {
        this.d = i;
    }

    @Override // defpackage.py
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        w01 lambda_129995601$lambda$0;
        w01 lambda_636288403$lambda$0;
        w01 lambda__1357803046$lambda$0;
        w01 onClickProcessTextItem$lambda$0;
        switch (this.d) {
            case 0:
                lambda_129995601$lambda$0 = ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda_129995601$lambda$0((TextContextMenuSession) obj, (TextContextMenuDataProvider) obj2, (iy) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                return lambda_129995601$lambda$0;
            case 1:
                lambda_636288403$lambda$0 = ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda_636288403$lambda$0((TextContextMenuSession) obj, (TextContextMenuDataProvider) obj2, (iy) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                return lambda_636288403$lambda$0;
            case 2:
                lambda__1357803046$lambda$0 = ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda__1357803046$lambda$0((TextContextMenuSession) obj, (TextContextMenuDataProvider) obj2, (iy) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                return lambda__1357803046$lambda$0;
            default:
                onClickProcessTextItem$lambda$0 = ProcessTextApi23Impl.onClickProcessTextItem$lambda$0((Context) obj, (ResolveInfo) obj2, ((Boolean) obj3).booleanValue(), (CharSequence) obj4, (TextRange) obj5);
                return onClickProcessTextItem$lambda$0;
        }
    }
}
