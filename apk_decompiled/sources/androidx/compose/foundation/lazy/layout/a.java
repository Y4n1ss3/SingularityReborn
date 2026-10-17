package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invokeSuspend$lambda$0;
        w01 invokeSuspend$lambda$02;
        DisposableEffectResult SaveableStateProvider$lambda$0$0;
        int i = this.d;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                invokeSuspend$lambda$0 = LazyLayoutItemAnimation$animateAppearance$2.invokeSuspend$lambda$0((GraphicsLayer) obj3, (LazyLayoutItemAnimation) obj2, (Animatable) obj);
                return invokeSuspend$lambda$0;
            case 1:
                invokeSuspend$lambda$02 = LazyLayoutItemAnimation$animateDisappearance$1.invokeSuspend$lambda$0((GraphicsLayer) obj3, (LazyLayoutItemAnimation) obj2, (Animatable) obj);
                return invokeSuspend$lambda$02;
            default:
                SaveableStateProvider$lambda$0$0 = LazySaveableStateHolder.SaveableStateProvider$lambda$0$0((LazySaveableStateHolder) obj3, obj2, (DisposableEffectScope) obj);
                return SaveableStateProvider$lambda$0$0;
        }
    }
}
