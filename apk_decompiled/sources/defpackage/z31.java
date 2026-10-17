package defpackage;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.platform.WindowRecomposerFactory;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class z31 implements WindowRecomposerFactory {
    @Override // androidx.compose.ui.platform.WindowRecomposerFactory
    public final Recomposer createRecomposer(View view) {
        Recomposer LifecycleAware$lambda$0;
        LifecycleAware$lambda$0 = WindowRecomposerFactory.Companion.LifecycleAware$lambda$0(view);
        return LifecycleAware$lambda$0;
    }
}
