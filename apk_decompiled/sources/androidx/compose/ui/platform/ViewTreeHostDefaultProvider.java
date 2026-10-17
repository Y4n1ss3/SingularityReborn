package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.HostDefaultKey;
import androidx.compose.runtime.HostDefaultProvider;
import androidx.compose.runtime.ViewTreeHostDefaultKey;
import defpackage.p10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ViewTreeHostDefaultProvider implements HostDefaultProvider {
    public static final int $stable = 8;
    private final View view;

    public ViewTreeHostDefaultProvider(View view) {
        this.view = view;
    }

    @Override // androidx.compose.runtime.HostDefaultProvider
    public <T> T getHostDefault(HostDefaultKey<T> hostDefaultKey) {
        if (!(hostDefaultKey instanceof ViewTreeHostDefaultKey)) {
            return null;
        }
        View view = this.view;
        while (view != null) {
            T t = (T) view.getTag(((ViewTreeHostDefaultKey) hostDefaultKey).getTagKey());
            if (t != null) {
                return t;
            }
            Object u = p10.u(view);
            view = u instanceof View ? (View) u : null;
        }
        return null;
    }
}
